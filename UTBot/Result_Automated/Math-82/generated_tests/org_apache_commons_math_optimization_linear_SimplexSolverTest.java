package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import java.lang.reflect.Method;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.util.OpenIntToDoubleHashMap;
import org.apache.commons.math.linear.MatrixIndexException;
import java.util.Collection;
import org.apache.commons.math.optimization.GoalType;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math.optimization.OptimizationException;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.ArrayRealVector;
import java.util.HashSet;
import org.apache.commons.math.optimization.RealPointValuePair;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertEquals;
import static java.util.Collections.emptyList;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math_optimization_linear_SimplexSolverTest {
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPivotRow(int, org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minRatioPos;}
 *  */
    @Test
    public void testGetPivotRow_ReturnMinRatioPos() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minRatioPos;}
 *  */
    @Test
    public void testGetPivotRow_ReturnMinRatioPos_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minRatioPos;}
 *  */
    @Test
    public void testGetPivotRow_ReturnMinRatioPos_7() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minRatioPos;}
 *  */
    @Test
    public void testGetPivotRow_ReturnMinRatioPos_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null
        };
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        RealMatrix realMatrix1 = simplexTableau.tableau;
        double[][] realMatrix1TableauData = ((double[][]) getFieldValue(realMatrix1, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData1 = ((double[]) get(realMatrix1TableauData, 1));
        
        assertNull(finalSimplexTableauTableauData0);
        
        assertNull(finalSimplexTableauTableauData1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minRatioPos;}
 *  */
    @Test
    public void testGetPivotRow_ReturnMinRatioPos_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 0.0);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        double[] doubleArray1 = {-0.0, java.lang.Double.NaN};
        data[2] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = 0;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData1 = ((double[]) get(realMatrixTableauData, 1));
        
        assertNull(finalSimplexTableauTableauData1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minRatioPos;}
 *  */
    @Test
    public void testGetPivotRow_ReturnMinRatioPos_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 0.0);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        double[] doubleArray1 = {1.73887276664364E-310, -0.0};
        data[2] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = 1;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        Integer expected = 2;
        
        assertEquals(expected, actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData1 = ((double[]) get(realMatrixTableauData, 1));
        
        assertNull(finalSimplexTableauTableauData1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minRatioPos;}
 *  */
    @Test
    public void testGetPivotRow_ReturnMinRatioPos_6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -3.88669753771023E-77);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        double[] doubleArray1 = {-6.713235011667217E-154};
        data[2] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = 0;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData1 = ((double[]) get(realMatrixTableauData, 1));
        
        assertNull(finalSimplexTableauTableauData1);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minRatioPos;}
 *  */
    @Test
    public void testGetPivotRow_ReturnMinRatioPos_9() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minRatioPos;}
 *  */
    @Test
    public void testGetPivotRow_ReturnMinRatioPos_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minRatioPos;}
 *  */
    @Test
    public void testGetPivotRow_ReturnMinRatioPos_8() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPivotRow(int, org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2021725416);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", -1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:80) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:80) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, -4};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:80) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 39);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[37];
        keys[8] = -80;
        keys[34] = -80;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[29];
        states[8] = java.lang.Byte.MIN_VALUE;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 42);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 34 out of bounds for length 29]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:80) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 5);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[1] = -12;
        keys[7] = 9;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 7);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:80) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getHeight(); i++)
 *  */
    @Test
    public void testGetPivotRow_ThrowNullPointerException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:79) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = ((Object) null);
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test
    public void testGetPivotRow_ThrowNullPointerException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotRow(SimplexSolver.java:80) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPivotRow(int, org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotRow_ThrowMatrixIndexException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double entry = tableau.getEntry(i, col);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotRow_ThrowMatrixIndexException_5() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -256;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotRow_ThrowMatrixIndexException_6() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        data[0] = ((double[]) null);
        double[] doubleArray = {0.0};
        data[1] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotRow_ThrowMatrixIndexException_7() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = {null};
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 1744830505);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", -33554433);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double rhs = tableau.getEntry(i, tableau.getWidth() - 1);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotRow_ThrowMatrixIndexException_8() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        double[][] blocks = new double[2][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        blocks[1] = ((double[]) null);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blocks", blocks);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "rows", 2);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", -40);
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "blockColumns", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -255;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double entry = tableau.getEntry(i, col);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotRow_ThrowMatrixIndexException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {-4};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -1;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double entry = tableau.getEntry(i, col);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotRow_ThrowMatrixIndexException_2() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -1;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double entry = tableau.getEntry(i, col);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotRow_ThrowMatrixIndexException_3() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 595591169);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[39];
        keys[21] = -4;
        keys[30] = -1191182340;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[37];
        states[30] = (byte) 1;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 0.0);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 31);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -1;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double entry = tableau.getEntry(i, col);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotRow_ThrowMatrixIndexException_4() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 16385);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[1] = -32772;
        keys[7] = 32769;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[12];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 7);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -1;
        getPivotRowMethodArguments[1] = simplexTableau;
        try {
            getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getPivotRow(int, org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)}
     */
    @Test
    public void testGetPivotRow() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        SimplexSolver simplexSolver = new SimplexSolver();
        simplexSolver.setMaxIterations(0);
        double[] doubleArray = {1.0};
        LinearObjectiveFunction linearObjectiveFunction = new LinearObjectiveFunction(doubleArray, 1.7976931348623157E308);
        Collection collection = emptyList();
        GoalType goalType = GoalType.MINIMIZE;
        SimplexTableau simplexTableau = new SimplexTableau(linearObjectiveFunction, collection, goalType, false, 0.0);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class intType = int.class;
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotRowMethod = simplexSolverClazz.getDeclaredMethod("getPivotRow", intType, simplexTableauType);
        getPivotRowMethod.setAccessible(true);
        java.lang.Object[] getPivotRowMethodArguments = new java.lang.Object[2];
        getPivotRowMethodArguments[0] = -3;
        getPivotRowMethodArguments[1] = simplexTableau;
        Integer actual = ((Integer) getPivotRowMethod.invoke(simplexSolver, getPivotRowMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_10() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 0.0);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0, -0.0, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -7.378697629497224E19);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0, -2.0522684006529157E-289, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        Integer expected = 2;
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_11() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_13() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_12() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 3.0000019073529716);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {-3.0000019073529716};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_7() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -1.4489970869782785E-70);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_8() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 2.2250743890061496E-308);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 4, (byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 1.2882300610573341E-231);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 13);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return minPos;}
 *  */
    @Test
    public void testGetPivotColumn_ReturnMinPos_9() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 2.044048524600631E-302);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[16];
        keys[0] = 3;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 1;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        keys[12] = 3;
        keys[13] = 3;
        keys[14] = 3;
        keys[15] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[14];
        values[5] = -2.044048524600631E-302;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, (byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method getPivotColumnMethod = simplexSolverClazz.getDeclaredMethod("getPivotColumn", simplexTableauType);
        getPivotColumnMethod.setAccessible(true);
        java.lang.Object[] getPivotColumnMethodArguments = new java.lang.Object[1];
        getPivotColumnMethodArguments[0] = simplexTableau;
        Integer actual = ((Integer) getPivotColumnMethod.invoke(simplexSolver, getPivotColumnMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++)
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:410)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:398)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:61) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++)
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:412)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:398)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:61) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), minValue, epsilon) < 0
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), minValue, epsilon) < 0
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), minValue, epsilon) < 0
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), minValue, epsilon) < 0
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), minValue, epsilon) < 0
 *  */
    @Test
    public void testGetPivotColumn_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1024);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[0] = 3;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 1;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        keys[12] = 3;
        keys[13] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++)
 *  */
    @Test
    public void testGetPivotColumn_ThrowNullPointerException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:61) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: MathUtils.compareTo(tableau.getEntry(0, i), minValue, epsilon) < 0
 *  */
    @Test
    public void testGetPivotColumn_ThrowNullPointerException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: MathUtils.compareTo(tableau.getEntry(0, i), minValue, epsilon) < 0
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotColumn_ThrowMatrixIndexException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: MathUtils.compareTo(tableau.getEntry(0, i), minValue, epsilon) < 0
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetPivotColumn_ThrowMatrixIndexException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
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
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexSolver.doIteration
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:410)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:398)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:61)
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:105) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62)
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:105) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62)
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:105) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62)
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:105) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62)
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:105) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[0] = 3;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 1;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        keys[12] = 3;
        keys[13] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62)
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:105) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:61)
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:105) */
        simplexSolver.doIteration(null);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(pivotCol, tableau);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:106) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(pivotCol, tableau);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_7() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:106) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(pivotCol, tableau);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_8() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 2.225073858507202E-308);
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0, -2.225073858507202E-308, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:106) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(pivotCol, tableau);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_9() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:106) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.getPivotColumn(SimplexSolver.java:62)
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:105) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(pivotCol, tableau);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 4.9E-324);
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:106) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(pivotCol, tableau);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -8.988465674311584E307);
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {java.lang.Double.NaN};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:106) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(pivotCol, tableau);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 4.9E-324);
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[12];
        keys[0] = -2147483647;
        keys[2] = -2147483647;
        keys[3] = -2147483647;
        keys[4] = -2147483647;
        keys[6] = -2147483647;
        keys[7] = -2147483647;
        keys[8] = -2147483647;
        keys[9] = -2147483647;
        keys[10] = -2147483647;
        keys[11] = -2147483647;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = new byte[12];
        states[1] = (byte) 64;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:106) */
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Integer pivotRow = getPivotRow(pivotCol, tableau);
 *  */
    @Test
    public void testDoIteration_ThrowNullPointerException_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 0.0);
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[12];
        values[5] = -0.0;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doIteration] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.doIteration(SimplexSolver.java:106) */
        simplexSolver.doIteration(simplexTableau);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: incrementIterationsCounter();
 *  */
    @Test(expected = OptimizationException.class)
    public void testDoIteration_ThrowOptimizationException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        
        simplexSolver.doIteration(null);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.optimization.linear.UnboundedSolutionException} when: pivotRow == null
 *  */
    @Test(expected = UnboundedSolutionException.class)
    public void testDoIteration_ThrowUnboundedSolutionException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -2.0000000000000004);
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0, -3.337610787760802E-308, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.optimization.linear.UnboundedSolutionException} when: pivotRow == null
 *  */
    @Test(expected = UnboundedSolutionException.class)
    public void testDoIteration_ThrowUnboundedSolutionException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -4.000000000006978);
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -3.8814E-320);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexSolver.doIteration(simplexTableau);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testDoIteration_ThrowMatrixIndexException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: Integer pivotCol = getPivotColumn(tableau);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testDoIteration_ThrowMatrixIndexException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexSolver.doIteration(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doIteration(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.invokes {@link java.lang.Integer#intValue()}
 * @utbot.invokes org.apache.commons.math.optimization.linear.SimplexSolver#getPivotRow(int,org.apache.commons.math.optimization.linear.SimplexTableau)
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: Integer pivotRow = getPivotRow(pivotCol, tableau);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testDoIteration_ThrowMatrixIndexException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        simplexSolver.setMaxIterations(Integer.MIN_VALUE);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "iterations", Integer.MAX_VALUE);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[3][];
        double[] doubleArray = {0.0, 0.0, -5.304989477E-315, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        double[] doubleArray1 = {};
        data[2] = doubleArray1;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        simplexSolver.doIteration(simplexTableau);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue_7() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -2.2250823464903657E-308);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, -8.000030517578125, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue_8() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue_9() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue_6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue_10() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 8.775531596451002E-193);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {-8.775531596451002E-193};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 0.0);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {-0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -254;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -96.00000000000001);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 536870912);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {
            3, 0, 3, 3, 3, 0, 3, 3,
            3, 3
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {
            (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -4.3746732117338385E-303);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_ReturnTrue_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -2.2250738585086095E-308);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -252;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsPhase1Solved_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -6.210072739351995E231);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 16777216);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, -3.105036369675997E231};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        boolean actual = ((Boolean) isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++)
 *  */
    @Test
    public void testIsPhase1Solved_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:410)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:398)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:133) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++)
 *  */
    @Test
    public void testIsPhase1Solved_ThrowArrayIndexOutOfBoundsException_7() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:412)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:398)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:133) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsPhase1Solved_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsPhase1Solved_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsPhase1Solved_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsPhase1Solved_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsPhase1Solved_ThrowArrayIndexOutOfBoundsException_6() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:192)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsPhase1Solved_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 7);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tableau.getNumArtificialVariables() == 0
 *  */
    @Test
    public void testIsPhase1Solved_ThrowNullPointerException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:130) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = ((Object) null);
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsPhase1Solved_ThrowNullPointerException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134) */
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testIsPhase1Solved_ThrowMatrixIndexException() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isPhase1Solved(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testIsPhase1Solved_ThrowMatrixIndexException_1() throws Throwable  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        Class simplexSolverClazz = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class simplexTableauType = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Method isPhase1SolvedMethod = simplexSolverClazz.getDeclaredMethod("isPhase1Solved", simplexTableauType);
        isPhase1SolvedMethod.setAccessible(true);
        java.lang.Object[] isPhase1SolvedMethodArguments = new java.lang.Object[1];
        isPhase1SolvedMethodArguments[0] = simplexTableau;
        try {
            isPhase1SolvedMethod.invoke(simplexSolver, isPhase1SolvedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testSolvePhase1_Return() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 *  */
    @Test
    public void testSolvePhase1_IterateWhileLoop_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 4.9E-324);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", 4.9E-324);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 *  */
    @Test
    public void testSolvePhase1_IterateWhileLoop() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 0.0);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {-0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!isPhase1Solved(tableau))
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:410)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:398)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:133)
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:172) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !MathUtils.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0, epsilon)
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:177) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!isPhase1Solved(tableau))
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134)
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:172) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!isPhase1Solved(tableau))
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1024);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[12];
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -224;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134)
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:172) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 4.9E-324);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 6);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -4.9E-324);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134)
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:172) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!isPhase1Solved(tableau))
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1024);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[14];
        keys[0] = 3;
        keys[2] = 3;
        keys[3] = 3;
        keys[4] = 3;
        keys[5] = 1;
        keys[6] = 3;
        keys[7] = 3;
        keys[8] = 3;
        keys[9] = 3;
        keys[10] = 3;
        keys[11] = 3;
        keys[12] = 3;
        keys[13] = 3;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -255;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134)
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:172) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: while(!isPhase1Solved(tableau))
 *  */
    @Test
    public void testSolvePhase1_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -9.55669236469316E-299);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 11);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, 131073.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134)
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:172) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tableau.getNumArtificialVariables() == 0
 *  */
    @Test
    public void testSolvePhase1_ThrowNullPointerException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:168) */
        simplexSolver.solvePhase1(null);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSolvePhase1_ThrowNullPointerException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isPhase1Solved(SimplexSolver.java:134)
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:172) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !MathUtils.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0, epsilon)
 *  */
    @Test
    public void testSolvePhase1_ThrowNullPointerException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:177) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !MathUtils.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0, epsilon)
 *  */
    @Test
    public void testSolvePhase1_ThrowNullPointerException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.solvePhase1(SimplexSolver.java:177) */
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: while(!isPhase1Solved(tableau))
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSolvePhase1_ThrowMatrixIndexException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !MathUtils.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0, epsilon)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSolvePhase1_ThrowMatrixIndexException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: while(!isPhase1Solved(tableau))
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSolvePhase1_ThrowMatrixIndexException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: while(!isPhase1Solved(tableau))
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSolvePhase1_ThrowMatrixIndexException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !MathUtils.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0, epsilon)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSolvePhase1_ThrowMatrixIndexException_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: doIteration(tableau);
 *  */
    @Test(expected = OptimizationException.class)
    public void testSolvePhase1_ThrowOptimizationException_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -262145.00000000006);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, -2.9164599331918515E-303, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getRhsOffset()}
 * @utbot.invokes {@link org.apache.commons.math.optimization.linear.SimplexTableau#getEntry(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#equals(double,double,double)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link org.apache.commons.math.optimization.linear.NoFeasibleSolutionException} when: !MathUtils.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0, epsilon)
 *  */
    @Test(expected = NoFeasibleSolutionException.class)
    public void testSolvePhase1_ThrowNoFeasibleSolutionException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 8.325053178350204E-258);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", java.lang.Double.NaN);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: doIteration(tableau);
 *  */
    @Test(expected = OptimizationException.class)
    public void testSolvePhase1_ThrowOptimizationException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 3.3376107877608026E-308);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4194304);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {-768.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: doIteration(tableau);
 *  */
    @Test(expected = OptimizationException.class)
    public void testSolvePhase1_ThrowOptimizationException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 0.0);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -2.225073858507202E-308);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -256;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: doIteration(tableau);
 *  */
    @Test(expected = OptimizationException.class)
    public void testSolvePhase1_ThrowOptimizationException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 134217728);
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
        byte[] states = new byte[12];
        states[1] = (byte) 64;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -1.0864618449742E-311);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = -254;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#solvePhase1(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.iterates iterate the loop {@code while(!isPhase1Solved(tableau))} once
 * @utbot.throwsException {@link org.apache.commons.math.optimization.OptimizationException} in: doIteration(tableau);
 *  */
    @Test(expected = OptimizationException.class)
    public void testSolvePhase1_ThrowOptimizationException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -6.210072369203014E231);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 16777216);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0, 2};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0, -2.6815615859885956E154};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        simplexTableau.numArtificialVariables = 1;
        
        simplexSolver.solvePhase1(simplexTableau);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doOptimize()
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final SimplexTableau tableau = new SimplexTableau(f, constraints, goalType, restrictToNonNegative, epsilon);
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 4.9E-324);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        GoalType goalType = GoalType.MINIMIZE;
        simplexSolver.goalType = goalType;
        simplexSolver.restrictToNonNegative = true;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:110)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doOptimize()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final SimplexTableau tableau = new SimplexTableau(f, constraints, goalType, restrictToNonNegative, epsilon);
 *  */
    @Test
    public void testDoOptimize_ThrowNullPointerException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        GoalType goalType = GoalType.MAXIMIZE;
        simplexSolver.goalType = goalType;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:110)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method doOptimize()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver}
     * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#doOptimize()}
     */
    @Test
    public void testDoOptimizeThrowsNPE() throws OptimizationException  {
        SimplexSolver simplexSolver = new SimplexSolver(0.0);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getNumVariables(SimplexTableau.java:190)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:109)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doOptimize()
    
    @Test
    public void testDoOptimize1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        simplexSolver.restrictToNonNegative = true;
        
        RealPointValuePair actual = simplexSolver.doOptimize();
        
        RealPointValuePair expected = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = {};
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "value", 0.0);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double expectedValue = expected.getValue();
        double actualValue = actual.getValue();
        org.junit.Assert.assertEquals(expectedValue, actualValue, 1.0E-6);
        
    }
    
    @Test
    public void testDoOptimize2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = new double[15];
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        OpenMapRealVector coefficients1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        coefficients1.setEpsilon(java.lang.Double.NaN);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients1);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", 2.0);
        constraints.add(linearConstraint);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        GoalType goalType = GoalType.MAXIMIZE;
        simplexSolver.goalType = goalType;
        
        RealPointValuePair actual = simplexSolver.doOptimize();
        
        RealPointValuePair expected = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = new double[15];
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "value", 0.0);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double expectedValue = expected.getValue();
        double actualValue = actual.getValue();
        org.junit.Assert.assertEquals(expectedValue, actualValue, 1.0E-6);
        
    }
    
    @Test
    public void testDoOptimize3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = new double[15];
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        OpenMapRealVector coefficients1 = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        coefficients1.setEpsilon(java.lang.Double.NaN);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients1);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", java.lang.Double.NaN);
        constraints.add(linearConstraint);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        GoalType goalType = GoalType.MINIMIZE;
        simplexSolver.goalType = goalType;
        
        RealPointValuePair actual = simplexSolver.doOptimize();
        
        RealPointValuePair expected = ((RealPointValuePair) createInstance("org.apache.commons.math.optimization.RealPointValuePair"));
        double[] point = new double[15];
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "point", point);
        setField(expected, "org.apache.commons.math.optimization.RealPointValuePair", "value", 0.0);
        
        double[] expectedPoint = expected.getPoint();
        double[] actualPoint = actual.getPoint();
        int expectedPointSize = expectedPoint.length;
        assertEquals(expectedPointSize, actualPoint.length);
        assertArrayEquals(expectedPoint, actualPoint, 1.0E-6);
        
        double expectedValue = expected.getValue();
        double actualValue = actual.getValue();
        org.junit.Assert.assertEquals(expectedValue, actualValue, 1.0E-6);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doOptimize()
    
    @Test
    public void testDoOptimize4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:137)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:114)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    @Test
    public void testDoOptimize5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "virtualSize", -3);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        ArrayRealVector coefficients1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        setField(coefficients1, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients1);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", java.lang.Double.NaN);
        constraints.add(linearConstraint);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        GoalType goalType = GoalType.MINIMIZE;
        simplexSolver.goalType = goalType;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NegativeArraySizeException: -3]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:404)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:140)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:114)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    @Test
    public void testDoOptimize6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        simplexSolver.restrictToNonNegative = true;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:235)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:110)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    @Test
    public void testDoOptimize7() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = new double[15];
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        constraints.add(null);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        GoalType goalType = GoalType.MAXIMIZE;
        simplexSolver.goalType = goalType;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:236)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:110)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    @Test
    public void testDoOptimize8() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {};
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        constraints.add(null);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        GoalType goalType = GoalType.MINIMIZE;
        simplexSolver.goalType = goalType;
        simplexSolver.restrictToNonNegative = true;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:236)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:110)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    @Test
    public void testDoOptimize9() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        ArrayRealVector coefficients1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {
            -2.0, java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        setField(coefficients1, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients1);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", -2.0);
        constraints.add(linearConstraint);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        GoalType goalType = GoalType.MAXIMIZE;
        simplexSolver.goalType = goalType;
        simplexSolver.restrictToNonNegative = true;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:133)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:873)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:30)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:139)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:114)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    @Test
    public void testDoOptimize10() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        coefficients.setEpsilon(java.lang.Double.NaN);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", java.lang.Double.NaN);
        constraints.add(linearConstraint);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        GoalType goalType = GoalType.MINIMIZE;
        simplexSolver.goalType = goalType;
        simplexSolver.restrictToNonNegative = true;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.advance(OpenIntToDoubleHashMap.java:568)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:502)
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.<init>(OpenIntToDoubleHashMap.java:480)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.iterator(OpenIntToDoubleHashMap.java:238)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:405)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:140)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:114)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    @Test
    public void testDoOptimize11() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        coefficients.setEpsilon(java.lang.Double.NaN);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", -2.0);
        constraints.add(linearConstraint);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        simplexSolver.restrictToNonNegative = true;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator.key(OpenIntToDoubleHashMap.java:531)
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:408)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:140)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:114)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    @Test
    public void testDoOptimize12() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        coefficients.setEpsilon(java.lang.Double.NaN);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", -2.0);
        constraints.add(linearConstraint);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        simplexSolver.restrictToNonNegative = true;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.<init>(OpenIntToDoubleHashMap.java:133)
            org.apache.commons.math.linear.OpenMapRealVector.<init>(OpenMapRealVector.java:171)
            org.apache.commons.math.linear.OpenMapRealVector.copy(OpenMapRealVector.java:306)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:873)
            org.apache.commons.math.linear.OpenMapRealVector.mapMultiply(OpenMapRealVector.java:30)
            org.apache.commons.math.optimization.linear.SimplexTableau.normalize(SimplexTableau.java:212)
            org.apache.commons.math.optimization.linear.SimplexTableau.getNormalizedConstraints(SimplexTableau.java:200)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:126)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:114)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    @Test
    public void testDoOptimize13() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        coefficients.setEpsilon(java.lang.Double.NaN);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        constraints.add(null);
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", -2.0);
        constraints.add(linearConstraint);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        GoalType goalType = GoalType.MINIMIZE;
        simplexSolver.goalType = goalType;
        simplexSolver.restrictToNonNegative = true;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexTableau.getConstraintTypeCounts(SimplexTableau.java:236)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:110)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    
    @Test
    public void testDoOptimize14() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        ArrayRealVector coefficients1 = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = {
            java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        setField(coefficients1, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients1);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", -2.0);
        constraints.add(linearConstraint);
        LinearConstraint linearConstraint1 = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        constraints.add(linearConstraint1);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        simplexSolver.restrictToNonNegative = true;
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.OpenMapRealVector.getData(OpenMapRealVector.java:405)
            org.apache.commons.math.optimization.linear.SimplexTableau.createTableau(SimplexTableau.java:140)
            org.apache.commons.math.optimization.linear.SimplexTableau.<init>(SimplexTableau.java:114)
            org.apache.commons.math.optimization.linear.SimplexSolver.doOptimize(SimplexSolver.java:186) */
        simplexSolver.doOptimize();
    }
    ///endregion
    
    ///region OTHER: CHECKED EXCEPTIONS for method doOptimize()
    
    @Test(expected = NoFeasibleSolutionException.class)
    public void testDoOptimize15() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        ArrayRealVector coefficients = ((ArrayRealVector) createInstance("org.apache.commons.math.linear.ArrayRealVector"));
        double[] data = new double[15];
        setField(coefficients, "org.apache.commons.math.linear.ArrayRealVector", "data", data);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", java.lang.Double.NaN);
        constraints.add(linearConstraint);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        GoalType goalType = GoalType.MAXIMIZE;
        simplexSolver.goalType = goalType;
        
        simplexSolver.doOptimize();
    }
    
    @Test(expected = NoFeasibleSolutionException.class)
    public void testDoOptimize16() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        LinearObjectiveFunction f = ((LinearObjectiveFunction) createInstance("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        OpenMapRealVector coefficients = ((OpenMapRealVector) createInstance("org.apache.commons.math.linear.OpenMapRealVector"));
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] states = {
            (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
            (byte) 0
        };
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(coefficients, "org.apache.commons.math.linear.OpenMapRealVector", "entries", entries);
        coefficients.setEpsilon(-2.0);
        setField(f, "org.apache.commons.math.optimization.linear.LinearObjectiveFunction", "coefficients", coefficients);
        simplexSolver.f = f;
        HashSet constraints = new HashSet();
        LinearConstraint linearConstraint = ((LinearConstraint) createInstance("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "coefficients", coefficients);
        Relationship relationship = Relationship.GEQ;
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "relationship", relationship);
        setField(linearConstraint, "org.apache.commons.math.optimization.linear.LinearConstraint", "value", java.lang.Double.NaN);
        constraints.add(linearConstraint);
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.AbstractLinearOptimizer", "constraints", constraints);
        GoalType goalType = GoalType.MINIMIZE;
        simplexSolver.goalType = goalType;
        simplexSolver.restrictToNonNegative = true;
        
        simplexSolver.doOptimize();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsOptimal_ReturnFalse() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        simplexTableau.numArtificialVariables = 1;
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_7() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        BlockRealMatrix tableau = ((BlockRealMatrix) createInstance("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.BlockRealMatrix", "columns", 2);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsOptimal() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -4.000015258789063);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, -4.45016469298073E-308, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_9() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {null};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
        
        RealMatrix realMatrix = simplexTableau.tableau;
        double[][] realMatrixTableauData = ((double[][]) getFieldValue(realMatrix, "org.apache.commons.math.linear.RealMatrixImpl", "data"));
        double[] finalSimplexTableauTableauData0 = ((double[]) get(realMatrixTableauData, 0));
        
        assertNull(finalSimplexTableauTableauData0);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_10() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_8() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 0.0);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -0.0);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", 2.253321897042389E-308);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {2.253321897042389E-308};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsOptimal_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 268435456);
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
        byte[] states = new byte[12];
        states[1] = (byte) 64;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "missingEntries", -1.1125369292536007E-308);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsOptimal_ReturnTrue_6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", -3.969666306201937E-264);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {java.lang.Double.NaN, 0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 *  */
    @Test
    public void testIsOptimal_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setField(simplexSolver, "org.apache.commons.math.optimization.linear.SimplexSolver", "epsilon", java.lang.Double.NaN);
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 16777216);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = new int[17];
        keys[0] = 536870912;
        keys[2] = 536870912;
        keys[3] = 536870912;
        keys[4] = 536870912;
        keys[5] = 1;
        keys[6] = 536870912;
        keys[7] = 536870912;
        keys[8] = 536870912;
        keys[9] = 536870912;
        keys[10] = 536870912;
        keys[11] = 536870912;
        keys[12] = 536870912;
        keys[13] = 536870912;
        keys[14] = 536870912;
        keys[15] = 536870912;
        keys[16] = 536870912;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = new double[12];
        values[5] = -1.73833895198405E-310;
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {(byte) 0, java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        boolean actual = simplexSolver.isOptimal(simplexTableau);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++)
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_5() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Array2DRowRealMatrix tableau = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.Array2DRowRealMatrix", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:410)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:398)
            org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(SimplexSolver.java:150) */
        simplexSolver.isOptimal(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int i = tableau.getNumObjectiveFunctions(); i < tableau.getWidth() - 1; i++)
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_6() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        RealMatrixImpl tableau = ((RealMatrixImpl) createInstance("org.apache.commons.math.linear.RealMatrixImpl"));
        double[][] data = {};
        setField(tableau, "org.apache.commons.math.linear.RealMatrixImpl", "data", data);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:412)
            org.apache.commons.math.optimization.linear.SimplexTableau.getWidth(SimplexTableau.java:398)
            org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(SimplexSolver.java:150) */
        simplexSolver.isOptimal(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(SimplexSolver.java:151) */
        simplexSolver.isOptimal(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        byte[] states = {(byte) 0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:185)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(SimplexSolver.java:151) */
        simplexSolver.isOptimal(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] keys = {3, 1};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:182)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(SimplexSolver.java:151) */
        simplexSolver.isOptimal(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 1024);
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 5);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 2]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:189)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(SimplexSolver.java:151) */
        simplexSolver.isOptimal(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsOptimal_ThrowArrayIndexOutOfBoundsException_4() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
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
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "keys", keys);
        double[] values = {0.0};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "values", values);
        byte[] states = {java.lang.Byte.MIN_VALUE};
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "states", states);
        setField(entries, "org.apache.commons.math.util.OpenIntToDoubleHashMap", "mask", 2);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:193)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(SimplexSolver.java:151) */
        simplexSolver.isOptimal(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: tableau.getNumArtificialVariables() > 0
 *  */
    @Test
    public void testIsOptimal_ThrowNullPointerException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal] produces [java.lang.NullPointerException]
            org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(SimplexSolver.java:147) */
        simplexSolver.isOptimal(null);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test
    public void testIsOptimal_ThrowNullPointerException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 4);
        OpenIntToDoubleHashMap entries = ((OpenIntToDoubleHashMap) createInstance("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "entries", entries);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        /* This test fails because method [org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.OpenIntToDoubleHashMap.containsKey(OpenIntToDoubleHashMap.java:381)
            org.apache.commons.math.util.OpenIntToDoubleHashMap.get(OpenIntToDoubleHashMap.java:181)
            org.apache.commons.math.linear.OpenMapRealMatrix.getEntry(OpenMapRealMatrix.java:229)
            org.apache.commons.math.optimization.linear.SimplexTableau.getEntry(SimplexTableau.java:415)
            org.apache.commons.math.optimization.linear.SimplexSolver.isOptimal(SimplexSolver.java:151) */
        simplexSolver.isOptimal(simplexTableau);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testIsOptimal_ThrowMatrixIndexException() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", 3);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexSolver.isOptimal(simplexTableau);
    }
    
    /**
    @utbot.classUnderTest {@link SimplexSolver}
 * @utbot.methodUnderTest {@link org.apache.commons.math.optimization.linear.SimplexSolver#isOptimal(org.apache.commons.math.optimization.linear.SimplexTableau)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon) < 0
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testIsOptimal_ThrowMatrixIndexException_1() throws Exception  {
        SimplexSolver simplexSolver = ((SimplexSolver) createInstance("org.apache.commons.math.optimization.linear.SimplexSolver"));
        SimplexTableau simplexTableau = ((SimplexTableau) createInstance("org.apache.commons.math.optimization.linear.SimplexTableau"));
        OpenMapRealMatrix tableau = ((OpenMapRealMatrix) createInstance("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "rowDimension", 1);
        setField(tableau, "org.apache.commons.math.linear.OpenMapRealMatrix", "columnDimension", Integer.MIN_VALUE);
        setField(simplexTableau, "org.apache.commons.math.optimization.linear.SimplexTableau", "tableau", tableau);
        
        simplexSolver.isOptimal(simplexTableau);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields741774603399900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields741774603399900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass741774603406900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields741774603399900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass741774603406900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields741774604219000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields741774604219000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass741774604220900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields741774604219000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass741774604220900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

