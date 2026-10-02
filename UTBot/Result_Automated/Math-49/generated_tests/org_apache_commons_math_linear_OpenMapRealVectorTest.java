package org.apache.commons.math.linear;

import org.junit.Test;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.apache.commons.math.exception.DimensionMismatchException;
import java.lang.reflect.Method;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.MathArithmeticException;
import org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator;
import org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator;
import org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry;
import org.apache.commons.math.linear.RealVector.Entry;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_linear_OpenMapRealVectorTest {
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (copyThis): False}
 * @utbot.executesCondition {@code (copyThis): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#copy()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testAdd_NotCopyThis() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -254);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        OpenMapRealVector actual = openMapRealVector.add(openMapRealVector1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries2 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states2 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states2);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:244) */
        openMapRealVector.add(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean copyThis = entries.size() > v.entries.size();
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:245) */
        openMapRealVector.add(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean copyThis = entries.size() > v.entries.size();
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:245) */
        openMapRealVector.add(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (copyThis): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#copy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.copy()
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 256);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:246) */
        openMapRealVector.add(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (copyThis): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: v.copy()
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:246) */
        openMapRealVector.add(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (copyThis): False}
 * @utbot.executesCondition {@code (copyThis): False}
 * @utbot.executesCondition {@code (copyThis): False}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -254);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:251) */
        openMapRealVector.add(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testAdd_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -2);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        openMapRealVector.add(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.RealVector)}
 *  */
    @Test
    public void testAdd_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {3.78599806061379E-270};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method addMethod = openMapRealVectorClazz.getDeclaredMethod("add", fortranArrayType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = fortranArray;
        ArrayRealVector actual = ((ArrayRealVector) addMethod.invoke(openMapRealVector, addMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {3.78599806061379E-270};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.RealVector)}
 *  */
    @Test
    public void testAdd() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {8.289046E-317, 8.0948E-320};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method addMethod = openMapRealVectorClazz.getDeclaredMethod("add", arrayRealVectorType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = arrayRealVector;
        ArrayRealVector actual = ((ArrayRealVector) addMethod.invoke(openMapRealVector, addMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {8.289046E-317, 8.0948E-320};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testAdd_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:226) */
        openMapRealVector.add(((RealVector) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testAdd_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.add(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testAdd_ThrowDimensionMismatchException1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method addMethod = openMapRealVectorClazz.getDeclaredMethod("add", arrayRealVectorType);
        addMethod.setAccessible(true);
        java.lang.Object[] addMethodArguments = new java.lang.Object[1];
        addMethodArguments[0] = arrayRealVector;
        try {
            addMethod.invoke(openMapRealVector, addMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        boolean actual = openMapRealVector.equals(openMapRealVector);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof OpenMapRealVector)): False}
 * @utbot.executesCondition {@code (virtualSize != other.virtualSize): True}
 *  */
    @Test
    public void testEquals_VirtualSizeNotEqualsOtherVirtualSize() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        boolean actual = openMapRealVector.equals(openMapRealVector1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof OpenMapRealVector)): False}
 * @utbot.executesCondition {@code (virtualSize != other.virtualSize): False}
 * @utbot.executesCondition {@code (Double.doubleToLongBits(other.epsilon)): True}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 *  */
    @Test
    public void testEquals_DoubleDoubleToLongBits() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -256);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -256);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", -2.0000000000000004);
        
        boolean actual = openMapRealVector.equals(openMapRealVector1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof OpenMapRealVector)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        boolean actual = openMapRealVector.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.append
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, 1);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:286) */
        openMapRealVector.append(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, 1);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -227);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:286) */
        openMapRealVector.append(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: res.setEntry(virtualSize, d);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.225073858507202E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.225073858507202E-308);
        
        openMapRealVector.append(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: res.setEntry(virtualSize, d);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 7.405045801111966E-304);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MAX_VALUE);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        openMapRealVector.append(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method append(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double)}
     */
    @Test
    public void testAppendThrowsAIOOBE() {
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(1, -1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:212)
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:666)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:287) */
        openMapRealVector.append(-1.1125369292536007E-308);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.returnsFrom {@code return res;}
 *  */
    @Test
    public void testAppend_ReturnRes() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.450147717014404E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -248);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        double[] doubleArray = {};
        
        OpenMapRealVector actual = openMapRealVector.append(doubleArray);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.450147717014404E-308);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -248);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, a.length);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:293) */
        openMapRealVector.append(((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, a.length);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:293) */
        openMapRealVector.append(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, a.length);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:293) */
        openMapRealVector.append(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < a.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: res.setEntry(i + virtualSize, a[i]);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        double[] doubleArray = {0.0};
        
        openMapRealVector.append(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < a.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: res.setEntry(i + virtualSize, a[i]);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 1.0565890622713305E270);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MAX_VALUE);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        double[] doubleArray = {0.0};
        
        openMapRealVector.append(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testAppend_OpenIntToDoubleHashMapIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) -127};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        
        OpenMapRealVector actual = openMapRealVector.append(openMapRealVector1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries2 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states2 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states2);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -509);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res.setEntry(iter.key() + virtualSize, iter.value());
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.225073858507202E-308);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:271) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res.setEntry(iter.key() + virtualSize, iter.value());
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:271) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:267) */
        openMapRealVector.append(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_12() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:267) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_21() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:267) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = v.entries.iterator();
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 2);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -254);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 133);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:268) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.225073858507202E-308);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:271) */
        openMapRealVector.append(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: res.setEntry(iter.key() + virtualSize, iter.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 1.61895E-319);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 17);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-18};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 17);
        
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: res.setEntry(iter.key() + virtualSize, iter.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException_12() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 1.265E-321);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 3);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-3};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        
        openMapRealVector.append(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getData()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.returnsFrom {@code return append(v.getData());}
 *  */
    @Test
    public void testAppend_NotVNotInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method appendMethod = openMapRealVectorClazz.getDeclaredMethod("append", fortranArrayType);
        appendMethod.setAccessible(true);
        java.lang.Object[] appendMethodArguments = new java.lang.Object[1];
        appendMethodArguments[0] = fortranArray;
        OpenMapRealVector actual = ((OpenMapRealVector) appendMethod.invoke(openMapRealVector, appendMethodArguments));
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append(v.getData());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:281) */
        openMapRealVector.append(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append((OpenMapRealVector) v);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_22() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:267)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:279) */
        openMapRealVector.append(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append((OpenMapRealVector) v);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_31() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:267)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:279) */
        openMapRealVector.append(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getData()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append(v.getData());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_13() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.8480945388892178E-306, 1.0361308E-317};
        arrayRealVector.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:293)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:281) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method appendMethod = openMapRealVectorClazz.getDeclaredMethod("append", arrayRealVectorType);
        appendMethod.setAccessible(true);
        java.lang.Object[] appendMethodArguments = new java.lang.Object[1];
        appendMethodArguments[0] = arrayRealVector;
        try {
            appendMethod.invoke(openMapRealVector, appendMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#hashCode()}
 *  */
    @Test
    public void testHashCode() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        int actual = openMapRealVector.hashCode();
        
        assertEquals(48759745, actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#hashCode()}
 *  */
    @Test
    public void testHashCode_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        int actual = openMapRealVector.hashCode();
        
        assertEquals(48759745, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#hashCode()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testHashCode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {-2.0000000000000004};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.hashCode(OpenMapRealVector.java:792) */
        openMapRealVector.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#hashCode()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.hashCode(OpenMapRealVector.java:789) */
        openMapRealVector.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#hashCode()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.hashCode(OpenMapRealVector.java:792) */
        openMapRealVector.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.toArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toArray()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#toArray()}
 *  */
    @Test
    public void testToArray() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double[] actual = openMapRealVector.toArray();
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#toArray()}
 *  */
    @Test
    public void testToArray_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double[] actual = openMapRealVector.toArray();
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toArray()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#toArray()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: return getData();
 *  */
    @Test
    public void testToArray_ThrowNegativeArraySizeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -256);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.toArray] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:411)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:772) */
        openMapRealVector.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#toArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getData();
 *  */
    @Test
    public void testToArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.toArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:772) */
        openMapRealVector.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#toArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getData();
 *  */
    @Test
    public void testToArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-256};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.toArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:772) */
        openMapRealVector.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#toArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getData();
 *  */
    @Test
    public void testToArray_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.toArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:772) */
        openMapRealVector.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#toArray()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getData();
 *  */
    @Test
    public void testToArray_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.toArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:772) */
        openMapRealVector.toArray();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toArray()
    
    @Test
    public void testToArray1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            3, 0, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        
        double[] actual = openMapRealVector.toArray();
        
        double[] expected = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    @Test
    public void testToArray2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        
        double[] actual = openMapRealVector.toArray();
        
        double[] expected = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toArray()
    
    @Test
    public void testToArray3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.toArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:772) */
        openMapRealVector.toArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.set
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method set(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#set(double)}
 *  */
    @Test
    public void testSet() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.set(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method set(double)
    
    @Test(timeout = 1000L)
    public void testSet1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.6939704024287E-310);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.set(-3.6939704024287E-310);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.isNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isNaN()}
 *  */
    @Test
    public void testIsNaN() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isNaN()}
 *  */
    @Test
    public void testIsNaN_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator#hasNext()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator#advance()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator#value()}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaN() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {java.lang.Double.NaN};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isNaN();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNaN()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator#advance()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator#value()}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testIsNaN_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {-2.0000000000000004};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.isNaN] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:609) */
        openMapRealVector.isNaN();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isNaN()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testIsNaN_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.isNaN] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:606) */
        openMapRealVector.isNaN();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isNaN()}
     */
    @Test
    public void testIsNaNReturnsFalse() {
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(-2147483647, -1);
        
        boolean actual = openMapRealVector.isNaN();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isNaN()
    
    @Test
    public void testIsNaN1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isNaN();
        
        assertFalse(actual);
    }
    
    @Test
    public void testIsNaN2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            -2.2250738585072014E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isNaN();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isNaN()
    
    @Test
    public void testIsNaN3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.isNaN] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:609) */
        openMapRealVector.isNaN();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.copy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copy()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#copy()}
 * @utbot.returnsFrom {@code return new OpenMapRealVector(this);}
 *  */
    @Test
    public void testCopy_Return() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        OpenMapRealVector actual = openMapRealVector.copy();
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copy()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#copy()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new OpenMapRealVector(this);
 *  */
    @Test
    public void testCopy_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.copy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for double[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306) */
        openMapRealVector.copy();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#copy()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new OpenMapRealVector(this);
 *  */
    @Test
    public void testCopy_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.copy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306) */
        openMapRealVector.copy();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#copy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new OpenMapRealVector(this);
 *  */
    @Test
    public void testCopy_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.copy] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306) */
        openMapRealVector.copy();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#copy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new OpenMapRealVector(this);
 *  */
    @Test
    public void testCopy_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.copy] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306) */
        openMapRealVector.copy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getEntries
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntries()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntries()}
 * @utbot.returnsFrom {@code return entries;}
 *  */
    @Test
    public void testGetEntries_ReturnEntries() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method getEntriesMethod = openMapRealVectorClazz.getDeclaredMethod("getEntries");
        getEntriesMethod.setAccessible(true);
        java.lang.Object[] getEntriesMethodArguments = new java.lang.Object[0];
        OpenIntToDoubleHashMap actual = ((OpenIntToDoubleHashMap) getEntriesMethod.invoke(openMapRealVector, getEntriesMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.isInfinite
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInfinite()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isInfinite()}
 *  */
    @Test
    public void testIsInfinite() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isInfinite()}
 *  */
    @Test
    public void testIsInfinite_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isInfinite()}
 *  */
    @Test
    public void testIsInfinite_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {java.lang.Double.NaN};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isInfinite();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isInfinite()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isInfinite()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = iter.value();
 *  */
    @Test
    public void testIsInfinite_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.isInfinite] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:593) */
        openMapRealVector.isInfinite();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isInfinite()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testIsInfinite_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.isInfinite] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:590) */
        openMapRealVector.isInfinite();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isInfinite()
    
    @Test
    public void testIsInfinite1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            0.0, java.lang.Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isInfinite();
        
        assertTrue(actual);
    }
    
    @Test
    public void testIsInfinite2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            java.lang.Double.POSITIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isInfinite();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isInfinite()
    
    @Test
    public void testIsInfinite3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.isInfinite] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:593) */
        openMapRealVector.isInfinite();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntry(int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return entries.get(index);}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = openMapRealVector.getEntry(0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return entries.get(index);}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 2, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = openMapRealVector.getEntry(0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return entries.get(index);}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 256);
        
        double actual = openMapRealVector.getEntry(255);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return entries.get(index);}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        
        double actual = openMapRealVector.getEntry(1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return entries.get(index);}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 6};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 9);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 7);
        
        double actual = openMapRealVector.getEntry(6);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEntry(int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getEntry(-1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getEntry(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntry(int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480) */
        openMapRealVector.getEntry(0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480) */
        openMapRealVector.getEntry(0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480) */
        openMapRealVector.getEntry(1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:186)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480) */
        openMapRealVector.getEntry(255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", Integer.MIN_VALUE);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2021725416);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:194)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480) */
        openMapRealVector.getEntry(2021725415);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 129};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 130);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:195)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480) */
        openMapRealVector.getEntry(129);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480) */
        openMapRealVector.getEntry(0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480) */
        openMapRealVector.getEntry(0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480) */
        openMapRealVector.getEntry(0);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getEntry(int)
    
    @Test
    public void testGetEntry1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646, -2147483646,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            java.lang.Byte.MIN_VALUE
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 251658238);
        
        double actual = openMapRealVector.getEntry(251658231);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getEntry(int)
    
    @Test
    public void testGetEntry2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 3);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480) */
        openMapRealVector.getEntry(2);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getEntry(int)
    
    @Test(timeout = 1000L)
    public void testGetEntry3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.getEntry(0);
    }
    
    @Test(timeout = 1000L)
    public void testGetEntry4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.getEntry(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getData()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getData()}
 *  */
    @Test
    public void testGetData() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double[] actual = openMapRealVector.getData();
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getData()}
 *  */
    @Test
    public void testGetData_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double[] actual = openMapRealVector.getData();
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getData()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getData()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] res = new double[virtualSize];
 *  */
    @Test
    public void testGetData_ThrowNegativeArraySizeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -256);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getData] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:411) */
        openMapRealVector.getData();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getData()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res[iter.key()] = iter.value();
 *  */
    @Test
    public void testGetData_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415) */
        openMapRealVector.getData();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getData()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res[iter.key()] = iter.value();
 *  */
    @Test
    public void testGetData_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {129};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415) */
        openMapRealVector.getData();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getData()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res[iter.key()] = iter.value();
 *  */
    @Test
    public void testGetData_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415) */
        openMapRealVector.getData();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getData()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetData_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:412) */
        openMapRealVector.getData();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getData()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testGetData_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415) */
        openMapRealVector.getData();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getData()
    
    @Test
    public void testGetData1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        
        double[] actual = openMapRealVector.getData();
        
        double[] expected = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    @Test
    public void testGetData2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = (byte) 1;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        
        double[] actual = openMapRealVector.getData();
        
        double[] expected = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getData()
    
    @Test
    public void testGetData3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415) */
        openMapRealVector.getData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.setEntry
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setEntry(0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setEntry(-1, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#containsKey(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(index)
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 128.00097656250003);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:212)
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:666) */
        openMapRealVector.setEntry(0, -2.278493014500894E-305);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.put(index, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.225073858507202E-308);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:665) */
        openMapRealVector.setEntry(0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entries.containsKey(index)
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.7179934720000004E10);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:666) */
        openMapRealVector.setEntry(0, -9.691600479459036E-268);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.put(index, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", -0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:665) */
        openMapRealVector.setEntry(0, 0.0);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method setEntry(int, double)
    
    @Test(timeout = 1000L)
    public void testSetEntry1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.503225133099298E-308);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.setEntry(0, -3.4150869761E-313);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#copy()}
 * @utbot.invokes org.apache.commons.math.linear.OpenMapRealVector#getEntries()
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testSubtract_OpenIntToDoubleHashMapIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) -127};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        OpenMapRealVector actual = openMapRealVector.subtract(openMapRealVector1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries2 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states2 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states2);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int key = iter.key();
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.2250738585072014E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -254);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:711) */
        openMapRealVector.subtract(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:706) */
        openMapRealVector.subtract(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = v.getEntries().iterator();
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:708) */
        openMapRealVector.subtract(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.POSITIVE_INFINITY);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:711) */
        openMapRealVector.subtract(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = copy();
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:707) */
        openMapRealVector.subtract(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = copy();
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:707) */
        openMapRealVector.subtract(openMapRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testSubtract_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -2);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        openMapRealVector.subtract(openMapRealVector1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test
    public void testSubtract1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 41;
        keys[2] = 41;
        keys[3] = 41;
        keys[4] = 41;
        keys[5] = 41;
        keys[6] = 41;
        keys[7] = 41;
        keys[8] = 41;
        keys[9] = 41;
        keys[10] = 41;
        keys[11] = 41;
        keys[12] = 41;
        keys[13] = 41;
        keys[14] = 41;
        keys[15] = 41;
        keys[16] = 41;
        keys[17] = 41;
        keys[18] = 41;
        keys[19] = 41;
        keys[20] = 41;
        keys[21] = 41;
        keys[22] = 41;
        keys[23] = 41;
        keys[24] = 41;
        keys[25] = 41;
        keys[26] = 41;
        keys[27] = 41;
        keys[28] = 41;
        keys[29] = 41;
        keys[30] = 41;
        keys[31] = 41;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[33];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[33];
        states[0] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            0, 41, 41, 41, 41, 41, 41, 41,
            41
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:713) */
        openMapRealVector.subtract(openMapRealVector1);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method subtract(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test(timeout = 1000L)
    public void testSubtract2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[0] = 32769;
        keys[1] = 41;
        keys[2] = 41;
        keys[3] = 41;
        keys[4] = 41;
        keys[5] = 41;
        keys[6] = 41;
        keys[7] = 41;
        keys[8] = 41;
        keys[9] = 41;
        keys[10] = 41;
        keys[11] = 41;
        keys[12] = 41;
        keys[13] = 41;
        keys[14] = 41;
        keys[15] = 41;
        keys[16] = 41;
        keys[17] = 41;
        keys[18] = 41;
        keys[19] = 41;
        keys[20] = 41;
        keys[21] = 41;
        keys[22] = 41;
        keys[23] = 41;
        keys[24] = 41;
        keys[25] = 41;
        keys[26] = 41;
        keys[27] = 41;
        keys[28] = 41;
        keys[29] = 41;
        keys[30] = 41;
        keys[31] = 41;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[33];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[33];
        states[0] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            0, 41, 41, 41, 41, 41, 41, 41,
            41
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.subtract(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.returnsFrom {@code return res;}
 *  */
    @Test
    public void testSubtract_OpenMapRealVectorCheckVectorDimensions() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -252);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 2);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        double[] doubleArray = {};
        
        OpenMapRealVector actual = openMapRealVector.subtract(doubleArray);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -252);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(i)
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.0000000000000004);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:212)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:737) */
        openMapRealVector.subtract(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(i)
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:212)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:737) */
        openMapRealVector.subtract(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:734) */
        openMapRealVector.subtract(((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:735) */
        openMapRealVector.subtract(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_21() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:735) */
        openMapRealVector.subtract(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.length);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testSubtract_ThrowDimensionMismatchException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        double[] doubleArray = {0.0, 0.0};
        
        openMapRealVector.subtract(doubleArray);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method subtract([D)
    
    @Test(timeout = 1000L)
    public void testSubtract3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {131072};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 4);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.subtract(doubleArray);
    }
    
    @Test(timeout = 1000L)
    public void testSubtract4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 27;
        keys[2] = 27;
        keys[3] = 27;
        keys[4] = 27;
        keys[5] = 27;
        keys[6] = 27;
        keys[7] = 27;
        keys[8] = 27;
        keys[9] = 27;
        keys[10] = 27;
        keys[11] = 27;
        keys[12] = 27;
        keys[13] = 27;
        keys[14] = 27;
        keys[15] = 27;
        keys[16] = 27;
        keys[17] = 27;
        keys[18] = 27;
        keys[19] = 27;
        keys[20] = 27;
        keys[21] = 27;
        keys[22] = 27;
        keys[23] = 27;
        keys[24] = 27;
        keys[25] = 27;
        keys[26] = 27;
        keys[27] = 27;
        keys[28] = 27;
        keys[29] = 27;
        keys[30] = 27;
        keys[31] = 27;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[33];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[33];
        states[0] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 4);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.subtract(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:724) */
        openMapRealVector.subtract(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getData()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return subtract(v.getData());
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_12() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {2.0722615E-317};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:735)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:728) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method subtractMethod = openMapRealVectorClazz.getDeclaredMethod("subtract", fortranArrayType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = fortranArray;
        try {
            subtractMethod.invoke(openMapRealVector, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return subtract((OpenMapRealVector) v);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_22() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:707)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:726) */
        openMapRealVector.subtract(((RealVector) openMapRealVector));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return subtract((OpenMapRealVector) v);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_31() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:707)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:726) */
        openMapRealVector.subtract(((RealVector) openMapRealVector));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testSubtract_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.subtract(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testSubtract_ThrowDimensionMismatchException2() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method subtractMethod = openMapRealVectorClazz.getDeclaredMethod("subtract", arrayRealVectorType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = arrayRealVector;
        try {
            subtractMethod.invoke(openMapRealVector, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testSubtract5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[34];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        OpenMapRealVector actual = openMapRealVector.subtract(((RealVector) openMapRealVector1));
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries2 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0, 0, 0};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0, 0.0, 0.0};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states2 = {(byte) 0, (byte) 0, (byte) 0};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states2);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testSubtract6() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[35];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 35 out of bounds for double[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:735)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:728) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method subtractMethod = openMapRealVectorClazz.getDeclaredMethod("subtract", fortranArrayType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = fortranArray;
        try {
            subtractMethod.invoke(openMapRealVector, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSubtract7() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[18];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[17];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 18 out of bounds for double[17]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:707)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:726) */
        openMapRealVector.subtract(((RealVector) openMapRealVector));
    }
    
    @Test
    public void testSubtract8() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 3 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:707)
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:726) */
        openMapRealVector.subtract(((RealVector) openMapRealVector));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDimension()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.returnsFrom {@code return virtualSize;}
 *  */
    @Test
    public void testGetDimension_ReturnVirtualSize() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        int actual = openMapRealVector.getDimension();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.ebeDivide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeDivide([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testEbeDivide_OpenIntToDoubleHashMapIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        double[] doubleArray = {0.0, 0.0};
        
        OpenMapRealVector actual = openMapRealVector.ebeDivide(doubleArray);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeDivide([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.length);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        double[] doubleArray = {0.0, 0.0};
        
        openMapRealVector.ebeDivide(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeDivide([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(double[])}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testEbeDivide_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:361) */
        openMapRealVector.ebeDivide(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:356) */
        openMapRealVector.ebeDivide(((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:357) */
        openMapRealVector.ebeDivide(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:357) */
        openMapRealVector.ebeDivide(doubleArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ebeDivide([D)
    
    @Test
    public void testEbeDivide1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[34];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 4);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        
        OpenMapRealVector actual = openMapRealVector.ebeDivide(doubleArray);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0, 0, 0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {java.lang.Double.NaN, 0.0, 0.0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1, (byte) 0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 4);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method ebeDivide([D)
    
    @Test(timeout = 1000L)
    public void testEbeDivide2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[34];
        states[0] = (byte) 2;
        states[1] = (byte) 2;
        states[2] = java.lang.Byte.MIN_VALUE;
        states[3] = (byte) 1;
        states[4] = java.lang.Byte.MIN_VALUE;
        states[5] = java.lang.Byte.MIN_VALUE;
        states[6] = java.lang.Byte.MIN_VALUE;
        states[7] = java.lang.Byte.MIN_VALUE;
        states[8] = java.lang.Byte.MIN_VALUE;
        states[9] = java.lang.Byte.MIN_VALUE;
        states[10] = java.lang.Byte.MIN_VALUE;
        states[11] = java.lang.Byte.MIN_VALUE;
        states[12] = java.lang.Byte.MIN_VALUE;
        states[13] = java.lang.Byte.MIN_VALUE;
        states[14] = java.lang.Byte.MIN_VALUE;
        states[15] = java.lang.Byte.MIN_VALUE;
        states[16] = java.lang.Byte.MIN_VALUE;
        states[17] = java.lang.Byte.MIN_VALUE;
        states[18] = java.lang.Byte.MIN_VALUE;
        states[19] = java.lang.Byte.MIN_VALUE;
        states[20] = java.lang.Byte.MIN_VALUE;
        states[21] = java.lang.Byte.MIN_VALUE;
        states[22] = java.lang.Byte.MIN_VALUE;
        states[23] = java.lang.Byte.MIN_VALUE;
        states[24] = java.lang.Byte.MIN_VALUE;
        states[25] = java.lang.Byte.MIN_VALUE;
        states[26] = java.lang.Byte.MIN_VALUE;
        states[27] = java.lang.Byte.MIN_VALUE;
        states[28] = java.lang.Byte.MIN_VALUE;
        states[29] = java.lang.Byte.MIN_VALUE;
        states[30] = java.lang.Byte.MIN_VALUE;
        states[31] = java.lang.Byte.MIN_VALUE;
        states[32] = java.lang.Byte.MIN_VALUE;
        states[33] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        double[] doubleArray = {0.0, 0.0};
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.ebeDivide(doubleArray);
    }
    
    @Test(timeout = 1000L)
    public void testEbeDivide3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[34];
        states[0] = (byte) 2;
        states[1] = (byte) 1;
        states[2] = java.lang.Byte.MIN_VALUE;
        states[3] = (byte) 1;
        states[4] = java.lang.Byte.MIN_VALUE;
        states[5] = java.lang.Byte.MIN_VALUE;
        states[6] = java.lang.Byte.MIN_VALUE;
        states[7] = java.lang.Byte.MIN_VALUE;
        states[8] = java.lang.Byte.MIN_VALUE;
        states[9] = java.lang.Byte.MIN_VALUE;
        states[10] = java.lang.Byte.MIN_VALUE;
        states[11] = java.lang.Byte.MIN_VALUE;
        states[12] = java.lang.Byte.MIN_VALUE;
        states[13] = java.lang.Byte.MIN_VALUE;
        states[14] = java.lang.Byte.MIN_VALUE;
        states[15] = java.lang.Byte.MIN_VALUE;
        states[16] = java.lang.Byte.MIN_VALUE;
        states[17] = java.lang.Byte.MIN_VALUE;
        states[18] = java.lang.Byte.MIN_VALUE;
        states[19] = java.lang.Byte.MIN_VALUE;
        states[20] = java.lang.Byte.MIN_VALUE;
        states[21] = java.lang.Byte.MIN_VALUE;
        states[22] = java.lang.Byte.MIN_VALUE;
        states[23] = java.lang.Byte.MIN_VALUE;
        states[24] = java.lang.Byte.MIN_VALUE;
        states[25] = java.lang.Byte.MIN_VALUE;
        states[26] = java.lang.Byte.MIN_VALUE;
        states[27] = java.lang.Byte.MIN_VALUE;
        states[28] = java.lang.Byte.MIN_VALUE;
        states[29] = java.lang.Byte.MIN_VALUE;
        states[30] = java.lang.Byte.MIN_VALUE;
        states[31] = java.lang.Byte.MIN_VALUE;
        states[32] = java.lang.Byte.MIN_VALUE;
        states[33] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 4);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.ebeDivide(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.ebeDivide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeDivide(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testEbeDivide_OpenIntToDoubleHashMapIterator1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {0.0};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeDivideMethod = openMapRealVectorClazz.getDeclaredMethod("ebeDivide", fortranArrayType);
        ebeDivideMethod.setAccessible(true);
        java.lang.Object[] ebeDivideMethodArguments = new java.lang.Object[1];
        ebeDivideMethodArguments[0] = fortranArray;
        OpenMapRealVector actual = ((OpenMapRealVector) ebeDivideMethod.invoke(openMapRealVector, ebeDivideMethodArguments));
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) -127};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeDivide(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:343) */
        openMapRealVector.ebeDivide(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException_11() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {0.0};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:344) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeDivideMethod = openMapRealVectorClazz.getDeclaredMethod("ebeDivide", fortranArrayType);
        ebeDivideMethod.setAccessible(true);
        java.lang.Object[] ebeDivideMethodArguments = new java.lang.Object[1];
        ebeDivideMethodArguments[0] = fortranArray;
        try {
            ebeDivideMethod.invoke(openMapRealVector, ebeDivideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException_21() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {0.0};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:344) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeDivideMethod = openMapRealVectorClazz.getDeclaredMethod("ebeDivide", fortranArrayType);
        ebeDivideMethod.setAccessible(true);
        java.lang.Object[] ebeDivideMethodArguments = new java.lang.Object[1];
        ebeDivideMethodArguments[0] = fortranArray;
        try {
            ebeDivideMethod.invoke(openMapRealVector, ebeDivideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeDivide(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.ebeDivide(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_ThrowDimensionMismatchException1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeDivideMethod = openMapRealVectorClazz.getDeclaredMethod("ebeDivide", arrayRealVectorType);
        ebeDivideMethod.setAccessible(true);
        java.lang.Object[] ebeDivideMethodArguments = new java.lang.Object[1];
        ebeDivideMethodArguments[0] = arrayRealVector;
        try {
            ebeDivideMethod.invoke(openMapRealVector, ebeDivideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ebeDivide(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testEbeDivide4() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:344) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeDivideMethod = openMapRealVectorClazz.getDeclaredMethod("ebeDivide", fortranArrayType);
        ebeDivideMethod.setAccessible(true);
        java.lang.Object[] ebeDivideMethodArguments = new java.lang.Object[1];
        ebeDivideMethodArguments[0] = fortranArray;
        try {
            ebeDivideMethod.invoke(openMapRealVector, ebeDivideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEbeDivide5() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[34];
        states[0] = (byte) 2;
        states[1] = (byte) 2;
        states[2] = (byte) 1;
        states[3] = (byte) 2;
        states[4] = (byte) 2;
        states[5] = (byte) 2;
        states[6] = (byte) 2;
        states[7] = (byte) 2;
        states[8] = (byte) 2;
        states[9] = (byte) 2;
        states[10] = (byte) 2;
        states[11] = (byte) 2;
        states[12] = (byte) 2;
        states[13] = (byte) 2;
        states[14] = (byte) 2;
        states[15] = (byte) 2;
        states[16] = (byte) 2;
        states[17] = (byte) 2;
        states[18] = (byte) 2;
        states[19] = (byte) 2;
        states[20] = (byte) 2;
        states[21] = (byte) 2;
        states[22] = (byte) 2;
        states[23] = (byte) 2;
        states[24] = (byte) 2;
        states[25] = (byte) 2;
        states[26] = (byte) 2;
        states[27] = (byte) 2;
        states[28] = (byte) 2;
        states[29] = (byte) 2;
        states[30] = (byte) 2;
        states[31] = (byte) 2;
        states[32] = (byte) 2;
        states[33] = (byte) 2;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            org.apache.commons.math.linear.ArrayRealVector.getEntry(ArrayRealVector.java:813)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray.getEntry(BOBYQAOptimizer.java:3161)
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:348) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeDivideMethod = openMapRealVectorClazz.getDeclaredMethod("ebeDivide", fortranArrayType);
        ebeDivideMethod.setAccessible(true);
        java.lang.Object[] ebeDivideMethodArguments = new java.lang.Object[1];
        ebeDivideMethodArguments[0] = fortranArray;
        try {
            ebeDivideMethod.invoke(openMapRealVector, ebeDivideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEbeDivide6() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:344) */
        openMapRealVector.ebeDivide(((RealVector) openMapRealVector1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLInfDistance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(double[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetLInfDistance_ReturnMax() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        double[] doubleArray = {};
        
        double actual = openMapRealVector.getLInfDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetLInfDistance_DeltaLessOrEqualMax() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0, (byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {-0.0};
        
        double actual = openMapRealVector.getLInfDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLInfDistance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.length);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetLInfDistance_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        double[] doubleArray = {0.0, 0.0};
        
        openMapRealVector.getLInfDistance(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:576) */
        openMapRealVector.getLInfDistance(((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = FastMath.abs(getEntry(i) - v[i]);
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:579) */
        openMapRealVector.getLInfDistance(doubleArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLInfDistance([D)
    
    @Test
    public void testGetLInfDistance1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -1.0000076295128526);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {-0.4999418259813458};
        
        double actual = openMapRealVector.getLInfDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.5000658035315069, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getLInfDistance([D)
    
    @Test(timeout = 1000L)
    public void testGetLInfDistance2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.getLInfDistance(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:545) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = ((Object) null);
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:545) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = ((Object) null);
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:550) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = ((Object) null);
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_11() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:545) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = ((Object) null);
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_3() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:542) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = ((Object) null);
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_4() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:550) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = ((Object) null);
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:545) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = ((Object) null);
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetLInfDistance_ThrowOutOfRangeException() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = openMapRealVector1;
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test(timeout = 1000L)
    public void testGetLInfDistance3() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            2, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 3);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = openMapRealVector1;
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getData()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(double[])}
 * @utbot.returnsFrom {@code return getLInfDistance(v.getData());}
 *  */
    @Test
    public void testGetLInfDistance_NotVNotInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", arrayRealVectorType);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = arrayRealVector;
        double actual = ((Double) getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:566) */
        openMapRealVector.getLInfDistance(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getLInfDistance((OpenMapRealVector) v);
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_12() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:542)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:568) */
        openMapRealVector.getLInfDistance(((RealVector) openMapRealVector));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetLInfDistance_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getLInfDistance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetLInfDistance_ThrowDimensionMismatchException1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", arrayRealVectorType);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = arrayRealVector;
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testGetLInfDistance4() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.343725125073E-311);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-1.117973552926945E-308, 4.778309744537072E-299};
        arrayRealVector.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException] */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", arrayRealVectorType);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = arrayRealVector;
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    @Test(timeout = 1000L)
    public void testGetLInfDistance5() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", arrayRealVectorType);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = arrayRealVector;
        try {
            getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getSubVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSubVector(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testGetSubVector_OpenIntToDoubleHashMapIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        OpenMapRealVector actual = openMapRealVector.getSubVector(0, 1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = new byte[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.0E-12);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSubVector(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getSubVector(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getSubVector(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index + n - 1);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_ThrowOutOfRangeException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        openMapRealVector.getSubVector(0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSubVector(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int key = iter.key();
 *  */
    @Test
    public void testGetSubVector_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getSubVector(OpenMapRealVector.java:400) */
        openMapRealVector.getSubVector(0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res.setEntry(key - index, iter.value());
 *  */
    @Test
    public void testGetSubVector_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getSubVector(OpenMapRealVector.java:402) */
        openMapRealVector.getSubVector(0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetSubVector_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getSubVector(OpenMapRealVector.java:397) */
        openMapRealVector.getSubVector(0, 1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSubVector(int, int)
    
    @Test
    public void testGetSubVector1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 60292928);
        
        OpenMapRealVector actual = openMapRealVector.getSubVector(33554432, 0);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values = new double[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = new byte[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.0E-12);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetSubVector2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1073741824, 33554432, 33554432, 33554432, 33554432, 33554432, 33554432, 33554432,
            33554432
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 43515712);
        
        OpenMapRealVector actual = openMapRealVector.getSubVector(33554432, 0);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values = new double[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = new byte[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.0E-12);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSubVector(int, int)
    
    @Test
    public void testGetSubVector3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = new byte[11];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 59244288);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getSubVector(OpenMapRealVector.java:400) */
        openMapRealVector.getSubVector(33554432, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.dotProduct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dotProduct(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 *  */
    @Test
    public void testDotProduct_VInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        double actual = openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.AbstractRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
 *  */
    @Test
    public void testDotProduct_NotVNotInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method dotProductMethod = openMapRealVectorClazz.getDeclaredMethod("dotProduct", arrayRealVectorType);
        dotProductMethod.setAccessible(true);
        java.lang.Object[] dotProductMethodArguments = new java.lang.Object[1];
        dotProductMethodArguments[0] = arrayRealVector;
        double actual = ((Double) dotProductMethod.invoke(openMapRealVector, dotProductMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method dotProduct(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: return dotProduct((OpenMapRealVector) v);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDotProduct_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.AbstractRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: return super.dotProduct(v);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDotProduct_ThrowDimensionMismatchException_1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method dotProductMethod = openMapRealVectorClazz.getDeclaredMethod("dotProduct", arrayRealVectorType);
        dotProductMethod.setAccessible(true);
        java.lang.Object[] dotProductMethodArguments = new java.lang.Object[1];
        dotProductMethodArguments[0] = arrayRealVector;
        try {
            dotProductMethod.invoke(openMapRealVector, dotProductMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method dotProduct(org.apache.commons.math.linear.RealVector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
     */
    @Test
    public void testDotProductThrowsNPE() {
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(-2147483647, -1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.AbstractRealVector.checkVectorDimensions(AbstractRealVector.java:52)
            org.apache.commons.math.linear.AbstractRealVector.dotProduct(AbstractRealVector.java:177)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:337) */
        openMapRealVector.dotProduct(((RealVector) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method dotProduct(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testDotProduct1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        double actual = openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method dotProduct(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testDotProduct2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:326)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:335) */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testDotProduct3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:326)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:335) */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testDotProduct4() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 9);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        arrayRealVector.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:875)
            org.apache.commons.math.linear.AbstractRealVector.dotProduct(AbstractRealVector.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:337) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method dotProductMethod = openMapRealVectorClazz.getDeclaredMethod("dotProduct", arrayRealVectorType);
        dotProductMethod.setAccessible(true);
        java.lang.Object[] dotProductMethodArguments = new java.lang.Object[1];
        dotProductMethodArguments[0] = arrayRealVector;
        try {
            dotProductMethod.invoke(openMapRealVector, dotProductMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.dotProduct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dotProduct(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): True}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testDotProduct_ThisIsSmaller() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 256);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        double actual = openMapRealVector.dotProduct(openMapRealVector1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testDotProduct_NotThisIsSmaller() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = openMapRealVector.dotProduct(openMapRealVector1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dotProduct(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): True}
 * @utbot.executesCondition {@code (thisIsSmaller): True}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 256);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:326) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:326) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:319) */
        openMapRealVector.dotProduct(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean thisIsSmaller = entries.size() < v.entries.size();
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:320) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean thisIsSmaller = entries.size() < v.entries.size();
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:320) */
        openMapRealVector.dotProduct(openMapRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method dotProduct(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDotProduct_ThrowDimensionMismatchException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -2);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method dotProduct(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test
    public void testDotProduct5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:326) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    @Test
    public void testDotProduct6() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[39];
        keys[0] = 56;
        keys[1] = 56;
        keys[2] = 56;
        keys[3] = 56;
        keys[4] = 56;
        keys[5] = 56;
        keys[6] = 56;
        keys[7] = 56;
        keys[8] = 56;
        keys[9] = 56;
        keys[10] = 56;
        keys[11] = 56;
        keys[12] = 56;
        keys[13] = 56;
        keys[14] = 56;
        keys[15] = 56;
        keys[16] = 56;
        keys[17] = 56;
        keys[18] = 56;
        keys[19] = 56;
        keys[20] = 56;
        keys[21] = 56;
        keys[22] = 56;
        keys[23] = 56;
        keys[24] = 56;
        keys[25] = 56;
        keys[26] = 56;
        keys[27] = 56;
        keys[28] = 56;
        keys[29] = 56;
        keys[30] = 56;
        keys[31] = 56;
        keys[32] = 56;
        keys[33] = 56;
        keys[34] = 56;
        keys[35] = 56;
        keys[36] = 56;
        keys[37] = 56;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1073741824);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 38);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            866123769, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:186)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:326) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    @Test
    public void testDotProduct7() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:326) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    @Test
    public void testDotProduct8() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException] */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    @Test
    public void testDotProduct9() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException] */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method dotProduct(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test(timeout = 1000L)
    public void testDotProduct10() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeMultiply([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testEbeMultiply_OpenIntToDoubleHashMapIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        double[] doubleArray = {0.0};
        
        OpenMapRealVector actual = openMapRealVector.ebeMultiply(doubleArray);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) -127};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeMultiply([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.length);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        double[] doubleArray = {0.0, 0.0};
        
        openMapRealVector.ebeMultiply(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeMultiply([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(double[])}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testEbeMultiply_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.225073858507202E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index -255 out of bounds for length 1]
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:386) */
        openMapRealVector.ebeMultiply(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:381) */
        openMapRealVector.ebeMultiply(((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:382) */
        openMapRealVector.ebeMultiply(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:382) */
        openMapRealVector.ebeMultiply(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeMultiply(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testEbeMultiply_OpenIntToDoubleHashMapIterator1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {0.0};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeMultiplyMethod = openMapRealVectorClazz.getDeclaredMethod("ebeMultiply", fortranArrayType);
        ebeMultiplyMethod.setAccessible(true);
        java.lang.Object[] ebeMultiplyMethodArguments = new java.lang.Object[1];
        ebeMultiplyMethodArguments[0] = fortranArray;
        OpenMapRealVector actual = ((OpenMapRealVector) ebeMultiplyMethod.invoke(openMapRealVector, ebeMultiplyMethodArguments));
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) -127};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeMultiply(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testEbeMultiply_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {0.0};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index -256 out of bounds for length 1]
            org.apache.commons.math.linear.ArrayRealVector.getEntry(ArrayRealVector.java:813)
            org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray.getEntry(BOBYQAOptimizer.java:3161)
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:373) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeMultiplyMethod = openMapRealVectorClazz.getDeclaredMethod("ebeMultiply", fortranArrayType);
        ebeMultiplyMethod.setAccessible(true);
        java.lang.Object[] ebeMultiplyMethodArguments = new java.lang.Object[1];
        ebeMultiplyMethodArguments[0] = fortranArray;
        try {
            ebeMultiplyMethod.invoke(openMapRealVector, ebeMultiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:368) */
        openMapRealVector.ebeMultiply(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException_11() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {0.0};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:369) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeMultiplyMethod = openMapRealVectorClazz.getDeclaredMethod("ebeMultiply", fortranArrayType);
        ebeMultiplyMethod.setAccessible(true);
        java.lang.Object[] ebeMultiplyMethodArguments = new java.lang.Object[1];
        ebeMultiplyMethodArguments[0] = fortranArray;
        try {
            ebeMultiplyMethod.invoke(openMapRealVector, ebeMultiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException_21() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {0.0};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:369) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeMultiplyMethod = openMapRealVectorClazz.getDeclaredMethod("ebeMultiply", fortranArrayType);
        ebeMultiplyMethod.setAccessible(true);
        java.lang.Object[] ebeMultiplyMethodArguments = new java.lang.Object[1];
        ebeMultiplyMethodArguments[0] = fortranArray;
        try {
            ebeMultiplyMethod.invoke(openMapRealVector, ebeMultiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeMultiply(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.ebeMultiply(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_ThrowDimensionMismatchException1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method ebeMultiplyMethod = openMapRealVectorClazz.getDeclaredMethod("ebeMultiply", arrayRealVectorType);
        ebeMultiplyMethod.setAccessible(true);
        java.lang.Object[] ebeMultiplyMethodArguments = new java.lang.Object[1];
        ebeMultiplyMethodArguments[0] = arrayRealVector;
        try {
            ebeMultiplyMethod.invoke(openMapRealVector, ebeMultiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.mapAdd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapAdd(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAdd(double)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#copy()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.returnsFrom {@code return copy().mapAddToSelf(d);}
 *  */
    @Test
    public void testMapAdd_OpenMapRealVectorMapAddToSelf() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        OpenMapRealVector actual = openMapRealVector.mapAdd(java.lang.Double.NaN);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapAdd(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAdd(double)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return copy().mapAddToSelf(d);
 *  */
    @Test
    public void testMapAdd_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:194)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:626)
            org.apache.commons.math.linear.OpenMapRealVector.mapAdd(OpenMapRealVector.java:619) */
        openMapRealVector.mapAdd(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAdd(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return copy().mapAddToSelf(d);
 *  */
    @Test
    public void testMapAdd_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAdd] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.mapAdd(OpenMapRealVector.java:619) */
        openMapRealVector.mapAdd(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAdd(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return copy().mapAddToSelf(d);
 *  */
    @Test
    public void testMapAdd_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAdd] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.mapAdd(OpenMapRealVector.java:619) */
        openMapRealVector.mapAdd(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.projection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method projection(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
 *  */
    @Test
    public void testProjection_OpenMapRealVectorDotProduct() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method projectionMethod = openMapRealVectorClazz.getDeclaredMethod("projection", arrayRealVectorType);
        projectionMethod.setAccessible(true);
        java.lang.Object[] projectionMethodArguments = new java.lang.Object[1];
        projectionMethodArguments[0] = arrayRealVector;
        ArrayRealVector actual = ((ArrayRealVector) projectionMethod.invoke(openMapRealVector, projectionMethodArguments));
        
        ArrayRealVector expected = new ArrayRealVector(0);
        double[] data1 = {java.lang.Double.NaN};
        expected.data = data1;
        
        // org.apache.commons.math.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method projection(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testProjection_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.projection(OpenMapRealVector.java:650) */
        openMapRealVector.projection(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProjection_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:134)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:33)
            org.apache.commons.math.linear.AbstractRealVector.mapMultiply(AbstractRealVector.java:369)
            org.apache.commons.math.linear.OpenMapRealVector.projection(OpenMapRealVector.java:651) */
        openMapRealVector.projection(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProjection_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 127);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 128);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.advance(OpenIntToDoubleHashMap.java:572)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:506)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:484)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator(OpenIntToDoubleHashMap.java:241)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:321)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:335)
            org.apache.commons.math.linear.OpenMapRealVector.projection(OpenMapRealVector.java:651) */
        openMapRealVector.projection(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method projection(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testProjection_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.projection(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testProjection_ThrowDimensionMismatchException() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method projectionMethod = openMapRealVectorClazz.getDeclaredMethod("projection", arrayRealVectorType);
        projectionMethod.setAccessible(true);
        java.lang.Object[] projectionMethodArguments = new java.lang.Object[1];
        projectionMethodArguments[0] = arrayRealVector;
        try {
            projectionMethod.invoke(openMapRealVector, projectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.projection
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method projection([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#projection(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.length);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testProjection_ThrowDimensionMismatchException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        double[] doubleArray = {0.0, 0.0};
        
        openMapRealVector.projection(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method projection([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#projection(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testProjection_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.projection(OpenMapRealVector.java:657) */
        openMapRealVector.projection(((double[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.outerProduct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method outerProduct([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#outerProduct(double[])}
 *  */
    @Test
    public void testOuterProduct() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) openMapRealVector.outerProduct(doubleArray));
        
        OpenMapRealMatrix expected = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = new byte[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        int expectedRows = ((Integer) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        assertEquals(expectedRows, actualRows);
        
        int expectedColumns = ((Integer) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        assertEquals(expectedColumns, actualColumns);
        
        OpenIntToDoubleHashMap expectedEntries = ((OpenIntToDoubleHashMap) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] expectedEntriesKeys = ((int[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        int[] actualEntriesKeys = ((int[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        int expectedEntriesKeysSize = expectedEntriesKeys.length;
        assertEquals(expectedEntriesKeysSize, actualEntriesKeys.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
        byte[] expectedEntriesStates = ((byte[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte[] actualEntriesStates = ((byte[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        int expectedEntriesStatesSize = expectedEntriesStates.length;
        assertEquals(expectedEntriesStatesSize, actualEntriesStates.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesStates, actualEntriesStates);
        
        double expectedEntriesMissingEntries = ((Double) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries"));
        double actualEntriesMissingEntries = ((Double) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries"));
        org.junit.Assert.assertEquals(expectedEntriesMissingEntries, actualEntriesMissingEntries, 1.0E-6);
        
        int expectedEntriesSize = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        int actualEntriesSize = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        assertEquals(expectedEntriesSize, actualEntriesSize);
        
        int expectedEntriesMask = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask"));
        int actualEntriesMask = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask"));
        assertEquals(expectedEntriesMask, actualEntriesMask);
        
        int expectedEntriesCount = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        int actualEntriesCount = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        assertEquals(expectedEntriesCount, actualEntriesCount);
        
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#outerProduct(double[])}
 *  */
    @Test
    public void testOuterProduct_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) openMapRealVector.outerProduct(doubleArray));
        
        OpenMapRealMatrix expected = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = new byte[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        int expectedRows = ((Integer) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows"));
        assertEquals(expectedRows, actualRows);
        
        int expectedColumns = ((Integer) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns"));
        assertEquals(expectedColumns, actualColumns);
        
        OpenIntToDoubleHashMap expectedEntries = ((OpenIntToDoubleHashMap) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] expectedEntriesKeys = ((int[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        int[] actualEntriesKeys = ((int[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        int expectedEntriesKeysSize = expectedEntriesKeys.length;
        assertEquals(expectedEntriesKeysSize, actualEntriesKeys.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
        byte[] expectedEntriesStates = ((byte[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte[] actualEntriesStates = ((byte[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        int expectedEntriesStatesSize = expectedEntriesStates.length;
        assertEquals(expectedEntriesStatesSize, actualEntriesStates.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesStates, actualEntriesStates);
        
        double expectedEntriesMissingEntries = ((Double) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries"));
        double actualEntriesMissingEntries = ((Double) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries"));
        org.junit.Assert.assertEquals(expectedEntriesMissingEntries, actualEntriesMissingEntries, 1.0E-6);
        
        int expectedEntriesSize = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        int actualEntriesSize = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        assertEquals(expectedEntriesSize, actualEntriesSize);
        
        int expectedEntriesMask = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask"));
        int actualEntriesMask = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask"));
        assertEquals(expectedEntriesMask, actualEntriesMask);
        
        int expectedEntriesCount = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        int actualEntriesCount = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        assertEquals(expectedEntriesCount, actualEntriesCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerProduct([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#outerProduct(double[])}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int row = iter.key();
 *  */
    @Test
    public void testOuterProduct_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.outerProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.outerProduct(OpenMapRealVector.java:639) */
        openMapRealVector.outerProduct(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#outerProduct(double[])}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double value = iter.value();
 *  */
    @Test
    public void testOuterProduct_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.outerProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.outerProduct(OpenMapRealVector.java:640) */
        openMapRealVector.outerProduct(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#outerProduct(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int n = v.length;
 *  */
    @Test
    public void testOuterProduct_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.outerProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.outerProduct(OpenMapRealVector.java:634) */
        openMapRealVector.outerProduct(((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#outerProduct(double[])}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testOuterProduct_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.outerProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.outerProduct(OpenMapRealVector.java:636) */
        openMapRealVector.outerProduct(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#outerProduct(double[])}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testOuterProduct_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.outerProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.outerProduct(OpenMapRealVector.java:639) */
        openMapRealVector.outerProduct(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method outerProduct([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#outerProduct(double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: RealMatrix res = new OpenMapRealMatrix(virtualSize, n);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testOuterProduct_ThrowNotStrictlyPositiveException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {};
        
        openMapRealVector.outerProduct(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#outerProduct(double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: RealMatrix res = new OpenMapRealMatrix(virtualSize, n);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testOuterProduct_ThrowNotStrictlyPositiveException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        double[] doubleArray = {0.0};
        
        openMapRealVector.outerProduct(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getL1Distance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getData()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.returnsFrom {@code return getL1Distance(v.getData());}
 *  */
    @Test
    public void testGetL1Distance_NotVNotInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getL1DistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getL1Distance", arrayRealVectorType);
        getL1DistanceMethod.setAccessible(true);
        java.lang.Object[] getL1DistanceMethodArguments = new java.lang.Object[1];
        getL1DistanceMethodArguments[0] = arrayRealVector;
        double actual = ((Double) getL1DistanceMethod.invoke(openMapRealVector, getL1DistanceMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:515) */
        openMapRealVector.getL1Distance(((RealVector) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getL1Distance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetL1Distance_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getL1Distance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetL1Distance_ThrowDimensionMismatchException() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getL1DistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getL1Distance", arrayRealVectorType);
        getL1DistanceMethod.setAccessible(true);
        java.lang.Object[] getL1DistanceMethodArguments = new java.lang.Object[1];
        getL1DistanceMethodArguments[0] = arrayRealVector;
        try {
            getL1DistanceMethod.invoke(openMapRealVector, getL1DistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:497) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:497) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:494) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:500) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:500) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:497) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:497) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:497) */
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetL1Distance_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetL1Distance_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getL1Distance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetL1Distance_ReturnMax() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        double[] doubleArray = {};
        
        double actual = openMapRealVector.getL1Distance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetL1Distance_IterateForLoop() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 5.818921303755822E-306);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {1.7557080120026898E-300};
        
        double actual = openMapRealVector.getL1Distance(doubleArray);
        
        org.junit.Assert.assertEquals(1.755702193081386E-300, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetL1Distance_IterateForLoop_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 1.4833822324871946);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {-1.3623613194236417};
        
        double actual = openMapRealVector.getL1Distance(doubleArray);
        
        org.junit.Assert.assertEquals(2.8457435519108363, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetL1Distance_IterateForLoop_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -2147483646};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {-6.136337622943112E-308};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {-6.136337622943112E-308};
        
        double actual = openMapRealVector.getL1Distance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:528) */
        openMapRealVector.getL1Distance(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:525) */
        openMapRealVector.getL1Distance(((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:528) */
        openMapRealVector.getL1Distance(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getL1Distance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.length);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetL1Distance_ThrowDimensionMismatchException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        double[] doubleArray = {0.0, 0.0};
        
        openMapRealVector.getL1Distance(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.setSubVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSubVector(int, [D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 *  */
    @Test
    public void testSetSubVector_OpenMapRealVectorCheckIndex() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 3);
        double[] doubleArray = {};
        
        openMapRealVector.setSubVector(1, doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSubVector(int, [D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index + v.length - 1);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {};
        
        openMapRealVector.setSubVector(0, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(-1, ((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(0, ((double[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSubVector(int, [D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkIndex(index + v.length - 1);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:683) */
        openMapRealVector.setSubVector(0, ((double[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.setSubVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSubVector(int, org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getData()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,double[])}
 *  */
    @Test
    public void testSetSubVector_OpenMapRealVectorSetSubVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 257);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class intType = int.class;
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method setSubVectorMethod = openMapRealVectorClazz.getDeclaredMethod("setSubVector", intType, fortranArrayType);
        setSubVectorMethod.setAccessible(true);
        java.lang.Object[] setSubVectorMethodArguments = new java.lang.Object[2];
        setSubVectorMethodArguments[0] = 256;
        setSubVectorMethodArguments[1] = fortranArray;
        setSubVectorMethod.invoke(openMapRealVector, setSubVectorMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSubVector(int, org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index + v.getDimension() - 1);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(0, openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(0, ((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(-1, ((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: checkIndex(index + v.getDimension() - 1);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException_21() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class intType = int.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method setSubVectorMethod = openMapRealVectorClazz.getDeclaredMethod("setSubVector", intType, arrayRealVectorType);
        setSubVectorMethod.setAccessible(true);
        java.lang.Object[] setSubVectorMethodArguments = new java.lang.Object[2];
        setSubVectorMethodArguments[0] = 0;
        setSubVectorMethodArguments[1] = arrayRealVector;
        try {
            setSubVectorMethod.invoke(openMapRealVector, setSubVectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSubVector(int, org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: setSubVector(index, v.getData());
 *  */
    @Test
    public void testSetSubVector_ThrowNegativeArraySizeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 256);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NegativeArraySizeException: -254]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:411)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:676) */
        openMapRealVector.setSubVector(255, openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setSubVector(index, v.getData());
 *  */
    @Test
    public void testSetSubVector_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {Integer.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 1]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:676) */
        openMapRealVector.setSubVector(0, openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setSubVector(index, v.getData());
 *  */
    @Test
    public void testSetSubVector_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:676) */
        openMapRealVector.setSubVector(0, openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setSubVector(index, v.getData());
 *  */
    @Test
    public void testSetSubVector_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:676) */
        openMapRealVector.setSubVector(0, openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkIndex(index + v.getDimension() - 1);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:675) */
        openMapRealVector.setSubVector(0, ((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:665)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:685)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:676) */
        openMapRealVector.setSubVector(0, openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setSubVector(index, v.getData());
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:415)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:676) */
        openMapRealVector.setSubVector(0, openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapAddToSelf(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAddToSelf_Return() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        OpenMapRealVector actual = openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(openMapRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapAddToSelf(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:626) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:626) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:626) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:195)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:626) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:626) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:626) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 2, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:194)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:626) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDistance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.returnsFrom {@code return FastMath.sqrt(res);}
 *  */
    @Test
    public void testGetDistance_ReturnFastMathSqrt() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        double[] doubleArray = {};
        
        double actual = openMapRealVector.getDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.returnsFrom {@code return FastMath.sqrt(res);}
 *  */
    @Test
    public void testGetDistance_IterateForLoop_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        double actual = openMapRealVector.getDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.returnsFrom {@code return FastMath.sqrt(res);}
 *  */
    @Test
    public void testGetDistance_IterateForLoop_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        double actual = openMapRealVector.getDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.returnsFrom {@code return FastMath.sqrt(res);}
 *  */
    @Test
    public void testGetDistance_IterateForLoop() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        double actual = openMapRealVector.getDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDistance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = entries.get(i) - v[i];
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471) */
        openMapRealVector.getDistance(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = entries.get(i) - v[i];
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471) */
        openMapRealVector.getDistance(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = entries.get(i) - v[i];
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:194)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471) */
        openMapRealVector.getDistance(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = entries.get(i) - v[i];
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471) */
        openMapRealVector.getDistance(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = entries.get(i) - v[i];
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:195)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471) */
        openMapRealVector.getDistance(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:468) */
        openMapRealVector.getDistance(((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = entries.get(i) - v[i];
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471) */
        openMapRealVector.getDistance(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = entries.get(i) - v[i];
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471) */
        openMapRealVector.getDistance(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = entries.get(i) - v[i];
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471) */
        openMapRealVector.getDistance(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDistance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.length);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetDistance_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        double[] doubleArray = {0.0, 0.0};
        
        openMapRealVector.getDistance(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getDistance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int key = iter.key();
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:438) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:440) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:440) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:440) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255, -255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:186)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:440) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:440) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:434) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:443) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_21() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:443) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_31() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:535)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:438) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:440) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:440) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_6() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:480)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:440) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetDistance_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetDistance_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getDistance(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getData()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.returnsFrom {@code return getDistance(v.getData());}
 *  */
    @Test
    public void testGetDistance_NotVNotInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getDistance", arrayRealVectorType);
        getDistanceMethod.setAccessible(true);
        java.lang.Object[] getDistanceMethodArguments = new java.lang.Object[1];
        getDistanceMethodArguments[0] = arrayRealVector;
        double actual = ((Double) getDistanceMethod.invoke(openMapRealVector, getDistanceMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_12() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {5.304989477E-315};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:462) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getDistance", fortranArrayType);
        getDistanceMethod.setAccessible(true);
        java.lang.Object[] getDistanceMethodArguments = new java.lang.Object[1];
        getDistanceMethodArguments[0] = fortranArray;
        try {
            getDistanceMethod.invoke(openMapRealVector, getDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException2() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {-0.0};
        arrayRealVector.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:462) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getDistance", arrayRealVectorType);
        getDistanceMethod.setAccessible(true);
        java.lang.Object[] getDistanceMethodArguments = new java.lang.Object[1];
        getDistanceMethodArguments[0] = arrayRealVector;
        try {
            getDistanceMethod.invoke(openMapRealVector, getDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:458) */
        openMapRealVector.getDistance(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_12() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        Object fortranArray = createInstance("org.apache.commons.math.optimization.direct.BOBYQAOptimizer$FortranArray");
        double[] data = {1.2882297539194267E-231};
        setField(fortranArray, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:385)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:471)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:462) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class fortranArrayType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getDistance", fortranArrayType);
        getDistanceMethod.setAccessible(true);
        java.lang.Object[] getDistanceMethodArguments = new java.lang.Object[1];
        getDistanceMethodArguments[0] = fortranArray;
        try {
            getDistanceMethod.invoke(openMapRealVector, getDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetDistance_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getDistance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetDistance_ThrowDimensionMismatchException1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0, 0.0};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method getDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getDistance", arrayRealVectorType);
        getDistanceMethod.setAccessible(true);
        java.lang.Object[] getDistanceMethodArguments = new java.lang.Object[1];
        getDistanceMethodArguments[0] = arrayRealVector;
        try {
            getDistanceMethod.invoke(openMapRealVector, getDistanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.isDefaultValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDefaultValue(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(value) < epsilon;}
 *  */
    @Test
    public void testIsDefaultValue_FastMathAbsLessThanEpsilon() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 6.212292209319139E-265);
        
        boolean actual = openMapRealVector.isDefaultValue(-2.927843967320439E-303);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(value) < epsilon;}
 *  */
    @Test
    public void testIsDefaultValue_FastMathAbsGreaterOrEqualEpsilon() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.2232472900896077E-296);
        
        boolean actual = openMapRealVector.isDefaultValue(-1.2232472900896077E-296);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(value) < epsilon;}
 *  */
    @Test
    public void testIsDefaultValue_FastMathAbsLessThanEpsilon_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.2957976386111284E-202);
        
        boolean actual = openMapRealVector.isDefaultValue(1.253684848667777E-221);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(value) < epsilon;}
 *  */
    @Test
    public void testIsDefaultValue_FastMathAbsGreaterOrEqualEpsilon_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", -0.0);
        
        boolean actual = openMapRealVector.isDefaultValue(0.0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.unitVector
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unitVector()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitVector()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathArithmeticException} 
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testUnitVector_ThrowMathArithmeticException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.0522684006491886E-289);
        
        openMapRealVector.unitVector();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitVector()}
 * @utbot.throwsException {@link org.apache.commons.math.exception.MathArithmeticException} 
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testUnitVector_ThrowMathArithmeticException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        openMapRealVector.unitVector();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unitVector()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitVector()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#unitize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testUnitVector_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.unitVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index -235868415 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:274)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:259)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:410)
            org.apache.commons.math.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:765)
            org.apache.commons.math.linear.OpenMapRealVector.unitVector(OpenMapRealVector.java:751) */
        openMapRealVector.unitVector();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitVector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = copy();
 *  */
    @Test
    public void testUnitVector_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.unitVector] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:138)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.unitVector(OpenMapRealVector.java:750) */
        openMapRealVector.unitVector();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitVector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = copy();
 *  */
    @Test
    public void testUnitVector_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.unitVector] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:140)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.unitVector(OpenMapRealVector.java:750) */
        openMapRealVector.unitVector();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.unitize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unitize()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitize()}
 *  */
    @Test
    public void testUnitize() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        openMapRealVector.unitize();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitize()}
 *  */
    @Test
    public void testUnitize_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        openMapRealVector.unitize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unitize()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testUnitize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.unitize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:875)
            org.apache.commons.math.linear.AbstractRealVector.getNorm(AbstractRealVector.java:233)
            org.apache.commons.math.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:758) */
        openMapRealVector.unitize();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testUnitize_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.unitize] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:552)
            org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:875)
            org.apache.commons.math.linear.AbstractRealVector.getNorm(AbstractRealVector.java:233)
            org.apache.commons.math.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:758) */
        openMapRealVector.unitize();
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unitize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitize()}
     */
    @Test(expected = MathArithmeticException.class)
    public void testUnitizeThrowsMAE() {
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(Integer.MIN_VALUE, -1);
        
        openMapRealVector.unitize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getSparsity
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSparsity()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSparsity()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.returnsFrom {@code return (double) entries.size() / (double) getDimension();}
 *  */
    @Test
    public void testGetSparsity_OpenMapRealVectorGetDimension() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        double actual = openMapRealVector.getSparsity();
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSparsity()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSparsity()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (double) entries.size() / (double) getDimension();
 *  */
    @Test
    public void testGetSparsity_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getSparsity] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getSparsity(OpenMapRealVector.java:845) */
        openMapRealVector.getSparsity();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.sparseIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sparseIterator()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#sparseIterator()}
 *  */
    @Test
    public void testSparseIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        OpenMapRealVector.OpenMapSparseIterator actual = ((OpenMapRealVector.OpenMapSparseIterator) openMapRealVector.sparseIterator());
        
        OpenMapRealVector.OpenMapSparseIterator expected = ((OpenMapRealVector.OpenMapSparseIterator) createInstance("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator"));
        OpenIntToDoubleHashMap.Iterator iter = ((OpenIntToDoubleHashMap.Iterator) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator"));
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "referenceCount", -255);
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "current", -1);
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "next", -2);
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "this$0", entries);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "iter", iter);
        OpenMapRealVector.OpenMapEntry current = ((OpenMapRealVector.OpenMapEntry) createInstance("org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry"));
        setField(current, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "iter", iter);
        setField(current, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "this$0", openMapRealVector);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "current", current);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "this$0", openMapRealVector);
        
        OpenIntToDoubleHashMap.Iterator expectedIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        OpenIntToDoubleHashMap.Iterator actualIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        int expectedIterReferenceCount = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        int actualIterReferenceCount = ((Integer) getFieldValue(actualIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        assertEquals(expectedIterReferenceCount, actualIterReferenceCount);
        
        int expectedIterCurrent = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "current"));
        int actualIterCurrent = ((Integer) getFieldValue(actualIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "current"));
        assertEquals(expectedIterCurrent, actualIterCurrent);
        
        int expectedIterNext = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "next"));
        int actualIterNext = ((Integer) getFieldValue(actualIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "next"));
        assertEquals(expectedIterNext, actualIterNext);
        
        RealVector.Entry expectedCurrent = ((RealVector.Entry) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        RealVector.Entry actualCurrent = ((RealVector.Entry) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        OpenIntToDoubleHashMap.Iterator expectedCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expectedCurrent, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        OpenIntToDoubleHashMap.Iterator actualCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actualCurrent, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        
        int expectedCurrentIndex = expectedCurrent.getIndex();
        int actualCurrentIndex = actualCurrent.getIndex();
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#sparseIterator()}
 * @utbot.returnsFrom {@code return new OpenMapSparseIterator();}
 *  */
    @Test
    public void testSparseIterator_Return() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        OpenMapRealVector.OpenMapSparseIterator actual = ((OpenMapRealVector.OpenMapSparseIterator) openMapRealVector.sparseIterator());
        
        OpenMapRealVector.OpenMapSparseIterator expected = ((OpenMapRealVector.OpenMapSparseIterator) createInstance("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator"));
        OpenIntToDoubleHashMap.Iterator iter = ((OpenIntToDoubleHashMap.Iterator) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator"));
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "referenceCount", -255);
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "current", -1);
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "this$0", entries);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "iter", iter);
        OpenMapRealVector.OpenMapEntry current = ((OpenMapRealVector.OpenMapEntry) createInstance("org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry"));
        setField(current, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "iter", iter);
        setField(current, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "this$0", openMapRealVector);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "current", current);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "this$0", openMapRealVector);
        
        OpenIntToDoubleHashMap.Iterator expectedIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        OpenIntToDoubleHashMap.Iterator actualIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        int expectedIterReferenceCount = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        int actualIterReferenceCount = ((Integer) getFieldValue(actualIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        assertEquals(expectedIterReferenceCount, actualIterReferenceCount);
        
        int expectedIterCurrent = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "current"));
        int actualIterCurrent = ((Integer) getFieldValue(actualIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "current"));
        assertEquals(expectedIterCurrent, actualIterCurrent);
        
        int expectedIterNext = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "next"));
        int actualIterNext = ((Integer) getFieldValue(actualIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "next"));
        assertEquals(expectedIterNext, actualIterNext);
        
        RealVector.Entry expectedCurrent = ((RealVector.Entry) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        RealVector.Entry actualCurrent = ((RealVector.Entry) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        OpenIntToDoubleHashMap.Iterator expectedCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expectedCurrent, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        OpenIntToDoubleHashMap.Iterator actualCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actualCurrent, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        
        int expectedCurrentIndex = expectedCurrent.getIndex();
        int actualCurrentIndex = actualCurrent.getIndex();
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#sparseIterator()}
 *  */
    @Test
    public void testSparseIterator_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        OpenMapRealVector.OpenMapSparseIterator actual = ((OpenMapRealVector.OpenMapSparseIterator) openMapRealVector.sparseIterator());
        
        OpenMapRealVector.OpenMapSparseIterator expected = ((OpenMapRealVector.OpenMapSparseIterator) createInstance("org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator"));
        OpenIntToDoubleHashMap.Iterator iter = ((OpenIntToDoubleHashMap.Iterator) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator"));
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "referenceCount", -255);
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "current", -1);
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "next", -2);
        setField(iter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "this$0", entries);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "iter", iter);
        OpenMapRealVector.OpenMapEntry current = ((OpenMapRealVector.OpenMapEntry) createInstance("org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry"));
        setField(current, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "iter", iter);
        setField(current, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "this$0", openMapRealVector);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "current", current);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "this$0", openMapRealVector);
        
        OpenIntToDoubleHashMap.Iterator expectedIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        OpenIntToDoubleHashMap.Iterator actualIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        int expectedIterReferenceCount = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        int actualIterReferenceCount = ((Integer) getFieldValue(actualIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        assertEquals(expectedIterReferenceCount, actualIterReferenceCount);
        
        int expectedIterCurrent = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "current"));
        int actualIterCurrent = ((Integer) getFieldValue(actualIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "current"));
        assertEquals(expectedIterCurrent, actualIterCurrent);
        
        int expectedIterNext = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "next"));
        int actualIterNext = ((Integer) getFieldValue(actualIter, "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator", "next"));
        assertEquals(expectedIterNext, actualIterNext);
        
        RealVector.Entry expectedCurrent = ((RealVector.Entry) getFieldValue(expected, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        RealVector.Entry actualCurrent = ((RealVector.Entry) getFieldValue(actual, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        OpenIntToDoubleHashMap.Iterator expectedCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expectedCurrent, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        OpenIntToDoubleHashMap.Iterator actualCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actualCurrent, "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        
        int expectedCurrentIndex = expectedCurrent.getIndex();
        int actualCurrentIndex = actualCurrent.getIndex();
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields730901646262600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields730901646262600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass730901646268300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields730901646262600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass730901646268300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields730901646924700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields730901646924700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass730901646926500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields730901646924700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass730901646926500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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

