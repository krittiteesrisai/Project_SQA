package org.apache.commons.math3.distribution;

import org.junit.Test;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import java.lang.reflect.Method;
import org.apache.commons.math3.exception.DimensionMismatchException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math3_distribution_MultivariateNormalDistributionTest {
    ///region Test suites for executable org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getStandardDeviations()
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.returnsFrom {@code return std;}
 *  */
    @Test
    public void testGetStandardDeviations_ReturnStd_1() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        
        double[] actual = multivariateNormalDistribution.getStandardDeviations();
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dim; i++)} once
 * @utbot.returnsFrom {@code return std;}
 *  */
    @Test
    public void testGetStandardDeviations_FastMathSqrt() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        double[] actual = multivariateNormalDistribution.getStandardDeviations();
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.returnsFrom {@code return std;}
 *  */
    @Test
    public void testGetStandardDeviations_ReturnStd_2() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        
        double[] actual = multivariateNormalDistribution.getStandardDeviations();
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.returnsFrom {@code return std;}
 *  */
    @Test
    public void testGetStandardDeviations_ReturnStd_3() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", 1);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        
        double[] actual = multivariateNormalDistribution.getStandardDeviations();
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.returnsFrom {@code return std;}
 *  */
    @Test
    public void testGetStandardDeviations_ReturnStd() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        
        double[] actual = multivariateNormalDistribution.getStandardDeviations();
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getStandardDeviations()
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[] std = new double[dim];
 *  */
    @Test
    public void testGetStandardDeviations_ThrowNegativeArraySizeException() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", Integer.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:196) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[][] s = covarianceMatrix.getData();
 *  */
    @Test
    public void testGetStandardDeviations_ThrowNegativeArraySizeException_1() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", Integer.MIN_VALUE);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.linear.BlockRealMatrix.getData(BlockRealMatrix.java:598)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testGetStandardDeviations_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(covarianceMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:529)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getData(Array2DRowRealMatrix.java:254)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] s = covarianceMatrix.getData();
 *  */
    @Test
    public void testGetStandardDeviations_ThrowArrayIndexOutOfBoundsException_2() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", 1);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.getData(BlockRealMatrix.java:614)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] s = covarianceMatrix.getData();
 *  */
    @Test
    public void testGetStandardDeviations_ThrowArrayIndexOutOfBoundsException_3() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", 2);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.getData(BlockRealMatrix.java:611)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < dim; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: std[i] = FastMath.sqrt(s[i][i]);
 *  */
    @Test
    public void testGetStandardDeviations_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:199) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] s = covarianceMatrix.getData();
 *  */
    @Test
    public void testGetStandardDeviations_ThrowNullPointerException() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] s = covarianceMatrix.getData();
 *  */
    @Test
    public void testGetStandardDeviations_ThrowNullPointerException_1() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {
            null,
            null
        };
        setField(covarianceMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getData(Array2DRowRealMatrix.java:254)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] s = covarianceMatrix.getData();
 *  */
    @Test
    public void testGetStandardDeviations_ThrowNullPointerException_2() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {null};
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", 2);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.linear.BlockRealMatrix.getData(BlockRealMatrix.java:611)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getStandardDeviations()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[][] s = covarianceMatrix.getData();
 *  */
    @Test
    public void testGetStandardDeviations_ThrowNullPointerException_3() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {null};
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", 1);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.linear.BlockRealMatrix.getData(BlockRealMatrix.java:614)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getStandardDeviations()
    
    @Test
    public void testGetStandardDeviations1() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 9);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 9);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 9);
        
        double[] actual = multivariateNormalDistribution.getStandardDeviations();
        
        double[] expected = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    @Test
    public void testGetStandardDeviations2() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[12][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        data[1] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[2] = doubleArray1;
        data[3] = doubleArray1;
        data[4] = doubleArray1;
        data[5] = doubleArray1;
        data[6] = doubleArray1;
        data[7] = doubleArray1;
        data[8] = doubleArray1;
        data[9] = doubleArray1;
        data[10] = doubleArray1;
        data[11] = doubleArray1;
        setField(covarianceMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 9);
        
        double[] actual = multivariateNormalDistribution.getStandardDeviations();
        
        double[] expected = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getStandardDeviations()
    
    @Test
    public void testGetStandardDeviations3() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 9);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", -2147483647);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 9);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:199) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    @Test
    public void testGetStandardDeviations4() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 11);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:199) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    @Test
    public void testGetStandardDeviations5() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        OpenMapRealMatrix covarianceMatrix = ((OpenMapRealMatrix) createInstance("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:199) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    @Test
    public void testGetStandardDeviations6() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        DiagonalMatrix covarianceMatrix = ((DiagonalMatrix) createInstance("org.apache.commons.math3.linear.DiagonalMatrix"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:199) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    @Test
    public void testGetStandardDeviations7() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        setField(covarianceMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 9);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:199) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    @Test
    public void testGetStandardDeviations8() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrix = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[14][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        data[1] = doubleArray1;
        data[2] = doubleArray1;
        data[3] = doubleArray1;
        data[4] = doubleArray1;
        data[5] = doubleArray1;
        data[6] = doubleArray1;
        data[7] = doubleArray1;
        data[8] = doubleArray1;
        data[9] = doubleArray1;
        data[10] = doubleArray1;
        data[11] = doubleArray1;
        data[12] = doubleArray1;
        data[13] = doubleArray1;
        setField(covarianceMatrix, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 1 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.copyOut(Array2DRowRealMatrix.java:532)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getData(Array2DRowRealMatrix.java:254)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    @Test
    public void testGetStandardDeviations9() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {0.0};
        blocks[0] = doubleArray;
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", -1775803786);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 2);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -2147483587 is negative]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.linear.BlockRealMatrix.getData(BlockRealMatrix.java:614)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    @Test
    public void testGetStandardDeviations10() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        blocks[0] = doubleArray;
        blocks[1] = ((double[]) null);
        blocks[2] = ((double[]) null);
        blocks[3] = ((double[]) null);
        blocks[4] = ((double[]) null);
        blocks[5] = ((double[]) null);
        blocks[6] = ((double[]) null);
        blocks[7] = ((double[]) null);
        blocks[8] = ((double[]) null);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 2);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 9);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", Integer.MIN_VALUE);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 9);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 52 out of bounds for double[9]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math3.linear.BlockRealMatrix.getData(BlockRealMatrix.java:611)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    @Test
    public void testGetStandardDeviations11() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[9][];
        double[] doubleArray = new double[33];
        blocks[0] = doubleArray;
        blocks[1] = ((double[]) null);
        blocks[2] = ((double[]) null);
        blocks[3] = ((double[]) null);
        blocks[4] = ((double[]) null);
        blocks[5] = ((double[]) null);
        blocks[6] = ((double[]) null);
        blocks[7] = ((double[]) null);
        blocks[8] = ((double[]) null);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 40);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 6);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", -1321528397);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 10);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:199) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    @Test
    public void testGetStandardDeviations12() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = new double[1][];
        double[] doubleArray = {};
        blocks[0] = doubleArray;
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 4);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", 1);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:199) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    
    @Test
    public void testGetStandardDeviations13() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        BlockRealMatrix covarianceMatrix = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 9);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(covarianceMatrix, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrix", covarianceMatrix);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.AbstractMultivariateRealDistribution", "dimension", 1);
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations] produces [java.lang.NullPointerException]
            org.apache.commons.math3.linear.BlockRealMatrix.getData(BlockRealMatrix.java:614)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getStandardDeviations(MultivariateNormalDistribution.java:197) */
        multivariateNormalDistribution.getStandardDeviations();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getExponentTerm([D)
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < centered.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: centered[i] = values[i] - getMeans()[i];
 *  */
    @Test
    public void testGetExponentTerm_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] means = {};
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "means", means);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:231) */
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArrayType = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArrayType);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) doubleArray);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
 *  */
    @Test
    public void testGetExponentTerm_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrixInverse = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixInverse", covarianceMatrixInverse);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.preMultiply(Array2DRowRealMatrix.java:374)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233) */
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArrayType = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArrayType);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) doubleArray);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < centered.length; i++)} once
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
 *  */
    @Test
    public void testGetExponentTerm_ThrowNegativeArraySizeException() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] means = {0.0};
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "means", means);
        BlockRealMatrix covarianceMatrixInverse = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", Integer.MIN_VALUE);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixInverse", covarianceMatrixInverse);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm] produces [java.lang.NegativeArraySizeException: -2147483648]
            org.apache.commons.math3.linear.BlockRealMatrix.preMultiply(BlockRealMatrix.java:1307)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233) */
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArrayType = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArrayType);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) doubleArray);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < centered.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
 *  */
    @Test
    public void testGetExponentTerm_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] means = {0.0};
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "means", means);
        BlockRealMatrix covarianceMatrixInverse = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 1);
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", 2);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixInverse", covarianceMatrixInverse);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.preMultiply(BlockRealMatrix.java:1318)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233) */
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArrayType = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArrayType);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) doubleArray);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < centered.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
 *  */
    @Test
    public void testGetExponentTerm_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] means = {0.0};
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "means", means);
        BlockRealMatrix covarianceMatrixInverse = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        double[][] blocks = {};
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "blocks", blocks);
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", 1);
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "columns", 52);
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "blockRows", 1);
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "blockColumns", 1);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixInverse", covarianceMatrixInverse);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.BlockRealMatrix.preMultiply(BlockRealMatrix.java:1318)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233) */
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArrayType = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArrayType);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) doubleArray);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] centered = new double[values.length];
 *  */
    @Test
    public void testGetExponentTerm_ThrowNullPointerException() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:229) */
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArrayType = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArrayType);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) null);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
 *  */
    @Test
    public void testGetExponentTerm_ThrowNullPointerException_1() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233) */
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArrayType = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArrayType);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) doubleArray);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < centered.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
 *  */
    @Test
    public void testGetExponentTerm_ThrowNullPointerException_2() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] means = {0.0};
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "means", means);
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233) */
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArrayType = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArrayType);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) doubleArray);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getExponentTerm([D)
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetExponentTerm_ThrowDimensionMismatchException() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrixInverse = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixInverse", covarianceMatrixInverse);
        double[] doubleArray1 = {};
        
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArray1Type = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArray1Type);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) doubleArray1);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetExponentTerm_ThrowDimensionMismatchException_1() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrixInverse = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixInverse", covarianceMatrixInverse);
        double[] doubleArray = {};
        
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArrayType = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArrayType);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) doubleArray);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getExponentTerm(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < centered.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: final double[] preMultiplied = covarianceMatrixInverse.preMultiply(centered);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testGetExponentTerm_ThrowDimensionMismatchException_2() throws Throwable  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] means = {0.0};
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "means", means);
        BlockRealMatrix covarianceMatrixInverse = ((BlockRealMatrix) createInstance("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.BlockRealMatrix", "rows", -2);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixInverse", covarianceMatrixInverse);
        double[] doubleArray = {0.0};
        
        Class multivariateNormalDistributionClazz = Class.forName("org.apache.commons.math3.distribution.MultivariateNormalDistribution");
        Class doubleArrayType = Class.forName("[D");
        Method getExponentTermMethod = multivariateNormalDistributionClazz.getDeclaredMethod("getExponentTerm", doubleArrayType);
        getExponentTermMethod.setAccessible(true);
        java.lang.Object[] getExponentTermMethodArguments = new java.lang.Object[1];
        getExponentTermMethodArguments[0] = ((Object) doubleArray);
        try {
            getExponentTermMethod.invoke(multivariateNormalDistribution, getExponentTermMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.MultivariateNormalDistribution.getMeans
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getMeans()
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#getMeans()}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathArrays#copyOf(double[])}
 * @utbot.returnsFrom {@code return MathArrays.copyOf(means);}
 *  */
    @Test
    public void testGetMeans_MathArraysCopyOf() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] means = {};
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "means", means);
        
        double[] actual = multivariateNormalDistribution.getMeans();
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.distribution.MultivariateNormalDistribution.density
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method density([D)
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#density(double[])}
 * @utbot.executesCondition {@code (vals.length != dim): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testDensity_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrixInverse = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {};
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixInverse", covarianceMatrixInverse);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixDeterminant", java.lang.Double.NaN);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.density] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.linear.Array2DRowRealMatrix.getColumnDimension(Array2DRowRealMatrix.java:345)
            org.apache.commons.math3.linear.Array2DRowRealMatrix.preMultiply(Array2DRowRealMatrix.java:374)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.density(MultivariateNormalDistribution.java:185) */
        multivariateNormalDistribution.density(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#density(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: vals.length != dim
 *  */
    @Test
    public void testDensity_ThrowNullPointerException() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.density] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.density(MultivariateNormalDistribution.java:179) */
        multivariateNormalDistribution.density(null);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#density(double[])}
 * @utbot.executesCondition {@code (vals.length != dim): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getExponentTerm(vals)
 *  */
    @Test
    public void testDensity_ThrowNullPointerException_1() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixDeterminant", java.lang.Double.NaN);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.density] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.density(MultivariateNormalDistribution.java:185) */
        multivariateNormalDistribution.density(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#density(double[])}
 * @utbot.executesCondition {@code (vals.length != dim): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getExponentTerm(vals)
 *  */
    @Test
    public void testDensity_ThrowNullPointerException_2() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixDeterminant", java.lang.Double.POSITIVE_INFINITY);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.density] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.density(MultivariateNormalDistribution.java:185) */
        multivariateNormalDistribution.density(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#density(double[])}
 * @utbot.executesCondition {@code (vals.length != dim): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getExponentTerm(vals)
 *  */
    @Test
    public void testDensity_ThrowNullPointerException_3() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixDeterminant", -2.225073858507202E-308);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.density] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.density(MultivariateNormalDistribution.java:185) */
        multivariateNormalDistribution.density(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#density(double[])}
 * @utbot.executesCondition {@code (vals.length != dim): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getExponentTerm(vals)
 *  */
    @Test
    public void testDensity_ThrowNullPointerException_4() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixDeterminant", java.lang.Double.NEGATIVE_INFINITY);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.density] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.density(MultivariateNormalDistribution.java:185) */
        multivariateNormalDistribution.density(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#density(double[])}
 * @utbot.executesCondition {@code (vals.length != dim): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getExponentTerm(vals)
 *  */
    @Test
    public void testDensity_ThrowNullPointerException_5() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixDeterminant", -0.0);
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.distribution.MultivariateNormalDistribution.density] produces [java.lang.NullPointerException]
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.getExponentTerm(MultivariateNormalDistribution.java:233)
            org.apache.commons.math3.distribution.MultivariateNormalDistribution.density(MultivariateNormalDistribution.java:185) */
        multivariateNormalDistribution.density(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method density([D)
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#density(double[])}
 * @utbot.executesCondition {@code (vals.length != dim): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: vals.length != dim
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDensity_ThrowDimensionMismatchException() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        double[] doubleArray = {0.0};
        
        multivariateNormalDistribution.density(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#density(double[])}
 * @utbot.executesCondition {@code (vals.length != dim): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: getExponentTerm(vals)
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDensity_ThrowDimensionMismatchException_1() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrixInverse = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixInverse", covarianceMatrixInverse);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixDeterminant", java.lang.Double.NaN);
        double[] doubleArray1 = {};
        
        multivariateNormalDistribution.density(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MultivariateNormalDistribution}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.distribution.MultivariateNormalDistribution#density(double[])}
 * @utbot.executesCondition {@code (vals.length != dim): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: getExponentTerm(vals)
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testDensity_ThrowDimensionMismatchException_2() throws Exception  {
        MultivariateNormalDistribution multivariateNormalDistribution = ((MultivariateNormalDistribution) createInstance("org.apache.commons.math3.distribution.MultivariateNormalDistribution"));
        Array2DRowRealMatrix covarianceMatrixInverse = ((Array2DRowRealMatrix) createInstance("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        double[][] data = {null};
        setField(covarianceMatrixInverse, "org.apache.commons.math3.linear.Array2DRowRealMatrix", "data", data);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixInverse", covarianceMatrixInverse);
        setField(multivariateNormalDistribution, "org.apache.commons.math3.distribution.MultivariateNormalDistribution", "covarianceMatrixDeterminant", java.lang.Double.NEGATIVE_INFINITY);
        double[] doubleArray = {};
        
        multivariateNormalDistribution.density(doubleArray);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields717235835648300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields717235835648300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass717235835655500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields717235835648300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass717235835655500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

