package org.apache.commons.math.stat.correlation;

import org.junit.Test;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.apache.commons.math.linear.RealMatrix;
import java.lang.reflect.Method;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.linear.BlockRealMatrix;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math.linear.MatrixIndexException;
import org.apache.commons.math.linear.DecompositionSolver;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math_stat_correlation_PearsonsCorrelationTest {
    ///region Test suites for executable org.apache.commons.math.stat.correlation.PearsonsCorrelation.correlation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method correlation([D, [D)
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#correlation(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: xArray.length == yArray.length && xArray.length > 1
 *  */
    @Test
    public void testCorrelation_ThrowNullPointerException_1() {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.correlation] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.correlation(PearsonsCorrelation.java:226) */
        pearsonsCorrelation.correlation(doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#correlation(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: xArray.length == yArray.length && xArray.length > 1
 *  */
    @Test
    public void testCorrelation_ThrowNullPointerException() {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.correlation] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.correlation(PearsonsCorrelation.java:226) */
        pearsonsCorrelation.correlation(null, null);
    }
    ///endregion
    
    ///region Errors report for correlation
    
    public void testCorrelation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat.correlation
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCorrelationPValues()
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] out = new double[nVars][nVars];
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowNegativeArraySizeException() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 161);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:163) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BlockRealMatrix(out);
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 142);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:126)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:175) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int nVars = correlationMatrix.getColumnDimension();
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Array2DRowRealMatrix correlationMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(correlationMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 138);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:426)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:162) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BlockRealMatrix(out);
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Array2DRowRealMatrix correlationMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(correlationMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 184);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:126)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:175) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BlockRealMatrix(out);
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Array2DRowRealMatrix correlationMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null
        };
        setField(correlationMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 40);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:126)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:175) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BlockRealMatrix(out);
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Array2DRowRealMatrix correlationMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 37);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:126)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:175) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 194);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:169) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double r = correlationMatrix.getEntry(i, j);
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 4);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:169) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double r = correlationMatrix.getEntry(i, j);
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 4);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:190)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:169) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double r = correlationMatrix.getEntry(i, j);
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[1] = 41;
        keys[3] = 41;
        keys[4] = 41;
        keys[5] = 41;
        keys[6] = 41;
        keys[7] = 41;
        keys[8] = 41;
        keys[9] = 41;
        keys[10] = 41;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 4, (byte) 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 66);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:198)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:169) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double r = correlationMatrix.getEntry(i, j);
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[1] = 5091;
        keys[2] = 1;
        keys[3] = 5091;
        keys[4] = 5091;
        keys[5] = 5091;
        keys[6] = 5091;
        keys[7] = 5091;
        keys[8] = 5091;
        keys[9] = 5091;
        keys[10] = 5091;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 5);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:202)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:169) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nVars = correlationMatrix.getColumnDimension();
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowNullPointerException() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 9);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:162) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationPValues()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetCorrelationPValues_ThrowNullPointerException_1() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "nObs", 44);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationPValues(PearsonsCorrelation.java:169) */
        pearsonsCorrelation.getCorrelationPValues();
    }
    ///endregion
    
    ///region Errors report for getCorrelationPValues
    
    public void testGetCorrelationPValues_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat.correlation
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getCorrelationMatrix()
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationMatrix()}
 * @utbot.returnsFrom {@code return correlationMatrix;}
 *  */
    @Test
    public void testGetCorrelationMatrix_ReturnCorrelationMatrix() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        
        RealMatrix actual = pearsonsCorrelation.getCorrelationMatrix();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.correlation.PearsonsCorrelation.covarianceToCorrelation
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method covarianceToCorrelation(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#covarianceToCorrelation(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int nVars = covarianceMatrix.getColumnDimension();
 *  */
    @Test
    public void testCovarianceToCorrelation_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.covarianceToCorrelation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:426)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.covarianceToCorrelation(PearsonsCorrelation.java:251) */
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method covarianceToCorrelationMethod = pearsonsCorrelationClazz.getDeclaredMethod("covarianceToCorrelation", array2DRowRealMatrixType);
        covarianceToCorrelationMethod.setAccessible(true);
        java.lang.Object[] covarianceToCorrelationMethodArguments = new java.lang.Object[1];
        covarianceToCorrelationMethodArguments[0] = array2DRowRealMatrix;
        try {
            covarianceToCorrelationMethod.invoke(pearsonsCorrelation, covarianceToCorrelationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#covarianceToCorrelation(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int nVars = covarianceMatrix.getColumnDimension();
 *  */
    @Test
    public void testCovarianceToCorrelation_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        RealMatrixImpl realMatrixImpl = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(realMatrixImpl, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.covarianceToCorrelation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:412)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.covarianceToCorrelation(PearsonsCorrelation.java:251) */
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class realMatrixImplType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method covarianceToCorrelationMethod = pearsonsCorrelationClazz.getDeclaredMethod("covarianceToCorrelation", realMatrixImplType);
        covarianceToCorrelationMethod.setAccessible(true);
        java.lang.Object[] covarianceToCorrelationMethodArguments = new java.lang.Object[1];
        covarianceToCorrelationMethodArguments[0] = realMatrixImpl;
        try {
            covarianceToCorrelationMethod.invoke(pearsonsCorrelation, covarianceToCorrelationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#covarianceToCorrelation(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nVars = covarianceMatrix.getColumnDimension();
 *  */
    @Test
    public void testCovarianceToCorrelation_ThrowNullPointerException() {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.covarianceToCorrelation] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.covarianceToCorrelation(PearsonsCorrelation.java:251) */
        pearsonsCorrelation.covarianceToCorrelation(null);
    }
    ///endregion
    
    ///region Errors report for covarianceToCorrelation
    
    public void testCovarianceToCorrelation_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat.correlation
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeCorrelationMatrix(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#computeCorrelationMatrix(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int nVars = matrix.getColumnDimension();
 *  */
    @Test
    public void testComputeCorrelationMatrix_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:426)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix(PearsonsCorrelation.java:187) */
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method computeCorrelationMatrixMethod = pearsonsCorrelationClazz.getDeclaredMethod("computeCorrelationMatrix", array2DRowRealMatrixType);
        computeCorrelationMatrixMethod.setAccessible(true);
        java.lang.Object[] computeCorrelationMatrixMethodArguments = new java.lang.Object[1];
        computeCorrelationMatrixMethodArguments[0] = array2DRowRealMatrix;
        try {
            computeCorrelationMatrixMethod.invoke(pearsonsCorrelation, computeCorrelationMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#computeCorrelationMatrix(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int nVars = matrix.getColumnDimension();
 *  */
    @Test
    public void testComputeCorrelationMatrix_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        RealMatrixImpl realMatrixImpl = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(realMatrixImpl, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:412)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix(PearsonsCorrelation.java:187) */
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class realMatrixImplType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method computeCorrelationMatrixMethod = pearsonsCorrelationClazz.getDeclaredMethod("computeCorrelationMatrix", realMatrixImplType);
        computeCorrelationMatrixMethod.setAccessible(true);
        java.lang.Object[] computeCorrelationMatrixMethodArguments = new java.lang.Object[1];
        computeCorrelationMatrixMethodArguments[0] = realMatrixImpl;
        try {
            computeCorrelationMatrixMethod.invoke(pearsonsCorrelation, computeCorrelationMatrixMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#computeCorrelationMatrix(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nVars = matrix.getColumnDimension();
 *  */
    @Test
    public void testComputeCorrelationMatrix_ThrowNullPointerException() {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix(PearsonsCorrelation.java:187) */
        pearsonsCorrelation.computeCorrelationMatrix(((RealMatrix) null));
    }
    ///endregion
    
    ///region Errors report for computeCorrelationMatrix
    
    public void testComputeCorrelationMatrix_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat.correlation
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeCorrelationMatrix([[D)
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#computeCorrelationMatrix(double[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return computeCorrelationMatrix(new BlockRealMatrix(data));
 *  */
    @Test
    public void testComputeCorrelationMatrix_ThrowArrayIndexOutOfBoundsException1() {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        double[][] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:126)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.computeCorrelationMatrix(PearsonsCorrelation.java:209) */
        pearsonsCorrelation.computeCorrelationMatrix(doubleArray);
    }
    ///endregion
    
    ///region Errors report for computeCorrelationMatrix
    
    public void testComputeCorrelationMatrix_errors1()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat.correlation
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.correlation.PearsonsCorrelation.checkSufficientData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkSufficientData(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#checkSufficientData(org.apache.commons.math.linear.RealMatrix)}
 *  */
    @Test
    public void testCheckSufficientData() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        OpenMapRealMatrix openMapRealMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 2);
        setField(openMapRealMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class openMapRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method checkSufficientDataMethod = pearsonsCorrelationClazz.getDeclaredMethod("checkSufficientData", openMapRealMatrixType);
        checkSufficientDataMethod.setAccessible(true);
        java.lang.Object[] checkSufficientDataMethodArguments = new java.lang.Object[1];
        checkSufficientDataMethodArguments[0] = openMapRealMatrix;
        checkSufficientDataMethod.invoke(pearsonsCorrelation, checkSufficientDataMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#checkSufficientData(org.apache.commons.math.linear.RealMatrix)}
 *  */
    @Test
    public void testCheckSufficientData_2() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        BlockRealMatrix blockRealMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(blockRealMatrix, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 2);
        setField(blockRealMatrix, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 2);
        
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class blockRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method checkSufficientDataMethod = pearsonsCorrelationClazz.getDeclaredMethod("checkSufficientData", blockRealMatrixType);
        checkSufficientDataMethod.setAccessible(true);
        java.lang.Object[] checkSufficientDataMethodArguments = new java.lang.Object[1];
        checkSufficientDataMethodArguments[0] = blockRealMatrix;
        checkSufficientDataMethod.invoke(pearsonsCorrelation, checkSufficientDataMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#checkSufficientData(org.apache.commons.math.linear.RealMatrix)}
 *  */
    @Test
    public void testCheckSufficientData_1() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(array2DRowRealMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method checkSufficientDataMethod = pearsonsCorrelationClazz.getDeclaredMethod("checkSufficientData", array2DRowRealMatrixType);
        checkSufficientDataMethod.setAccessible(true);
        java.lang.Object[] checkSufficientDataMethodArguments = new java.lang.Object[1];
        checkSufficientDataMethodArguments[0] = array2DRowRealMatrix;
        checkSufficientDataMethod.invoke(pearsonsCorrelation, checkSufficientDataMethodArguments);
        
        double[][] array2DRowRealMatrixData = ((double[][]) getFieldValue(array2DRowRealMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalArray2DRowRealMatrixData1 = ((double[]) get(array2DRowRealMatrixData, 1));
        
        assertNull(finalArray2DRowRealMatrixData1);
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#checkSufficientData(org.apache.commons.math.linear.RealMatrix)}
 *  */
    @Test
    public void testCheckSufficientData_3() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        RealMatrixImpl realMatrixImpl = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(realMatrixImpl, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class realMatrixImplType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method checkSufficientDataMethod = pearsonsCorrelationClazz.getDeclaredMethod("checkSufficientData", realMatrixImplType);
        checkSufficientDataMethod.setAccessible(true);
        java.lang.Object[] checkSufficientDataMethodArguments = new java.lang.Object[1];
        checkSufficientDataMethodArguments[0] = realMatrixImpl;
        checkSufficientDataMethod.invoke(pearsonsCorrelation, checkSufficientDataMethodArguments);
        
        double[][] realMatrixImplData = ((double[][]) getFieldValue(realMatrixImpl, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalRealMatrixImplData1 = ((double[]) get(realMatrixImplData, 1));
        
        assertNull(finalRealMatrixImplData1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkSufficientData(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#checkSufficientData(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int nCols = matrix.getColumnDimension();
 *  */
    @Test
    public void testCheckSufficientData_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        Array2DRowRealMatrix array2DRowRealMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(array2DRowRealMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.checkSufficientData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:426)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.checkSufficientData(PearsonsCorrelation.java:274) */
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class array2DRowRealMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method checkSufficientDataMethod = pearsonsCorrelationClazz.getDeclaredMethod("checkSufficientData", array2DRowRealMatrixType);
        checkSufficientDataMethod.setAccessible(true);
        java.lang.Object[] checkSufficientDataMethodArguments = new java.lang.Object[1];
        checkSufficientDataMethodArguments[0] = array2DRowRealMatrix;
        try {
            checkSufficientDataMethod.invoke(pearsonsCorrelation, checkSufficientDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#checkSufficientData(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int nCols = matrix.getColumnDimension();
 *  */
    @Test
    public void testCheckSufficientData_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        RealMatrixImpl realMatrixImpl = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(realMatrixImpl, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.checkSufficientData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:412)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.checkSufficientData(PearsonsCorrelation.java:274) */
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class realMatrixImplType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method checkSufficientDataMethod = pearsonsCorrelationClazz.getDeclaredMethod("checkSufficientData", realMatrixImplType);
        checkSufficientDataMethod.setAccessible(true);
        java.lang.Object[] checkSufficientDataMethodArguments = new java.lang.Object[1];
        checkSufficientDataMethodArguments[0] = realMatrixImpl;
        try {
            checkSufficientDataMethod.invoke(pearsonsCorrelation, checkSufficientDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#checkSufficientData(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nRows = matrix.getRowDimension();
 *  */
    @Test
    public void testCheckSufficientData_ThrowNullPointerException() throws Throwable  {
        PearsonsCorrelation pearsonsCorrelation = new PearsonsCorrelation();
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.checkSufficientData] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.checkSufficientData(PearsonsCorrelation.java:273) */
        Class pearsonsCorrelationClazz = Class.forName("org.apache.commons.math.stat.correlation.PearsonsCorrelation");
        Class realMatrixType = Class.forName("org.apache.commons.math.linear.RealMatrix");
        Method checkSufficientDataMethod = pearsonsCorrelationClazz.getDeclaredMethod("checkSufficientData", realMatrixType);
        checkSufficientDataMethod.setAccessible(true);
        java.lang.Object[] checkSufficientDataMethodArguments = new java.lang.Object[1];
        checkSufficientDataMethodArguments[0] = ((Object) null);
        try {
            checkSufficientDataMethod.invoke(pearsonsCorrelation, checkSufficientDataMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for checkSufficientData
    
    public void testCheckSufficientData_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.stat.correlation
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getCorrelationStandardErrors()
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: double[][] out = new double[nVars][nVars];
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowNegativeArraySizeException() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:137) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BlockRealMatrix(out);
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:126)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:144) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: int nVars = correlationMatrix.getColumnDimension();
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Array2DRowRealMatrix correlationMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(correlationMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:426)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:136) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BlockRealMatrix(out);
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Array2DRowRealMatrix correlationMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(correlationMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:126)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:144) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BlockRealMatrix(out);
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Array2DRowRealMatrix correlationMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(correlationMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:126)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:144) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BlockRealMatrix(out);
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Array2DRowRealMatrix correlationMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BlockRealMatrix.<init>(BlockRealMatrix.java:126)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:144) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:140) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double r = correlationMatrix.getEntry(i, j);
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException_8() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:140) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double r = correlationMatrix.getEntry(i, j);
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException_9() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[12];
        keys[0] = 3;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:198)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:140) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double r = correlationMatrix.getEntry(i, j);
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:202)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:140) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:140) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double r = correlationMatrix.getEntry(i, j);
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowArrayIndexOutOfBoundsException_10() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 2);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {5091, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:190)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:140) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int nVars = correlationMatrix.getColumnDimension();
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowNullPointerException() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.NullPointerException]
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:136) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowNullPointerException_1() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:140) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetCorrelationStandardErrors_ThrowNullPointerException_2() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This test fails because method [org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:392)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.stat.correlation.PearsonsCorrelation.getCorrelationStandardErrors(PearsonsCorrelation.java:140) */
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCorrelationStandardErrors()
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} twice
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: double r = correlationMatrix.getEntry(i, j);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetCorrelationStandardErrors_ThrowMatrixIndexException() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Array2DRowRealMatrix correlationMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        setField(correlationMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    
    /**
    @utbot.classUnderTest {@link PearsonsCorrelation}
 * @utbot.methodUnderTest {@link org.apache.commons.math.stat.correlation.PearsonsCorrelation#getCorrelationStandardErrors()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nVars; i++)} twice
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: double r = correlationMatrix.getEntry(i, j);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetCorrelationStandardErrors_ThrowMatrixIndexException_1() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        Array2DRowRealMatrix correlationMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        setField(correlationMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getCorrelationStandardErrors()
    
    @Test
    public void testGetCorrelationStandardErrors1() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 1);
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        BlockRealMatrix actual = ((BlockRealMatrix) pearsonsCorrelation.getCorrelationStandardErrors());
        
        BlockRealMatrix expected = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {java.lang.Double.NaN};
        blocks[0] = doubleArray;
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
                assertArrayEquals(expectedBlocksNestedElement1, actualBlocksNestedElement1, 1.0E-6);
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
        
        DecompositionSolver actualLu = ((DecompositionSolver) getFieldValue(actual, "org.apache.commons.math.linear.AbstractRealMatrix", "lu"));
        assertNull(actualLu);
        
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getCorrelationStandardErrors()
    
    @Test(expected = MatrixIndexException.class)
    public void testGetCorrelationStandardErrors2() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[0] = 3;
        keys[1] = 1;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 3;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[11];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[1] = (byte) 1;
        states[2] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 3);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        pearsonsCorrelation.getCorrelationStandardErrors();
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method getCorrelationStandardErrors()
    
    @Test(timeout = 1000L)
    public void testGetCorrelationStandardErrors3() throws Exception  {
        PearsonsCorrelation pearsonsCorrelation = ((PearsonsCorrelation) createInstance("org.apache.commons.math.stat.correlation.PearsonsCorrelation"));
        OpenMapRealMatrix correlationMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "rows", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "columns", 5);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            3, 0, 3, 3, 3, 3, 3, 3,
            3, 3
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(correlationMatrix, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(pearsonsCorrelation, "org.apache.commons.math.stat.correlation.PearsonsCorrelation", "correlationMatrix", correlationMatrix);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        pearsonsCorrelation.getCorrelationStandardErrors();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields738507971871300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields738507971871300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass738507971877300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields738507971871300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass738507971877300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields738507972224500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields738507972224500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass738507972228000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields738507972224500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass738507972228000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

