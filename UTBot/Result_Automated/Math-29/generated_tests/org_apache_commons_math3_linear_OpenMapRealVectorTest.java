package org.apache.commons.math3.linear;

import org.junit.Test;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.apache.commons.math3.exception.DimensionMismatchException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator;
import org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry;
import org.apache.commons.math3.linear.RealVector.Entry;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math3_linear_OpenMapRealVectorTest {
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDimension()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.returnsFrom {@code return virtualSize;}
 *  */
    @Test
    public void testGetDimension_ReturnVirtualSize() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        int actual = openMapRealVector.getDimension();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.setSubVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSubVector(int, org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.getDimension(); i++)} once
 *  */
    @Test
    public void testSetSubVector_OpenMapRealVectorCheckIndex() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 3);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.setSubVector(1, arrayRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSubVector(int, org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index + v.getDimension() - 1);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(0, openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(-1, null);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index + v.getDimension() - 1);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVector_ThrowOutOfRangeException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.setSubVector(0, arrayRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSubVector(int, org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.getDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSetSubVector_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 6.000000000000001);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {-5.678650493600519E-270};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591)
            org.apache.commons.math3.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:602) */
        openMapRealVector.setSubVector(0, arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.getDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i + index, v.getEntry(i));
 *  */
    @Test
    public void testSetSubVector_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -256};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 8.244810725680472E-230);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {-1.0306013407100588E-230};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:213)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591)
            org.apache.commons.math3.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:602) */
        openMapRealVector.setSubVector(255, arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkIndex(index + v.getDimension() - 1);
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:600) */
        openMapRealVector.setSubVector(0, null);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.getDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 2.2250739911319467E-308);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {-1.32624745E-315};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591)
            org.apache.commons.math3.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:602) */
        openMapRealVector.setSubVector(0, arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.getDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 3.0581387213346945E-297);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {-2.2784909019877715E-305};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591)
            org.apache.commons.math3.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:602) */
        openMapRealVector.setSubVector(255, arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.getDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSetSubVector_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.4916681476292662E-154);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {-1.4916681476292662E-154};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:590)
            org.apache.commons.math3.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:602) */
        openMapRealVector.setSubVector(0, arrayRealVector);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSubVector(int, org.apache.commons.math3.linear.RealVector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math3.linear.RealVector)}
     */
    @Test(expected = OutOfRangeException.class)
    public void testSetSubVectorThrowsOORE() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY};
        ArrayRealVector arrayRealVector = new ArrayRealVector(doubleArray1, false);
        
        openMapRealVector.setSubVector(-2147483647, arrayRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getSparsity
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSparsity()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSparsity()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#size()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.returnsFrom {@code return (double) entries.size() / (double) getDimension();}
 *  */
    @Test
    public void testGetSparsity_OpenMapRealVectorGetDimension() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        double actual = openMapRealVector.getSparsity();
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSparsity()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSparsity()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (double) entries.size() / (double) getDimension();
 *  */
    @Test
    public void testGetSparsity_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getSparsity] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getSparsity(OpenMapRealVector.java:753) */
        openMapRealVector.getSparsity();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeDivide(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testEbeDivide_OpenIntToDoubleHashMapIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        OpenMapRealVector actual = openMapRealVector.ebeDivide(((RealVector) arrayRealVector));
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeDivide(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testEbeDivide_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:352) */
        openMapRealVector.ebeDivide(((RealVector) arrayRealVector));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:342) */
        openMapRealVector.ebeDivide(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:343) */
        openMapRealVector.ebeDivide(((RealVector) arrayRealVector));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:343) */
        openMapRealVector.ebeDivide(((RealVector) arrayRealVector));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeDivide(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.ebeDivide(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.ebeDivide(((RealVector) arrayRealVector));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: res.setEntry(iter.key(), iter.value() / v.getEntry(iter.key()));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testEbeDivide_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.ebeDivide(((RealVector) arrayRealVector));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDistance(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.SparseRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.returnsFrom {@code return super.getDistance(v);}
 *  */
    @Test
    public void testGetDistance_NotVNotInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        double actual = openMapRealVector.getDistance(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDistance(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getDistance(RealVector.java:372)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:441) */
        openMapRealVector.getDistance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getDistance(RealVector.java:372)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:441) */
        openMapRealVector.getDistance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getDistance(RealVector.java:372)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:441) */
        openMapRealVector.getDistance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:437) */
        openMapRealVector.getDistance(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:422)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:439) */
        openMapRealVector.getDistance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getDistance((OpenMapRealVector) v);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:417)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:439) */
        openMapRealVector.getDistance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getDistance(RealVector.java:372)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:441) */
        openMapRealVector.getDistance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getDistance(RealVector.java:372)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:441) */
        openMapRealVector.getDistance(arrayRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDistance(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetDistance_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getDistance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetDistance_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.getDistance(arrayRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getDistance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDistance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int key = iter.key();
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:417) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:419) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:419) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:419) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255, -255};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:419) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:419) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:413) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:422) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_21() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:422) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_31() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:417) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_41() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:419) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:419) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_6() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 2, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:419) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDistance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetDistance_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetDistance_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getDistance(openMapRealVector1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getDistance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
     */
    @Test
    public void testGetDistanceReturnsNan() {
        double[] doubleArray = {-1.0, java.lang.Double.NEGATIVE_INFINITY, 1.0};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, java.lang.Double.NaN);
        java.lang.Double[] doubleArray1 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, 0.0};
        OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, -1.1235582092889474E307);
        
        double actual = openMapRealVector.getDistance(openMapRealVector1);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapAddToSelf(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testMapAddToSelf_Return() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        OpenMapRealVector actual = openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(openMapRealVector, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapAddToSelf(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:573) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:573) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:573) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:573) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:573) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:573) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:573) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 2, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:573) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method mapAddToSelf(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
     */
    @Test
    public void testMapAddToSelfWithCornerCase() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        
        OpenMapRealVector actual = openMapRealVector.mapAddToSelf(java.lang.Double.NEGATIVE_INFINITY);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 1;
        keys[2] = 2;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NEGATIVE_INFINITY;
        values[1] = java.lang.Double.NEGATIVE_INFINITY;
        values[2] = java.lang.Double.NaN;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 3);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 3);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 3);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.isDefaultValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDefaultValue(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(value) < epsilon;}
 *  */
    @Test
    public void testIsDefaultValue_FastMathAbsGreaterOrEqualEpsilon() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.666318098238392E-302);
        
        boolean actual = openMapRealVector.isDefaultValue(-4.666318098238392E-302);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(value) < epsilon;}
 *  */
    @Test
    public void testIsDefaultValue_FastMathAbsLessThanEpsilon() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 2.244412773384605E-190);
        
        boolean actual = openMapRealVector.isDefaultValue(-2.7934243076933574E-250);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(value) < epsilon;}
 *  */
    @Test
    public void testIsDefaultValue_FastMathAbsLessThanEpsilon_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 6.000061035156251);
        
        boolean actual = openMapRealVector.isDefaultValue(2.0523349453017665E-289);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(value) < epsilon;}
 *  */
    @Test
    public void testIsDefaultValue_FastMathAbsGreaterOrEqualEpsilon_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", -0.0);
        
        boolean actual = openMapRealVector.isDefaultValue(0.0);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466) */
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255, -255};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466) */
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:463) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:469) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:469) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_6() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466) */
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466) */
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetL1Distance_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetL1Distance_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector)}
     */
    @Test
    public void testGetL1DistanceReturnsNan() {
        double[] doubleArray = {-1.0, java.lang.Double.NEGATIVE_INFINITY, 1.0};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, java.lang.Double.NaN);
        java.lang.Double[] doubleArray1 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, 0.0};
        OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, -1.1235582092889474E307);
        
        double actual = openMapRealVector.getL1Distance(openMapRealVector1);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getL1Distance(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.SparseRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.returnsFrom {@code return super.getL1Distance(v);}
 *  */
    @Test
    public void testGetL1Distance_NotVNotInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        double actual = openMapRealVector.getL1Distance(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_31() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getL1Distance(RealVector.java:456)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:488) */
        openMapRealVector.getL1Distance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getL1Distance(RealVector.java:456)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:488) */
        openMapRealVector.getL1Distance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException_21() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getL1Distance(RealVector.java:456)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:488) */
        openMapRealVector.getL1Distance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getL1Distance((OpenMapRealVector) v);
 *  */
    @Test
    public void testGetL1Distance_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:486) */
        openMapRealVector.getL1Distance(((RealVector) openMapRealVector));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:484) */
        openMapRealVector.getL1Distance(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:469)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:486) */
        openMapRealVector.getL1Distance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getL1Distance((OpenMapRealVector) v);
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_21() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:486) */
        openMapRealVector.getL1Distance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_31() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getL1Distance(RealVector.java:456)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:488) */
        openMapRealVector.getL1Distance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException_41() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getL1Distance(RealVector.java:456)
            org.apache.commons.math3.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:488) */
        openMapRealVector.getL1Distance(arrayRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getL1Distance(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetL1Distance_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getL1Distance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetL1Distance_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.getL1Distance(arrayRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLInfDistance(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.SparseRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.returnsFrom {@code return super.getLInfDistance(v);}
 *  */
    @Test
    public void testGetLInfDistance_NotVNotInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        double actual = openMapRealVector.getLInfDistance(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getLInfDistance(RealVector.java:481)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:528) */
        openMapRealVector.getLInfDistance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getLInfDistance(RealVector.java:481)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:528) */
        openMapRealVector.getLInfDistance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:524) */
        openMapRealVector.getLInfDistance(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:508)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:526) */
        openMapRealVector.getLInfDistance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getLInfDistance((OpenMapRealVector) v);
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:500)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:526) */
        openMapRealVector.getLInfDistance(((RealVector) openMapRealVector));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getLInfDistance(RealVector.java:481)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:528) */
        openMapRealVector.getLInfDistance(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.RealVector$Entry.getValue(RealVector.java:1005)
            org.apache.commons.math3.linear.RealVector.getLInfDistance(RealVector.java:481)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:528) */
        openMapRealVector.getLInfDistance(arrayRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLInfDistance(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetLInfDistance_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getLInfDistance(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetLInfDistance_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.getLInfDistance(arrayRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:503) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:503) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255, -255};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:503) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:500) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_11() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:508) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_21() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:508) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_31() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:503) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_41() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:503) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_5() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:503) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetLInfDistance_ThrowOutOfRangeException() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: double delta = FastMath.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetLInfDistance_ThrowOutOfRangeException_1() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)}
     */
    @Test
    public void testGetLInfDistanceReturnsInfinity() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {-1.0, java.lang.Double.NEGATIVE_INFINITY, 1.0};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, java.lang.Double.NaN);
        java.lang.Double[] doubleArray1 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, 0.0};
        OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, -1.1235582092889474E307);
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = openMapRealVector1;
        double actual = ((Double) getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    @Test
    public void testGetLInfDistance1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1478258148, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            1.5966723998983076E294, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[33];
        keys1[0] = 128;
        keys1[1] = 128;
        keys1[2] = 128;
        keys1[3] = 128;
        keys1[4] = 128;
        keys1[5] = 128;
        keys1[6] = 128;
        keys1[7] = 128;
        keys1[8] = 128;
        keys1[9] = 128;
        keys1[10] = 128;
        keys1[11] = 128;
        keys1[12] = 128;
        keys1[13] = 128;
        keys1[14] = 128;
        keys1[15] = 128;
        keys1[16] = 128;
        keys1[17] = 128;
        keys1[18] = 128;
        keys1[19] = 128;
        keys1[20] = 128;
        keys1[21] = 128;
        keys1[22] = 128;
        keys1[23] = 128;
        keys1[24] = 128;
        keys1[25] = 128;
        keys1[26] = 128;
        keys1[27] = 128;
        keys1[28] = 128;
        keys1[29] = 128;
        keys1[30] = 128;
        keys1[31] = 128;
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = new byte[33];
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -9.717248878924822E293);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 32);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1479306821);
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Method getLInfDistanceMethod = openMapRealVectorClazz.getDeclaredMethod("getLInfDistance", openMapRealVectorClazz);
        getLInfDistanceMethod.setAccessible(true);
        java.lang.Object[] getLInfDistanceMethodArguments = new java.lang.Object[1];
        getLInfDistanceMethodArguments[0] = openMapRealVector1;
        double actual = ((Double) getLInfDistanceMethod.invoke(openMapRealVector, getLInfDistanceMethodArguments));
        
        org.junit.Assert.assertEquals(2.56839728779079E294, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    @Test
    public void testGetLInfDistance2() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            251658231, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states1 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            java.lang.Byte.MIN_VALUE
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 251658238);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:503) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
    
    ///region OTHER: TIMEOUTS for method getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector)
    
    @Test(timeout = 1000L)
    public void testGetLInfDistance3() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
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
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getSubVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSubVector(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.executesCondition {@code (n < 0): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testGetSubVector_NGreaterOrEqualZero() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        OpenMapRealVector actual = openMapRealVector.getSubVector(255, 1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = new byte[32];
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.0E-12);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSubVector(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getSubVector(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getSubVector(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.executesCondition {@code (n < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotPositiveException} when: n < 0
 *  */
    @Test(expected = NotPositiveException.class)
    public void testGetSubVector_ThrowNotPositiveException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        openMapRealVector.getSubVector(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.executesCondition {@code (n < 0): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index + n - 1);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetSubVector_ThrowOutOfRangeException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        openMapRealVector.getSubVector(0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSubVector(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int key = iter.key();
 *  */
    @Test
    public void testGetSubVector_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.getSubVector(OpenMapRealVector.java:390) */
        openMapRealVector.getSubVector(255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res.setEntry(key - index, iter.value());
 *  */
    @Test
    public void testGetSubVector_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.getSubVector(OpenMapRealVector.java:392) */
        openMapRealVector.getSubVector(255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetSubVector_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getSubVector(OpenMapRealVector.java:387) */
        openMapRealVector.getSubVector(255, 1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testGetSubVector_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.getSubVector(OpenMapRealVector.java:390) */
        openMapRealVector.getSubVector(255, 1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSubVector(int, int)
    
    @Test
    public void testGetSubVector1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1073741824, 27, 27, 27, 27, 27, 27, 27,
            27
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 16777217);
        
        OpenMapRealVector actual = openMapRealVector.getSubVector(1, 0);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[32];
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values = new double[32];
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = new byte[32];
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.0E-12);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetSubVector2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            2, 27, 27, 27, 27, 27, 27, 27,
            27
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            2.2250738585072093E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 8388648);
        
        OpenMapRealVector actual = openMapRealVector.getSubVector(0, 2097187);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[32];
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = new double[32];
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = new byte[32];
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2097187);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.0E-12);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetSubVector3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            2, 27, 27, 27, 27, 27, 27, 27,
            27
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -1.0E-12, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 671088736);
        
        OpenMapRealVector actual = openMapRealVector.getSubVector(0, 142606371);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[32];
        keys1[2] = 2;
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = new double[32];
        values1[2] = -1.0E-12;
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = new byte[32];
        states1[2] = (byte) 1;
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 142606371);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.0E-12);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSubVector(int, int)
    
    @Test
    public void testGetSubVector4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 33554431, 33554431, 33554431, 33554431, 33554431, 33554431, 33554431,
            33554431
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 60292128);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.getSubVector(OpenMapRealVector.java:392) */
        openMapRealVector.getSubVector(31095835, 2458597);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.mapAdd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mapAdd(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAdd(double)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#copy()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.returnsFrom {@code return copy().mapAddToSelf(d);}
 *  */
    @Test
    public void testMapAdd_OpenMapRealVectorMapAddToSelf() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        OpenMapRealVector actual = openMapRealVector.mapAdd(java.lang.Double.NaN);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mapAdd(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAdd(double)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return copy().mapAddToSelf(d);
 *  */
    @Test
    public void testMapAdd_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:573)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAdd(OpenMapRealVector.java:566) */
        openMapRealVector.mapAdd(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAdd(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return copy().mapAddToSelf(d);
 *  */
    @Test
    public void testMapAdd_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAdd] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAdd(OpenMapRealVector.java:566) */
        openMapRealVector.mapAdd(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAdd(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return copy().mapAddToSelf(d);
 *  */
    @Test
    public void testMapAdd_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.mapAdd] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.mapAdd(OpenMapRealVector.java:566) */
        openMapRealVector.mapAdd(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method mapAdd(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#mapAdd(double)}
     */
    @Test
    public void testMapAddWithCornerCase() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        
        OpenMapRealVector actual = openMapRealVector.mapAdd(java.lang.Double.NEGATIVE_INFINITY);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 1;
        keys[2] = 2;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NEGATIVE_INFINITY;
        values[1] = java.lang.Double.NEGATIVE_INFINITY;
        values[2] = java.lang.Double.NaN;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 3);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 3);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 3);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method mapAdd(double)
    
    @Test
    public void testMapAdd1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 26};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[33];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.8480945388892178E-306);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        OpenMapRealVector actual = openMapRealVector.mapAdd(java.lang.Double.NaN);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {1, 0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0, java.lang.Double.NaN};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.8480945388892178E-306);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method mapAdd(double)
    
    @Test(timeout = 1000L)
    public void testMapAdd2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 33554432, 33554432, 33554432, 33554432, 33554432};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[17];
        values[0] = 3.9655857341863195E-308;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 4);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", -0.0);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.mapAdd(java.lang.Double.NEGATIVE_INFINITY);
    }
    
    @Test(timeout = 1000L)
    public void testMapAdd3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {26, 1, 26};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[34];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        states[3] = (byte) 1;
        states[4] = (byte) 1;
        states[5] = (byte) 1;
        states[6] = (byte) 1;
        states[7] = (byte) 1;
        states[8] = (byte) 1;
        states[9] = (byte) 1;
        states[10] = (byte) 1;
        states[11] = (byte) 1;
        states[12] = (byte) 1;
        states[13] = (byte) 1;
        states[14] = (byte) 1;
        states[15] = (byte) 1;
        states[16] = (byte) 1;
        states[17] = (byte) 1;
        states[18] = (byte) 1;
        states[19] = (byte) 1;
        states[20] = (byte) 1;
        states[21] = (byte) 1;
        states[22] = (byte) 1;
        states[23] = (byte) 1;
        states[24] = (byte) 1;
        states[25] = (byte) 1;
        states[26] = (byte) 1;
        states[27] = (byte) 1;
        states[28] = (byte) 1;
        states[29] = (byte) 1;
        states[30] = (byte) 1;
        states[31] = (byte) 1;
        states[32] = (byte) 1;
        states[33] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.mapAdd(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.projection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method projection(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#projection(org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 *  */
    @Test
    public void testProjection_OpenMapRealVectorDotProduct() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        ArrayRealVector actual = ((ArrayRealVector) openMapRealVector.projection(arrayRealVector));
        
        ArrayRealVector expected = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data1 = {java.lang.Double.NaN};
        setField(expected, "org.apache.commons.math3.linear.ArrayRealVector", "data", data1);
        
        // org.apache.commons.math3.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method projection(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#projection(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return v.mapMultiply(dotProduct(v) / v.dotProduct(v));
 *  */
    @Test
    public void testProjection_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 127);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 128);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.projection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:333)
            org.apache.commons.math3.linear.OpenMapRealVector.projection(OpenMapRealVector.java:582) */
        openMapRealVector.projection(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#projection(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return v.mapMultiply(dotProduct(v) / v.dotProduct(v));
 *  */
    @Test
    public void testProjection_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.projection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:783)
            org.apache.commons.math3.linear.RealVector.dotProduct(RealVector.java:309)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:335)
            org.apache.commons.math3.linear.OpenMapRealVector.projection(OpenMapRealVector.java:582) */
        openMapRealVector.projection(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#projection(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testProjection_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.projection(OpenMapRealVector.java:581) */
        openMapRealVector.projection(null);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#projection(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProjection_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 127);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 128);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.advance(OpenIntToDoubleHashMap.java:569)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:503)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:481)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.iterator(OpenIntToDoubleHashMap.java:238)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:319)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:333)
            org.apache.commons.math3.linear.OpenMapRealVector.projection(OpenMapRealVector.java:582) */
        openMapRealVector.projection(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#projection(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return v.mapMultiply(dotProduct(v) / v.dotProduct(v));
 *  */
    @Test
    public void testProjection_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:333)
            org.apache.commons.math3.linear.OpenMapRealVector.projection(OpenMapRealVector.java:582) */
        openMapRealVector.projection(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method projection(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#projection(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testProjection_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.projection(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#projection(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testProjection_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.projection(arrayRealVector);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method projection(org.apache.commons.math3.linear.RealVector)
    
    @Test
    public void testProjection1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 9);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", values);
        
        ArrayRealVector actual = ((ArrayRealVector) openMapRealVector.projection(arrayRealVector));
        
        ArrayRealVector expected = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(expected, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        // org.apache.commons.math3.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method projection(org.apache.commons.math3.linear.RealVector)
    
    @Test
    public void testProjection2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.projection] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:333)
            org.apache.commons.math3.linear.OpenMapRealVector.projection(OpenMapRealVector.java:582) */
        openMapRealVector.projection(openMapRealVector1);
    }
    
    @Test
    public void testProjection3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:131)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:34)
            org.apache.commons.math3.linear.RealVector.mapMultiply(RealVector.java:557)
            org.apache.commons.math3.linear.OpenMapRealVector.projection(OpenMapRealVector.java:582) */
        openMapRealVector.projection(openMapRealVector1);
    }
    
    @Test
    public void testProjection4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = new byte[11];
        states[0] = (byte) 1;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 9);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:783)
            org.apache.commons.math3.linear.RealVector.dotProduct(RealVector.java:309)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:335)
            org.apache.commons.math3.linear.OpenMapRealVector.projection(OpenMapRealVector.java:582) */
        openMapRealVector.projection(arrayRealVector);
    }
    
    @Test
    public void testProjection5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException] */
        openMapRealVector.projection(openMapRealVector1);
    }
    
    @Test
    public void testProjection6() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 71, 71, 71, 71, 71, 71, 71,
            71
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException] */
        openMapRealVector.projection(openMapRealVector1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method projection(org.apache.commons.math3.linear.RealVector)
    
    @Test(expected = OutOfRangeException.class)
    public void testProjection7() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1073741824, 90, 90, 90, 90, 90, 90, 90,
            90
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 9);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", values);
        
        openMapRealVector.projection(arrayRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeMultiply(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testEbeMultiply_OpenIntToDoubleHashMapIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        OpenMapRealVector actual = openMapRealVector.ebeMultiply(((RealVector) arrayRealVector));
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeMultiply(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:360) */
        openMapRealVector.ebeMultiply(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:361) */
        openMapRealVector.ebeMultiply(((RealVector) arrayRealVector));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this);
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:361) */
        openMapRealVector.ebeMultiply(((RealVector) arrayRealVector));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeMultiply(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.ebeMultiply(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.ebeMultiply(((RealVector) arrayRealVector));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ebeMultiply(org.apache.commons.math3.linear.RealVector)
    
    @Test
    public void testEbeMultiply1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 32 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:361) */
        openMapRealVector.ebeMultiply(((RealVector) arrayRealVector));
    }
    
    @Test
    public void testEbeMultiply2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 33, (byte) 33, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:365) */
        openMapRealVector.ebeMultiply(((RealVector) arrayRealVector));
    }
    
    @Test
    public void testEbeMultiply3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0, 0, 0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 6 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:361) */
        openMapRealVector.ebeMultiply(((RealVector) arrayRealVector));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeMultiply(org.apache.commons.math3.linear.RealVector)
    
    @Test(expected = OutOfRangeException.class)
    public void testEbeMultiply4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[33];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[35];
        states[0] = (byte) 1;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = (byte) 1;
        states[3] = java.lang.Byte.MIN_VALUE;
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
        states[34] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.ebeMultiply(((RealVector) arrayRealVector));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.dotProduct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): True}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#size()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#size()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testDotProduct_ThisIsSmaller() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 256);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        double actual = openMapRealVector.dotProduct(openMapRealVector1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): True}
 * @utbot.executesCondition {@code (thisIsSmaller): True}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 256);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 3};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {3};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, -256};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {255};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values = {0.0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-239};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -2);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index -235868162 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-132, 131};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {131};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:317) */
        openMapRealVector.dotProduct(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean thisIsSmaller = entries.size() < v.entries.size();
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:318) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean thisIsSmaller = entries.size() < v.entries.size();
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:318) */
        openMapRealVector.dotProduct(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.executesCondition {@code (thisIsSmaller): False}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d += iter.value() * larger.get(iter.key());
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324) */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDotProduct_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -2);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)
    
    @Test
    public void testDotProduct1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[37];
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
        keys[33] = 56;
        keys[34] = 56;
        keys[35] = 56;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[37];
        states[36] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1073741824);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            -251516586, 56, 56, 56, 56, 56, 56, 56,
            56
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        double actual = openMapRealVector.dotProduct(openMapRealVector1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testDotProduct2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        double actual = openMapRealVector.dotProduct(openMapRealVector1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testDotProduct3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1073741824, 56, 56, 56, 56, 56, 56, 56,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            java.lang.Byte.MIN_VALUE
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        double actual = openMapRealVector.dotProduct(openMapRealVector1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)
    
    @Test(timeout = 1000L)
    public void testDotProduct4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    
    @Test(timeout = 1000L)
    public void testDotProduct5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.dotProduct(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.dotProduct
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dotProduct(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.SparseRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 *  */
    @Test
    public void testDotProduct_NotVNotInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        double actual = openMapRealVector.dotProduct(arrayRealVector);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 *  */
    @Test
    public void testDotProduct_VInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 127);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 128);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        double actual = openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 *  */
    @Test
    public void testDotProduct_VInstanceOfOpenMapRealVector_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        double actual = openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dotProduct(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return dotProduct((OpenMapRealVector) v);
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:333) */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDotProduct_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:783)
            org.apache.commons.math3.linear.RealVector.dotProduct(RealVector.java:309)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:335) */
        openMapRealVector.dotProduct(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return dotProduct((OpenMapRealVector) v);
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 127);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 128);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:333) */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:783)
            org.apache.commons.math3.linear.RealVector.dotProduct(RealVector.java:309)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:335) */
        openMapRealVector.dotProduct(arrayRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method dotProduct(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return dotProduct((OpenMapRealVector) v);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDotProduct_ThrowDimensionMismatchException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: return super.dotProduct(v);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDotProduct_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.dotProduct(arrayRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: return super.dotProduct(v);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDotProduct_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-256};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", values);
        
        openMapRealVector.dotProduct(arrayRealVector);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method dotProduct(org.apache.commons.math3.linear.RealVector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#dotProduct(org.apache.commons.math3.linear.RealVector)}
     */
    @Test
    public void testDotProductThrowsNPE() {
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.RealVector.checkVectorDimensions(RealVector.java:165)
            org.apache.commons.math3.linear.RealVector.dotProduct(RealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:335) */
        openMapRealVector.dotProduct(((RealVector) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method dotProduct(org.apache.commons.math3.linear.RealVector)
    
    @Test
    public void testDotProduct6() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 9);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", values);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry.getIndex(OpenMapRealVector.java:795)
            org.apache.commons.math3.linear.RealVector.dotProduct(RealVector.java:309)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:335) */
        openMapRealVector.dotProduct(arrayRealVector);
    }
    
    @Test
    public void testDotProduct7() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            -251516465, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.ArrayIndexOutOfBoundsException] */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testDotProduct8() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[39];
        keys[0] = -2147483616;
        keys[1] = -2147483616;
        keys[2] = -2147483616;
        keys[3] = -2147483616;
        keys[4] = -2147483616;
        keys[5] = -2147483616;
        keys[6] = -2147483616;
        keys[7] = -2147483616;
        keys[8] = -2147483616;
        keys[9] = -2147483616;
        keys[10] = -2147483616;
        keys[11] = -2147483616;
        keys[12] = -2147483616;
        keys[13] = -2147483616;
        keys[14] = -2147483616;
        keys[15] = -2147483616;
        keys[16] = -2147483616;
        keys[17] = -2147483616;
        keys[18] = -2147483616;
        keys[19] = -2147483616;
        keys[20] = -2147483616;
        keys[21] = -2147483616;
        keys[22] = -2147483616;
        keys[23] = -2147483616;
        keys[24] = -2147483616;
        keys[25] = -2147483616;
        keys[26] = -2147483616;
        keys[27] = -2147483616;
        keys[28] = -2147483616;
        keys[29] = -2147483616;
        keys[30] = -2147483616;
        keys[31] = -2147483616;
        keys[32] = -2147483616;
        keys[33] = -2147483616;
        keys[34] = -2147483616;
        keys[35] = -2147483616;
        keys[36] = -2147483616;
        keys[37] = -2147483616;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 38);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            866123769, -2147483616, -2147483616, -2147483616, -2147483616, -2147483616, -2147483616, -2147483616,
            -2147483616
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:333) */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testDotProduct9() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 102, 102, 102, 102, 102, 102, 102,
            102
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:324)
            org.apache.commons.math3.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:333) */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testDotProduct10() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException] */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testDotProduct11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 102, 102, 102, 102, 102, 102, 102,
            102
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException] */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method dotProduct(org.apache.commons.math3.linear.RealVector)
    
    @Test(timeout = 1000L)
    public void testDotProduct12() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 102, 102, 102, 102, 102, 102, 102,
            102
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.unitize
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unitize()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitize()}
 *  */
    @Test
    public void testUnitize() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        openMapRealVector.unitize();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitize()}
 *  */
    @Test
    public void testUnitize_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        openMapRealVector.unitize();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unitize()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitize()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double norm = getNorm();
 *  */
    @Test
    public void testUnitize_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.unitize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:783)
            org.apache.commons.math3.linear.RealVector.getNorm(RealVector.java:393)
            org.apache.commons.math3.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:660) */
        openMapRealVector.unitize();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double norm = getNorm();
 *  */
    @Test
    public void testUnitize_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.unitize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:783)
            org.apache.commons.math3.linear.RealVector.getNorm(RealVector.java:393)
            org.apache.commons.math3.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:660) */
        openMapRealVector.unitize();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unitize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitize()}
     */
    @Test
    public void testUnitize1() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 2.0);
        
        openMapRealVector.unitize();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unitize()
    
    @Test
    public void testUnitize2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = new byte[13];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = java.lang.Byte.MIN_VALUE;
        states[3] = java.lang.Byte.MIN_VALUE;
        states[4] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.unitize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:783)
            org.apache.commons.math3.linear.RealVector.getNorm(RealVector.java:393)
            org.apache.commons.math3.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:660) */
        openMapRealVector.unitize();
    }
    
    @Test
    public void testUnitize3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.unitize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:667) */
        openMapRealVector.unitize();
    }
    
    @Test
    public void testUnitize4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.unitize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:667) */
        openMapRealVector.unitize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.unitVector
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method unitVector()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitVector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = copy();
 *  */
    @Test
    public void testUnitVector_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.unitVector] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.unitVector(OpenMapRealVector.java:652) */
        openMapRealVector.unitVector();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitVector()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = copy();
 *  */
    @Test
    public void testUnitVector_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.unitVector] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.unitVector(OpenMapRealVector.java:652) */
        openMapRealVector.unitVector();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unitVector()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitVector()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} 
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testUnitVector_ThrowMathArithmeticException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 2.0522684006491886E-289);
        
        openMapRealVector.unitVector();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitVector()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} 
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testUnitVector_ThrowMathArithmeticException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        openMapRealVector.unitVector();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitVector()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} 
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testUnitVector_ThrowMathArithmeticException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        openMapRealVector.unitVector();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unitVector()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#unitVector()}
     */
    @Test
    public void testUnitVector() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 2.0);
        
        OpenMapRealVector actual = openMapRealVector.unitVector();
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[2] = 2;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NaN;
        values[2] = java.lang.Double.NaN;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 2);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 2);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 3);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 2.0);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unitVector()
    
    @Test
    public void testUnitVector1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[33];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[33];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.8480945388892184E-306);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        OpenMapRealVector actual = openMapRealVector.unitVector();
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0, 0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {java.lang.Double.NaN, 0.0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.8480945388892184E-306);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method unitVector()
    
    @Test(timeout = 1000L)
    public void testUnitVector2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[19];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
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
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.unitVector();
    }
    
    @Test(timeout = 1000L)
    public void testUnitVector3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[34];
        states[0] = (byte) 2;
        states[1] = (byte) 1;
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
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.unitVector();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.sparseIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sparseIterator()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#sparseIterator()}
 * @utbot.returnsFrom {@code return new OpenMapSparseIterator();}
 *  */
    @Test
    public void testSparseIterator_Return() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        OpenMapRealVector.OpenMapSparseIterator actual = ((OpenMapRealVector.OpenMapSparseIterator) openMapRealVector.sparseIterator());
        
        OpenMapRealVector.OpenMapSparseIterator expected = ((OpenMapRealVector.OpenMapSparseIterator) createInstance("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator"));
        OpenIntToDoubleHashMap.Iterator iter = ((OpenIntToDoubleHashMap.Iterator) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator"));
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "referenceCount", -255);
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "current", -1);
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "this$0", entries);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "iter", iter);
        OpenMapRealVector.OpenMapEntry current = ((OpenMapRealVector.OpenMapEntry) createInstance("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry"));
        setField(current, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "iter", iter);
        setField(current, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "this$0", openMapRealVector);
        setField(current, "org.apache.commons.math3.linear.RealVector$Entry", "this$0", openMapRealVector);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "current", current);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "this$0", openMapRealVector);
        
        OpenIntToDoubleHashMap.Iterator expectedIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        OpenIntToDoubleHashMap.Iterator actualIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        int expectedIterReferenceCount = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        int actualIterReferenceCount = ((Integer) getFieldValue(actualIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        assertEquals(expectedIterReferenceCount, actualIterReferenceCount);
        
        int expectedIterCurrent = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "current"));
        int actualIterCurrent = ((Integer) getFieldValue(actualIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "current"));
        assertEquals(expectedIterCurrent, actualIterCurrent);
        
        int expectedIterNext = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "next"));
        int actualIterNext = ((Integer) getFieldValue(actualIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "next"));
        assertEquals(expectedIterNext, actualIterNext);
        
        RealVector.Entry expectedCurrent = ((RealVector.Entry) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        RealVector.Entry actualCurrent = ((RealVector.Entry) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        OpenIntToDoubleHashMap.Iterator expectedCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expectedCurrent, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        OpenIntToDoubleHashMap.Iterator actualCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actualCurrent, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        
        int expectedCurrentIndex = expectedCurrent.getIndex();
        int actualCurrentIndex = actualCurrent.getIndex();
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#sparseIterator()}
 *  */
    @Test
    public void testSparseIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        OpenMapRealVector.OpenMapSparseIterator actual = ((OpenMapRealVector.OpenMapSparseIterator) openMapRealVector.sparseIterator());
        
        OpenMapRealVector.OpenMapSparseIterator expected = ((OpenMapRealVector.OpenMapSparseIterator) createInstance("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator"));
        OpenIntToDoubleHashMap.Iterator iter = ((OpenIntToDoubleHashMap.Iterator) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator"));
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "referenceCount", -255);
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "current", -1);
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "next", -2);
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "this$0", entries);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "iter", iter);
        OpenMapRealVector.OpenMapEntry current = ((OpenMapRealVector.OpenMapEntry) createInstance("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry"));
        setField(current, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "iter", iter);
        setField(current, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "this$0", openMapRealVector);
        setField(current, "org.apache.commons.math3.linear.RealVector$Entry", "this$0", openMapRealVector);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "current", current);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "this$0", openMapRealVector);
        
        OpenIntToDoubleHashMap.Iterator expectedIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        OpenIntToDoubleHashMap.Iterator actualIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        int expectedIterReferenceCount = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        int actualIterReferenceCount = ((Integer) getFieldValue(actualIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        assertEquals(expectedIterReferenceCount, actualIterReferenceCount);
        
        int expectedIterCurrent = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "current"));
        int actualIterCurrent = ((Integer) getFieldValue(actualIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "current"));
        assertEquals(expectedIterCurrent, actualIterCurrent);
        
        int expectedIterNext = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "next"));
        int actualIterNext = ((Integer) getFieldValue(actualIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "next"));
        assertEquals(expectedIterNext, actualIterNext);
        
        RealVector.Entry expectedCurrent = ((RealVector.Entry) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        RealVector.Entry actualCurrent = ((RealVector.Entry) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        OpenIntToDoubleHashMap.Iterator expectedCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expectedCurrent, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        OpenIntToDoubleHashMap.Iterator actualCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actualCurrent, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        
        int expectedCurrentIndex = expectedCurrent.getIndex();
        int actualCurrentIndex = actualCurrent.getIndex();
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#sparseIterator()}
 *  */
    @Test
    public void testSparseIterator_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        OpenMapRealVector.OpenMapSparseIterator actual = ((OpenMapRealVector.OpenMapSparseIterator) openMapRealVector.sparseIterator());
        
        OpenMapRealVector.OpenMapSparseIterator expected = ((OpenMapRealVector.OpenMapSparseIterator) createInstance("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator"));
        OpenIntToDoubleHashMap.Iterator iter = ((OpenIntToDoubleHashMap.Iterator) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator"));
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "referenceCount", -255);
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "current", -1);
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "next", -2);
        setField(iter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "this$0", entries);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "iter", iter);
        OpenMapRealVector.OpenMapEntry current = ((OpenMapRealVector.OpenMapEntry) createInstance("org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry"));
        setField(current, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "iter", iter);
        setField(current, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "this$0", openMapRealVector);
        setField(current, "org.apache.commons.math3.linear.RealVector$Entry", "this$0", openMapRealVector);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "current", current);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "this$0", openMapRealVector);
        
        OpenIntToDoubleHashMap.Iterator expectedIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        OpenIntToDoubleHashMap.Iterator actualIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "iter"));
        int expectedIterReferenceCount = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        int actualIterReferenceCount = ((Integer) getFieldValue(actualIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "referenceCount"));
        assertEquals(expectedIterReferenceCount, actualIterReferenceCount);
        
        int expectedIterCurrent = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "current"));
        int actualIterCurrent = ((Integer) getFieldValue(actualIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "current"));
        assertEquals(expectedIterCurrent, actualIterCurrent);
        
        int expectedIterNext = ((Integer) getFieldValue(expectedIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "next"));
        int actualIterNext = ((Integer) getFieldValue(actualIter, "org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator", "next"));
        assertEquals(expectedIterNext, actualIterNext);
        
        RealVector.Entry expectedCurrent = ((RealVector.Entry) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        RealVector.Entry actualCurrent = ((RealVector.Entry) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapSparseIterator", "current"));
        OpenIntToDoubleHashMap.Iterator expectedCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(expectedCurrent, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        OpenIntToDoubleHashMap.Iterator actualCurrentIter = ((OpenIntToDoubleHashMap.Iterator) getFieldValue(actualCurrent, "org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry", "iter"));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        assertTrue(deepEquals(expectedCurrentIter, actualCurrentIter));
        
        int expectedCurrentIndex = expectedCurrent.getIndex();
        int actualCurrentIndex = actualCurrent.getIndex();
        assertEquals(expectedCurrentIndex, actualCurrentIndex);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:226) */
        openMapRealVector.add(((RealVector) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testAdd_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.add(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testAdd_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.add(arrayRealVector);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math3.linear.RealVector)
    
    @Test
    public void testAdd1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        ArrayRealVector actual = ((ArrayRealVector) openMapRealVector.add(arrayRealVector));
        
        ArrayRealVector expected = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data1 = {};
        setField(expected, "org.apache.commons.math3.linear.ArrayRealVector", "data", data1);
        
        // org.apache.commons.math3.linear.ArrayRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(org.apache.commons.math3.linear.RealVector)
    
    @Test
    public void testAdd2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:131)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:246)
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:228) */
        openMapRealVector.add(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testAdd3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector$OpenMapEntry.getIndex(OpenMapRealVector.java:795)
            org.apache.commons.math3.linear.RealVector.add(RealVector.java:236)
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:230) */
        openMapRealVector.add(arrayRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (copyThis): True}
 * @utbot.executesCondition {@code (copyThis): True}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#size()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#size()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#copy()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testAdd_CopyThis() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -3);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        OpenMapRealVector actual = openMapRealVector.add(openMapRealVector1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries2 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries2);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (copyThis): True}
 * @utbot.executesCondition {@code (copyThis): True}
 * @utbot.executesCondition {@code (copyThis): True}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int key = iter.key();
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -1);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 2.225073858507202E-308);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:251) */
        openMapRealVector.add(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testAdd_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:244) */
        openMapRealVector.add(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean copyThis = entries.size() > v.entries.size();
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:245) */
        openMapRealVector.add(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean copyThis = entries.size() > v.entries.size();
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:245) */
        openMapRealVector.add(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (copyThis): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#copy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: v.copy()
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:246) */
        openMapRealVector.add(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.executesCondition {@code (copyThis): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.copy()
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:246) */
        openMapRealVector.add(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testAdd_ThrowDimensionMismatchException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -2);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        openMapRealVector.add(openMapRealVector1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#add(org.apache.commons.math3.linear.OpenMapRealVector)}
     */
    @Test
    public void testAdd() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        java.lang.Double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, 1.1235582092889477E307);
        
        OpenMapRealVector actual = openMapRealVector.add(openMapRealVector1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 1;
        keys[2] = 2;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NaN;
        values[1] = java.lang.Double.POSITIVE_INFINITY;
        values[2] = java.lang.Double.NaN;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 3);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 3);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 3);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.1235582092889477E307);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(org.apache.commons.math3.linear.OpenMapRealVector)
    
    @Test
    public void testAdd4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -2147483647);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {(byte) 0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.add(OpenMapRealVector.java:251) */
        openMapRealVector.add(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): True}
 *  */
    @Test
    public void testEquals_Obj() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        boolean actual = openMapRealVector.equals(openMapRealVector);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof OpenMapRealVector)): False}
 * @utbot.executesCondition {@code (virtualSize != other.virtualSize): True}
 *  */
    @Test
    public void testEquals_VirtualSizeNotEqualsOtherVirtualSize() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        boolean actual = openMapRealVector.equals(openMapRealVector1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof OpenMapRealVector)): False}
 * @utbot.executesCondition {@code (virtualSize != other.virtualSize): False}
 * @utbot.executesCondition {@code (Double.doubleToLongBits(other.epsilon)): True}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 *  */
    @Test
    public void testEquals_DoubleDoubleToLongBits() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -256);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -256);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", -2.0000000000000004);
        
        boolean actual = openMapRealVector.equals(openMapRealVector1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (!(obj instanceof OpenMapRealVector)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        boolean actual = openMapRealVector.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.advance(OpenIntToDoubleHashMap.java:569)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:503)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:481)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.iterator(OpenIntToDoubleHashMap.java:238)
            org.apache.commons.math3.linear.OpenMapRealVector.equals(OpenMapRealVector.java:728) */
        openMapRealVector.equals(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testAppend_OpenIntToDoubleHashMapIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.2250738585072014E-308);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -251);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -254);
        
        OpenMapRealVector actual = openMapRealVector.append(openMapRealVector1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries2 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states2 = {};
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states2);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.2250738585072014E-308);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries2);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -505);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res.setEntry(iter.key() + virtualSize, iter.value());
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -119);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 130);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:271) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res.setEntry(iter.key() + virtualSize, iter.value());
 *  */
    @Test
    public void testAppend_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -247);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -254);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:271) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:267) */
        openMapRealVector.append(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -254);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:267) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -254);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:267) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = v.entries.iterator();
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.225073860579463E-308);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -254);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:268) */
        openMapRealVector.append(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: res.setEntry(iter.key() + virtualSize, iter.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 8.0948E-320);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 17);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 2.225073858515296E-308);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-18};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 15);
        
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: res.setEntry(iter.key() + virtualSize, iter.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 6.953355807835E-310);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 3);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-3};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        
        openMapRealVector.append(openMapRealVector1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
     */
    @Test
    public void testAppend() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        java.lang.Double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, 1.1235582092889477E307);
        
        OpenMapRealVector actual = openMapRealVector.append(openMapRealVector1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 1;
        keys[2] = 2;
        keys[3] = 3;
        keys[4] = 4;
        keys[5] = 5;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NEGATIVE_INFINITY;
        values[1] = -1.0;
        values[2] = java.lang.Double.NaN;
        values[3] = java.lang.Double.POSITIVE_INFINITY;
        values[4] = java.lang.Double.POSITIVE_INFINITY;
        values[5] = java.lang.Double.NEGATIVE_INFINITY;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        states[3] = (byte) 1;
        states[4] = (byte) 1;
        states[5] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 6);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 6);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 6);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(org.apache.commons.math3.linear.OpenMapRealVector)
    
    @Test
    public void testAppend1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 8945696);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            0, 56, 56, 56, 56, 56, 56, 56,
            56
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {
            -0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 37814785);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:590)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:271) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    @Test
    public void testAppend2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.POSITIVE_INFINITY);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 8945697);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.3256956644261779E-231);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            0, 56, 56, 56, 56, 56, 56, 56,
            56
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {
            4.510582157141094E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1348485823);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException] */
        openMapRealVector.append(openMapRealVector1);
    }
    
    @Test
    public void testAppend3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 8.4879831639E-314);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 8945696);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 2.5988623552465274E-113);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            0, 56, 56, 56, 56, 56, 56, 56,
            56
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {
            -5.276634361381258E-228, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 4456453);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException] */
        openMapRealVector.append(openMapRealVector1);
    }
    
    @Test
    public void testAppend4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 65537);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states1 = new byte[11];
        states1[0] = java.lang.Byte.MIN_VALUE;
        states1[1] = java.lang.Byte.MIN_VALUE;
        states1[2] = (byte) 1;
        states1[3] = java.lang.Byte.MIN_VALUE;
        states1[4] = java.lang.Byte.MIN_VALUE;
        states1[5] = java.lang.Byte.MIN_VALUE;
        states1[6] = java.lang.Byte.MIN_VALUE;
        states1[7] = java.lang.Byte.MIN_VALUE;
        states1[8] = java.lang.Byte.MIN_VALUE;
        states1[9] = java.lang.Byte.MIN_VALUE;
        states1[10] = java.lang.Byte.MIN_VALUE;
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:271) */
        openMapRealVector.append(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.getDimension(); i++)} once
 * @utbot.returnsFrom {@code return res;}
 *  */
    @Test
    public void testAppend_NotVNotInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -252);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        OpenMapRealVector actual = openMapRealVector.append(((RealVector) arrayRealVector));
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -252);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:282) */
        openMapRealVector.append(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append((OpenMapRealVector) v);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_21() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:267)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:280) */
        openMapRealVector.append(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:282) */
        openMapRealVector.append(((RealVector) arrayRealVector));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_31() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", values);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:282) */
        openMapRealVector.append(((RealVector) arrayRealVector));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.getDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: res.setEntry(i + virtualSize, v.getEntry(i));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", Integer.MAX_VALUE);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.append(((RealVector) arrayRealVector));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(org.apache.commons.math3.linear.RealVector)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.getDimension(); i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: res.setEntry(i + virtualSize, v.getEntry(i));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 1.69759663277E-313);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.append(((RealVector) arrayRealVector));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.append
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, 1);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:293) */
        openMapRealVector.append(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, 1);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_12() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -227);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:88)
            org.apache.commons.math3.linear.OpenMapRealVector.append(OpenMapRealVector.java:293) */
        openMapRealVector.append(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: res.setEntry(virtualSize, d);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", Integer.MAX_VALUE);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        openMapRealVector.append(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: res.setEntry(virtualSize, d);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAppend_ThrowOutOfRangeException_12() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        openMapRealVector.append(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#append(double)}
     */
    @Test
    public void testAppendWithCornerCase() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        
        OpenMapRealVector actual = openMapRealVector.append(java.lang.Double.NEGATIVE_INFINITY);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 1;
        keys[2] = 2;
        keys[3] = 3;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NEGATIVE_INFINITY;
        values[1] = -1.0;
        values[2] = java.lang.Double.NaN;
        values[3] = java.lang.Double.NEGATIVE_INFINITY;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        states[3] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 4);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 4);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 4);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#hashCode()}
 *  */
    @Test
    public void testHashCode() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        int actual = openMapRealVector.hashCode();
        
        assertEquals(48759745, actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#hashCode()}
 *  */
    @Test
    public void testHashCode_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        int actual = openMapRealVector.hashCode();
        
        assertEquals(48759745, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#hashCode()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testHashCode_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {-2.0000000000000004};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.hashCode(OpenMapRealVector.java:700) */
        openMapRealVector.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#hashCode()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.hashCode(OpenMapRealVector.java:697) */
        openMapRealVector.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#hashCode()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.hashCode(OpenMapRealVector.java:700) */
        openMapRealVector.hashCode();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#hashCode()}
     */
    @Test
    public void testHashCode1() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 2.0);
        
        int actual = openMapRealVector.hashCode();
        
        assertEquals(1041638084, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.toArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toArray()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#toArray()}
 *  */
    @Test
    public void testToArray() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        double[] actual = openMapRealVector.toArray();
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#toArray()}
 *  */
    @Test
    public void testToArray_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        double[] actual = openMapRealVector.toArray();
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toArray()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#toArray()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[] res = new double[virtualSize];
 *  */
    @Test
    public void testToArray_ThrowNegativeArraySizeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -256);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.toArray] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math3.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:674) */
        openMapRealVector.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#toArray()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res[iter.key()] = iter.value();
 *  */
    @Test
    public void testToArray_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {129};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.toArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 129 out of bounds for length 2]
            org.apache.commons.math3.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:678) */
        openMapRealVector.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#toArray()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: res[iter.key()] = iter.value();
 *  */
    @Test
    public void testToArray_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.toArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:678) */
        openMapRealVector.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#toArray()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testToArray_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.toArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:678) */
        openMapRealVector.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#toArray()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testToArray_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.toArray] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:675) */
        openMapRealVector.toArray();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#toArray()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testToArray_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.toArray] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:678) */
        openMapRealVector.toArray();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toArray()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#toArray()}
     */
    @Test
    public void testToArray1() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 2.0);
        
        double[] actual = openMapRealVector.toArray();
        
        double[] expected = {java.lang.Double.NEGATIVE_INFINITY, 0.0, java.lang.Double.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.set
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method set(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#set(double)}
 *  */
    @Test
    public void testSet() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.set(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#set(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 *  */
    @Test
    public void testSet_OpenMapRealVectorSetEntry() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.078125000000001);
        
        openMapRealVector.set(2.142578125);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method set(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#set(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, value);
 *  */
    @Test
    public void testSet_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", -0.0);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.set] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:417)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:590)
            org.apache.commons.math3.linear.OpenMapRealVector.set(OpenMapRealVector.java:610) */
        openMapRealVector.set(0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#set(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSet_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 2.036965487906076E199);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.set] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591)
            org.apache.commons.math3.linear.OpenMapRealVector.set(OpenMapRealVector.java:610) */
        openMapRealVector.set(1.1308086247128172E102);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#set(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSet_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", -0.0);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.set] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:590)
            org.apache.commons.math3.linear.OpenMapRealVector.set(OpenMapRealVector.java:610) */
        openMapRealVector.set(0.0);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method set(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#set(double)}
     */
    @Test
    public void testSetWithCornerCase() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        
        openMapRealVector.set(java.lang.Double.NEGATIVE_INFINITY);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.isNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isNaN()}
 *  */
    @Test
    public void testIsNaN() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -254);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isNaN()}
 *  */
    @Test
    public void testIsNaN_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isNaN()}
 * @utbot.executesCondition {@code (Double.isNaN(iter.value())): True}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator#hasNext()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator#advance()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator#value()}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaN() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {java.lang.Double.NaN};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isNaN();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNaN()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isNaN()}
 * @utbot.executesCondition {@code (Double.isNaN(iter.value())): False}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator#value()}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testIsNaN_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {-2.0000000000000004};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.isNaN] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:556) */
        openMapRealVector.isNaN();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testIsNaN_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.isNaN] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:553) */
        openMapRealVector.isNaN();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isNaN()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testIsNaN_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.isNaN] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:556) */
        openMapRealVector.isNaN();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isNaN()}
     */
    @Test
    public void testIsNaNReturnsFalse() {
        double[] doubleArray = {1.0, -1.0, java.lang.Double.POSITIVE_INFINITY};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 1.0);
        
        boolean actual = openMapRealVector.isNaN();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.copy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copy()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#copy()}
 * @utbot.returnsFrom {@code return new OpenMapRealVector(this);}
 *  */
    @Test
    public void testCopy_Return() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 1.2882297539194267E-231);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -192);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        OpenMapRealVector actual = openMapRealVector.copy();
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 1.2882297539194267E-231);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -192);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copy()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#copy()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new OpenMapRealVector(this);
 *  */
    @Test
    public void testCopy_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.copy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for double[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304) */
        openMapRealVector.copy();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#copy()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new OpenMapRealVector(this);
 *  */
    @Test
    public void testCopy_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.copy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304) */
        openMapRealVector.copy();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#copy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new OpenMapRealVector(this);
 *  */
    @Test
    public void testCopy_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.copy] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304) */
        openMapRealVector.copy();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#copy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new OpenMapRealVector(this);
 *  */
    @Test
    public void testCopy_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.copy] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304) */
        openMapRealVector.copy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getEntries
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntries()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntries()}
 * @utbot.returnsFrom {@code return entries;}
 *  */
    @Test
    public void testGetEntries_ReturnEntries() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Method getEntriesMethod = openMapRealVectorClazz.getDeclaredMethod("getEntries");
        getEntriesMethod.setAccessible(true);
        java.lang.Object[] getEntriesMethodArguments = new java.lang.Object[0];
        OpenIntToDoubleHashMap actual = ((OpenIntToDoubleHashMap) getEntriesMethod.invoke(openMapRealVector, getEntriesMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.isInfinite
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInfinite()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isInfinite()}
 *  */
    @Test
    public void testIsInfinite() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isInfinite()}
 *  */
    @Test
    public void testIsInfinite_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isInfinite()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 *  */
    @Test
    public void testIsInfinite_DoubleIsNaN() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {java.lang.Double.NaN};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        boolean actual = openMapRealVector.isInfinite();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isInfinite()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isInfinite()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testIsInfinite_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {java.lang.Double.NEGATIVE_INFINITY};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.isInfinite] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:539) */
        openMapRealVector.isInfinite();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isInfinite()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testIsInfinite_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        double[] values = {-2.0000000000000004};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.isInfinite] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:539) */
        openMapRealVector.isInfinite();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isInfinite()}
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testIsInfinite_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.isInfinite] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:536) */
        openMapRealVector.isInfinite();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isInfinite()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testIsInfinite_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.isInfinite] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math3.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:539) */
        openMapRealVector.isInfinite();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isInfinite()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#isInfinite()}
     */
    @Test
    public void testIsInfiniteReturnsTrue() {
        double[] doubleArray = {1.0, -1.0, java.lang.Double.POSITIVE_INFINITY};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 1.0);
        
        boolean actual = openMapRealVector.isInfinite();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.getEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntry(int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return entries.get(index);}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = openMapRealVector.getEntry(0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return entries.get(index);}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 2, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = openMapRealVector.getEntry(0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return entries.get(index);}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-254, -255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        double actual = openMapRealVector.getEntry(255);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return entries.get(index);}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        
        double actual = openMapRealVector.getEntry(1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.returnsFrom {@code return entries.get(index);}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 19};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 33);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 20);
        
        double actual = openMapRealVector.getEntry(19);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEntry(int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getEntry(-1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.getEntry(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntry(int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449) */
        openMapRealVector.getEntry(0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449) */
        openMapRealVector.getEntry(0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449) */
        openMapRealVector.getEntry(1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449) */
        openMapRealVector.getEntry(255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -2147483647);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 2021725412);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483647 out of bounds for length 2]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449) */
        openMapRealVector.getEntry(2021725411);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-223, 17};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 18);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449) */
        openMapRealVector.getEntry(17);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449) */
        openMapRealVector.getEntry(0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449) */
        openMapRealVector.getEntry(0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(index);
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:449) */
        openMapRealVector.getEntry(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.setEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 *  */
    @Test
    public void testSetEntry_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 7.571541212244863E-270);
        
        openMapRealVector.setEntry(0, -2.052270357844852E-289);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 *  */
    @Test
    public void testSetEntry() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-256};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 2.2250919003941845E-308);
        
        openMapRealVector.setEntry(255, -1.80418869826E-313);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.setEntry(0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: checkIndex(index);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.setEntry(-1, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(index)
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 3.5635948515154405E-307);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591) */
        openMapRealVector.setEntry(0, -4.4544935643943E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(index)
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 128);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.6953579558404969E50);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 128 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591) */
        openMapRealVector.setEntry(255, 2.719563730844146E-216);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.put(index, value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.946939626193801E-308);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:273)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:590) */
        openMapRealVector.setEntry(0, 1.946939626193801E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.put(index, value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 7.120236348052069E-307);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:415)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:590) */
        openMapRealVector.setEntry(0, 7.120236348052069E-307);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(index)
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 6.211594422538871E231);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591) */
        openMapRealVector.setEntry(0, -4.273021108333656E96);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(index)
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -256};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 256);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 4.002929687500001);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:213)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591) */
        openMapRealVector.setEntry(255, -3.7885397742950075E-270);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.put(index, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 2.225073858507202E-308);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:590) */
        openMapRealVector.setEntry(0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entries.containsKey(index)
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.7188323328000004E10);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591) */
        openMapRealVector.setEntry(0, -3.299491037594822E-229);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.put(index, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", -0.0);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:590) */
        openMapRealVector.setEntry(0, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entries.containsKey(index)
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 1.1497807779959659E-298);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:591) */
        openMapRealVector.setEntry(0, -5.354083972032953E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.put(index, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", -0.0);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math3.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:590) */
        openMapRealVector.setEntry(0, 0.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:641) */
        openMapRealVector.subtract(((RealVector) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math3.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testSubtract_ThrowDimensionMismatchException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        openMapRealVector.subtract(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testSubtract_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -3);
        ArrayRealVector arrayRealVector = ((ArrayRealVector) createInstance("org.apache.commons.math3.linear.ArrayRealVector"));
        double[] data = {0.0, 0.0};
        setField(arrayRealVector, "org.apache.commons.math3.linear.ArrayRealVector", "data", data);
        
        openMapRealVector.subtract(arrayRealVector);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.linear.OpenMapRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#copy()}
 * @utbot.invokes org.apache.commons.math3.linear.OpenMapRealVector#getEntries()
 * @utbot.invokes {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testSubtract_OpenIntToDoubleHashMapIterator() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        OpenMapRealVector actual = openMapRealVector.subtract(openMapRealVector1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries2 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states2 = {};
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states2);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries2, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries2);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int key = iter.key();
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -254);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:628) */
        openMapRealVector.subtract(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(key)
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:629) */
        openMapRealVector.subtract(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(key)
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:629) */
        openMapRealVector.subtract(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(key)
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.POSITIVE_INFINITY);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-241};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index -235868415 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math3.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:629) */
        openMapRealVector.subtract(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:623) */
        openMapRealVector.subtract(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = v.getEntries().iterator();
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:625) */
        openMapRealVector.subtract(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math3.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:628) */
        openMapRealVector.subtract(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = copy();
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:624) */
        openMapRealVector.subtract(openMapRealVector);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = copy();
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math3.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:181)
            org.apache.commons.math3.linear.OpenMapRealVector.copy(OpenMapRealVector.java:304)
            org.apache.commons.math3.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:624) */
        openMapRealVector.subtract(openMapRealVector);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math3.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testSubtract_ThrowDimensionMismatchException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -2);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", -255);
        
        openMapRealVector.subtract(openMapRealVector1);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math3.linear.OpenMapRealVector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.linear.OpenMapRealVector#subtract(org.apache.commons.math3.linear.OpenMapRealVector)}
     */
    @Test
    public void testSubtract() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        java.lang.Double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY};
        OpenMapRealVector openMapRealVector1 = new OpenMapRealVector(doubleArray1, 1.1235582092889477E307);
        
        OpenMapRealVector actual = openMapRealVector.subtract(openMapRealVector1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math3.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 1;
        keys[2] = 2;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NEGATIVE_INFINITY;
        values[1] = java.lang.Double.NEGATIVE_INFINITY;
        values[2] = java.lang.Double.NaN;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size", 3);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count", 3);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "virtualSize", 3);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math3.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields723914634067800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields723914634067800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass723914634072700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields723914634067800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass723914634072700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields723914634346600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields723914634346600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass723914634348500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields723914634346600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass723914634348500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

