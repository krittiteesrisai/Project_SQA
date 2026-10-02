package org.apache.commons.math.linear;

import org.junit.Test;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.apache.commons.math.exception.OutOfRangeException;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_linear_OpenMapRealMatrixTest {
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.linear.OpenMapRealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.MatrixUtils#checkAdditionCompatible(org.apache.commons.math.linear.AnyMatrix,org.apache.commons.math.linear.AnyMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testAdd_MatrixUtilsCheckAdditionCompatible() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) -127};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        OpenMapRealMatrix actual = openMapRealMatrix.add(openMapRealMatrix1);
        
        OpenMapRealMatrix expected = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries2 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states2 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states2);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.225073858507202E-308);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries2);
        
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
        assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.linear.OpenMapRealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixDimensionMismatchException} in: MatrixUtils.checkAdditionCompatible(this, m);
 *  */
    @Test(expected = MatrixDimensionMismatchException.class)
    public void testAdd_ThrowMatrixDimensionMismatchException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -2);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixDimensionMismatchException} in: MatrixUtils.checkAdditionCompatible(this, m);
 *  */
    @Test(expected = MatrixDimensionMismatchException.class)
    public void testAdd_ThrowMatrixDimensionMismatchException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -2);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: out.setEntry(row, col, getEntry(row, col) + iterator.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAdd_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 130);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 130);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-256};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: out.setEntry(row, col, getEntry(row, col) + iterator.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAdd_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 5);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 5);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: out.setEntry(row, col, getEntry(row, col) + iterator.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAdd_ThrowOutOfRangeException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 18);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 18);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-16};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: out.setEntry(row, col, getEntry(row, col) + iterator.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAdd_ThrowOutOfRangeException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -128);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 3.9040722143503565E-270);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -254);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -128);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {64};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.linear.OpenMapRealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int row = iterator.key() / columns;
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math.linear.OpenMapRealMatrix.add(OpenMapRealMatrix.java:100) */
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: final int row = iterator.key() / columns;
 *  */
    @Test
    public void testAdd_ThrowArithmeticException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -254);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -254);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.add] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math.linear.OpenMapRealMatrix.add(OpenMapRealMatrix.java:100) */
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.225073858507202E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213)
            org.apache.commons.math.linear.OpenMapRealMatrix.add(OpenMapRealMatrix.java:102) */
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.setEntry(row, col, getEntry(row, col) + iterator.value());
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 256);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127, (byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.225073858507202E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 256);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1025 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213)
            org.apache.commons.math.linear.OpenMapRealMatrix.add(OpenMapRealMatrix.java:102) */
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.setEntry(row, col, getEntry(row, col) + iterator.value());
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 256);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -254);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 256);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math.linear.OpenMapRealMatrix.add(OpenMapRealMatrix.java:102) */
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final OpenMapRealMatrix out = new OpenMapRealMatrix(this);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.add] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:63)
            org.apache.commons.math.linear.OpenMapRealMatrix.add(OpenMapRealMatrix.java:97) */
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(OpenIntToDoubleHashMap.Iterator iterator = m.entries.iterator(); iterator.hasNext(); )
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 5.180654E-318);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.add(OpenMapRealMatrix.java:98) */
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iterator.advance();
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math.linear.OpenMapRealMatrix.add(OpenMapRealMatrix.java:100) */
        openMapRealMatrix.add(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#add(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final OpenMapRealMatrix out = new OpenMapRealMatrix(this);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.add] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:63)
            org.apache.commons.math.linear.OpenMapRealMatrix.add(OpenMapRealMatrix.java:97) */
        openMapRealMatrix.add(openMapRealMatrix);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.copy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copy()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#copy()}
 * @utbot.returnsFrom {@code return new OpenMapRealMatrix(this);}
 *  */
    @Test
    public void testCopy_Return() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 8);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -248);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -254);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        OpenMapRealMatrix actual = openMapRealMatrix.copy();
        
        OpenMapRealMatrix expected = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 8);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -248);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -254);
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
        assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copy()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#copy()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new OpenMapRealMatrix(this);
 *  */
    @Test
    public void testCopy_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -254);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.copy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for double[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:63)
            org.apache.commons.math.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:69) */
        openMapRealMatrix.copy();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#copy()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new OpenMapRealMatrix(this);
 *  */
    @Test
    public void testCopy_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.copy] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for byte[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:63)
            org.apache.commons.math.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:69) */
        openMapRealMatrix.copy();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#copy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new OpenMapRealMatrix(this);
 *  */
    @Test
    public void testCopy_ThrowNullPointerException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.copy] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:63)
            org.apache.commons.math.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:69) */
        openMapRealMatrix.copy();
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#copy()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return new OpenMapRealMatrix(this);
 *  */
    @Test
    public void testCopy_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.copy] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:63)
            org.apache.commons.math.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:69) */
        openMapRealMatrix.copy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.multiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math.linear.OpenMapRealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.MatrixUtils#checkMultiplicationCompatible(org.apache.commons.math.linear.AnyMatrix,org.apache.commons.math.linear.AnyMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealMatrix#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testMultiply_OpenMapRealMatrixGetColumnDimension() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        OpenMapRealMatrix actual = openMapRealMatrix.multiply(openMapRealMatrix1);
        
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
        assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math.linear.OpenMapRealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: MatrixUtils.checkMultiplicationCompatible(this, m);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testMultiply_ThrowDimensionMismatchException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -2);
        
        openMapRealMatrix.multiply(openMapRealMatrix);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: OpenMapRealMatrix out = new OpenMapRealMatrix(rows, outCols);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testMultiply_ThrowNotStrictlyPositiveException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: OpenMapRealMatrix out = new OpenMapRealMatrix(rows, outCols);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testMultiply_ThrowNotStrictlyPositiveException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(org.apache.commons.math.linear.OpenMapRealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = iterator.value();
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:186) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: final int i = key / columns;
 *  */
    @Test
    public void testMultiply_ThrowArithmeticException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:188) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: iterator.advance();
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:187) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: m.entries.containsKey(rightKey)
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 173);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {146};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 173);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {256};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:213)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: m.entries.containsKey(rightKey)
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-128};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:221)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: m.entries.containsKey(rightKey)
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 64);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 64);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255, -255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {java.lang.Byte.MIN_VALUE};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:218)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: m.entries.containsKey(rightKey)
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 8);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -254);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 8);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.entries.get(outKey) + value * m.entries.get(rightKey)
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 50);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 50);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {1, -255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -254);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:195) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:184) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iterator.advance();
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:186) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: m.entries.containsKey(rightKey)
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: m.entries.containsKey(rightKey)
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 128);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {64};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -254);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 128);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -240);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.iterates iterate the loop {@code for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: m.entries.containsKey(rightKey)
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192) */
        openMapRealMatrix.multiply(openMapRealMatrix1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.multiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.OpenMapRealMatrix)}
 *  */
    @Test
    public void testMultiply_OpenMapRealMatrixMultiply() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1)));
        
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
        assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
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
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.MatrixUtils#checkMultiplicationCompatible(org.apache.commons.math.linear.AnyMatrix,org.apache.commons.math.linear.AnyMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.caughtException {@code ClassCastException cce}
 *  */
    @Test
    public void testMultiply_CatchClassCastException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        BlockRealMatrix actual = ((BlockRealMatrix) multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments));
        
        BlockRealMatrix expected = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray1 = {0.0};
        blocks[0] = doubleArray1;
        setField(expected, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(expected, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(expected, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 1);
        setField(expected, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows", 1);
        setField(expected, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 1);
        
        double[][] expectedBlocks = ((double[][]) getFieldValue(expected, "org.apache.commons.math.linear.BlockRealMatrix", "blocks"));
        double[][] actualBlocks = ((double[][]) getFieldValue(actual, "org.apache.commons.math.linear.BlockRealMatrix", "blocks"));
        int expectedBlocksSize = expectedBlocks.length;
        assertEquals(expectedBlocksSize, actualBlocks.length);
        for (int i = 0; i < expectedBlocksSize; i++) {
            double[] expectedBlocksNestedElement1 = expectedBlocks[i];
            double[] actualBlocksNestedElement1 = actualBlocks[i];
            
            if (expectedBlocksNestedElement1 == null) {
                assertNull(actualBlocksNestedElement1);
            } else {
                int expectedBlocksNestedElement1Size = expectedBlocksNestedElement1.length;
                assertEquals(expectedBlocksNestedElement1Size, actualBlocksNestedElement1.length);
                org.junit.Assert.assertArrayEquals(expectedBlocksNestedElement1, actualBlocksNestedElement1, 1.0E-6);
            }
        }
        
        int expectedRows = ((Integer) getFieldValue(expected, "org.apache.commons.math.linear.BlockRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.BlockRealMatrix", "rows"));
        assertEquals(expectedRows, actualRows);
        
        int expectedColumns = ((Integer) getFieldValue(expected, "org.apache.commons.math.linear.BlockRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.BlockRealMatrix", "columns"));
        assertEquals(expectedColumns, actualColumns);
        
        int expectedBlockRows = ((Integer) getFieldValue(expected, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows"));
        int actualBlockRows = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.BlockRealMatrix", "blockRows"));
        assertEquals(expectedBlockRows, actualBlockRows);
        
        int expectedBlockColumns = ((Integer) getFieldValue(expected, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns"));
        int actualBlockColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns"));
        assertEquals(expectedBlockColumns, actualBlockColumns);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: return multiply((OpenMapRealMatrix) m);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testMultiply_ThrowDimensionMismatchException1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -1);
        
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return multiply((OpenMapRealMatrix) m);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testMultiply_ThrowNotStrictlyPositiveException1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return multiply((OpenMapRealMatrix) m);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testMultiply_ThrowNotStrictlyPositiveException_11() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: MatrixUtils.checkMultiplicationCompatible(this, m);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testMultiply_ThrowDimensionMismatchException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: final BlockRealMatrix out = new BlockRealMatrix(rows, outCols);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testMultiply_ThrowNotStrictlyPositiveException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.exception.DimensionMismatchException} in: MatrixUtils.checkMultiplicationCompatible(this, m);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testMultiply_ThrowDimensionMismatchException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -3);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = {
            null,
            null
        };
        array2DRowRealMatrix.data = data;
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: final BlockRealMatrix out = new BlockRealMatrix(rows, outCols);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testMultiply_ThrowNotStrictlyPositiveException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = {null};
        array2DRowRealMatrix.data = data;
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: out.addToEntry(i, j, value * m.getEntry(k, j));
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testMultiply_ThrowOutOfRangeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[2][];
        data[0] = values;
        data[1] = ((double[]) null);
        array2DRowRealMatrix.data = data;
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int outCols = m.getColumnDimension();
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = {};
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:328)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:152) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final BlockRealMatrix out = new BlockRealMatrix(rows, outCols);
 *  */
    @Test
    public void testMultiply_ThrowNegativeArraySizeException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2147483620);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NegativeArraySizeException: -41297762]
            org.apache.commons.math.linear.BlockRealMatrix.createBlocksLayout(BlockRealMatrix.java:250)
            org.apache.commons.math.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:103)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:153) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return multiply((OpenMapRealMatrix) m);
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_41() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:186)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return multiply((OpenMapRealMatrix) m);
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_51() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:187)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: return multiply((OpenMapRealMatrix) m);
 *  */
    @Test
    public void testMultiply_ThrowArithmeticException1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:188)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = iterator.value();
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:156) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int key = iterator.key();
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_21() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        data[0] = values;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:157) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.addToEntry(i, j, value * m.getEntry(k, j));
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_31() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[2][];
        data[0] = values;
        double[] doubleArray = {};
        data[1] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:295)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:161) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_61() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 127);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 127);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return multiply((OpenMapRealMatrix) m);
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {37};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-268435710};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:213)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return multiply((OpenMapRealMatrix) m);
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1153);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-224, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1153);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-219, -255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {java.lang.Byte.MIN_VALUE};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:218)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return multiply((OpenMapRealMatrix) m);
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_21() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:186)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(OpenIntToDoubleHashMap.Iterator iterator = entries.iterator(); iterator.hasNext(); )
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:154) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iterator.advance();
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_11() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:156) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method multiplyMethod = openMapRealMatrixClazz.getDeclaredMethod("multiply", array2DRowRealMatrixType);
        multiplyMethod.setAccessible(true);
        java.lang.Object[] multiplyMethodArguments = new java.lang.Object[1];
        multiplyMethodArguments[0] = array2DRowRealMatrix;
        try {
            multiplyMethod.invoke(openMapRealMatrix, multiplyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_31() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-128};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_41() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {64};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:209)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testMultiply1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -268449023);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            1644652681, 10689, 10689, 10689, 10689, 10689, 10689, 10689,
            10689
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1, (byte) 0, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -268449023);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1881366434);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = new int[13];
        keys1[0] = 10689;
        keys1[1] = 10689;
        keys1[2] = 10689;
        keys1[3] = -213975170;
        keys1[4] = 10689;
        keys1[5] = 10689;
        keys1[6] = 10689;
        keys1[7] = 10689;
        keys1[8] = 10689;
        keys1[9] = 10689;
        keys1[10] = 10689;
        keys1[12] = 10689;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = new byte[15];
        states1[0] = java.lang.Byte.MIN_VALUE;
        states1[1] = java.lang.Byte.MIN_VALUE;
        states1[2] = java.lang.Byte.MIN_VALUE;
        states1[3] = java.lang.Byte.MIN_VALUE;
        states1[4] = java.lang.Byte.MIN_VALUE;
        states1[5] = java.lang.Byte.MIN_VALUE;
        states1[6] = java.lang.Byte.MIN_VALUE;
        states1[7] = java.lang.Byte.MIN_VALUE;
        states1[8] = java.lang.Byte.MIN_VALUE;
        states1[9] = java.lang.Byte.MIN_VALUE;
        states1[10] = java.lang.Byte.MIN_VALUE;
        states1[11] = java.lang.Byte.MIN_VALUE;
        states1[12] = java.lang.Byte.MIN_VALUE;
        states1[13] = java.lang.Byte.MIN_VALUE;
        states1[14] = java.lang.Byte.MIN_VALUE;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 11);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:195)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiply(OpenMapRealMatrix.java:146) */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method multiply(org.apache.commons.math.linear.RealMatrix)
    
    @Test(timeout = 1000L)
    public void testMultiply2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -80);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            41943040, 33554432, 33554432, 33554432, 33554432, 33554432, 33554432, 33554432,
            33554432
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -80);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 33554432);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {
            1, 33554432, 33554432, 33554432, 33554432, 33554432, 33554432, 33554432,
            33554432
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealMatrix.multiply(((RealMatrix) openMapRealMatrix1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.getEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.returnsFrom {@code return entries.get(computeKey(row, column));}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        double actual = openMapRealMatrix.getEntry(0, 0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.returnsFrom {@code return entries.get(computeKey(row, column));}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 2, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        double actual = openMapRealMatrix.getEntry(0, 0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.returnsFrom {@code return entries.get(computeKey(row, column));}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 4);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        double actual = openMapRealMatrix.getEntry(0, 0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.returnsFrom {@code return entries.get(computeKey(row, column));}
 *  */
    @Test
    public void testGetEntry_ReturnEntriesGet_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        double actual = openMapRealMatrix.getEntry(0, 0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkRowIndex(this, row);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.getEntry(-1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkColumnIndex(this, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        
        openMapRealMatrix.getEntry(0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkRowIndex(this, row);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.getEntry(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkColumnIndex(this, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetEntry_ThrowOutOfRangeException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        
        openMapRealMatrix.getEntry(0, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(computeKey(row, column));
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213) */
        openMapRealMatrix.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(computeKey(row, column));
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 4);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2029549313 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213) */
        openMapRealMatrix.getEntry(3, 536870911);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(computeKey(row, column));
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213) */
        openMapRealMatrix.getEntry(255, 536870911);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(computeKey(row, column));
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213) */
        openMapRealMatrix.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(computeKey(row, column));
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213) */
        openMapRealMatrix.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return entries.get(computeKey(row, column));
 *  */
    @Test
    public void testGetEntry_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.getEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213) */
        openMapRealMatrix.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(computeKey(row, column));
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213) */
        openMapRealMatrix.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(computeKey(row, column));
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213) */
        openMapRealMatrix.getEntry(0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return entries.get(computeKey(row, column));
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213) */
        openMapRealMatrix.getEntry(255, 536870911);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.setEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 *  */
    @Test
    public void testSetEntry_ValueEqualsZero_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        openMapRealMatrix.setEntry(0, 0, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 *  */
    @Test
    public void testSetEntry_ValueEqualsZero() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        openMapRealMatrix.setEntry(255, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 *  */
    @Test
    public void testSetEntry_ValueEqualsZero_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 130);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1946157056);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-402653186, -402653186};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        openMapRealMatrix.setEntry(129, 1946157055, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 *  */
    @Test
    public void testSetEntry_ValueEqualsZero_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        openMapRealMatrix.setEntry(0, 0, 0.0);
        
        OpenIntToDoubleHashMap openMapRealMatrixEntries = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] openMapRealMatrixEntriesEntriesStates = ((byte[]) getFieldValue(openMapRealMatrixEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte finalOpenMapRealMatrixEntriesStates0 = ((Byte) get(openMapRealMatrixEntriesEntriesStates, 0));
        OpenIntToDoubleHashMap openMapRealMatrixEntries1 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesSize = ((Integer) getFieldValue(openMapRealMatrixEntries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries2 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesCount = ((Integer) getFieldValue(openMapRealMatrixEntries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        
        assertEquals((byte) 2, finalOpenMapRealMatrixEntriesStates0);
        
        assertEquals(-256, finalOpenMapRealMatrixEntriesSize);
        
        assertEquals(-254, finalOpenMapRealMatrixEntriesCount);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 *  */
    @Test
    public void testSetEntry_ValueNotEqualsZero() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
        
        OpenIntToDoubleHashMap openMapRealMatrixEntries = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] openMapRealMatrixEntriesEntriesValues = ((double[]) getFieldValue(openMapRealMatrixEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double finalOpenMapRealMatrixEntriesValues0 = ((Double) get(openMapRealMatrixEntriesEntriesValues, 0));
        
        org.junit.Assert.assertEquals(2.225073858507202E-308, finalOpenMapRealMatrixEntriesValues0, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 *  */
    @Test
    public void testSetEntry_ValueNotEqualsZero_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -1);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        openMapRealMatrix.setEntry(0, 0, 1.835685933268441E-307);
        
        OpenIntToDoubleHashMap openMapRealMatrixEntries = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] openMapRealMatrixEntriesEntriesKeys = ((int[]) getFieldValue(openMapRealMatrixEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        int finalOpenMapRealMatrixEntriesKeys0 = ((Integer) get(openMapRealMatrixEntriesEntriesKeys, 0));
        OpenIntToDoubleHashMap openMapRealMatrixEntries1 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] openMapRealMatrixEntries1EntriesValues = ((double[]) getFieldValue(openMapRealMatrixEntries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double finalOpenMapRealMatrixEntriesValues0 = ((Double) get(openMapRealMatrixEntries1EntriesValues, 0));
        OpenIntToDoubleHashMap openMapRealMatrixEntries2 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] openMapRealMatrixEntries2EntriesStates = ((byte[]) getFieldValue(openMapRealMatrixEntries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte finalOpenMapRealMatrixEntriesStates0 = ((Byte) get(openMapRealMatrixEntries2EntriesStates, 0));
        OpenIntToDoubleHashMap openMapRealMatrixEntries3 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesSize = ((Integer) getFieldValue(openMapRealMatrixEntries3, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries4 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesCount = ((Integer) getFieldValue(openMapRealMatrixEntries4, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        
        assertEquals(0, finalOpenMapRealMatrixEntriesKeys0);
        
        org.junit.Assert.assertEquals(1.835685933268441E-307, finalOpenMapRealMatrixEntriesValues0, 1.0E-6);
        
        assertEquals((byte) 1, finalOpenMapRealMatrixEntriesStates0);
        
        assertEquals(0, finalOpenMapRealMatrixEntriesSize);
        
        assertEquals(1, finalOpenMapRealMatrixEntriesCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkRowIndex(this, row);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.setEntry(-1, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkRowIndex(this, row);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.setEntry(0, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkColumnIndex(this, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        
        openMapRealMatrix.setEntry(0, -1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkColumnIndex(this, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSetEntry_ThrowOutOfRangeException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        
        openMapRealMatrix.setEntry(0, 0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.remove(computeKey(row, column));
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(0, 0, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.remove(computeKey(row, column));
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(0, 0, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.remove(computeKey(row, column));
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, -1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:354)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(255, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.remove(computeKey(row, column));
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, -2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:357)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(255, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.remove(computeKey(row, column));
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 12);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1107296256);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {2147483646, 939524094};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:362)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(11, 1107296255, -0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.put(computeKey(row, column), value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:415)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.put(computeKey(row, column), value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 2, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:306)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.put(computeKey(row, column), value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:273)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.put(computeKey(row, column), value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_11() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:285)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.put(computeKey(row, column), value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.put(computeKey(row, column), value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:417)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: entries.put(computeKey(row, column), value);
 *  */
    @Test
    public void testSetEntry_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:412)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.remove(computeKey(row, column));
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(0, 0, -0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.put(computeKey(row, column), value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.remove(computeKey(row, column));
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(255, 1073741823, -0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.remove(computeKey(row, column));
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_4() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:353)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(0, 0, -0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.remove(computeKey(row, column));
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:354)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(255, 1073741823, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.put(computeKey(row, column), value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_7() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:273)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.remove(computeKey(row, column));
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_5() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:393)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:354)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(0, 0, 0.0);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#setEntry(int,int,double)}
 * @utbot.executesCondition {@code (value == 0.0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: entries.put(computeKey(row, column), value);
 *  */
    @Test
    public void testSetEntry_ThrowNullPointerException_6() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:271)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(0, 0, 2.225073858507202E-308);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method setEntry(int, int, double)
    
    @Test
    public void testSetEntry1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 807473734);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 373719717);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[35];
        keys[0] = 10689;
        keys[1] = 10689;
        keys[3] = 10689;
        keys[4] = 10689;
        keys[5] = 10689;
        keys[6] = 10689;
        keys[7] = 10689;
        keys[8] = 10689;
        keys[9] = 10689;
        keys[10] = 10689;
        keys[11] = 10689;
        keys[12] = 10689;
        keys[13] = 10689;
        keys[14] = 10689;
        keys[15] = 10689;
        keys[16] = 10689;
        keys[17] = 10689;
        keys[18] = 10689;
        keys[19] = 10689;
        keys[20] = 10689;
        keys[21] = 10689;
        keys[22] = 10689;
        keys[23] = 10689;
        keys[24] = 10689;
        keys[25] = 10689;
        keys[26] = 10689;
        keys[27] = 10689;
        keys[28] = 10689;
        keys[29] = 10689;
        keys[30] = 10689;
        keys[31] = 10689;
        keys[32] = 10689;
        keys[33] = 10689;
        keys[34] = -1981808639;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[35];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[35];
        states[2] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 34);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        openMapRealMatrix.setEntry(807440965, 230469512, -0.0);
        
        OpenIntToDoubleHashMap openMapRealMatrixEntries = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] openMapRealMatrixEntriesEntriesKeys = ((int[]) getFieldValue(openMapRealMatrixEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        int finalOpenMapRealMatrixEntriesKeys34 = ((Integer) get(openMapRealMatrixEntriesEntriesKeys, 34));
        OpenIntToDoubleHashMap openMapRealMatrixEntries1 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] openMapRealMatrixEntries1EntriesStates = ((byte[]) getFieldValue(openMapRealMatrixEntries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte finalOpenMapRealMatrixEntriesStates34 = ((Byte) get(openMapRealMatrixEntries1EntriesStates, 34));
        OpenIntToDoubleHashMap openMapRealMatrixEntries2 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesSize = ((Integer) getFieldValue(openMapRealMatrixEntries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries3 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesCount = ((Integer) getFieldValue(openMapRealMatrixEntries3, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        
        assertEquals(0, finalOpenMapRealMatrixEntriesKeys34);
        
        assertEquals((byte) 2, finalOpenMapRealMatrixEntriesStates34);
        
        assertEquals(-1, finalOpenMapRealMatrixEntriesSize);
        
        assertEquals(1, finalOpenMapRealMatrixEntriesCount);
    }
    
    @Test
    public void testSetEntry2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 867894146);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1749694141);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            536870912, 0, 536870912, 536870912, 536870912, 536870912, 536870912, 536870912,
            536870912, 536870912
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        openMapRealMatrix.setEntry(788169601, 235254723, -0.0);
        
        OpenIntToDoubleHashMap openMapRealMatrixEntries = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] openMapRealMatrixEntriesEntriesStates = ((byte[]) getFieldValue(openMapRealMatrixEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        byte finalOpenMapRealMatrixEntriesStates1 = ((Byte) get(openMapRealMatrixEntriesEntriesStates, 1));
        OpenIntToDoubleHashMap openMapRealMatrixEntries1 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesSize = ((Integer) getFieldValue(openMapRealMatrixEntries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries2 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesCount = ((Integer) getFieldValue(openMapRealMatrixEntries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count"));
        
        assertEquals((byte) 2, finalOpenMapRealMatrixEntriesStates1);
        
        assertEquals(-1, finalOpenMapRealMatrixEntriesSize);
        
        assertEquals(1, finalOpenMapRealMatrixEntriesCount);
    }
    
    @Test
    public void testSetEntry3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1082327188);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1498972682);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[13];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[13];
        states[1] = (byte) 8;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 195099903);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        OpenIntToDoubleHashMap openMapRealMatrixEntries = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] initialOpenMapRealMatrixEntriesKeys = ((int[]) getFieldValue(openMapRealMatrixEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries1 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] initialOpenMapRealMatrixEntriesValues = ((double[]) getFieldValue(openMapRealMatrixEntries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries2 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] initialOpenMapRealMatrixEntriesStates = ((byte[]) getFieldValue(openMapRealMatrixEntries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        
        openMapRealMatrix.setEntry(1082282545, 55830551, 2.0532704848291926E-289);
        
        OpenIntToDoubleHashMap openMapRealMatrixEntries3 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] finalOpenMapRealMatrixEntriesKeys = ((int[]) getFieldValue(openMapRealMatrixEntries3, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries4 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] finalOpenMapRealMatrixEntriesValues = ((double[]) getFieldValue(openMapRealMatrixEntries4, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries5 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] finalOpenMapRealMatrixEntriesStates = ((byte[]) getFieldValue(openMapRealMatrixEntries5, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries6 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesSize = ((Integer) getFieldValue(openMapRealMatrixEntries6, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries7 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesMask = ((Integer) getFieldValue(openMapRealMatrixEntries7, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask"));
        
        assertFalse(initialOpenMapRealMatrixEntriesKeys == finalOpenMapRealMatrixEntriesKeys);
        
        assertFalse(initialOpenMapRealMatrixEntriesValues == finalOpenMapRealMatrixEntriesValues);
        
        assertFalse(initialOpenMapRealMatrixEntriesStates == finalOpenMapRealMatrixEntriesStates);
        
        assertEquals(195099904, finalOpenMapRealMatrixEntriesSize);
        
        assertEquals(25, finalOpenMapRealMatrixEntriesMask);
    }
    
    @Test
    public void testSetEntry4() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 237207808);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 764263353);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[17];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[17];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[17];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 39518208);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -590224);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        OpenIntToDoubleHashMap openMapRealMatrixEntries = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] initialOpenMapRealMatrixEntriesKeys = ((int[]) getFieldValue(openMapRealMatrixEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries1 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] initialOpenMapRealMatrixEntriesValues = ((double[]) getFieldValue(openMapRealMatrixEntries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries2 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] initialOpenMapRealMatrixEntriesStates = ((byte[]) getFieldValue(openMapRealMatrixEntries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        
        openMapRealMatrix.setEntry(237158561, 8401328, 1.4916681462427547E-154);
        
        OpenIntToDoubleHashMap openMapRealMatrixEntries3 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int[] finalOpenMapRealMatrixEntriesKeys = ((int[]) getFieldValue(openMapRealMatrixEntries3, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries4 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        double[] finalOpenMapRealMatrixEntriesValues = ((double[]) getFieldValue(openMapRealMatrixEntries4, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries5 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        byte[] finalOpenMapRealMatrixEntriesStates = ((byte[]) getFieldValue(openMapRealMatrixEntries5, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries6 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesSize = ((Integer) getFieldValue(openMapRealMatrixEntries6, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size"));
        OpenIntToDoubleHashMap openMapRealMatrixEntries7 = ((OpenIntToDoubleHashMap) getFieldValue(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries"));
        int finalOpenMapRealMatrixEntriesMask = ((Integer) getFieldValue(openMapRealMatrixEntries7, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask"));
        
        assertFalse(initialOpenMapRealMatrixEntriesKeys == finalOpenMapRealMatrixEntriesKeys);
        
        assertFalse(initialOpenMapRealMatrixEntriesValues == finalOpenMapRealMatrixEntriesValues);
        
        assertFalse(initialOpenMapRealMatrixEntriesStates == finalOpenMapRealMatrixEntriesStates);
        
        assertEquals(39518209, finalOpenMapRealMatrixEntriesSize);
        
        assertEquals(33, finalOpenMapRealMatrixEntriesMask);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method setEntry(int, int, double)
    
    @Test
    public void testSetEntry5() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2087040620);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 115119723);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[32];
        states[0] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", Integer.MIN_VALUE);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 32]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:304)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(1063234303, 3093074, 1.2882297539194267E-231);
    }
    
    @Test
    public void testSetEntry6() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1132154994);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1135791904);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        keys[0] = 536870912;
        keys[1] = 536870912;
        keys[2] = 536870912;
        keys[3] = 536870912;
        keys[4] = 536870912;
        keys[5] = 536870912;
        keys[6] = 536870912;
        keys[7] = 536870912;
        keys[9] = 536870912;
        keys[10] = 536870912;
        keys[11] = 536870912;
        keys[12] = 536870912;
        keys[13] = 536870912;
        keys[14] = 536870912;
        keys[15] = 536870912;
        keys[16] = 536870912;
        keys[17] = 536870912;
        keys[18] = 536870912;
        keys[19] = 536870912;
        keys[20] = 536870912;
        keys[21] = 536870912;
        keys[22] = 536870912;
        keys[23] = 536870912;
        keys[24] = 536870912;
        keys[25] = 536870912;
        keys[26] = 536870912;
        keys[27] = 536870912;
        keys[28] = 536870912;
        keys[29] = 536870912;
        keys[30] = 536870912;
        keys[31] = 536870912;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[33];
        states[8] = (byte) 1;
        states[32] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 40);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 32]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:285)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(1132146801, 1082132740, java.lang.Double.NaN);
    }
    
    @Test
    public void testSetEntry7() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 715832057);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1657909206);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            730098360, 0, 730098360, 730098360, 730098360, 730098360, 730098360, 730098360,
            730098360, 730098360
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.doRemove(OpenIntToDoubleHashMap.java:393)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.remove(OpenIntToDoubleHashMap.java:366)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:228) */
        openMapRealMatrix.setEntry(715307756, 730098360, -0.0);
    }
    
    @Test
    public void testSetEntry8() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2122593157);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 966547083);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[35];
        keys[0] = 6;
        keys[1] = 6;
        keys[2] = 6;
        keys[3] = 6;
        keys[4] = 6;
        keys[5] = 6;
        keys[6] = 6;
        keys[7] = 6;
        keys[8] = 6;
        keys[9] = 6;
        keys[10] = 6;
        keys[11] = 6;
        keys[12] = 6;
        keys[13] = 6;
        keys[14] = 6;
        keys[15] = 6;
        keys[16] = 6;
        keys[17] = 6;
        keys[18] = 6;
        keys[19] = 6;
        keys[20] = 6;
        keys[21] = 6;
        keys[22] = 6;
        keys[23] = 6;
        keys[24] = 6;
        keys[25] = 6;
        keys[26] = 6;
        keys[27] = 6;
        keys[28] = 6;
        keys[29] = 6;
        keys[30] = 6;
        keys[31] = 6;
        keys[32] = 6;
        keys[33] = 6;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[39];
        states[34] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 34);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:417)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(1585591172, 445765795, 2.225073858507202E-308);
    }
    
    @Test
    public void testSetEntry9() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2027815190);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 563987283);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[33];
        keys[1] = 1917441;
        keys[2] = 1917441;
        keys[3] = 1917441;
        keys[4] = 1917441;
        keys[5] = 1917441;
        keys[6] = 1917441;
        keys[7] = 1917441;
        keys[8] = 1917441;
        keys[9] = 1917441;
        keys[10] = 1917441;
        keys[11] = 1917441;
        keys[12] = 1917441;
        keys[13] = 1917441;
        keys[14] = 1917441;
        keys[15] = 1917441;
        keys[16] = 1917441;
        keys[17] = 1917441;
        keys[18] = 1917441;
        keys[19] = 1917441;
        keys[20] = 1917441;
        keys[21] = 1917441;
        keys[22] = 1917441;
        keys[23] = 1917441;
        keys[24] = 1917441;
        keys[25] = 1917441;
        keys[26] = 1917441;
        keys[27] = 1917441;
        keys[28] = 1917441;
        keys[29] = 1917441;
        keys[30] = 1917441;
        keys[31] = 1917441;
        keys[32] = -112978902;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[33];
        states[0] = (byte) 1;
        states[32] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 32);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:412)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(1490682131, 1917441, 2.937097493229506E-306);
    }
    
    @Test
    public void testSetEntry10() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1605279750);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 429783805);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-650494976};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[25];
        states[0] = (byte) 1;
        states[16] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 16);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:412)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(1605275653, 16778511, 2.225073858507202E-308);
    }
    
    @Test
    public void testSetEntry11() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1359258722);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1528243843);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[39];
        keys[0] = 1702724515;
        keys[1] = 1702724515;
        keys[2] = 1702724515;
        keys[4] = 1702724515;
        keys[5] = 1702724515;
        keys[6] = 1702724515;
        keys[7] = 1702724515;
        keys[8] = 1702724515;
        keys[9] = 1702724515;
        keys[10] = 1702724515;
        keys[11] = 1702724515;
        keys[12] = 1702724515;
        keys[13] = 1702724515;
        keys[14] = 1702724515;
        keys[15] = 1702724515;
        keys[16] = 1702724515;
        keys[17] = 1702724515;
        keys[18] = 1702724515;
        keys[19] = 1702724515;
        keys[20] = 1702724515;
        keys[21] = 1702724515;
        keys[22] = 1702724515;
        keys[23] = 1702724515;
        keys[24] = 1702724515;
        keys[25] = 1702724515;
        keys[26] = 1702724515;
        keys[27] = 1702724515;
        keys[28] = 1702724515;
        keys[29] = 1702724515;
        keys[30] = 1702724515;
        keys[31] = 1702724515;
        keys[32] = 1702724515;
        keys[33] = 1702724515;
        keys[34] = 1702724515;
        keys[35] = 1702724515;
        keys[36] = 1702724515;
        keys[37] = 1702724515;
        keys[38] = 1702724515;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[27];
        states[3] = (byte) 1;
        states[11] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 11);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:417)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(1359258721, 1141235678, 2.225073858507202E-308);
    }
    
    @Test
    public void testSetEntry12() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2122593157);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 966547083);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[35];
        keys[0] = 6;
        keys[1] = 6;
        keys[2] = 6;
        keys[3] = 6;
        keys[4] = 6;
        keys[5] = 6;
        keys[6] = 6;
        keys[7] = 6;
        keys[8] = 6;
        keys[9] = 6;
        keys[10] = 6;
        keys[11] = 6;
        keys[12] = 6;
        keys[13] = 6;
        keys[14] = 6;
        keys[15] = 6;
        keys[16] = 6;
        keys[17] = 6;
        keys[18] = 6;
        keys[19] = 6;
        keys[20] = 6;
        keys[21] = 6;
        keys[22] = 6;
        keys[23] = 6;
        keys[24] = 6;
        keys[25] = 6;
        keys[26] = 6;
        keys[27] = 6;
        keys[28] = 6;
        keys[29] = 6;
        keys[30] = 6;
        keys[31] = 6;
        keys[32] = 6;
        keys[33] = 6;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[39];
        states[32] = java.lang.Byte.MIN_VALUE;
        states[34] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 34);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:417)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(1585591172, 445765795, 2.225073858507202E-308);
    }
    
    @Test
    public void testSetEntry13() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1754895877);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1688592124);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = new byte[39];
        states[32] = (byte) 1;
        states[34] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 34);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.setEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:306)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.findInsertionIndex(OpenIntToDoubleHashMap.java:256)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.put(OpenIntToDoubleHashMap.java:407)
            org.apache.commons.math.linear.OpenMapRealMatrix.setEntry(OpenMapRealMatrix.java:230) */
        openMapRealMatrix.setEntry(143496708, 1010304863, 4.778309726771247E-299);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method setEntry(int, int, double)
    
    @Test(timeout = 1000L)
    public void testSetEntry14() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", Integer.MAX_VALUE);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", Integer.MAX_VALUE);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealMatrix.setEntry(2147483646, 2147483646, -0.0);
    }
    
    @Test(timeout = 1000L)
    public void testSetEntry15() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1717987942);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2147483643);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            3, 1, 3, 3, 3, 3, 3, 3,
            3, 3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        openMapRealMatrix.setEntry(1717986917, 2147483641, 0.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.linear.OpenMapRealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.MatrixUtils#checkAdditionCompatible(org.apache.commons.math.linear.AnyMatrix,org.apache.commons.math.linear.AnyMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.util.OpenIntToDoubleHashMap#iterator()}
 *  */
    @Test
    public void testSubtract_MatrixUtilsCheckAdditionCompatible() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) -127};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        OpenMapRealMatrix actual = openMapRealMatrix.subtract(openMapRealMatrix1);
        
        OpenMapRealMatrix expected = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries2 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states2 = {};
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states2);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.225073858507202E-308);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries2, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries2);
        
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
        assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.linear.OpenMapRealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixDimensionMismatchException} in: MatrixUtils.checkAdditionCompatible(this, m);
 *  */
    @Test(expected = MatrixDimensionMismatchException.class)
    public void testSubtract_ThrowMatrixDimensionMismatchException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -2);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixDimensionMismatchException} in: MatrixUtils.checkAdditionCompatible(this, m);
 *  */
    @Test(expected = MatrixDimensionMismatchException.class)
    public void testSubtract_ThrowMatrixDimensionMismatchException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -2);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: out.setEntry(row, col, getEntry(row, col) - iterator.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSubtract_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -254);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -33);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -254);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -33);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {40};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: out.setEntry(row, col, getEntry(row, col) - iterator.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSubtract_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 17);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 17);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: out.setEntry(row, col, getEntry(row, col) - iterator.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSubtract_ThrowOutOfRangeException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 135);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 135);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-64};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: out.setEntry(row, col, getEntry(row, col) - iterator.value());
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSubtract_ThrowOutOfRangeException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -1.0936683029334596E-303);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.OpenMapRealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int row = iterator.key() / columns;
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:134) */
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: final int row = iterator.key() / columns;
 *  */
    @Test
    public void testSubtract_ThrowArithmeticException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -254);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -254);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {-255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:134) */
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {0};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:136) */
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.setEntry(row, col, getEntry(row, col) - iterator.value());
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 256);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127, (byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 256);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1025 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:136) */
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out.setEntry(row, col, getEntry(row, col) - iterator.value());
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 256);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 2.225073858507202E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", -255);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -254);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 256);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {255};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {(byte) 1, (byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.value(OpenIntToDoubleHashMap.java:549)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:136) */
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final OpenMapRealMatrix out = new OpenMapRealMatrix(this);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:63)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:131) */
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(OpenIntToDoubleHashMap.Iterator iterator = m.entries.iterator(); iterator.hasNext(); )
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 5.180654E-318);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:132) */
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: iterator.advance();
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
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
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states1 = {(byte) 1};
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:532)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:134) */
        openMapRealMatrix.subtract(openMapRealMatrix1);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.OpenMapRealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final OpenMapRealMatrix out = new OpenMapRealMatrix(this);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:63)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:131) */
        openMapRealMatrix.subtract(openMapRealMatrix);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.AbstractRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.returnsFrom {@code return (OpenMapRealMatrix) super.subtract(m);}
 * @utbot.caughtException {@code ClassCastException cce}
 *  */
    @Test
    public void testSubtract_CatchClassCastException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -1.491669568805641E-154);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {-3.403073751319798E38};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments));
        
        OpenMapRealMatrix expected = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        values[0] = 3.403073751319798E38;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states1 = new byte[32];
        states1[0] = (byte) 1;
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "size", 1);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(entries1, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "count", 1);
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
        assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixDimensionMismatchException} in: return subtract((OpenMapRealMatrix) m);
 *  */
    @Test(expected = MatrixDimensionMismatchException.class)
    public void testSubtract_ThrowMatrixDimensionMismatchException1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -1);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.subtract(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixDimensionMismatchException} in: return subtract((OpenMapRealMatrix) m);
 *  */
    @Test(expected = MatrixDimensionMismatchException.class)
    public void testSubtract_ThrowMatrixDimensionMismatchException_11() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -1);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        
        openMapRealMatrix.subtract(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixDimensionMismatchException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test(expected = MatrixDimensionMismatchException.class)
    public void testSubtract_ThrowMatrixDimensionMismatchException_2() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixDimensionMismatchException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test(expected = MatrixDimensionMismatchException.class)
    public void testSubtract_ThrowMatrixDimensionMismatchException_3() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testSubtract_ThrowNotStrictlyPositiveException() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixDimensionMismatchException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test(expected = MatrixDimensionMismatchException.class)
    public void testSubtract_ThrowMatrixDimensionMismatchException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -3);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = {
            null,
            null
        };
        array2DRowRealMatrix.data = data;
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixDimensionMismatchException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test(expected = MatrixDimensionMismatchException.class)
    public void testSubtract_ThrowMatrixDimensionMismatchException_5() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = {null};
        array2DRowRealMatrix.data = data;
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testSubtract_ThrowNotStrictlyPositiveException_1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = {};
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:328)
            org.apache.commons.math.linear.MatrixUtils.checkSubtractionCompatible(MatrixUtils.java:494)
            org.apache.commons.math.linear.AbstractRealMatrix.subtract(AbstractRealMatrix.java:88)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:115) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_11() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213)
            org.apache.commons.math.linear.AbstractRealMatrix.subtract(AbstractRealMatrix.java:95)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:115) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_31() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213)
            org.apache.commons.math.linear.AbstractRealMatrix.subtract(AbstractRealMatrix.java:95)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:115) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_21() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213)
            org.apache.commons.math.linear.AbstractRealMatrix.subtract(AbstractRealMatrix.java:95)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:115) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {41, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213)
            org.apache.commons.math.linear.AbstractRealMatrix.subtract(AbstractRealMatrix.java:95)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:115) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return subtract((OpenMapRealMatrix) m);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:63)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:131)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:113) */
        openMapRealMatrix.subtract(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return subtract((OpenMapRealMatrix) m);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_11() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        OpenMapRealMatrix openMapRealMatrix1 = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        setField(openMapRealMatrix1, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:63)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:131)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:113) */
        openMapRealMatrix.subtract(((RealMatrix) openMapRealMatrix1));
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_21() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213)
            org.apache.commons.math.linear.AbstractRealMatrix.subtract(AbstractRealMatrix.java:95)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:115) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.caughtException {@code ClassCastException cce}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return (OpenMapRealMatrix) super.subtract(m);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_31() throws Throwable  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = new byte[13];
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 4);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        Array2DRowRealMatrix array2DRowRealMatrix = new Array2DRowRealMatrix();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        array2DRowRealMatrix.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:213)
            org.apache.commons.math.linear.AbstractRealMatrix.subtract(AbstractRealMatrix.java:95)
            org.apache.commons.math.linear.OpenMapRealMatrix.subtract(OpenMapRealMatrix.java:115) */
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method subtractMethod = openMapRealMatrixClazz.getDeclaredMethod("subtract", array2DRowRealMatrixType);
        subtractMethod.setAccessible(true);
        java.lang.Object[] subtractMethodArguments = new java.lang.Object[1];
        subtractMethodArguments[0] = array2DRowRealMatrix;
        try {
            subtractMethod.invoke(openMapRealMatrix, subtractMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.getColumnDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnDimension()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getColumnDimension()}
 * @utbot.returnsFrom {@code return columns;}
 *  */
    @Test
    public void testGetColumnDimension_ReturnColumns() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        
        int actual = openMapRealMatrix.getColumnDimension();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiplyEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkRowIndex(this, row);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testMultiplyEntry_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.multiplyEntry(-1, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkColumnIndex(this, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testMultiplyEntry_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        
        openMapRealMatrix.multiplyEntry(0, -1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkColumnIndex(this, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testMultiplyEntry_ThrowOutOfRangeException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        
        openMapRealMatrix.multiplyEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkRowIndex(this, row);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testMultiplyEntry_ThrowOutOfRangeException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.multiplyEntry(0, -255, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiplyEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -225);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index -235868385 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(1073741823, 536870911, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) -127};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 32);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(255, 536870911, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-254};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(1, 536870911, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-2147483647, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowNullPointerException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(255, 536870911, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#multiplyEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double value = entries.get(key) * factor;
 *  */
    @Test
    public void testMultiplyEntry_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.multiplyEntry(OpenMapRealMatrix.java:254) */
        openMapRealMatrix.multiplyEntry(0, 0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.getRowDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowDimension()
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#getRowDimension()}
 * @utbot.returnsFrom {@code return rows;}
 *  */
    @Test
    public void testGetRowDimension_ReturnRows() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", -255);
        
        int actual = openMapRealMatrix.getRowDimension();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.computeKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeKey(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#computeKey(int,int)}
 * @utbot.returnsFrom {@code return row * columns + column;}
 *  */
    @Test
    public void testComputeKey_ReturnRowMultiplyColumnsPlusColumn() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", -255);
        
        Class openMapRealMatrixClazz = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class intType = int.class;
        Method computeKeyMethod = openMapRealMatrixClazz.getDeclaredMethod("computeKey", intType, intType);
        computeKeyMethod.setAccessible(true);
        java.lang.Object[] computeKeyMethodArguments = new java.lang.Object[2];
        computeKeyMethodArguments[0] = -255;
        computeKeyMethodArguments[1] = -255;
        int actual = ((Integer) computeKeyMethod.invoke(openMapRealMatrix, computeKeyMethodArguments));
        
        assertEquals(64770, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addToEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkRowIndex(this, row);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAddToEntry_ThrowOutOfRangeException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.addToEntry(-1, -255, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkColumnIndex(this, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAddToEntry_ThrowOutOfRangeException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        
        openMapRealMatrix.addToEntry(0, -1, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkColumnIndex(this, column);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAddToEntry_ThrowOutOfRangeException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        
        openMapRealMatrix.addToEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.OutOfRangeException} in: MatrixUtils.checkRowIndex(this, row);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testAddToEntry_ThrowOutOfRangeException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.addToEntry(0, -255, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addToEntry(int, int, double)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) + increment;
 *  */
    @Test
    public void testAddToEntry_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1073741824);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -225);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index -235868385 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(OpenMapRealMatrix.java:240) */
        openMapRealMatrix.addToEntry(1073741823, 536870911, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) + increment;
 *  */
    @Test
    public void testAddToEntry_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(OpenMapRealMatrix.java:240) */
        openMapRealMatrix.addToEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) + increment;
 *  */
    @Test
    public void testAddToEntry_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-1, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 32);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(OpenMapRealMatrix.java:240) */
        openMapRealMatrix.addToEntry(255, 536870911, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) + increment;
 *  */
    @Test
    public void testAddToEntry_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-255, -255};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(OpenMapRealMatrix.java:240) */
        openMapRealMatrix.addToEntry(255, 536870911, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) + increment;
 *  */
    @Test
    public void testAddToEntry_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) -127, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(OpenMapRealMatrix.java:240) */
        openMapRealMatrix.addToEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double value = entries.get(key) + increment;
 *  */
    @Test
    public void testAddToEntry_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-2147483647, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) -127, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(OpenMapRealMatrix.java:240) */
        openMapRealMatrix.addToEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double value = entries.get(key) + increment;
 *  */
    @Test
    public void testAddToEntry_ThrowNullPointerException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(OpenMapRealMatrix.java:240) */
        openMapRealMatrix.addToEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double value = entries.get(key) + increment;
 *  */
    @Test
    public void testAddToEntry_ThrowNullPointerException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 256);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(OpenMapRealMatrix.java:240) */
        openMapRealMatrix.addToEntry(255, 536870911, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double value = entries.get(key) + increment;
 *  */
    @Test
    public void testAddToEntry_ThrowNullPointerException_3() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(OpenMapRealMatrix.java:240) */
        openMapRealMatrix.addToEntry(0, 0, java.lang.Double.NaN);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#addToEntry(int,int,double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double value = entries.get(key) + increment;
 *  */
    @Test
    public void testAddToEntry_ThrowNullPointerException_2() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -255);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
        /* This test fails because method [org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math.linear.OpenMapRealMatrix.addToEntry(OpenMapRealMatrix.java:240) */
        openMapRealMatrix.addToEntry(0, 0, java.lang.Double.NaN);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.OpenMapRealMatrix.createMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createMatrix(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#createMatrix(int,int)}
 * @utbot.returnsFrom {@code return new OpenMapRealMatrix(rowDimension, columnDimension);}
 *  */
    @Test
    public void testCreateMatrix_Return() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        OpenMapRealMatrix actual = openMapRealMatrix.createMatrix(1, 1);
        
        OpenMapRealMatrix expected = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[32];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[32];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[32];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(expected, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        
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
        assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createMatrix(int, int)
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#createMatrix(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return new OpenMapRealMatrix(rowDimension, columnDimension);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testCreateMatrix_ThrowNotStrictlyPositiveException() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.createMatrix(0, -255);
    }
    
    /**
    @utbot.classUnderTest {@link OpenMapRealMatrix}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.OpenMapRealMatrix#createMatrix(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotStrictlyPositiveException} in: return new OpenMapRealMatrix(rowDimension, columnDimension);
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testCreateMatrix_ThrowNotStrictlyPositiveException_1() throws Exception  {
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        
        openMapRealMatrix.createMatrix(1, 0);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields729003993604000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields729003993604000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass729003993608000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields729003993604000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass729003993608000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields729003994154600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields729003994154600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass729003994156500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields729003994154600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass729003994156500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

