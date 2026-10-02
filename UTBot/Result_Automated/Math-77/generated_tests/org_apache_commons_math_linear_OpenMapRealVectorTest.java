package org.apache.commons.math.linear;

import org.junit.Test;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import java.lang.reflect.Method;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math_linear_OpenMapRealVectorTest {
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
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.isDefaultValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDefaultValue(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.returnsFrom {@code return Math.abs(value) < epsilon;}
 *  */
    @Test
    public void testIsDefaultValue_MathAbsGreaterOrEqualEpsilon() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        boolean actual = openMapRealVector.isDefaultValue(4.9E-324);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.returnsFrom {@code return Math.abs(value) < epsilon;}
 *  */
    @Test
    public void testIsDefaultValue_MathAbsLessThanEpsilon() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.5096681115199663E-303);
        
        boolean actual = openMapRealVector.isDefaultValue(3.0487857708928556E-306);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.projection
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method projection([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#projection(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testProjection_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.projection(OpenMapRealVector.java:623) */
        openMapRealVector.projection(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for projection
    
    public void testProjection_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.projection
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method projection(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#projection(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testProjection_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.projection] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.projection(OpenMapRealVector.java:617) */
        openMapRealVector.projection(((RealVector) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.unitVector
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method unitVector()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitVector()}
 *  */
    @Test
    public void testUnitVector() throws Exception  {
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        OpenMapRealVector actual = openMapRealVector.unitVector();
        
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
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitVector()}
 *  */
    @Test
    public void testUnitVector_1() throws Exception  {
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        OpenMapRealVector actual = openMapRealVector.unitVector();
        
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
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.unitVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index -235868415 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:281)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:266)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:417)
            org.apache.commons.math.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:722)
            org.apache.commons.math.linear.OpenMapRealVector.unitVector(OpenMapRealVector.java:709) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283)
            org.apache.commons.math.linear.OpenMapRealVector.unitVector(OpenMapRealVector.java:708) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:147)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283)
            org.apache.commons.math.linear.OpenMapRealVector.unitVector(OpenMapRealVector.java:708) */
        openMapRealVector.unitVector();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unitVector()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitVector()}
     */
    @Test
    public void testUnitVector1() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 2.0);
        
        OpenMapRealVector actual = openMapRealVector.unitVector();
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[2] = 2;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NaN;
        values[2] = java.lang.Double.NaN;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 2);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 3);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:537) */
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
    public void testGetLInfDistance_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:514)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:539) */
        openMapRealVector.getLInfDistance(((RealVector) openMapRealVector));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLInfDistance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetLInfDistance_OpenMapRealVectorCheckVectorDimensions() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        double[] doubleArray = {};
        
        double actual = openMapRealVector.getLInfDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:546) */
        openMapRealVector.getLInfDistance(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for getLInfDistance
    
    public void testGetLInfDistance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:517) */
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:517) */
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:517) */
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
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:517) */
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
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException2() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:514) */
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
    public void testGetLInfDistance_ThrowNullPointerException_11() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:522) */
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
    public void testGetLInfDistance_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:522) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_3() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:517) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_4() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -254);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:517) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_6() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:517) */
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
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test
    public void testGetLInfDistance_ThrowNullPointerException_5() throws Throwable  {
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
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfDistance(OpenMapRealVector.java:517) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetLInfDistance_ThrowMatrixIndexException() throws Throwable  {
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
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetLInfDistance_ThrowMatrixIndexException_1() throws Throwable  {
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
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getSparcity
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSparcity()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSparcity()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.returnsFrom {@code return (double) entries.size() / (double) getDimension();}
 *  */
    @Test
    public void testGetSparcity_OpenMapRealVectorGetDimension() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        double actual = openMapRealVector.getSparcity();
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSparcity()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSparcity()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (double) entries.size() / (double) getDimension();
 *  */
    @Test
    public void testGetSparcity_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getSparcity] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getSparcity(OpenMapRealVector.java:804) */
        openMapRealVector.getSparcity();
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:832)
            org.apache.commons.math.linear.AbstractRealVector.getNorm(AbstractRealVector.java:214)
            org.apache.commons.math.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:715) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry.getValue(OpenMapRealVector.java:832)
            org.apache.commons.math.linear.AbstractRealVector.getNorm(AbstractRealVector.java:214)
            org.apache.commons.math.linear.OpenMapRealVector.unitize(OpenMapRealVector.java:715) */
        openMapRealVector.unitize();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method unitize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#unitize()}
     */
    @Test
    public void testUnitize1() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 2.0);
        
        openMapRealVector.unitize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.sparseIterator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sparseIterator()
    
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
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.ebeDivide
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeDivide(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:317) */
        openMapRealVector.ebeDivide(((RealVector) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.ebeDivide
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeDivide([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeDivide(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeDivide] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.ebeDivide(OpenMapRealVector.java:329) */
        openMapRealVector.ebeDivide(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for ebeDivide
    
    public void testEbeDivide_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:463) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:463) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:460) */
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
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466) */
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
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:466) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:463) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -254);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:463) */
        openMapRealVector.getL1Distance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:463) */
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetL1Distance_ThrowMatrixIndexException() throws Exception  {
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
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: double delta = Math.abs(iter.value() - v.getEntry(iter.key()));
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetL1Distance_ThrowMatrixIndexException_1() throws Exception  {
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
    
    ///region OTHER: TIMEOUTS for method getL1Distance(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test(timeout = 1000L)
    public void testGetL1Distance1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
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
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.getL1Distance(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:480) */
        openMapRealVector.getL1Distance(((RealVector) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getL1Distance(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testGetL1Distance2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1410535424);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.advance(OpenIntToDoubleHashMap.java:582)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:513)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:491)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator(OpenIntToDoubleHashMap.java:248)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:460)
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:482) */
        openMapRealVector.getL1Distance(((RealVector) openMapRealVector));
    }
    ///endregion
    
    ///region Errors report for getL1Distance
    
    public void testGetL1Distance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getL1Distance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getL1Distance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testGetL1Distance_OpenMapRealVectorCheckVectorDimensions() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        double[] doubleArray = {};
        
        double actual = openMapRealVector.getL1Distance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getL1Distance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getL1Distance(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testGetL1Distance_ThrowNullPointerException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getL1Distance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getL1Distance(OpenMapRealVector.java:489) */
        openMapRealVector.getL1Distance(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for getL1Distance
    
    public void testGetL1Distance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        OpenMapRealVector actual = openMapRealVector.mapAdd(java.lang.Double.NaN);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:201)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:594)
            org.apache.commons.math.linear.OpenMapRealVector.mapAdd(OpenMapRealVector.java:588) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283)
            org.apache.commons.math.linear.OpenMapRealVector.mapAdd(OpenMapRealVector.java:588) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:147)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283)
            org.apache.commons.math.linear.OpenMapRealVector.mapAdd(OpenMapRealVector.java:588) */
        openMapRealVector.mapAdd(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method mapAdd(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAdd(double)}
     */
    @Test
    public void testMapAddWithCornerCase() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        
        OpenMapRealVector actual = openMapRealVector.mapAdd(java.lang.Double.NEGATIVE_INFINITY);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 1;
        keys[2] = 2;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NEGATIVE_INFINITY;
        values[1] = java.lang.Double.NEGATIVE_INFINITY;
        values[2] = java.lang.Double.NaN;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 3);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 3);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 3);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method mapAdd(double)
    
    @Test
    public void testMapAdd1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[36];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[40];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[40];
        states[1] = (byte) 68;
        states[2] = (byte) 68;
        states[3] = (byte) 68;
        states[4] = (byte) 68;
        states[5] = (byte) 68;
        states[6] = (byte) 68;
        states[7] = (byte) 68;
        states[8] = (byte) 68;
        states[9] = (byte) 68;
        states[10] = (byte) 68;
        states[11] = (byte) 68;
        states[12] = (byte) 68;
        states[13] = (byte) 68;
        states[14] = (byte) 68;
        states[15] = (byte) 68;
        states[16] = (byte) 68;
        states[17] = (byte) 68;
        states[18] = (byte) 68;
        states[19] = (byte) 68;
        states[20] = (byte) 68;
        states[21] = (byte) 68;
        states[22] = (byte) 68;
        states[23] = (byte) 68;
        states[24] = (byte) 68;
        states[25] = (byte) 68;
        states[26] = (byte) 68;
        states[27] = (byte) 68;
        states[28] = (byte) 68;
        states[29] = (byte) 68;
        states[30] = (byte) 68;
        states[31] = (byte) 68;
        states[32] = (byte) 68;
        states[33] = (byte) 68;
        states[34] = (byte) 68;
        states[35] = (byte) 68;
        states[36] = (byte) 68;
        states[37] = (byte) 68;
        states[38] = (byte) 68;
        states[39] = (byte) 68;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 4);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.3350443151043208E-307);
        
        OpenMapRealVector actual = openMapRealVector.mapAdd(-4.780432383136039E-308);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[36];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = new double[36];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = new byte[36];
        states1[1] = (byte) 68;
        states1[2] = (byte) 68;
        states1[3] = (byte) 68;
        states1[4] = (byte) 68;
        states1[5] = (byte) 68;
        states1[6] = (byte) 68;
        states1[7] = (byte) 68;
        states1[8] = (byte) 68;
        states1[9] = (byte) 68;
        states1[10] = (byte) 68;
        states1[11] = (byte) 68;
        states1[12] = (byte) 68;
        states1[13] = (byte) 68;
        states1[14] = (byte) 68;
        states1[15] = (byte) 68;
        states1[16] = (byte) 68;
        states1[17] = (byte) 68;
        states1[18] = (byte) 68;
        states1[19] = (byte) 68;
        states1[20] = (byte) 68;
        states1[21] = (byte) 68;
        states1[22] = (byte) 68;
        states1[23] = (byte) 68;
        states1[24] = (byte) 68;
        states1[25] = (byte) 68;
        states1[26] = (byte) 68;
        states1[27] = (byte) 68;
        states1[28] = (byte) 68;
        states1[29] = (byte) 68;
        states1[30] = (byte) 68;
        states1[31] = (byte) 68;
        states1[32] = (byte) 68;
        states1[33] = (byte) 68;
        states1[34] = (byte) 68;
        states1[35] = (byte) 68;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 4);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.3350443151043208E-307);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMapAdd2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[33];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[33];
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        OpenMapRealVector actual = openMapRealVector.mapAdd(java.lang.Double.NaN);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = new double[32];
        values1[1] = java.lang.Double.NaN;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = new byte[32];
        states1[0] = java.lang.Byte.MIN_VALUE;
        states1[1] = (byte) 1;
        states1[2] = (byte) 1;
        states1[3] = (byte) 1;
        states1[4] = (byte) 1;
        states1[5] = (byte) 1;
        states1[6] = (byte) 1;
        states1[7] = (byte) 1;
        states1[8] = (byte) 1;
        states1[9] = (byte) 1;
        states1[10] = (byte) 1;
        states1[11] = (byte) 1;
        states1[12] = (byte) 1;
        states1[13] = (byte) 1;
        states1[14] = (byte) 1;
        states1[15] = (byte) 1;
        states1[16] = (byte) 1;
        states1[17] = (byte) 1;
        states1[18] = (byte) 1;
        states1[19] = (byte) 1;
        states1[20] = (byte) 1;
        states1[21] = (byte) 1;
        states1[22] = (byte) 1;
        states1[23] = (byte) 1;
        states1[24] = (byte) 1;
        states1[25] = (byte) 1;
        states1[26] = (byte) 1;
        states1[27] = (byte) 1;
        states1[28] = (byte) 1;
        states1[29] = (byte) 1;
        states1[30] = (byte) 1;
        states1[31] = (byte) 1;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method mapAdd(double)
    
    @Test(timeout = 1000L)
    public void testMapAdd3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 3, 3, 3, 3, 3};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[33];
        states[0] = (byte) 1;
        states[1] = (byte) 2;
        states[2] = (byte) 2;
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.mapAdd(java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.outerProduct
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method outerProduct([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#outerProduct(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testOuterProduct_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.outerProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.outerProduct(OpenMapRealVector.java:601) */
        openMapRealVector.outerProduct(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for outerProduct
    
    public void testOuterProduct_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.dotProduct
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dotProduct(org.apache.commons.math.linear.OpenMapRealVector)
    
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
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:294) */
        openMapRealVector.dotProduct(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean thisIsSmaller = entries.size() < v.entries.size();
 *  */
    @Test
    public void testDotProduct_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 48);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:295) */
        openMapRealVector.dotProduct(openMapRealVector);
    }
    ///endregion
    
    ///region Errors report for dotProduct
    
    public void testDotProduct_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.dotProduct
    
    ///region FUZZER: ERROR SUITE for method dotProduct(org.apache.commons.math.linear.RealVector)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#dotProduct(org.apache.commons.math.linear.RealVector)}
     */
    @Test
    public void testDotProductThrowsNPE() {
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.AbstractRealVector.checkVectorDimensions(AbstractRealVector.java:43)
            org.apache.commons.math.linear.AbstractRealVector.dotProduct(AbstractRealVector.java:175)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:311) */
        openMapRealVector.dotProduct(((RealVector) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method dotProduct(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testDotProduct2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.dotProduct] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.advance(OpenIntToDoubleHashMap.java:582)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:513)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:491)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator(OpenIntToDoubleHashMap.java:248)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:296)
            org.apache.commons.math.linear.OpenMapRealVector.dotProduct(OpenMapRealVector.java:309) */
        openMapRealVector.dotProduct(((RealVector) openMapRealVector));
    }
    ///endregion
    
    ///region Errors report for dotProduct
    
    public void testDotProduct_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getSubVector
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSubVector(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubVector_ThrowMatrixIndexException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getSubVector(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubVector_ThrowMatrixIndexException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getSubVector(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getSubVector(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index + n - 1);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubVector_ThrowMatrixIndexException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        openMapRealVector.getSubVector(0, 0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSubVector(int, int)
    
    @Test
    public void testGetSubVector1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 3);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getSubVector(OpenMapRealVector.java:369) */
        openMapRealVector.getSubVector(1, 0);
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
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index + v.length - 1);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {};
        
        openMapRealVector.setSubVector(0, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(0, ((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,double[])}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(-1, ((double[]) null));
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
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:647) */
        openMapRealVector.setSubVector(0, ((double[]) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setSubVector(int, [D)
    
    @Test
    public void testSetSubVector1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1071501302);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 9.021982555859185E-307);
        double[] doubleArray = {9.32188082580304E-308};
        
        openMapRealVector.setSubVector(1071239139, doubleArray);
    }
    
    @Test
    public void testSetSubVector2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            3, 3, 3, 3, 3, 3, 3, 3,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1071241211);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.3255852775875809E-298);
        double[] doubleArray = {
            -6.315283074357343E-299, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        openMapRealVector.setSubVector(1071239154, doubleArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSubVector(int, [D)
    
    @Test
    public void testSetSubVector3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 6);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.1390823942665686E-207);
        double[] doubleArray = {-9.962927287332409E-265, 0.0, 0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException] */
        openMapRealVector.setSubVector(0, doubleArray);
    }
    
    @Test
    public void testSetSubVector4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 34);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.1125369292697907E-308);
        double[] doubleArray = new double[32];
        doubleArray[0] = -5.5626846464299E-309;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:403)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:364)
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:633)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:649) */
        openMapRealVector.setSubVector(0, doubleArray);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method setSubVector(int, [D)
    
    @Test(timeout = 1000L)
    public void testSetSubVector5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 64);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2084.3750000000077);
        double[] doubleArray = {
            4.961581052536364E-153, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.setSubVector(0, doubleArray);
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
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class intType = int.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method setSubVectorMethod = openMapRealVectorClazz.getDeclaredMethod("setSubVector", intType, arrayRealVectorType);
        setSubVectorMethod.setAccessible(true);
        java.lang.Object[] setSubVectorMethodArguments = new java.lang.Object[2];
        setSubVectorMethodArguments[0] = 256;
        setSubVectorMethodArguments[1] = arrayRealVector;
        setSubVectorMethod.invoke(openMapRealVector, setSubVectorMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSubVector(int, org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index + v.getDimension() - 1);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException_21() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(0, openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(0, ((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setSubVector(-1, ((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setSubVector(int,org.apache.commons.math.linear.RealVector)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index + v.getDimension() - 1);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubVector_ThrowMatrixIndexException_3() throws Throwable  {
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
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:382)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:641) */
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
        int[] keys = {1073741824};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1073741824 out of bounds for length 1]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:641) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:641) */
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
        byte[] states = new byte[11];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:641) */
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
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:640) */
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
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:631)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:649)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:641) */
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
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:641) */
        openMapRealVector.setSubVector(0, openMapRealVector1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setSubVector(int, org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testSetSubVector6() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1073741832);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = new double[40];
        data[0] = -0.0;
        data[2] = 2.0722615E-317;
        data[9] = 5.43230922487E-312;
        data[24] = 1.0609978955E-314;
        data[28] = 1.1125369292536007E-308;
        arrayRealVector.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:631)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:649)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:641) */
        Class openMapRealVectorClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class intType = int.class;
        Class arrayRealVectorType = Class.forName("org.apache.commons.math.linear.RealVector");
        Method setSubVectorMethod = openMapRealVectorClazz.getDeclaredMethod("setSubVector", intType, arrayRealVectorType);
        setSubVectorMethod.setAccessible(true);
        java.lang.Object[] setSubVectorMethodArguments = new java.lang.Object[2];
        setSubVectorMethodArguments[0] = 49266652;
        setSubVectorMethodArguments[1] = arrayRealVector;
        try {
            setSubVectorMethod.invoke(openMapRealVector, setSubVectorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSetSubVector7() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 11);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
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
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 10);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setSubVector] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:631)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:649)
            org.apache.commons.math.linear.OpenMapRealVector.setSubVector(OpenMapRealVector.java:641) */
        openMapRealVector.setSubVector(1, openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeMultiply(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:341) */
        openMapRealVector.ebeMultiply(((RealVector) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ebeMultiply(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testEbeMultiply1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1207959565);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1207959565);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:141)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:342) */
        openMapRealVector.ebeMultiply(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testEbeMultiply2() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {};
        arrayRealVector.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:141)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:342) */
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
    
    ///region Errors report for ebeMultiply
    
    public void testEbeMultiply_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeMultiply([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#ebeMultiply(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.ebeMultiply(OpenMapRealVector.java:353) */
        openMapRealVector.ebeMultiply(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for ebeMultiply
    
    public void testEbeMultiply_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
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
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:594) */
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
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:594) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
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
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:201)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:594) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:190)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:594) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: setEntry(i, getEntry(i) + d);
 *  */
    @Test
    public void testMapAddToSelf_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:202)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:594) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:594) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:594) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:201)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:594) */
        openMapRealVector.mapAddToSelf(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method mapAddToSelf(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#mapAddToSelf(double)}
     */
    @Test
    public void testMapAddToSelfWithCornerCase() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        
        OpenMapRealVector actual = openMapRealVector.mapAddToSelf(java.lang.Double.NEGATIVE_INFINITY);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 1;
        keys[2] = 2;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NEGATIVE_INFINITY;
        values[1] = java.lang.Double.NEGATIVE_INFINITY;
        values[2] = java.lang.Double.NaN;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 3);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 3);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 3);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method mapAddToSelf(double)
    
    @Test
    public void testMapAddToSelf1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -2.3255289908804677E154);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:425)
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:631)
            org.apache.commons.math.linear.OpenMapRealVector.mapAddToSelf(OpenMapRealVector.java:594) */
        openMapRealVector.mapAddToSelf(3.743737437340729E-155);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method mapAddToSelf(double)
    
    @Test(timeout = 1000L)
    public void testMapAddToSelf2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[16];
        keys[1] = -2147483646;
        keys[2] = -2147483646;
        keys[3] = -2147483646;
        keys[4] = -2147483646;
        keys[5] = -2147483646;
        keys[6] = -2147483646;
        keys[7] = -2147483646;
        keys[8] = -2147483646;
        keys[9] = -2147483646;
        keys[10] = -2147483646;
        keys[11] = -2147483646;
        keys[12] = -2147483646;
        keys[13] = -2147483646;
        keys[14] = -2147483646;
        keys[15] = -2147483646;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 8);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.576459507838854E-231);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.mapAddToSelf(-1.2882788959846244E-231);
    }
    
    @Test(timeout = 1000L)
    public void testMapAddToSelf3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            1.0019540508219553, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 4);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.706041068506667E302);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.mapAddToSelf(-0.7401800587842899);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getLInfNorm
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLInfNorm()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfNorm()}
 *  */
    @Test
    public void testGetLInfNorm() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        double actual = openMapRealVector.getLInfNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfNorm()}
 *  */
    @Test
    public void testGetLInfNorm_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        double actual = openMapRealVector.getLInfNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLInfNorm()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfNorm()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testGetLInfNorm_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfNorm] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfNorm(OpenMapRealVector.java:503) */
        openMapRealVector.getLInfNorm();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getLInfNorm()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetLInfNorm_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfNorm] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getLInfNorm(OpenMapRealVector.java:500) */
        openMapRealVector.getLInfNorm();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLInfNorm()
    
    @Test
    public void testGetLInfNorm1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = new double[11];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        double actual = openMapRealVector.getLInfNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testGetLInfNorm2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        double actual = openMapRealVector.getLInfNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLInfNorm()
    
    @Test
    public void testGetLInfNorm3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getLInfNorm] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getLInfNorm(OpenMapRealVector.java:503) */
        openMapRealVector.getLInfNorm();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getDistance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDistance(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:426) */
        openMapRealVector.getDistance(((RealVector) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDistance(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testGetDistance1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 545654786);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 545654786);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.advance(OpenIntToDoubleHashMap.java:582)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:513)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:491)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator(OpenIntToDoubleHashMap.java:248)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:403)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:428) */
        openMapRealVector.getDistance(((RealVector) openMapRealVector1));
    }
    ///endregion
    
    ///region Errors report for getDistance
    
    public void testGetDistance_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
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
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:407) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test
    public void testGetDistance_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:409) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
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
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:403) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:412) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:412) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iter.advance();
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:407) */
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:409) */
        openMapRealVector.getDistance(((OpenMapRealVector) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetDistance_ThrowMatrixIndexException() throws Exception  {
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
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: delta = iter.value() - v.getEntry(key);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetDistance_ThrowMatrixIndexException_1() throws Exception  {
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test
    public void testGetDistance3() throws Exception  {
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
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        double actual = openMapRealVector.getDistance(openMapRealVector1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test
    public void testGetDistance4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            251658231, 26, 26, 26, 26, 26, 26, 26,
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
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states1 = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            java.lang.Byte.MIN_VALUE
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 251658238);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:202)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447)
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:409) */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getDistance(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test(timeout = 1000L)
    public void testGetDistance5() throws Exception  {
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
        byte[] states = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.getDistance(openMapRealVector1);
    }
    
    @Test(timeout = 1000L)
    public void testGetDistance6() throws Exception  {
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
        openMapRealVector.getDistance(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.getDistance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDistance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 * @utbot.returnsFrom {@code return Math.sqrt(res);}
 *  */
    @Test
    public void testGetDistance_MathSqrt() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        double[] doubleArray = {};
        
        double actual = openMapRealVector.getDistance(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDistance([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:435) */
        openMapRealVector.getDistance(((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getDistance(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double delta = entries.get(i) - v[i];
 *  */
    @Test
    public void testGetDistance_ThrowNullPointerException_11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getDistance] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getDistance(OpenMapRealVector.java:438) */
        openMapRealVector.getDistance(doubleArray);
    }
    ///endregion
    
    ///region Errors report for getDistance
    
    public void testGetDistance_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.add
    
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
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:225) */
        openMapRealVector.add(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#add(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkVectorDimensions(int)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#size()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean copyThis = entries.size() > v.entries.size();
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 48);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:226) */
        openMapRealVector.add(openMapRealVector);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test
    public void testAdd1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 8651415);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:141)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283)
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:227) */
        openMapRealVector.add(openMapRealVector);
    }
    ///endregion
    
    ///region Errors report for add
    
    public void testAdd_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.add
    
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
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:210) */
        openMapRealVector.add(((RealVector) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testAdd3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:226)
            org.apache.commons.math.linear.OpenMapRealVector.add(OpenMapRealVector.java:212) */
        openMapRealVector.add(((RealVector) openMapRealVector));
    }
    ///endregion
    
    ///region Errors report for add
    
    public void testAdd_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
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
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.executesCondition {@code (!(obj instanceof OpenMapRealVector)): True}
 *  */
    @Test
    public void testEquals_NotObjInstanceOfOpenMapRealVector() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        byte[] byteArray = {};
        
        boolean actual = openMapRealVector.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj == null): False}
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
 * @utbot.executesCondition {@code (obj == null): False}
 * @utbot.executesCondition {@code (!(obj instanceof OpenMapRealVector)): False}
 * @utbot.executesCondition {@code (virtualSize != other.virtualSize): False}
 * @utbot.executesCondition {@code (Double.doubleToLongBits(other.epsilon)): True}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 *  */
    @Test
    public void testEquals_DoubleDoubleToLongBits() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", -0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        boolean actual = openMapRealVector.equals(openMapRealVector1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (obj): False}
 * @utbot.executesCondition {@code (obj == null): True}
 *  */
    @Test
    public void testEquals_ObjEqualsNull() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        boolean actual = openMapRealVector.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method equals(java.lang.Object)
    
    @Test
    public void testEquals1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.advance(OpenIntToDoubleHashMap.java:582)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:513)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:491)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator(OpenIntToDoubleHashMap.java:248)
            org.apache.commons.math.linear.OpenMapRealVector.equals(OpenMapRealVector.java:780) */
        openMapRealVector.equals(openMapRealVector1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.append
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method append(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 *  */
    @Test
    public void testAppend_VInstanceOfOpenMapRealVector() throws Exception  {
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -127);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {java.lang.Byte.MIN_VALUE};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 16384);
        
        OpenMapRealVector actual = openMapRealVector.append(((RealVector) openMapRealVector1));
        
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
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 16257);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append(v.getData());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:262) */
        openMapRealVector.append(((RealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append((OpenMapRealVector) v);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:248)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:260) */
        openMapRealVector.append(((RealVector) openMapRealVector1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return append((OpenMapRealVector) v);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 67108864);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:147)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:248)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:260) */
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
    public void testAppend_ThrowNullPointerException_2() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {2.0000000000004547};
        arrayRealVector.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:274)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:262) */
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
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.RealVector)}
 * @utbot.executesCondition {@code (v instanceof OpenMapRealVector): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.advance(OpenIntToDoubleHashMap.java:582)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:513)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:491)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator(OpenIntToDoubleHashMap.java:248)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:249)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:260) */
        openMapRealVector.append(((RealVector) openMapRealVector1));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(org.apache.commons.math.linear.RealVector)
    
    @Test
    public void testAppend1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:248)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:260) */
        openMapRealVector.append(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testAppend2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[33];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for byte[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:147)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:248)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:260) */
        openMapRealVector.append(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testAppend3() throws Throwable  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        ArrayRealVector arrayRealVector = new ArrayRealVector(0);
        double[] data = {0.0};
        arrayRealVector.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 3 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:274)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:262) */
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
    
    @Test
    public void testAppend4() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 134217761);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 402653184);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:252)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:260) */
        openMapRealVector.append(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testAppend5() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1744830431);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 134217728);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:252)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:260) */
        openMapRealVector.append(((RealVector) openMapRealVector1));
    }
    
    @Test
    public void testAppend6() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -2013265887);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 402653184);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:252)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:260) */
        openMapRealVector.append(((RealVector) openMapRealVector1));
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 2);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
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
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -254);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
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
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:274) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:274) */
        openMapRealVector.append(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, a.length);
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
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:147)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:274) */
        openMapRealVector.append(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < a.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: res.setEntry(i + virtualSize, a[i]);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testAppend_ThrowMatrixIndexException() throws Exception  {
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        double[] doubleArray = {0.0};
        
        openMapRealVector.append(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < a.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: res.setEntry(i + virtualSize, a[i]);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testAppend_ThrowMatrixIndexException_1() throws Exception  {
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MAX_VALUE);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        double[] doubleArray = {0.0};
        
        openMapRealVector.append(doubleArray);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method append([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double[])}
     */
    @Test
    public void testAppendWithNonEmptyPrimitiveArray() throws Exception  {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        
        OpenMapRealVector actual = openMapRealVector.append(doubleArray1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[1] = 1;
        keys[2] = 2;
        keys[3] = 3;
        keys[4] = 4;
        keys[5] = 5;
        keys[6] = 6;
        keys[7] = 7;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = java.lang.Double.NEGATIVE_INFINITY;
        values[1] = -1.0;
        values[2] = java.lang.Double.NaN;
        values[3] = java.lang.Double.POSITIVE_INFINITY;
        values[4] = java.lang.Double.POSITIVE_INFINITY;
        values[5] = java.lang.Double.POSITIVE_INFINITY;
        values[6] = java.lang.Double.POSITIVE_INFINITY;
        values[7] = java.lang.Double.POSITIVE_INFINITY;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        states[3] = (byte) 1;
        states[4] = (byte) 1;
        states[5] = (byte) 1;
        states[6] = (byte) 1;
        states[7] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 8);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 8);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 8);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append([D)
    
    @Test
    public void testAppend7() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 4224);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        double[] doubleArray = {4.9E-324};
        
        OpenMapRealVector actual = openMapRealVector.append(doubleArray);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {4224, 0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {4.9E-324, 0.0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 4225);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.9E-324);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append([D)
    
    @Test
    public void testAppend8() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1, 128, 128, 128, 128, 128, 128, 128,
            128, 128
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[40];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[25];
        states[0] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 36);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 864583529);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.000001907348633);
        double[] doubleArray = {2.000001907348633, 0.0, 0.0, 0.0, 0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException] */
        openMapRealVector.append(doubleArray);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method append([D)
    
    @Test(timeout = 1000L)
    public void testAppend9() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[39];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[40];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[40];
        states[0] = (byte) 2;
        states[1] = (byte) 2;
        states[2] = (byte) 2;
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
        states[34] = (byte) 2;
        states[35] = (byte) 2;
        states[36] = (byte) 2;
        states[37] = (byte) 2;
        states[38] = (byte) 2;
        states[39] = (byte) 2;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 38);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 866123769);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        double[] doubleArray = {0.0, 0.0};
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.append(doubleArray);
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
    public void testAppend_ThrowNullPointerException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -2);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:267) */
        openMapRealVector.append(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, 1);
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_12() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -15);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:147)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:267) */
        openMapRealVector.append(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: res.setEntry(virtualSize, d);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testAppend_ThrowMatrixIndexException1() throws Exception  {
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        openMapRealVector.append(java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(double)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: res.setEntry(virtualSize, d);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testAppend_ThrowMatrixIndexException_11() throws Exception  {
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", Integer.MAX_VALUE);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        openMapRealVector.append(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method append(double)
    
    @Test
    public void testAppend10() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[27];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[34];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[34];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 742506746);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", -4.628226285103933E-306);
        
        OpenMapRealVector actual = openMapRealVector.append(-4.6282262897457986E-306);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[54];
        keys1[4] = 742506746;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = new double[54];
        values1[4] = -4.6282262897457986E-306;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = new byte[54];
        states1[4] = (byte) 1;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 53);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 742506747);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", -4.628226285103933E-306);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAppend11() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[39];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[39];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[40];
        states[38] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 38);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 866123769);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", -3.2153130217738396E174);
        
        OpenMapRealVector actual = openMapRealVector.append(-3.215313024998661E174);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[39];
        keys1[36] = 866123769;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = new double[39];
        values1[36] = -3.215313024998661E174;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = new byte[39];
        states1[36] = (byte) 1;
        states1[38] = (byte) 1;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 38);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 866123770);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", -3.2153130217738396E174);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAppend12() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[12];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[12];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[33];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 486670590);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.2995055313880288E-113);
        
        OpenMapRealVector actual = openMapRealVector.append(-1.3191472680134932E-228);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[12];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = new double[12];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = new byte[12];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 486670591);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.2995055313880288E-113);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAppend13() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[34];
        states[0] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.252326732231971E-154);
        
        OpenMapRealVector actual = openMapRealVector.append(2.369491407830233E-289);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0, 0, 0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {java.lang.Double.NaN, 0.0, 0.0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 2, (byte) 0, (byte) 0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.252326732231971E-154);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method append(double)
    
    @Test(timeout = 1000L)
    public void testAppend14() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        states[0] = (byte) 2;
        states[1] = (byte) 2;
        states[2] = (byte) 2;
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 9.705941632433478E-299);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.append(-4.852970816216738E-299);
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) -127};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        OpenMapRealVector actual = openMapRealVector.append(openMapRealVector1);
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries2 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states2 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states2);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -510);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        // org.apache.commons.math.linear.OpenMapRealVector has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method append(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:252) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 3.337610787760802E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
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
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:252) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:248) */
        openMapRealVector.append(((OpenMapRealVector) null));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_13() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:248) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: OpenMapRealVector res = new OpenMapRealVector(this, v.getDimension());
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_22() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -254);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:147)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:248) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = v.entries.iterator();
 *  */
    @Test
    public void testAppend_ThrowNullPointerException_31() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 16);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 4);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -126);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 131);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:249) */
        openMapRealVector.append(openMapRealVector1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method append(org.apache.commons.math.linear.OpenMapRealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#append(org.apache.commons.math.linear.OpenMapRealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#getDimension()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: res.setEntry(iter.key() + virtualSize, iter.value());
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testAppend_ThrowMatrixIndexException2() throws Exception  {
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 5);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-6};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {0.0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        openMapRealVector.append(openMapRealVector1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method append(org.apache.commons.math.linear.OpenMapRealVector)
    
    @Test
    public void testAppend15() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:86)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:248) */
        openMapRealVector.append(openMapRealVector1);
    }
    
    @Test
    public void testAppend16() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            0, 27, 27, 27, 27, 27, 27, 27,
            27
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {
            -2.0000000000000004, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 965738817);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException] */
        openMapRealVector.append(openMapRealVector1);
    }
    
    @Test
    public void testAppend17() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -2.000000000001708, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 1.8465957235571472E-127);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 96);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.000000000003417);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {160, 1593875137, 1593875137, 1593875137, 1593875137, 1593875137, 1593875137, 1593875137};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1593875137);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException] */
        openMapRealVector.append(openMapRealVector1);
    }
    
    @Test
    public void testAppend18() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.0E-323);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            0, 387191109, 387191109, 387191109, 387191109, 387191109, 387191109, 387191109,
            387191109
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {
            4.9E-324, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {
            (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 387191109);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.ArrayIndexOutOfBoundsException] */
        openMapRealVector.append(openMapRealVector1);
    }
    
    @Test
    public void testAppend19() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        OpenMapRealVector openMapRealVector1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {
            (byte) 1, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE,
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(openMapRealVector1, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 51380225);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.append] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.append(OpenMapRealVector.java:252) */
        openMapRealVector.append(openMapRealVector1);
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
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.hashCode(OpenMapRealVector.java:749) */
        openMapRealVector.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#hashCode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator iter = entries.iterator();
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.hashCode(OpenMapRealVector.java:746) */
        openMapRealVector.hashCode();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hashCode()
    
    @Test
    public void testHashCode1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = (byte) 1;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", java.lang.Double.NaN);
        
        int actual = openMapRealVector.hashCode();
        
        assertEquals(665114783, actual);
    }
    
    @Test
    public void testHashCode2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            0.0, 2.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        int actual = openMapRealVector.hashCode();
        
        assertEquals(-1460267135, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hashCode()
    
    @Test
    public void testHashCode3() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 3.337610787760802E-308);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.hashCode(OpenMapRealVector.java:749) */
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
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:382)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:730) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:730) */
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
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:730) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:730) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:730) */
        openMapRealVector.toArray();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toArray()
    
    @Test
    public void testToArray1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 3, 3, 3, 3, 3, 3, 3,
            3
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386)
            org.apache.commons.math.linear.OpenMapRealVector.toArray(OpenMapRealVector.java:730) */
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
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#set(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < virtualSize; i++)} once
 *  */
    @Test
    public void testSet_OpenMapRealVectorSetEntry() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 1.529059112555674E-297);
        
        openMapRealVector.set(1.9113238906945923E-298);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method set(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#set(double)}
     */
    @Test
    public void testSetWithCornerCase() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 0.0);
        
        openMapRealVector.set(java.lang.Double.NEGATIVE_INFINITY);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method set(double)
    
    @Test(timeout = 1000L)
    public void testSet1() throws Exception  {
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", -0.0);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.set(0.0);
    }
    
    @Test(timeout = 1000L)
    public void testSet2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 256);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 5.617182442146609E-193);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealVector.set(-5.617182442146609E-193);
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:579) */
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
            org.apache.commons.math.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:576) */
        openMapRealVector.isNaN();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isNaN()
    
    @Test
    public void testIsNaN1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 1, java.lang.Byte.MIN_VALUE, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
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
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[13];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[2] = java.lang.Byte.MIN_VALUE;
        states[3] = java.lang.Byte.MIN_VALUE;
        states[4] = (byte) 1;
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
        byte[] states = new byte[13];
        states[0] = (byte) 1;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = java.lang.Byte.MIN_VALUE;
        states[3] = java.lang.Byte.MIN_VALUE;
        states[4] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.isNaN] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.isNaN(OpenMapRealVector.java:579) */
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 2);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 4);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 2);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
        OpenMapRealVector actual = openMapRealVector.copy();
        
        OpenMapRealVector expected = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 2);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 4);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 0.0);
        
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:147)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:145)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:147)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:283) */
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
    public void testIsInfinite_1() throws Exception  {
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
    public void testIsInfinite_2() throws Exception  {
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
    public void testIsInfinite() throws Exception  {
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
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testIsInfinite_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {java.lang.Double.NEGATIVE_INFINITY};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.isInfinite] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:563) */
        openMapRealVector.isInfinite();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#isInfinite()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testIsInfinite_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {-2.0000000000000004};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.isInfinite] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:563) */
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
            org.apache.commons.math.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:560) */
        openMapRealVector.isInfinite();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isInfinite()
    
    @Test
    public void testIsInfinite1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {
            java.lang.Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = (byte) 1;
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
            0.0, java.lang.Double.NEGATIVE_INFINITY, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
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
        byte[] states = new byte[13];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = (byte) 1;
        states[3] = java.lang.Byte.MIN_VALUE;
        states[4] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.isInfinite] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.isInfinite(OpenMapRealVector.java:563) */
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
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
        int[] keys = {1, 19};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 33);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 20);
        
        double actual = openMapRealVector.getEntry(19);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEntry(int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.getEntry(-1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getEntry(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException_1() throws Exception  {
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:190)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447) */
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
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -2147483647);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 2021725412);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483647 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:201)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447) */
        openMapRealVector.getEntry(2021725411);
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
        int[] keys = {-255, 17};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 18);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:202)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447) */
        openMapRealVector.getEntry(17);
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
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealVector.getEntry(OpenMapRealVector.java:447) */
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
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:382) */
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
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:561)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386) */
        openMapRealVector.getData();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getData()}
 * @utbot.iterates iterate the loop {@code while(iter.hasNext())} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iter.advance();
 *  */
    @Test
    public void testGetData_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
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
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386) */
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
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:383) */
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
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:543)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:386) */
        openMapRealVector.getData();
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getData()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#getData()}
     */
    @Test
    public void testGetData1() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, -1.0, java.lang.Double.NaN};
        OpenMapRealVector openMapRealVector = new OpenMapRealVector(doubleArray, 2.0);
        
        double[] actual = openMapRealVector.getData();
        
        double[] expected = {java.lang.Double.NEGATIVE_INFINITY, 0.0, java.lang.Double.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.setEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#checkIndex(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealVector#isDefaultValue(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#containsKey(int)}
 *  */
    @Test
    public void testSetEntry_OpenIntToDoubleHashMapContainsKey() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-256};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 256);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 5.36312317197704E154);
        
        openMapRealVector.setEntry(255, 2.315841784746324E77);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_ThrowMatrixIndexException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setEntry(0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: checkIndex(index);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetEntry_ThrowMatrixIndexException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        openMapRealVector.setEntry(-1, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setEntry(int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 9.556619453472963E-299);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:219)
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:632) */
        openMapRealVector.setEntry(0, 4.7783097267364807E-299);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: entries.containsKey(index)
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -256};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 256);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 8.767237918601685E-193);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:223)
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:632) */
        openMapRealVector.setEntry(255, 5.152919322815614E-231);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#put(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.put(index, value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 2.2250738585072014E-308);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:631) */
        openMapRealVector.setEntry(0, 2.2250738585072014E-308);
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
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 4.104568116429002E-289);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:632) */
        openMapRealVector.setEntry(0, 4.778346182346578E-299);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#setEntry(int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: entries.containsKey(index)
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", 1);
        setField(openMapRealVector, "org.apache.commons.math.linear.OpenMapRealVector", "epsilon", 9.464424710111703E-270);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:219)
            org.apache.commons.math.linear.OpenMapRealVector.setEntry(OpenMapRealVector.java:632) */
        openMapRealVector.setEntry(0, 2.225075556103834E-307);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.OpenMapRealVector)
    
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
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:667) */
        openMapRealVector.subtract(((OpenMapRealVector) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.RealVector)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(org.apache.commons.math.linear.RealVector)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealVector#getDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.getDimension());
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException1() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:684) */
        openMapRealVector.subtract(((RealVector) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealVector.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract([D)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealVector}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealVector#subtract(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkVectorDimensions(v.length);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException2() throws Exception  {
        OpenMapRealVector openMapRealVector = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealVector.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.subtract(OpenMapRealVector.java:693) */
        openMapRealVector.subtract(((double[]) null));
    }
    ///endregion
    
    ///region Errors report for subtract
    
    public void testSubtract_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.linear
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields740561522275700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields740561522275700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass740561522281800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields740561522275700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass740561522281800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields740561522741700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields740561522741700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass740561522743500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields740561522741700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass740561522743500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

