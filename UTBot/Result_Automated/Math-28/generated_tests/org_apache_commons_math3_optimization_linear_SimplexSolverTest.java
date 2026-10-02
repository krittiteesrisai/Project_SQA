package org.apache.commons.math3.optimization.linear;

import org.junit.Test;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import java.lang.reflect.Method;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.util.OpenIntToDoubleHashMap;
import org.apache.commons.math3.exception.OutOfRangeException;
import java.util.HashSet;
import org.apache.commons.math3.optimization.GoalType;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math3.exception.MaxCountExceededException;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math3_optimization_linear_SimplexSolverTest {
    ///region Test suites for executable org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 2);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau"));
        double[][] simplexTableauTableauTableauData = ((double[][]) getFieldValue(simplexTableauTableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(simplexTableauTableauTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, -4.9E-324, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        Integer expected = 1;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -2.0000000000000004);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        Integer expected = 1;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.math3.optimization.linear.SimplexTableau#getEntry(int,int)} twice,
    ///     {@link org.apache.commons.math3.linear.RealMatrix#getEntry(int,int)} twice,
    ///     {@link org.apache.commons.math3.linear.MatrixUtils#checkRowIndex(org.apache.commons.math3.linear.AnyMatrix,int)} twice,
    ///     {@link org.apache.commons.math3.linear.MatrixUtils#checkColumnIndex(org.apache.commons.math3.linear.AnyMatrix,int)} twice,
    ///     org.apache.commons.math3.linear.OpenMapRealMatrix#computeKey(int,int) twice,
    ///     {@link org.apache.commons.math3.util.OpenIntToDoubleHashMap#get(int)} twice
    /// execute conditions:
    ///     {@code (entry < minValue): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_7() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_8() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[16];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_9() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 2};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++)
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:329)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:478)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:72) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        try {
            getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        try {
            getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {2};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        try {
            getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        try {
            getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 32);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
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
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        try {
            getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 2};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        try {
            getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++)
 *  */
    @Test
    public void testGetPivotColumn_ThrowNullPointerException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:72) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = ((Object) null);
        try {
            getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test
    public void testGetPivotColumn_ThrowNullPointerException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        try {
            getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetPivotColumn_ThrowOutOfRangeException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        try {
            getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: final double entry = tableau.getEntry(0, i);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetPivotColumn_ThrowOutOfRangeException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        try {
            getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math3.optimization.linear.SimplexTableau)}
     */
    @Test
    public void testGetPivotColumn() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SimplexSolver simplexSolver = new SimplexSolver(0.0, 0);
        simplexSolver.setMaxIterations(-17);
        double[] doubleArray = {0.0, java.lang.Double.POSITIVE_INFINITY, 0.0, 0.0, java.lang.Double.NaN};
        LinearObjectiveFunction linearObjectiveFunction = new LinearObjectiveFunction(doubleArray, java.lang.Double.NEGATIVE_INFINITY);
        HashSet hashSet = new HashSet();
        double[] doubleArray1 = {1.0, 1.0, 0.0, java.lang.Double.NEGATIVE_INFINITY, 1.0};
        Relationship relationship = Relationship.GEQ;
        LinearConstraint linearConstraint = new LinearConstraint(doubleArray1, relationship, 0.0);
        hashSet.add(linearConstraint);
        GoalType goalType = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau = new SimplexTableau(linearObjectiveFunction, hashSet, goalType, true, -1.0);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        Integer expected = 2;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.invokes {@link org.apache.commons.math3.optimization.linear.SimplexTableau#getNumArtificialVariables()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testSolvePhase1_SimplexTableauGetNumArtificialVariables() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: while(!tableau.isOptimal())
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolvePhase1_ThrowOutOfRangeException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: while(!tableau.isOptimal())
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolvePhase1_ThrowOutOfRangeException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!tableau.isOptimal())} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} when: !Precision.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0d, epsilon)
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolvePhase1_ThrowOutOfRangeException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!tableau.isOptimal())} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} when: !Precision.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0d, epsilon)
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolvePhase1_ThrowOutOfRangeException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!tableau.isOptimal())} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} when: !Precision.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0d, epsilon)
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testSolvePhase1_ThrowOutOfRangeException_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!tableau.isOptimal())} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MaxCountExceededException} in: doIteration(tableau);
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testSolvePhase1_ThrowMaxCountExceededException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -6.463926257380971E-27);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "epsilon", -1.2927852514761944E-26);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!tableau.isOptimal())} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MaxCountExceededException} in: doIteration(tableau);
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testSolvePhase1_ThrowMaxCountExceededException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {2};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {-8.4879831639E-314};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "epsilon", java.lang.Double.NaN);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!tableau.isOptimal())
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:329)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:478)
            org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:389)
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:201) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!tableau.isOptimal())
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:329)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:478)
            org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:389)
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:201) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!tableau.isOptimal())
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:390)
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:201) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!tableau.isOptimal())
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {2};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:390)
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:201) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!tableau.isOptimal())
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 2048);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:191)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:390)
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:201) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!tableau.isOptimal())
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:390)
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:201) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!tableau.isOptimal())
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 32);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[12];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:390)
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:201) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!tableau.isOptimal())
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_7() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 32);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[1] = 3;
        keys[2] = 1;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 3;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:390)
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:201) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tableau.getNumArtificialVariables() == 0
 *  */
    @Test
    public void testSolvePhase1_ThrowNullPointerException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:197) */
        simplexSolver.solvePhase1(null);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(!tableau.isOptimal())
 *  */
    @Test
    public void testSolvePhase1_ThrowNullPointerException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:390)
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:201) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)}
     */
    @Test(expected = MaxCountExceededException.class)
    public void testSolvePhase1ThrowsMCEE() {
        SimplexSolver simplexSolver = new SimplexSolver(0.0, 1);
        simplexSolver.setMaxIterations(-17);
        double[] doubleArray = {0.0, java.lang.Double.POSITIVE_INFINITY, 0.0, 0.0, java.lang.Double.NaN};
        LinearObjectiveFunction linearObjectiveFunction = new LinearObjectiveFunction(doubleArray, java.lang.Double.NEGATIVE_INFINITY);
        HashSet hashSet = new HashSet();
        double[] doubleArray1 = {1.0, 1.0, 0.0, java.lang.Double.NEGATIVE_INFINITY, 1.0};
        Relationship relationship = Relationship.GEQ;
        LinearConstraint linearConstraint = new LinearConstraint(doubleArray1, relationship, 0.0);
        hashSet.add(linearConstraint);
        GoalType goalType = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau = new SimplexTableau(linearObjectiveFunction, hashSet, goalType, true, -1.0);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    @Test(expected = OutOfRangeException.class)
    public void testSolvePhase11() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -256);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testSolvePhase12() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testSolvePhase13() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    @Test(expected = NoFeasibleSolutionException.class)
    public void testSolvePhase14() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 64);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.225073858507202E-308);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "epsilon", 2.0);
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    @Test
    public void testSolvePhase15() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException] */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    @Test
    public void testSolvePhase16() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[15];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, (byte) 0, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 14);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException] */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    @Test
    public void testSolvePhase17() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0, (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException] */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    @Test
    public void testSolvePhase18() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 2};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException] */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    @Test
    public void testSolvePhase19() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            2, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            8.6916947597938E-311, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "epsilon", 8.6916947597938E-311);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.isOptimal(SimplexTableau.java:390)
            org.apache.commons.math3.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:201) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method solvePhase1(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    @Test(timeout = 1000L)
    public void testSolvePhase110() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 4);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 33554432);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 2.0);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483584);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "epsilon", 0.0);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    @Test(timeout = 1000L)
    public void testSolvePhase111() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -1.2882297539194272E-231);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "epsilon", 2.576459507838855E-231);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MaxCountExceededException} in: incrementIterationsCounter();
 *  */
    @Test(expected = MaxCountExceededException.class)
    public void testDoIteration_ThrowMaxCountExceededException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        
        simplexSolver.doIteration(null);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDoIteration_ThrowOutOfRangeException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testDoIteration_ThrowOutOfRangeException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.invokes org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)
 * @utbot.throwsException {@link org.apache.commons.math3.optimization.linear.UnboundedSolutionException} when: pivotRow == null
 *  */
    @Test(expected = UnboundedSolutionException.class)
    public void testDoIteration_ThrowUnboundedSolutionException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0, -2.225073858507202E-308, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexSolver.doIteration(simplexTableau);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:329)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:478)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:72)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
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
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[1] = 3;
        keys[2] = 1;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 3;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:72)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(null);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(tableau, pivotCol);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 2);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(tableau, pivotCol);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(tableau, pivotCol);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(tableau, pivotCol);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[0] = -2147483647;
        keys[2] = -2147483647;
        keys[3] = -2147483647;
        keys[4] = -2147483647;
        keys[5] = 1;
        keys[6] = -2147483647;
        keys[7] = -2147483647;
        keys[8] = -2147483647;
        keys[9] = -2147483647;
        keys[10] = -2147483647;
        keys[11] = -2147483647;
        keys[12] = -2147483647;
        keys[13] = -2147483647;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[12];
        values[5] = -0.0;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    @Test(expected = OutOfRangeException.class)
    public void testDoIteration1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -2);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", -2147483647);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(expected = OutOfRangeException.class)
    public void testDoIteration2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -2);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(expected = UnboundedSolutionException.class)
    public void testDoIteration3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[13];
        keys[1] = 10723;
        keys[2] = 10723;
        keys[3] = 10723;
        keys[5] = 10723;
        keys[6] = 10723;
        keys[7] = 10723;
        keys[8] = 10723;
        keys[9] = 10723;
        keys[10] = 10723;
        keys[11] = 10723;
        keys[12] = 10723;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[13];
        states[4] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -3.337610787760802E-308);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 4);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(expected = UnboundedSolutionException.class)
    public void testDoIteration4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 10723, 10723, 10723, 10723, 10723, 10723, 10723,
            10723
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -3.337610787760802E-308);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(expected = UnboundedSolutionException.class)
    public void testDoIteration5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32866);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[1] = 10723;
        keys[2] = 1;
        keys[3] = 10723;
        keys[4] = 10723;
        keys[5] = 10723;
        keys[6] = 10723;
        keys[7] = 10723;
        keys[8] = 10723;
        keys[9] = 10723;
        keys[10] = 10723;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[11];
        values[2] = -2.0000000000000004;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(expected = UnboundedSolutionException.class)
    public void testDoIteration6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -36866);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 1, 10723, 10723, 10723, 10723, 10723, 10723,
            10723, 10723
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, -2.0000000000000004, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(expected = UnboundedSolutionException.class)
    public void testDoIteration7() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -1087414080);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 8);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[0] = 10723;
        keys[1] = 10723;
        keys[2] = 3;
        keys[3] = 10723;
        keys[4] = 10723;
        keys[5] = 10723;
        keys[6] = 10723;
        keys[7] = 10723;
        keys[8] = 2;
        keys[9] = 10723;
        keys[10] = 10723;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, -2.0000000000000004
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[2] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 10);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 2);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(expected = UnboundedSolutionException.class)
    public void testDoIteration8() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -1310722);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            2, 10723, 10723, 10723, 10723, 10723, 10723, 10723,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(expected = UnboundedSolutionException.class)
    public void testDoIteration9() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            2, 3, 3, 3, 3, 3, 3, 3,
            0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            java.lang.Byte.MIN_VALUE
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 8);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        simplexSolver.doIteration(simplexTableau);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    @Test
    public void testDoIteration10() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration11() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[15];
        keys[0] = 1;
        keys[1] = 10723;
        keys[3] = 10723;
        keys[4] = 10723;
        keys[5] = 10723;
        keys[6] = 10723;
        keys[7] = 10723;
        keys[8] = 10723;
        keys[9] = 10723;
        keys[10] = 10723;
        keys[11] = 10723;
        keys[12] = 2;
        keys[13] = 10723;
        keys[14] = 10723;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {-2.225073858507202E-308};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[19];
        states[2] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 14);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException] */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration12() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(-2080374784);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -2080374785);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[0] = 2;
        keys[2] = -2147483647;
        keys[3] = -2147483647;
        keys[4] = -2147483647;
        keys[5] = 1;
        keys[6] = -2147483647;
        keys[7] = -2147483647;
        keys[8] = -2147483647;
        keys[9] = -2147483647;
        keys[10] = -2147483647;
        keys[11] = -2147483647;
        keys[12] = -2147483647;
        keys[13] = -2147483647;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[18];
        values[0] = -1.5231591128343337E-219;
        values[5] = -6.355205692543945E-294;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException] */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration13() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -218218498);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[33];
        keys[1] = 10723;
        keys[2] = 10723;
        keys[3] = 10723;
        keys[4] = 10723;
        keys[5] = 10723;
        keys[6] = 10723;
        keys[7] = 10723;
        keys[8] = 10723;
        keys[9] = 10723;
        keys[10] = 10723;
        keys[11] = 10723;
        keys[12] = 10723;
        keys[13] = 10723;
        keys[14] = 10723;
        keys[15] = 10723;
        keys[16] = 2;
        keys[17] = 10723;
        keys[18] = 10723;
        keys[19] = 10723;
        keys[20] = 10723;
        keys[21] = 10723;
        keys[22] = 10723;
        keys[23] = 10723;
        keys[24] = 10723;
        keys[25] = 10723;
        keys[26] = 10723;
        keys[27] = 10723;
        keys[28] = 10723;
        keys[29] = 10723;
        keys[30] = 10723;
        keys[31] = 10723;
        keys[32] = 10723;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[25];
        values[16] = -2.0000000000000004;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 16);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 9]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration14() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32898);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[0] = -2147483616;
        keys[1] = -2147483616;
        keys[3] = -2147483616;
        keys[4] = -2147483616;
        keys[5] = -2147483616;
        keys[6] = -2147483616;
        keys[7] = -2147483616;
        keys[8] = 2;
        keys[9] = -2147483616;
        keys[10] = 11;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, -2.0000000000000004
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[2] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 10);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException] */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration15() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -36880);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 8);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[25];
        keys[1] = -2147483647;
        keys[2] = -2147483647;
        keys[3] = -2147483647;
        keys[4] = -2147483647;
        keys[5] = -2147483647;
        keys[6] = -2147483647;
        keys[7] = -2147483647;
        keys[8] = -2147483647;
        keys[9] = -2147483647;
        keys[10] = -2147483647;
        keys[11] = -2147483647;
        keys[12] = -2147483647;
        keys[13] = -2147483647;
        keys[14] = -2147483647;
        keys[15] = -2147483647;
        keys[16] = 2;
        keys[17] = -2147483647;
        keys[18] = -2147483647;
        keys[19] = -2147483647;
        keys[20] = -2147483647;
        keys[21] = -2147483647;
        keys[22] = -2147483647;
        keys[23] = -2147483647;
        keys[24] = -2147483647;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[25];
        values[16] = -0.0;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 16);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException] */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration16() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration17() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, -3.337610787760802E-308, 0.0, 0.0, 0.0,
            0.0
        };
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:296)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration18() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[9][];
        double[] doubleArray = new double[32];
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration19() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[10][];
        double[] doubleArray = {0.0, -3.337610787760802E-308, 0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        data[9] = ((double[]) null);
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:296)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration20() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[13];
        keys[0] = 1;
        keys[1] = 10723;
        keys[2] = 10723;
        keys[3] = 10723;
        keys[4] = 5;
        keys[5] = 10723;
        keys[6] = 10723;
        keys[7] = 10723;
        keys[8] = 10723;
        keys[9] = 10723;
        keys[10] = 10723;
        keys[11] = 10723;
        keys[12] = 10723;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[13];
        values[0] = -2.0000000000000004;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 4);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:96)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration21() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32802);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[15];
        keys[0] = 10723;
        keys[3] = 10723;
        keys[4] = 10723;
        keys[5] = 10723;
        keys[6] = 10723;
        keys[8] = 10723;
        keys[9] = 10723;
        keys[10] = 10723;
        keys[11] = 10723;
        keys[12] = 10723;
        keys[13] = 2;
        keys[14] = 10723;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[15];
        states[1] = java.lang.Byte.MIN_VALUE;
        states[2] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -2.0000000000000004);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 15);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration22() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[0] = 1;
        keys[1] = 10723;
        keys[2] = 2;
        keys[3] = 10723;
        keys[4] = 10723;
        keys[5] = 10723;
        keys[6] = 10723;
        keys[7] = 10723;
        keys[8] = 10723;
        keys[9] = 10723;
        keys[10] = 10723;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -2.0000000000000004, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException] */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration23() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32962);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[2] = 10723;
        keys[3] = 10723;
        keys[4] = 10723;
        keys[6] = 10723;
        keys[7] = 10723;
        keys[8] = 10723;
        keys[9] = 10723;
        keys[10] = 10723;
        keys[11] = 10723;
        keys[12] = 10723;
        keys[13] = 10723;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[14];
        states[1] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -2.0000000000000004);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration24() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            2, 11, 10723, 10723, 10723, 10723, 10723, 10723,
            10723
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException] */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration25() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 8);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            2, 3, 10723, 10723, 10723, 10723, 10723, 10723,
            10723, 10723
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -2.0000000000000004, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:73)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:167) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration26() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -135321728);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 8);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[11];
        keys[0] = -2147483647;
        keys[1] = -2147483647;
        keys[2] = 3;
        keys[3] = -2147483647;
        keys[4] = -2147483647;
        keys[5] = -2147483647;
        keys[6] = -2147483647;
        keys[7] = -2147483647;
        keys[8] = 2;
        keys[9] = -2147483647;
        keys[10] = -2147483647;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, -0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = new byte[11];
        states[2] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 10);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test
    public void testDoIteration27() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 3);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 11, 10723, 10723, 10723, 10723, 10723, 10723,
            10723
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -3.337610787760802E-308);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:168) */
        simplexSolver.doIteration(simplexTableau);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method doIteration(org.apache.commons.math3.optimization.linear.SimplexTableau)
    
    @Test(timeout = 1000L)
    public void testDoIteration28() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -2);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[25];
        keys[1] = -2147483643;
        keys[2] = -2147483643;
        keys[3] = -2147483643;
        keys[4] = -2147483643;
        keys[5] = -2147483643;
        keys[6] = -2147483643;
        keys[7] = -2147483643;
        keys[8] = -2147483643;
        keys[9] = -2147483643;
        keys[10] = -2147483643;
        keys[11] = -2147483643;
        keys[12] = -2147483643;
        keys[13] = -2147483643;
        keys[14] = -2147483643;
        keys[15] = -2147483643;
        keys[17] = -2147483643;
        keys[18] = -2147483643;
        keys[19] = -2147483643;
        keys[20] = -2147483643;
        keys[21] = -2147483643;
        keys[22] = -2147483643;
        keys[23] = -2147483643;
        keys[24] = -2147483643;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[25];
        states[0] = java.lang.Byte.MIN_VALUE;
        states[16] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 16);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(timeout = 1000L)
    public void testDoIteration29() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -32770);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1073741824);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            0, 10723, 10723, 10723, 10723, 10723, 10723, 10723,
            10723
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", -2.0000000000000004);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", -2147483647);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(timeout = 1000L)
    public void testDoIteration30() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -495618);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 8);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            2, 10723, 10723, 10723, 10723, 10723, 10723, 10723,
            10723
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexSolver.doIteration(simplexTableau);
    }
    
    @Test(timeout = 1000L)
    public void testDoIteration31() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "iterations", -38898);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 8);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            2, 10723, 10723, 10723, 10723, 10723, 10723, 10723,
            10723
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {
            -2.0000000000000004, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {
            java.lang.Byte.MIN_VALUE, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        simplexSolver.doIteration(simplexTableau);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau, int)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPivotRow_ReturnNull() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPivotRow_ReturnNull_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPivotRow_ReturnNull_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPivotRow_ReturnNull_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null
        };
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
        
        RealMatrix simplexTableauTableau = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau"));
        double[][] simplexTableauTableauTableauData = ((double[][]) getFieldValue(simplexTableauTableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(simplexTableauTableauTableauData, 0));
        RealMatrix simplexTableauTableau1 = ((RealMatrix) getFieldValue(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau"));
        double[][] simplexTableauTableau1TableauData = ((double[][]) getFieldValue(simplexTableauTableau1, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData1 = ((double[]) get(simplexTableauTableau1TableauData, 1));
        
        assertNull(finalSimplexTableauTableauData0);
        
        assertNull(finalSimplexTableauTableauData1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPivotRow_ReturnNull_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau, int)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetPivotRow_ThrowOutOfRangeException_2() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: final double entry = tableau.getEntry(i, col);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetPivotRow_ThrowOutOfRangeException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = doubleArray;
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -1;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetPivotRow_ThrowOutOfRangeException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null,
            null
        };
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: final double entry = tableau.getEntry(i, col);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetPivotRow_ThrowOutOfRangeException_3() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {-4};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -1;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: final double entry = tableau.getEntry(i, col);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetPivotRow_ThrowOutOfRangeException_4() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -1;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: final double entry = tableau.getEntry(i, col);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetPivotRow_ThrowOutOfRangeException_5() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 939524097);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[34];
        keys[27] = -4;
        keys[31] = -1879048196;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[36];
        states[31] = (byte) 1;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -1;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.OutOfRangeException} in: final double entry = tableau.getEntry(i, col);
 *  */
    @Test(expected = OutOfRangeException.class)
    public void testGetPivotRow_ThrowOutOfRangeException_6() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 622593);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[0] = 3;
        keys[1] = -1245188;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 3;
        keys[6] = 3;
        keys[7] = 1245185;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        keys[12] = 3;
        keys[13] = 3;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[12];
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 7);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -1;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau, int)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = doubleArray;
        double[] doubleArray1 = {};
        data[2] = doubleArray1;
        setField(tableau, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "numArtificialVariables", 1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getEntry(Array2DRowRealMatrix.java:296)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1773237059);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", -536870913);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -536870913 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 1};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:180)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, -4};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:183)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 4099);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[36];
        keys[7] = -8200;
        keys[35] = -8200;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[14];
        states[7] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 39);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 14]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:188)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 14);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[12];
        keys[0] = -26;
        keys[1] = 27;
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE, (byte) 0};
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math3.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getHeight(); i++)
 *  */
    @Test
    public void testGetPivotRow_ThrowNullPointerException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:94) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = ((Object) null);
        getPivotRowMethodArguments[1] = -255;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#getPivotRow(org.apache.commons.math3.optimization.linear.SimplexTableau,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowNullPointerException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "columns", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math3.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math3.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:382)
            org.apache.commons.math3.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:179)
            org.apache.commons.math3.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:218)
            org.apache.commons.math3.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:495)
            org.apache.commons.math3.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:95) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class intType = int.class;
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", simplexTableauType, intType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = simplexTableau;
        getPivotRowMethodArguments[1] = -255;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.optimization.linear.SimplexSolver.doOptimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: restrictToNonNegative()
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.SimplexSolver", "epsilon", 0.0);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.SimplexSolver", "maxUlps", -255);
        ArrayList linearConstraints = new ArrayList();
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "linearConstraints", linearConstraints);
        GoalType goal = GoalType.MAXIMIZE;
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "goal", goal);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:265)
            org.apache.commons.math3.optimization.linear.SimplexTableau.normalizeConstraints(SimplexTableau.java:254)
            org.apache.commons.math3.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:141)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:219) */
        simplexSolver.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: restrictToNonNegative()
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.SimplexSolver", "epsilon", 0.0);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.SimplexSolver", "maxUlps", -255);
        LinearObjectiveFunction function = ((LinearObjectiveFunction) createInstance("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "function", function);
        ArrayList linearConstraints = new ArrayList();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(linearConstraint, "org.apache.commons.math3.optimization.linear.LinearConstraint", "value", -2.225073858507202E-308);
        linearConstraints.add(linearConstraint);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        linearConstraints.add(null);
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "linearConstraints", linearConstraints);
        GoalType goal = GoalType.MAXIMIZE;
        setField(simplexSolver, "org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer", "goal", goal);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math3.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:266)
            org.apache.commons.math3.optimization.linear.SimplexTableau.normalizeConstraints(SimplexTableau.java:254)
            org.apache.commons.math3.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:141)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:219) */
        simplexSolver.doOptimize();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method doOptimize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.optimization.linear.SimplexSolver#doOptimize()}
     */
    @Test
    public void testDoOptimizeThrowsNPE() {
        SimplexSolver simplexSolver = new SimplexSolver(1.2882297539194267E-231, -1);
        simplexSolver.setMaxIterations(-1);
        
        /* This test fails because method [org.apache.commons.math3.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            java.base/java.util.Collections.unmodifiableCollection(Collections.java:1019)
            org.apache.commons.math3.optimization.linear.AbstractLinearOptimizer.getConstraints(AbstractLinearOptimizer.java:103)
            org.apache.commons.math3.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:217) */
        simplexSolver.doOptimize();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields723492214138800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields723492214138800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass723492214145000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields723492214138800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass723492214145000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields723492214891800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields723492214891800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass723492214893500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields723492214891800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass723492214893500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

