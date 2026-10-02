package org.apache.commons.math3.optim.nonlinear.vector;

import org.junit.Test;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math3_optim_nonlinear_vector_WeightTest {
    ///region Test suites for executable org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getWeight()
    
    /**
    @utbot.classUnderTest {@link Weight}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.Weight#getWeight()}
 * @utbot.returnsFrom {@code return weightMatrix.copy();}
 *  */
    @Test
    public void testGetWeight_ReturnWeightMatrixCopy() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        Array2DRowRealMatrix actual = ((Array2DRowRealMatrix) weight.getWeight());
        
        Array2DRowRealMatrix expected = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        setField(expected, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data1);
        
        double[][] expectedData = expected.getData();
        double[][] actualData = actual.getData();
        int expectedDataSize = expectedData.length;
        assertEquals(expectedDataSize, actualData.length);
        for (int i = 0; i < expectedDataSize; i++) {
            double[] expectedDataNestedElement1 = expectedData[i];
            double[] actualDataNestedElement1 = actualData[i];
            
            if (expectedDataNestedElement1 == null) {
                assertNull(actualDataNestedElement1);
            } else {
                int expectedDataNestedElement1Size = expectedDataNestedElement1.length;
                assertEquals(expectedDataNestedElement1Size, actualDataNestedElement1.length);
                assertArrayEquals(expectedDataNestedElement1, actualDataNestedElement1, 1.0E-6);
            }
        }
        
    }
    
    /**
    @utbot.classUnderTest {@link Weight}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.Weight#getWeight()}
 * @utbot.returnsFrom {@code return weightMatrix.copy();}
 *  */
    @Test
    public void testGetWeight_ReturnWeightMatrixCopy_1() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        OpenMapRealMatrix actual = ((OpenMapRealMatrix) weight.getWeight());
        
        OpenMapRealMatrix expected = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries1 = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys1);
        double[] values1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values1);
        byte[] states1 = {};
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states1);
        setField(entries1, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(expected, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries1);
        
        int expectedRows = ((Integer) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows"));
        int actualRows = ((Integer) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows"));
        assertEquals(expectedRows, actualRows);
        
        int expectedColumns = ((Integer) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns"));
        int actualColumns = ((Integer) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns"));
        assertEquals(expectedColumns, actualColumns);
        
        OpenIntToDoubleHashMap expectedEntries = ((OpenIntToDoubleHashMap) getFieldValue(expected, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries"));
        OpenIntToDoubleHashMap actualEntries = ((OpenIntToDoubleHashMap) getFieldValue(actual, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries"));
        int[] expectedEntriesKeys = ((int[]) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys"));
        int[] actualEntriesKeys = ((int[]) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys"));
        int expectedEntriesKeysSize = expectedEntriesKeys.length;
        assertEquals(expectedEntriesKeysSize, actualEntriesKeys.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesKeys, actualEntriesKeys);
        
        double[] expectedEntriesValues = ((double[]) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values"));
        double[] actualEntriesValues = ((double[]) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values"));
        int expectedEntriesValuesSize = expectedEntriesValues.length;
        assertEquals(expectedEntriesValuesSize, actualEntriesValues.length);
        assertArrayEquals(expectedEntriesValues, actualEntriesValues, 1.0E-6);
        
        byte[] expectedEntriesStates = ((byte[]) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states"));
        byte[] actualEntriesStates = ((byte[]) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states"));
        int expectedEntriesStatesSize = expectedEntriesStates.length;
        assertEquals(expectedEntriesStatesSize, actualEntriesStates.length);
        org.junit.Assert.assertArrayEquals(expectedEntriesStates, actualEntriesStates);
        
        double expectedEntriesMissingEntries = ((Double) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries"));
        double actualEntriesMissingEntries = ((Double) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries"));
        org.junit.Assert.assertEquals(expectedEntriesMissingEntries, actualEntriesMissingEntries, 1.0E-6);
        
        int expectedEntriesSize = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size"));
        int actualEntriesSize = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "size"));
        assertEquals(expectedEntriesSize, actualEntriesSize);
        
        int expectedEntriesMask = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask"));
        int actualEntriesMask = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask"));
        assertEquals(expectedEntriesMask, actualEntriesMask);
        
        int expectedEntriesCount = ((Integer) getFieldValue(expectedEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count"));
        int actualEntriesCount = ((Integer) getFieldValue(actualEntries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "count"));
        assertEquals(expectedEntriesCount, actualEntriesCount);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getWeight()
    
    /**
    @utbot.classUnderTest {@link Weight}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.Weight#getWeight()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return weightMatrix.copy();
 *  */
    @Test
    public void testGetWeight_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69) */
        weight.getWeight();
    }
    
    /**
    @utbot.classUnderTest {@link Weight}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.Weight#getWeight()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrix.copy();
 *  */
    @Test
    public void testGetWeight_ThrowNullPointerException() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69) */
        weight.getWeight();
    }
    
    /**
    @utbot.classUnderTest {@link Weight}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.Weight#getWeight()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrix.copy();
 *  */
    @Test
    public void testGetWeight_ThrowNullPointerException_2() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69) */
        weight.getWeight();
    }
    
    /**
    @utbot.classUnderTest {@link Weight}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.Weight#getWeight()}
 * @utbot.returnsFrom {@code return weightMatrix.copy();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrix.copy();
 *  */
    @Test
    public void testGetWeight_ThrowNullPointerException_3() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69) */
        weight.getWeight();
    }
    
    /**
    @utbot.classUnderTest {@link Weight}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.Weight#getWeight()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrix.copy();
 *  */
    @Test
    public void testGetWeight_ThrowNullPointerException_1() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69) */
        weight.getWeight();
    }
    
    /**
    @utbot.classUnderTest {@link Weight}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.Weight#getWeight()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return weightMatrix.copy();
 *  */
    @Test
    public void testGetWeight_ThrowNullPointerException_4() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69) */
        weight.getWeight();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getWeight()
    
    /**
    @utbot.classUnderTest {@link Weight}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.Weight#getWeight()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return weightMatrix.copy();
 *  */
    @Test(expected = NoDataException.class)
    public void testGetWeight_ThrowNoDataException_1() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        weight.getWeight();
    }
    
    /**
    @utbot.classUnderTest {@link Weight}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optim.nonlinear.vector.Weight#getWeight()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} in: return weightMatrix.copy();
 *  */
    @Test(expected = NoDataException.class)
    public void testGetWeight_ThrowNoDataException() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        weight.getWeight();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getWeight()
    
    @Test
    public void testGetWeight1() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        Array2DRowRealMatrix weightMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[5][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = doubleArray1;
        data[3] = doubleArray1;
        data[4] = doubleArray1;
        setField(weightMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copy(Array2DRowRealMatrix.java:151)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69) */
        weight.getWeight();
    }
    
    @Test
    public void testGetWeight2() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {java.lang.Double.NaN};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for double[1]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:135)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69) */
        weight.getWeight();
    }
    
    @Test
    public void testGetWeight3() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        OpenMapRealMatrix weightMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[33];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(weightMatrix, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 10 out of bounds for byte[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:137)
            org.apache.commons.math3.linear.OpenMapRealMatrix.<init>(OpenMapRealMatrix.java:82)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:88)
            org.apache.commons.math3.linear.OpenMapRealMatrix.copy(OpenMapRealMatrix.java:39)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69) */
        weight.getWeight();
    }
    
    @Test
    public void testGetWeight4() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        DiagonalMatrix weightMatrix = ((DiagonalMatrix) createInstance("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        /* This test fails because method [org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.DiagonalMatrix.<init>(DiagonalMatrix.java:68)
            org.apache.commons.math3.linear.DiagonalMatrix.copy(DiagonalMatrix.java:107)
            org.apache.commons.math3.optim.nonlinear.vector.Weight.getWeight(Weight.java:69) */
        weight.getWeight();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getWeight()
    
    @Test(expected = NotStrictlyPositiveException.class)
    public void testGetWeight5() throws Exception  {
        Weight weight = ((Weight) createInstance("org.apache.commons.math3.optim.nonlinear.vector.Weight"));
        BlockRealMatrix weightMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(weight, "org.apache.commons.math3.optim.nonlinear.vector.Weight", "weightMatrix", weightMatrix);
        
        weight.getWeight();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields718749330815200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields718749330815200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass718749330823100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields718749330815200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass718749330823100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields718749331674200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields718749331674200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass718749331680300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields718749331674200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass718749331680300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

