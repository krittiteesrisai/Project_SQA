package org.apache.commons.math.linear;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_math_linear_RealMatrixImplTest {
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.preMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method preMultiply([D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(double[])}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testPreMultiply_ReturnOut() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[] doubleArray1 = {0.0};
        
        double[] actual = realMatrixImpl.preMultiply(doubleArray1);
        
        double[] expected = {};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(double[])}
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCols; col++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testPreMultiply_IterateForLoop() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[] doubleArray1 = {0.0};
        
        double[] actual = realMatrixImpl.preMultiply(doubleArray1);
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method preMultiply([D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(double[])}
 * @utbot.executesCondition {@code (v.length != nRows): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = this.getColumnDimension();
 *  */
    @Test
    public void testPreMultiply_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:801) */
        realMatrixImpl.preMultiply(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: v.length != nRows
 *  */
    @Test
    public void testPreMultiply_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:798) */
        realMatrixImpl.preMultiply(((double[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method preMultiply([D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(double[])}
 * @utbot.executesCondition {@code (v.length != nRows): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: v.length != nRows
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiply_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        double[] doubleArray = {0.0, 0.0};
        
        realMatrixImpl.preMultiply(doubleArray);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method preMultiply([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(double[])}
     */
    @Test
    public void testPreMultiplyThrowsNPEWithNonEmptyPrimitiveArray() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[] doubleArray = {1.0, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:797) */
        realMatrixImpl.preMultiply(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.preMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method preMultiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.returnsFrom {@code return m.multiply(this);}
 *  */
    @Test
    public void testPreMultiply_RealMatrixMultiply() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        data1[0] = doubleArray;
        data1[1] = doubleArray;
        realMatrixImpl1.data = data1;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.preMultiply(realMatrixImpl1));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data2 = new double[2][];
        double[] doubleArray1 = {0.0};
        data2[0] = doubleArray1;
        double[] doubleArray2 = {0.0};
        data2[1] = doubleArray2;
        expected.data = data2;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method preMultiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return m.multiply(this);
 *  */
    @Test
    public void testPreMultiply_ThrowArrayIndexOutOfBoundsException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:366)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334)
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:395) */
        realMatrixImpl.preMultiply(realMatrixImpl);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return m.multiply(this);
 *  */
    @Test
    public void testPreMultiply_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray = {};
        data1[0] = doubleArray;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:370)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334)
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:395) */
        realMatrixImpl.preMultiply(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return m.multiply(this);
 *  */
    @Test
    public void testPreMultiply_ThrowArrayIndexOutOfBoundsException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray2 = {0.0, 0.0};
        data1[0] = doubleArray2;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:379)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334)
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:395) */
        realMatrixImpl.preMultiply(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return m.multiply(this);
 *  */
    @Test
    public void testPreMultiply_ThrowNullPointerException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:395) */
        realMatrixImpl.preMultiply(((RealMatrix) null));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return m.multiply(this);
 *  */
    @Test
    public void testPreMultiply_ThrowNullPointerException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0, 0.0};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:379)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334)
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:395) */
        realMatrixImpl.preMultiply(realMatrixImpl1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method preMultiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return m.multiply(this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiply_ThrowIllegalArgumentException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        realMatrixImpl1.data = data;
        
        realMatrixImpl.preMultiply(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return m.multiply(this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiply_ThrowIllegalArgumentException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.preMultiply(realMatrixImpl1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method preMultiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#preMultiply(org.apache.commons.math.linear.RealMatrix)}
     */
    @Test
    public void testPreMultiplyThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[] doubleArray = {java.lang.Double.NaN, 0.0, java.lang.Double.NEGATIVE_INFINITY};
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray);
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:366)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334)
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:395) */
        realMatrixImpl.preMultiply(realMatrixImpl1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method preMultiply(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testPreMultiply1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[5][];
        double[] doubleArray2 = {0.0, 0.0};
        data1[0] = doubleArray2;
        data1[1] = doubleArray1;
        double[] doubleArray3 = {};
        data1[2] = doubleArray3;
        data1[3] = doubleArray3;
        data1[4] = doubleArray3;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:379)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334)
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:395) */
        realMatrixImpl.preMultiply(realMatrixImpl1);
    }
    
    @Test
    public void testPreMultiply2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[10][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        data1[1] = ((double[]) null);
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        data1[4] = ((double[]) null);
        data1[5] = ((double[]) null);
        data1[6] = ((double[]) null);
        data1[7] = ((double[]) null);
        data1[8] = ((double[]) null);
        data1[9] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.preMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:379)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334)
            org.apache.commons.math.linear.RealMatrixImpl.preMultiply(RealMatrixImpl.java:395) */
        realMatrixImpl.preMultiply(realMatrixImpl1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSubMatrix([[D, int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (data == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 *  */
    @Test
    public void testSetSubMatrix_DataNotEqualsNull() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        double[][] doubleArray1 = new double[1][];
        doubleArray1[0] = doubleArray;
        
        realMatrixImpl.setSubMatrix(doubleArray1, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (data == null): True}
 * @utbot.executesCondition {@code (row > 0): False}
 * @utbot.executesCondition {@code (column > 0): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 *  */
    @Test
    public void testSetSubMatrix_ColumnLessOrEqualZero() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.data = null;
        realMatrixImpl.lu = null;
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        
        double[][] initialRealMatrixImplData = realMatrixImpl.data;
        
        realMatrixImpl.setSubMatrix(doubleArray, 0, 0);
        
        double[][] finalRealMatrixImplData = realMatrixImpl.data;
        
        assertFalse(initialRealMatrixImplData == finalRealMatrixImplData);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSubMatrix([[D, int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.iterates iterate the loop {@code for(int r = 1; r < nRows; r++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: subMatrix[r].length != nCols
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] doubleArray = new double[2][];
        double[] doubleArray1 = {0.0, 0.0};
        doubleArray[0] = doubleArray1;
        double[] doubleArray2 = {0.0};
        doubleArray[1] = doubleArray2;
        
        realMatrixImpl.setSubMatrix(doubleArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: nRows == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_ThrowIllegalArgumentException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] doubleArray = {};
        
        realMatrixImpl.setSubMatrix(doubleArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: nCols == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_ThrowIllegalArgumentException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {};
        doubleArray[0] = doubleArray1;
        
        realMatrixImpl.setSubMatrix(doubleArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: (row < 0) || (column < 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_ThrowMatrixIndexException_4() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        realMatrixImpl.setSubMatrix(null, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: (row < 0) || (column < 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_ThrowMatrixIndexException_5() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        realMatrixImpl.setSubMatrix(null, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.executesCondition {@code (data == null): False}
 * @utbot.executesCondition {@code ((nRows + row) > this.getRowDimension()): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: ((nRows + row) > this.getRowDimension()) || (nCols + column > this.getColumnDimension())
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_ThrowMatrixIndexException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        
        realMatrixImpl.setSubMatrix(doubleArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.executesCondition {@code (data == null): False}
 * @utbot.executesCondition {@code ((nRows + row) > this.getRowDimension()): False}
 * @utbot.executesCondition {@code ((nCols + column > this.getColumnDimension())): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: ((nRows + row) > this.getRowDimension()) || (nCols + column > this.getColumnDimension())
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_ThrowMatrixIndexException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        
        realMatrixImpl.setSubMatrix(doubleArray1, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.executesCondition {@code (data == null): True}
 * @utbot.executesCondition {@code (row > 0): False}
 * @utbot.executesCondition {@code (column > 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: (row > 0) || (column > 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_ThrowMatrixIndexException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.data = null;
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        
        realMatrixImpl.setSubMatrix(doubleArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.executesCondition {@code (data == null): True}
 * @utbot.executesCondition {@code (row > 0): True}
 * @utbot.iterates iterate the loop {@code for(int r = 1; r < nRows; r++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: (row > 0) || (column > 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_ThrowMatrixIndexException_3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.data = null;
        double[][] doubleArray = new double[2][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        doubleArray[1] = doubleArray1;
        
        realMatrixImpl.setSubMatrix(doubleArray, 1, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSubMatrix([[D, int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.executesCondition {@code (data == null): False}
 * @utbot.executesCondition {@code ((nRows + row) > this.getRowDimension()): False}
 * @utbot.executesCondition {@code ((nCols + column > this.getColumnDimension())): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(subMatrix[i], 0, data[row + i], column, nCols);
 *  */
    @Test
    public void testSetSubMatrix_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[40][];
        double[] doubleArray = {0.0};
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
        data[10] = ((double[]) null);
        data[11] = ((double[]) null);
        data[12] = ((double[]) null);
        data[13] = ((double[]) null);
        data[14] = ((double[]) null);
        data[15] = ((double[]) null);
        data[16] = ((double[]) null);
        data[17] = ((double[]) null);
        data[18] = ((double[]) null);
        data[19] = ((double[]) null);
        data[20] = ((double[]) null);
        data[21] = ((double[]) null);
        data[22] = ((double[]) null);
        data[23] = ((double[]) null);
        data[24] = ((double[]) null);
        data[25] = ((double[]) null);
        data[26] = ((double[]) null);
        data[27] = ((double[]) null);
        data[28] = ((double[]) null);
        data[29] = ((double[]) null);
        data[30] = ((double[]) null);
        data[31] = ((double[]) null);
        data[32] = ((double[]) null);
        data[33] = ((double[]) null);
        data[34] = ((double[]) null);
        data[35] = ((double[]) null);
        data[36] = ((double[]) null);
        data[37] = ((double[]) null);
        data[38] = ((double[]) null);
        data[39] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 40]
            org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(RealMatrixImpl.java:560) */
        realMatrixImpl.setSubMatrix(doubleArray1, Integer.MAX_VALUE, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.executesCondition {@code (data == null): False}
 * @utbot.executesCondition {@code ((nRows + row) > this.getRowDimension()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: (nCols + column > this.getColumnDimension())
 *  */
    @Test
    public void testSetSubMatrix_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(RealMatrixImpl.java:556) */
        realMatrixImpl.setSubMatrix(doubleArray, Integer.MAX_VALUE, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nCols = subMatrix[0].length;
 *  */
    @Test
    public void testSetSubMatrix_ThrowNullPointerException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] doubleArray = {null};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(RealMatrixImpl.java:538) */
        realMatrixImpl.setSubMatrix(doubleArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.iterates iterate the loop {@code for(int r = 1; r < nRows; r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: subMatrix[r].length != nCols
 *  */
    @Test
    public void testSetSubMatrix_ThrowNullPointerException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] doubleArray = new double[2][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        doubleArray[1] = ((double[]) null);
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(RealMatrixImpl.java:544) */
        realMatrixImpl.setSubMatrix(doubleArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nRows = subMatrix.length;
 *  */
    @Test
    public void testSetSubMatrix_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(RealMatrixImpl.java:533) */
        realMatrixImpl.setSubMatrix(null, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#setSubMatrix(double[][],int,int)}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.executesCondition {@code (data == null): False}
 * @utbot.executesCondition {@code ((nRows + row) > this.getRowDimension()): False}
 * @utbot.executesCondition {@code ((nCols + column > this.getColumnDimension())): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(subMatrix[i], 0, data[row + i], column, nCols);
 *  */
    @Test
    public void testSetSubMatrix_ThrowNullPointerException_3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(RealMatrixImpl.java:560) */
        realMatrixImpl.setSubMatrix(doubleArray1, 1, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.scalarAdd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method scalarAdd(double)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#scalarAdd(double)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.returnsFrom {@code return new RealMatrixImpl(outData, false);}
 *  */
    @Test
    public void testScalarAdd_RealMatrixImplGetColumnDimension() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.scalarAdd(java.lang.Double.NaN));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {java.lang.Double.NaN};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scalarAdd(double)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#scalarAdd(double)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int columnCount = getColumnDimension();
 *  */
    @Test
    public void testScalarAdd_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.scalarAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.scalarAdd(RealMatrixImpl.java:294) */
        realMatrixImpl.scalarAdd(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method scalarAdd(double)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#scalarAdd(double)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testScalarAdd_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.scalarAdd(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method scalarAdd(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#scalarAdd(double)}
     */
    @Test
    public void testScalarAddThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.scalarAdd] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.scalarAdd(RealMatrixImpl.java:293) */
        realMatrixImpl.scalarAdd(2.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowMatrix(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRowMatrix(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return new RealMatrixImpl(out, false);}
 *  */
    @Test
    public void testGetRowMatrix_SystemArraycopy() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getRowMatrix(0));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowMatrix(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRowMatrix(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isValidCoordinate(row, 0)
 *  */
    @Test
    public void testGetRowMatrix_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(RealMatrixImpl.java:1174)
            org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix(RealMatrixImpl.java:574) */
        realMatrixImpl.getRowMatrix(-255);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRowMatrix(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(data[row], 0, out[0], 0, ncols);
 *  */
    @Test
    public void testGetRowMatrix_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix(RealMatrixImpl.java:579) */
        realMatrixImpl.getRowMatrix(1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRowMatrix(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(data[row], 0, out[0], 0, ncols);
 *  */
    @Test
    public void testGetRowMatrix_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix(RealMatrixImpl.java:579) */
        realMatrixImpl.getRowMatrix(1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRowMatrix(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRowMatrix(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrix_ThrowMatrixIndexException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getRowMatrix(-1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRowMatrix(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrix_ThrowMatrixIndexException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getRowMatrix(0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRowMatrix(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrix_ThrowMatrixIndexException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getRowMatrix(1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getRowMatrix(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRowMatrix(int)}
     */
    @Test
    public void testGetRowMatrixThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(RealMatrixImpl.java:1173)
            org.apache.commons.math.linear.RealMatrixImpl.getRowMatrix(RealMatrixImpl.java:574) */
        realMatrixImpl.getRowMatrix(-2147483647);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSubMatrix(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): False}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.executesCondition {@code (endColumn > data[0].length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startRow; i <= endRow; i++)} once
 * @utbot.returnsFrom {@code return new RealMatrixImpl(subMatrixData, false);}
 *  */
    @Test
    public void testGetSubMatrix_EndColumnLessOrEqualData0Length() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {0.0, 0.0};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getSubMatrix(1, 1, 0, 1));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray2 = {0.0, 0.0};
        data1[0] = doubleArray2;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSubMatrix(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        realMatrixImpl.getSubMatrix(0, -1, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        realMatrixImpl.getSubMatrix(-1, -255, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): False}
 * @utbot.executesCondition {@code (endRow > data.length): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        realMatrixImpl.data = data;
        
        realMatrixImpl.getSubMatrix(14, 139, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): False}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        realMatrixImpl.getSubMatrix(0, 0, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): False}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_4() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        realMatrixImpl.getSubMatrix(0, 0, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): False}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.executesCondition {@code (endColumn > data[0].length): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_5() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getSubMatrix(1, 1, 14, 139);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSubMatrix(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test
    public void testGetSubMatrix_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(RealMatrixImpl.java:451) */
        realMatrixImpl.getSubMatrix(0, 0, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.executesCondition {@code (endColumn > data[0].length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startRow; i <= endRow; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(data[i], startColumn, subMatrixData[i - startRow], 0, endColumn - startColumn + 1);
 *  */
    @Test
    public void testGetSubMatrix_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(RealMatrixImpl.java:460) */
        realMatrixImpl.getSubMatrix(1, 1, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.executesCondition {@code (endColumn > data[0].length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startRow; i <= endRow; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(data[i], startColumn, subMatrixData[i - startRow], 0, endColumn - startColumn + 1);
 *  */
    @Test
    public void testGetSubMatrix_ThrowArrayIndexOutOfBoundsException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 3 out of bounds for double[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(RealMatrixImpl.java:460) */
        realMatrixImpl.getSubMatrix(1, 1, 2, 2);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test
    public void testGetSubMatrix_ThrowNullPointerException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        data[0] = ((double[]) null);
        double[] doubleArray = {};
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(RealMatrixImpl.java:451) */
        realMatrixImpl.getSubMatrix(1, 1, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.executesCondition {@code (endColumn > data[0].length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startRow; i <= endRow; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(data[i], startColumn, subMatrixData[i - startRow], 0, endColumn - startColumn + 1);
 *  */
    @Test
    public void testGetSubMatrix_ThrowNullPointerException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(RealMatrixImpl.java:460) */
        realMatrixImpl.getSubMatrix(1, 1, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test
    public void testGetSubMatrix_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(RealMatrixImpl.java:451) */
        realMatrixImpl.getSubMatrix(0, 0, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSubMatrix([I, [I)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.executesCondition {@code (selectedRows.length * selectedColumns.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < selectedRows.length; i++)} once
 * @utbot.returnsFrom {@code return new RealMatrixImpl(subMatrixData, false);}
 *  */
    @Test
    public void testGetSubMatrix_SelectedRowsLengthMultiplySelectedColumnsLengthNotEqualsZero() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        data[0] = ((double[]) null);
        double[] doubleArray = {0.0, 0.0};
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        int[] intArray = {1};
        int[] intArray1 = {1};
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getSubMatrix(intArray, intArray1));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[] finalRealMatrixImplData0 = realMatrixImpl.data[0];
        
        assertNull(finalRealMatrixImplData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSubMatrix([I, [I)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: selectedRows.length * selectedColumns.length == 0
 *  */
    @Test
    public void testGetSubMatrix_ThrowNullPointerException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(RealMatrixImpl.java:480) */
        realMatrixImpl.getSubMatrix(intArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: selectedRows.length * selectedColumns.length == 0
 *  */
    @Test
    public void testGetSubMatrix_ThrowNullPointerException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(RealMatrixImpl.java:480) */
        realMatrixImpl.getSubMatrix(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSubMatrix([I, [I)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.executesCondition {@code (selectedRows.length * selectedColumns.length == 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: selectedRows.length * selectedColumns.length == 0
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        int[] intArray = {};
        int[] intArray1 = {-255, -255};
        
        realMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.executesCondition {@code (selectedRows.length * selectedColumns.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < selectedRows.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double[] dataSelectedI = data[selectedRows[i]];
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        int[] intArray = {-256};
        int[] intArray1 = {-255};
        
        realMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.executesCondition {@code (selectedRows.length * selectedColumns.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < selectedRows.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: subI[j] = dataSelectedI[selectedColumns[j]];
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_21() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        data[0] = ((double[]) null);
        double[] doubleArray = {0.0, 0.0};
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        int[] intArray = {1};
        int[] intArray1 = {17};
        
        realMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.executesCondition {@code (selectedRows.length * selectedColumns.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < selectedRows.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: subI[j] = dataSelectedI[selectedColumns[j]];
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_31() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        data[0] = ((double[]) null);
        double[] doubleArray = {0.0, 0.0};
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        int[] intArray = {1};
        int[] intArray1 = {1, 65};
        
        realMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSubMatrix([I, [I)
    
    @Test
    public void testGetSubMatrix1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
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
        realMatrixImpl.data = data;
        int[] intArray = {0, 0, 0, 0};
        int[] intArray1 = {0, 0};
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getSubMatrix(intArray, intArray1));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[4][];
        double[] doubleArray1 = {0.0, 0.0};
        data1[0] = doubleArray1;
        double[] doubleArray2 = {0.0, 0.0};
        data1[1] = doubleArray2;
        double[] doubleArray3 = {0.0, 0.0};
        data1[2] = doubleArray3;
        double[] doubleArray4 = {0.0, 0.0};
        data1[3] = doubleArray4;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[] finalRealMatrixImplData1 = realMatrixImpl.data[1];
        double[] finalRealMatrixImplData2 = realMatrixImpl.data[2];
        double[] finalRealMatrixImplData3 = realMatrixImpl.data[3];
        double[] finalRealMatrixImplData4 = realMatrixImpl.data[4];
        double[] finalRealMatrixImplData5 = realMatrixImpl.data[5];
        double[] finalRealMatrixImplData6 = realMatrixImpl.data[6];
        double[] finalRealMatrixImplData7 = realMatrixImpl.data[7];
        double[] finalRealMatrixImplData8 = realMatrixImpl.data[8];
        
        assertNull(finalRealMatrixImplData1);
        
        assertNull(finalRealMatrixImplData2);
        
        assertNull(finalRealMatrixImplData3);
        
        assertNull(finalRealMatrixImplData4);
        
        assertNull(finalRealMatrixImplData5);
        
        assertNull(finalRealMatrixImplData6);
        
        assertNull(finalRealMatrixImplData7);
        
        assertNull(finalRealMatrixImplData8);
    }
    
    @Test
    public void testGetSubMatrix2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
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
        realMatrixImpl.data = data;
        int[] intArray = {0, 0, 0};
        int[] intArray1 = {0, 0, 0, 0};
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getSubMatrix(intArray, intArray1));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[3][];
        double[] doubleArray1 = {0.0, 0.0, 0.0, 0.0};
        data1[0] = doubleArray1;
        double[] doubleArray2 = {0.0, 0.0, 0.0, 0.0};
        data1[1] = doubleArray2;
        double[] doubleArray3 = {0.0, 0.0, 0.0, 0.0};
        data1[2] = doubleArray3;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[] finalRealMatrixImplData1 = realMatrixImpl.data[1];
        double[] finalRealMatrixImplData2 = realMatrixImpl.data[2];
        double[] finalRealMatrixImplData3 = realMatrixImpl.data[3];
        double[] finalRealMatrixImplData4 = realMatrixImpl.data[4];
        double[] finalRealMatrixImplData5 = realMatrixImpl.data[5];
        double[] finalRealMatrixImplData6 = realMatrixImpl.data[6];
        double[] finalRealMatrixImplData7 = realMatrixImpl.data[7];
        double[] finalRealMatrixImplData8 = realMatrixImpl.data[8];
        
        assertNull(finalRealMatrixImplData1);
        
        assertNull(finalRealMatrixImplData2);
        
        assertNull(finalRealMatrixImplData3);
        
        assertNull(finalRealMatrixImplData4);
        
        assertNull(finalRealMatrixImplData5);
        
        assertNull(finalRealMatrixImplData6);
        
        assertNull(finalRealMatrixImplData7);
        
        assertNull(finalRealMatrixImplData8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSubMatrix([I, [I)
    
    @Test
    public void testGetSubMatrix3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        int[] intArray = new int[14];
        int[] intArray1 = {0};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(RealMatrixImpl.java:489) */
        realMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    
    @Test
    public void testGetSubMatrix4() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[11][];
        data[0] = ((double[]) null);
        data[1] = ((double[]) null);
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[2] = doubleArray;
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        data[7] = ((double[]) null);
        data[8] = ((double[]) null);
        data[9] = ((double[]) null);
        data[10] = ((double[]) null);
        realMatrixImpl.data = data;
        int[] intArray = {2, 0, 3};
        int[] intArray1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getSubMatrix(RealMatrixImpl.java:491) */
        realMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSubMatrix([I, [I)
    
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix5() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
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
        realMatrixImpl.data = data;
        int[] intArray = {0, -2147483643};
        int[] intArray1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        
        realMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getColumnMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnMatrix(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnMatrix(int)}
 * @utbot.executesCondition {@code (!isValidCoordinate(0, column)): False}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 *  */
    @Test
    public void testGetColumnMatrix_IsValidCoordinate() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = new double[32];
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getColumnMatrix(2));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnMatrix(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnMatrix(int)}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isValidCoordinate(0, column)
 *  */
    @Test
    public void testGetColumnMatrix_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getColumnMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(RealMatrixImpl.java:1174)
            org.apache.commons.math.linear.RealMatrixImpl.getColumnMatrix(RealMatrixImpl.java:592) */
        realMatrixImpl.getColumnMatrix(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getColumnMatrix(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnMatrix(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(0, column)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrix_ThrowMatrixIndexException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getColumnMatrix(-1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnMatrix(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(0, column)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrix_ThrowMatrixIndexException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getColumnMatrix(0);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getColumnMatrix(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnMatrix(int)}
     */
    @Test
    public void testGetColumnMatrixThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getColumnMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(RealMatrixImpl.java:1173)
            org.apache.commons.math.linear.RealMatrixImpl.getColumnMatrix(RealMatrixImpl.java:592) */
        realMatrixImpl.getColumnMatrix(-2147483647);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getNorm
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNorm()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getNorm()}
 * @utbot.returnsFrom {@code return maxColSum;}
 *  */
    @Test
    public void testGetNorm_ReturnMaxColSum() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        double actual = realMatrixImpl.getNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getNorm()}
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < this.getColumnDimension(); col++)} once
 * @utbot.returnsFrom {@code return maxColSum;}
 *  */
    @Test
    public void testGetNorm_MathMax() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        double actual = realMatrixImpl.getNorm();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNorm()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getNorm()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: for(int col = 0; col < this.getColumnDimension(); col++)
 *  */
    @Test
    public void testGetNorm_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getNorm] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.getNorm(RealMatrixImpl.java:426) */
        realMatrixImpl.getNorm();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getNorm()}
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < this.getColumnDimension(); col++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += Math.abs(data[row][col]);
 *  */
    @Test
    public void testGetNorm_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {-0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getNorm] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getNorm(RealMatrixImpl.java:429) */
        realMatrixImpl.getNorm();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getNorm()}
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < this.getColumnDimension(); col++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sum += Math.abs(data[row][col]);
 *  */
    @Test
    public void testGetNorm_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {-0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getNorm] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getNorm(RealMatrixImpl.java:429) */
        realMatrixImpl.getNorm();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getNorm()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getNorm()}
     */
    @Test
    public void testGetNormThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getNorm] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.getNorm(RealMatrixImpl.java:426) */
        realMatrixImpl.getNorm();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getDataRef
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataRef()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getDataRef()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetDataRef_ReturnData() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.data = null;
        
        double[][] actual = realMatrixImpl.getDataRef();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.scalarMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method scalarMultiply(double)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#scalarMultiply(double)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.returnsFrom {@code return new RealMatrixImpl(outData, false);}
 *  */
    @Test
    public void testScalarMultiply_RealMatrixImplGetColumnDimension() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.scalarMultiply(java.lang.Double.NaN));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {java.lang.Double.NaN};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scalarMultiply(double)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#scalarMultiply(double)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int columnCount = getColumnDimension();
 *  */
    @Test
    public void testScalarMultiply_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.scalarMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.scalarMultiply(RealMatrixImpl.java:313) */
        realMatrixImpl.scalarMultiply(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method scalarMultiply(double)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#scalarMultiply(double)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testScalarMultiply_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.scalarMultiply(java.lang.Double.NaN);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method scalarMultiply(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#scalarMultiply(double)}
     */
    @Test
    public void testScalarMultiplyThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.scalarMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.scalarMultiply(RealMatrixImpl.java:312) */
        realMatrixImpl.scalarMultiply(2.0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.inverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inverse()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.returnsFrom {@code return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));}
 *  */
    @Test
    public void testInverse_ReturnSolve() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = new double[1][];
        lu[0] = doubleArray;
        realMatrixImpl.lu = lu;
        int[] permutation = {0};
        realMatrixImpl.permutation = permutation;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.inverse());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.returnsFrom {@code return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));}
 *  */
    @Test
    public void testInverse_ReturnSolve_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = new double[2][];
        lu[0] = doubleArray;
        lu[1] = doubleArray;
        realMatrixImpl.lu = lu;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.inverse());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {java.lang.Double.NaN, java.lang.Double.NaN};
        data1[0] = doubleArray1;
        double[] doubleArray2 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN};
        data1[1] = doubleArray2;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[] finalRealMatrixImplData1 = realMatrixImpl.data[1];
        
        assertNull(finalRealMatrixImplData1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.returnsFrom {@code return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));}
 *  */
    @Test
    public void testInverse_ReturnSolve_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {1.0E-11};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = -255;
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.inverse());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {1.0E11};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inverse()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test
    public void testInverse_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        int[] permutation = {};
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:869)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test
    public void testInverse_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = {};
        realMatrixImpl.lu = lu;
        int[] permutation = {0};
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:887)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test
    public void testInverse_ThrowArrayIndexOutOfBoundsException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = new double[1][];
        double[] doubleArray1 = {};
        lu[0] = doubleArray1;
        realMatrixImpl.lu = lu;
        int[] permutation = {0};
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:887)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test
    public void testInverse_ThrowArrayIndexOutOfBoundsException_3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = {};
        realMatrixImpl.lu = lu;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:877)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test
    public void testInverse_ThrowArrayIndexOutOfBoundsException_4() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = new double[2][];
        lu[0] = ((double[]) null);
        double[] doubleArray1 = {};
        lu[1] = doubleArray1;
        realMatrixImpl.lu = lu;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:879)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test
    public void testInverse_ThrowArrayIndexOutOfBoundsException_5() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = new double[2][];
        lu[0] = ((double[]) null);
        double[] doubleArray1 = {0.0};
        lu[1] = doubleArray1;
        realMatrixImpl.lu = lu;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:887)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test
    public void testInverse_ThrowArrayIndexOutOfBoundsException_6() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = new double[2][];
        double[] doubleArray1 = {0.0};
        lu[0] = doubleArray1;
        lu[1] = doubleArray;
        realMatrixImpl.lu = lu;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:895)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testInverse_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:856)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inverse()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInverse_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testInverse_ThrowInvalidMatrixException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testInverse_ThrowInvalidMatrixException_3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testInverse_ThrowMatrixIndexException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        int[] permutation = {1073741824};
        realMatrixImpl.permutation = permutation;
        
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testInverse_ThrowInvalidMatrixException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {4.9E-324};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = -255;
        
        realMatrixImpl.inverse();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} in: return solve(MatrixUtils.createRealIdentityMatrix(getRowDimension()));
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testInverse_ThrowInvalidMatrixException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = -255;
        
        realMatrixImpl.inverse();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method inverse()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#inverse()}
     */
    @Test
    public void testInverseThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method inverse()
    
    @Test
    public void testInverse1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {java.lang.Double.NaN, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = 0;
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.inverse());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray2 = {java.lang.Double.NaN, java.lang.Double.NaN};
        data1[0] = doubleArray2;
        double[] doubleArray3 = {java.lang.Double.NaN, java.lang.Double.NaN};
        data1[1] = doubleArray3;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inverse()
    
    @Test
    public void testInverse2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {1.0E-11, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = new double[32];
        doubleArray1[0] = -1.358077306218E-312;
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        realMatrixImpl.permutation = permutation;
        realMatrixImpl.parity = 0;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 32 out of bounds for double[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:856)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    
    @Test
    public void testInverse3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {
            null,
            null,
            null,
            null,
            null,
            null
        };
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isSquare(RealMatrixImpl.java:720)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:853)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    
    @Test
    public void testInverse4() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[3][];
        double[] doubleArray = {0.0, 0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        realMatrixImpl.lu = lu;
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.inverse] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:879)
            org.apache.commons.math.linear.RealMatrixImpl.inverse(RealMatrixImpl.java:694) */
        realMatrixImpl.inverse();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inverse()
    
    @Test(expected = InvalidMatrixException.class)
    public void testInverse5() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {-1.0E-11, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {-4.507940274025741E-308};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        realMatrixImpl.permutation = permutation;
        realMatrixImpl.parity = 0;
        
        realMatrixImpl.inverse();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getTrace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTrace()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getTrace()}
 * @utbot.returnsFrom {@code return trace;}
 *  */
    @Test
    public void testGetTrace_ReturnTrace() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        double actual = realMatrixImpl.getTrace();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getTrace()}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < this.getRowDimension(); i++)} once
 * @utbot.returnsFrom {@code return trace;}
 *  */
    @Test
    public void testGetTrace_IterateForLoop() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        
        double actual = realMatrixImpl.getTrace();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTrace()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getTrace()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isSquare()
 *  */
    @Test
    public void testGetTrace_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getTrace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isSquare(RealMatrixImpl.java:720)
            org.apache.commons.math.linear.RealMatrixImpl.getTrace(RealMatrixImpl.java:758) */
        realMatrixImpl.getTrace();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getTrace()}
 * @utbot.executesCondition {@code (!isSquare()): False}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < this.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: trace += data[i][i];
 *  */
    @Test
    public void testGetTrace_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getTrace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getTrace(RealMatrixImpl.java:763) */
        realMatrixImpl.getTrace();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getTrace()}
 * @utbot.executesCondition {@code (!isSquare()): False}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < this.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: trace += data[i][i];
 *  */
    @Test
    public void testGetTrace_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getTrace] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getTrace(RealMatrixImpl.java:763) */
        realMatrixImpl.getTrace();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTrace()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getTrace()}
 * @utbot.executesCondition {@code (!isSquare()): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#isSquare()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isSquare()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTrace_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        realMatrixImpl.getTrace();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getTrace()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getTrace()}
     */
    @Test
    public void testGetTraceThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getTrace] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isSquare(RealMatrixImpl.java:720)
            org.apache.commons.math.linear.RealMatrixImpl.getTrace(RealMatrixImpl.java:758) */
        realMatrixImpl.getTrace();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.luDecompose
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method luDecompose()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#luDecompose()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = this.getColumnDimension();
 *  */
    @Test
    public void testLuDecompose_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.luDecompose] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:925) */
        realMatrixImpl.luDecompose();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#luDecompose()}
 * @utbot.executesCondition {@code (nRows != nCols): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lu = getData();
 *  */
    @Test
    public void testLuDecompose_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.luDecompose] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929) */
        realMatrixImpl.luDecompose();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method luDecompose()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#luDecompose()}
 * @utbot.executesCondition {@code (nRows != nCols): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} when: nRows != nCols
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testLuDecompose_ThrowInvalidMatrixException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.luDecompose();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method luDecompose()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#luDecompose()}
     */
    @Test
    public void testLuDecomposeThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.luDecompose] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:924) */
        realMatrixImpl.luDecompose();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method luDecompose()
    
    @Test
    public void testLuDecompose1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {java.lang.Double.NaN, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {-1.0E-11, 0.0};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        realMatrixImpl.permutation = permutation;
        realMatrixImpl.parity = 0;
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        realMatrixImpl.luDecompose();
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(-1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method luDecompose()
    
    @Test
    public void testLuDecompose2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[4][];
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        double[] doubleArray2 = {};
        data[2] = doubleArray2;
        data[3] = doubleArray2;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.luDecompose] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[4]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929) */
        realMatrixImpl.luDecompose();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method luDecompose()
    
    @Test(expected = InvalidMatrixException.class)
    public void testLuDecompose3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {-2.0000000000000004, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        double[][] lu = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        realMatrixImpl.lu = lu;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = 0;
        
        realMatrixImpl.luDecompose();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getLUMatrix()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): False}
 * @utbot.returnsFrom {@code return new RealMatrixImpl(lu);}
 *  */
    @Test
    public void testGetLUMatrix_LuNotEqualsNull() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] lu = new double[1][];
        double[] doubleArray = {0.0};
        lu[0] = doubleArray;
        realMatrixImpl.lu = lu;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getLUMatrix());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data = new double[1][];
        data[0] = doubleArray;
        expected.data = data;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLUMatrix()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getLUMatrix()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: luDecompose();
 *  */
    @Test
    public void testGetLUMatrix_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:925)
            org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix(RealMatrixImpl.java:1111) */
        realMatrixImpl.getLUMatrix();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getLUMatrix()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: luDecompose();
 *  */
    @Test
    public void testGetLUMatrix_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix(RealMatrixImpl.java:1111) */
        realMatrixImpl.getLUMatrix();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLUMatrix()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(lu);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLUMatrix_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] lu = {};
        realMatrixImpl.lu = lu;
        
        realMatrixImpl.getLUMatrix();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(lu);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLUMatrix_ThrowIllegalArgumentException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] lu = new double[1][];
        double[] doubleArray = {};
        lu[0] = doubleArray;
        realMatrixImpl.lu = lu;
        
        realMatrixImpl.getLUMatrix();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(lu);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLUMatrix_ThrowIllegalArgumentException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] lu = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        lu[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        lu[1] = doubleArray1;
        realMatrixImpl.lu = lu;
        
        realMatrixImpl.getLUMatrix();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(lu);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLUMatrix_ThrowIllegalArgumentException_3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] lu = new double[11][];
        double[] doubleArray = {0.0, 0.0};
        lu[0] = doubleArray;
        lu[1] = doubleArray;
        double[] doubleArray1 = {0.0};
        lu[2] = doubleArray1;
        lu[3] = ((double[]) null);
        lu[4] = ((double[]) null);
        lu[5] = ((double[]) null);
        lu[6] = ((double[]) null);
        lu[7] = ((double[]) null);
        lu[8] = ((double[]) null);
        lu[9] = ((double[]) null);
        lu[10] = ((double[]) null);
        realMatrixImpl.lu = lu;
        
        realMatrixImpl.getLUMatrix();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#luDecompose()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} in: luDecompose();
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testGetLUMatrix_ThrowInvalidMatrixException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        realMatrixImpl.getLUMatrix();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getLUMatrix()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getLUMatrix()}
     */
    @Test
    public void testGetLUMatrixThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:924)
            org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix(RealMatrixImpl.java:1111) */
        realMatrixImpl.getLUMatrix();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getLUMatrix()
    
    @Test
    public void testGetLUMatrix1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] lu = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        lu[0] = doubleArray;
        double[] doubleArray1 = {0.0, 0.0};
        lu[1] = doubleArray1;
        realMatrixImpl.lu = lu;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getLUMatrix());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data = new double[2][];
        data[0] = doubleArray;
        data[1] = doubleArray1;
        expected.data = data;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetLUMatrix2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] lu = new double[3][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        lu[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        lu[1] = doubleArray1;
        double[] doubleArray2 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0
        };
        lu[2] = doubleArray2;
        realMatrixImpl.lu = lu;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getLUMatrix());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data = new double[3][];
        data[0] = doubleArray;
        data[1] = doubleArray1;
        data[2] = doubleArray2;
        expected.data = data;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetLUMatrix3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {java.lang.Double.NaN, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        realMatrixImpl.permutation = permutation;
        realMatrixImpl.parity = 0;
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getLUMatrix());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray2 = {java.lang.Double.NaN, 0.0};
        data1[0] = doubleArray2;
        double[] doubleArray3 = {java.lang.Double.NaN, java.lang.Double.NaN};
        data1[1] = doubleArray3;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    
    @Test
    public void testGetLUMatrix4() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {2.0000000000000004};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = 0;
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.getLUMatrix());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {2.0000000000000004};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getLUMatrix()
    
    @Test
    public void testGetLUMatrix5() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[4][];
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        double[] doubleArray2 = {};
        data[2] = doubleArray2;
        data[3] = doubleArray2;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[4]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix(RealMatrixImpl.java:1111) */
        realMatrixImpl.getLUMatrix();
    }
    
    @Test
    public void testGetLUMatrix6() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] lu = new double[11][];
        double[] doubleArray = {java.lang.Double.NaN};
        lu[0] = doubleArray;
        lu[1] = doubleArray;
        lu[2] = doubleArray;
        lu[3] = doubleArray;
        lu[4] = doubleArray;
        lu[5] = doubleArray;
        lu[6] = doubleArray;
        lu[7] = doubleArray;
        lu[8] = doubleArray;
        lu[9] = doubleArray;
        lu[10] = ((double[]) null);
        realMatrixImpl.lu = lu;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.setSubMatrix(RealMatrixImpl.java:544)
            org.apache.commons.math.linear.RealMatrixImpl.copyIn(RealMatrixImpl.java:1162)
            org.apache.commons.math.linear.RealMatrixImpl.<init>(RealMatrixImpl.java:111)
            org.apache.commons.math.linear.RealMatrixImpl.getLUMatrix(RealMatrixImpl.java:1113) */
        realMatrixImpl.getLUMatrix();
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLUMatrix()
    
    @Test(expected = InvalidMatrixException.class)
    public void testGetLUMatrix7() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {4.9E-324, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        realMatrixImpl.permutation = permutation;
        realMatrixImpl.parity = 0;
        
        realMatrixImpl.getLUMatrix();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.operate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method operate([D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#operate(double[])}
 * @utbot.executesCondition {@code (v.length != nCols): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testOperate_VLengthEqualsNCols() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[] doubleArray1 = {0.0};
        
        double[] actual = realMatrixImpl.operate(doubleArray1);
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method operate([D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#operate(double[])}
 * @utbot.executesCondition {@code (v.length != nCols): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[row] = sum;
 *  */
    @Test
    public void testOperate_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.operate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.operate(RealMatrixImpl.java:786) */
        realMatrixImpl.operate(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#operate(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = this.getColumnDimension();
 *  */
    @Test
    public void testOperate_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.operate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.operate(RealMatrixImpl.java:775) */
        realMatrixImpl.operate(null);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#operate(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: v.length != nCols
 *  */
    @Test
    public void testOperate_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.operate] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.operate(RealMatrixImpl.java:776) */
        realMatrixImpl.operate(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method operate([D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#operate(double[])}
 * @utbot.executesCondition {@code (v.length != nCols): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: v.length != nCols
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testOperate_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[] doubleArray1 = {0.0, 0.0};
        
        realMatrixImpl.operate(doubleArray1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method operate([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#operate(double[])}
     */
    @Test
    public void testOperateThrowsNPEWithNonEmptyPrimitiveArray() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[] doubleArray = {1.0, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.operate] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.operate(RealMatrixImpl.java:774) */
        realMatrixImpl.operate(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnDimension()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.returnsFrom {@code return data[0].length;}
 *  */
    @Test
    public void testGetColumnDimension_ReturnData0Length() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        int actual = realMatrixImpl.getColumnDimension();
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnDimension()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return data[0].length;
 *  */
    @Test
    public void testGetColumnDimension_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750) */
        realMatrixImpl.getColumnDimension();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data[0].length;
 *  */
    @Test
    public void testGetColumnDimension_ThrowNullPointerException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750) */
        realMatrixImpl.getColumnDimension();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data[0].length;
 *  */
    @Test
    public void testGetColumnDimension_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750) */
        realMatrixImpl.getColumnDimension();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getPermutation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPermutation()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getPermutation()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetPermutation_SystemArraycopy() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        int[] permutation = {};
        realMatrixImpl.permutation = permutation;
        
        int[] actual = realMatrixImpl.getPermutation();
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPermutation()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getPermutation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int[] out = new int[permutation.length];
 *  */
    @Test
    public void testGetPermutation_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.permutation = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getPermutation] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getPermutation(RealMatrixImpl.java:1129) */
        realMatrixImpl.getPermutation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.copyOut
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyOut()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyOut()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testCopyOut_SystemArraycopy() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Method copyOutMethod = realMatrixImplClazz.getDeclaredMethod("copyOut");
        copyOutMethod.setAccessible(true);
        java.lang.Object[] copyOutMethodArguments = new java.lang.Object[0];
        double[][] actual = ((double[][]) copyOutMethod.invoke(realMatrixImpl, copyOutMethodArguments));
        
        double[][] expected = new double[1][];
        double[] doubleArray1 = {};
        expected[0] = doubleArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyOut()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyOut()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] out = new double[nRows][this.getColumnDimension()];
 *  */
    @Test
    public void testCopyOut_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.copyOut] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1143) */
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Method copyOutMethod = realMatrixImplClazz.getDeclaredMethod("copyOut");
        copyOutMethod.setAccessible(true);
        java.lang.Object[] copyOutMethodArguments = new java.lang.Object[0];
        try {
            copyOutMethod.invoke(realMatrixImpl, copyOutMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method copyOut()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyOut()}
     */
    @Test
    public void testCopyOutThrowsNPE() throws Throwable  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.copyOut] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1142) */
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Method copyOutMethod = realMatrixImplClazz.getDeclaredMethod("copyOut");
        copyOutMethod.setAccessible(true);
        java.lang.Object[] copyOutMethodArguments = new java.lang.Object[0];
        try {
            copyOutMethod.invoke(realMatrixImpl, copyOutMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.isSquare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSquare()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isSquare()}
 * @utbot.returnsFrom {@code return (this.getColumnDimension() == this.getRowDimension());}
 *  */
    @Test
    public void testIsSquare_ThisGetColumnDimensionEqualsThisGetRowDimension() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        boolean actual = realMatrixImpl.isSquare();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isSquare()}
 * @utbot.returnsFrom {@code return (this.getColumnDimension() == this.getRowDimension());}
 *  */
    @Test
    public void testIsSquare_ThisGetColumnDimensionNotEqualsThisGetRowDimension() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        boolean actual = realMatrixImpl.isSquare();
        
        assertFalse(actual);
        
        double[] finalRealMatrixImplData1 = realMatrixImpl.data[1];
        
        assertNull(finalRealMatrixImplData1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSquare()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isSquare()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (this.getColumnDimension() == this.getRowDimension());
 *  */
    @Test
    public void testIsSquare_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.isSquare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isSquare(RealMatrixImpl.java:720) */
        realMatrixImpl.isSquare();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isSquare()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isSquare()}
     */
    @Test
    public void testIsSquareThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.isSquare] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isSquare(RealMatrixImpl.java:720) */
        realMatrixImpl.isSquare();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.copyIn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyIn([[D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyIn(double[][])}
 *  */
    @Test
    public void testCopyIn() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        double[][] doubleArray1 = new double[1][];
        doubleArray1[0] = doubleArray;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class doubleArray1Type = Class.forName("[[D");
        Method copyInMethod = realMatrixImplClazz.getDeclaredMethod("copyIn", doubleArray1Type);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray1);
        copyInMethod.invoke(realMatrixImpl, copyInMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyIn(double[][])}
 *  */
    @Test
    public void testCopyIn_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.data = null;
        realMatrixImpl.lu = null;
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        
        double[][] initialRealMatrixImplData = realMatrixImpl.data;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = realMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        copyInMethod.invoke(realMatrixImpl, copyInMethodArguments);
        
        double[][] finalRealMatrixImplData = realMatrixImpl.data;
        
        assertFalse(initialRealMatrixImplData == finalRealMatrixImplData);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copyIn([[D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyIn(double[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCopyIn_ThrowIllegalArgumentException() throws Throwable  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] doubleArray = {};
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = realMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        try {
            copyInMethod.invoke(realMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyIn(double[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCopyIn_ThrowIllegalArgumentException_1() throws Throwable  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {};
        doubleArray[0] = doubleArray1;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = realMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        try {
            copyInMethod.invoke(realMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyIn(double[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCopyIn_ThrowIllegalArgumentException_2() throws Throwable  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] doubleArray = new double[2][];
        double[] doubleArray1 = {0.0, 0.0};
        doubleArray[0] = doubleArray1;
        double[] doubleArray2 = {0.0};
        doubleArray[1] = doubleArray2;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = realMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        try {
            copyInMethod.invoke(realMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyIn(double[][])}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testCopyIn_ThrowMatrixIndexException() throws Throwable  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = realMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        try {
            copyInMethod.invoke(realMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyIn(double[][])}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testCopyIn_ThrowMatrixIndexException_1() throws Throwable  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        double[][] doubleArray = new double[2][];
        double[] doubleArray1 = {0.0};
        doubleArray[0] = doubleArray1;
        doubleArray[1] = doubleArray1;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = realMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        try {
            copyInMethod.invoke(realMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyIn(double[][])}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testCopyIn_ThrowMatrixIndexException_2() throws Throwable  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0, 0.0};
        doubleArray1[0] = doubleArray2;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class doubleArray1Type = Class.forName("[[D");
        Method copyInMethod = realMatrixImplClazz.getDeclaredMethod("copyIn", doubleArray1Type);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray1);
        try {
            copyInMethod.invoke(realMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method copyIn([[D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copyIn(double[][])}
     */
    @Test
    public void testCopyInWithNonEmptyObjectArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] doubleArray = new double[3][];
        double[] doubleArray1 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        doubleArray[0] = doubleArray1;
        double[] doubleArray2 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN, 1.0};
        doubleArray[1] = doubleArray2;
        double[] doubleArray3 = {0.0, java.lang.Double.NEGATIVE_INFINITY, 1.0};
        doubleArray[2] = doubleArray3;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = realMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        copyInMethod.invoke(realMatrixImpl, copyInMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.transpose
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transpose()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#transpose()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return new RealMatrixImpl(outData, false);}
 *  */
    @Test
    public void testTranspose_RealMatrixImplGetColumnDimension() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.transpose());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transpose()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#transpose()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = getColumnDimension();
 *  */
    @Test
    public void testTranspose_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.transpose] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.transpose(RealMatrixImpl.java:676) */
        realMatrixImpl.transpose();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transpose()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#transpose()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTranspose_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.transpose();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method transpose()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#transpose()}
     */
    @Test
    public void testTransposeThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.transpose] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.transpose(RealMatrixImpl.java:675) */
        realMatrixImpl.transpose();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.solve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solve([D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} twice
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testSolve_IterateForLoop_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        double[] doubleArray1 = {0.0, 0.0};
        
        double[] actual = realMatrixImpl.solve(doubleArray1);
        
        double[] expected = {java.lang.Double.NaN, java.lang.Double.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testSolve_IterateForLoop() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = new double[1][];
        lu[0] = doubleArray;
        realMatrixImpl.lu = lu;
        int[] permutation = {0};
        realMatrixImpl.permutation = permutation;
        double[] doubleArray1 = {0.0};
        
        double[] actual = realMatrixImpl.solve(doubleArray1);
        
        double[] expected = {java.lang.Double.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testSolve_IterateForLoop_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {1.0E-11};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = -255;
        double[] doubleArray1 = {4.9E-324};
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        double[] actual = realMatrixImpl.solve(doubleArray1);
        
        double[] expected = {4.9406564584E-313};
        
        assertArrayEquals(expected, actual, 1.0E-6);
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve([D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isSquare(RealMatrixImpl.java:720)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:853)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:830) */
        realMatrixImpl.solve(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] solution = ((RealMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        int[] permutation = {};
        realMatrixImpl.permutation = permutation;
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:869)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:830) */
        realMatrixImpl.solve(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] solution = ((RealMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_5() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        double[] doubleArray2 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:879)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:830) */
        realMatrixImpl.solve(doubleArray2);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] solution = ((RealMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = {};
        realMatrixImpl.lu = lu;
        int[] permutation = {0};
        realMatrixImpl.permutation = permutation;
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:887)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:830) */
        realMatrixImpl.solve(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] solution = ((RealMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = new double[1][];
        double[] doubleArray1 = {};
        lu[0] = doubleArray1;
        realMatrixImpl.lu = lu;
        int[] permutation = {0};
        realMatrixImpl.permutation = permutation;
        double[] doubleArray2 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:887)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:830) */
        realMatrixImpl.solve(doubleArray2);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] solution = ((RealMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_4() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {0.0, 0.0};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        double[][] lu = {};
        realMatrixImpl.lu = lu;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:877)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:830) */
        realMatrixImpl.solve(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[][] solution = ((RealMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_6() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {0.0, 0.0};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        double[][] lu = new double[2][];
        double[] doubleArray2 = {0.0};
        lu[0] = doubleArray2;
        lu[1] = doubleArray;
        realMatrixImpl.lu = lu;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:895)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:830) */
        realMatrixImpl.solve(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: b.length != nRows
 *  */
    @Test
    public void testSolve_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:826) */
        realMatrixImpl.solve(((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testSolve_ThrowNullPointerException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:856)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:830) */
        realMatrixImpl.solve(doubleArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve([D)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: b.length != nRows
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        double[] doubleArray = {0.0, 0.0};
        
        realMatrixImpl.solve(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} in: final double[][] solution = ((RealMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testSolve_ThrowInvalidMatrixException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[] doubleArray1 = {0.0};
        
        realMatrixImpl.solve(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final double[][] solution = ((RealMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSolve_ThrowMatrixIndexException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        int[] permutation = {2};
        realMatrixImpl.permutation = permutation;
        double[] doubleArray1 = {0.0};
        
        realMatrixImpl.solve(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} in: final double[][] solution = ((RealMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testSolve_ThrowInvalidMatrixException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {4.9E-324};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = -255;
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        realMatrixImpl.solve(doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} in: final double[][] solution = ((RealMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testSolve_ThrowInvalidMatrixException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = -255;
        double[] doubleArray1 = {0.0};
        
        realMatrixImpl.solve(doubleArray1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method solve([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(double[])}
     */
    @Test
    public void testSolveThrowsNPEWithNonEmptyPrimitiveArray() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:825) */
        realMatrixImpl.solve(doubleArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve([D)
    
    @Test
    public void testSolve1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {java.lang.Double.NaN, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        realMatrixImpl.permutation = permutation;
        realMatrixImpl.parity = 0;
        double[] doubleArray2 = {6.47582E-319, java.lang.Double.NaN};
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        double[] actual = realMatrixImpl.solve(doubleArray2);
        
        double[] expected = {java.lang.Double.NaN, java.lang.Double.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6);
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method solve([D)
    
    @Test
    public void testSolve2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {-3.3376107877608026E-308, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            -3.078402600973782E-289, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        realMatrixImpl.permutation = permutation;
        realMatrixImpl.parity = 0;
        double[] doubleArray2 = {java.lang.Double.NaN, java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:856)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:830) */
        realMatrixImpl.solve(doubleArray2);
    }
    
    @Test
    public void testSolve3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {
            null,
            null,
            null,
            null
        };
        realMatrixImpl.data = data;
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isSquare(RealMatrixImpl.java:720)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:853)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:830) */
        realMatrixImpl.solve(doubleArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve([D)
    
    @Test(expected = InvalidMatrixException.class)
    public void testSolve4() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {-3.0000152587890625, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {-3.78576699573368E-270};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = 0;
        double[] doubleArray2 = {java.lang.Double.NaN, 1.390671161567E-309};
        
        realMatrixImpl.solve(doubleArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.solve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method solve(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#isSquare()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#isSingular()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} twice
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.returnsFrom {@code return new RealMatrixImpl(bp, false);}
 *  */
    @Test
    public void testSolve_NotThisIsSingular() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        data1[1] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.solve(realMatrixImpl1));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data2 = new double[2][];
        double[] doubleArray2 = {java.lang.Double.NaN};
        data2[0] = doubleArray2;
        double[] doubleArray3 = {java.lang.Double.NaN};
        data2[1] = doubleArray3;
        expected.data = data2;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[] finalRealMatrixImpl1Data1 = realMatrixImpl1.data[1];
        
        assertNull(finalRealMatrixImpl1Data1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !this.isSquare()
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isSquare(RealMatrixImpl.java:720)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:853) */
        realMatrixImpl.solve(realMatrixImpl);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double luDiag = lu[col][col];
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_21() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = {};
        realMatrixImpl.lu = lu;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:887) */
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} twice
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double[] luI = lu[i];
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_31() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = {null};
        realMatrixImpl.lu = lu;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {};
        data1[0] = doubleArray1;
        data1[1] = doubleArray;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:877) */
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} twice
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} twice
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} twice
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double luDiag = lu[col][col];
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_41() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = new double[2][];
        double[] doubleArray1 = {};
        lu[0] = doubleArray1;
        lu[1] = doubleArray;
        realMatrixImpl.lu = lu;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        realMatrixImpl1.data = lu;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:887) */
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bpI[j] -= bp[col][j] * luI[col];
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_51() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray2 = {0.0};
        data1[0] = doubleArray2;
        data1[1] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:879) */
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} twice
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bpI[j] -= bp[col][j] * luI[col];
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_61() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = new double[2][];
        double[] doubleArray1 = {0.0};
        lu[0] = doubleArray1;
        lu[1] = doubleArray;
        realMatrixImpl.lu = lu;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        realMatrixImpl1.data = lu;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:895) */
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bpRow[col] = b.getEntry(permutation[row], col);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        int[] permutation = {};
        realMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:869) */
        realMatrixImpl.solve(realMatrixImpl);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#getRowDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: b.getRowDimension() != this.getRowDimension()
 *  */
    @Test
    public void testSolve_ThrowNullPointerException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:850) */
        realMatrixImpl.solve(((RealMatrix) null));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double luDiag = lu[col][col];
 *  */
    @Test
    public void testSolve_ThrowNullPointerException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = {null};
        realMatrixImpl.lu = lu;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:887) */
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.isSingular()
 *  */
    @Test
    public void testSolve_ThrowNullPointerException_3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        realMatrixImpl1.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:856) */
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bpI[j] -= bp[col][j] * luI[col];
 *  */
    @Test
    public void testSolve_ThrowNullPointerException_4() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        data1[1] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:879) */
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} twice
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bpI[j] -= bp[col][j] * luI[col];
 *  */
    @Test
    public void testSolve_ThrowNullPointerException_5() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = new double[2][];
        lu[0] = ((double[]) null);
        lu[1] = doubleArray;
        realMatrixImpl.lu = lu;
        int[] permutation = {0, 0};
        realMatrixImpl.permutation = permutation;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        data1[1] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:895) */
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bpRow[col] = b.getEntry(permutation[row], col);
 *  */
    @Test
    public void testSolve_ThrowNullPointerException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        realMatrixImpl.permutation = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:869) */
        realMatrixImpl.solve(realMatrixImpl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: b.getRowDimension() != this.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = {
            null,
            null
        };
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} when: !this.isSquare()
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testSolve_ThrowInvalidMatrixException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        realMatrixImpl.solve(realMatrixImpl);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: bpRow[col] = b.getEntry(permutation[row], col);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSolve_ThrowMatrixIndexException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = {null};
        realMatrixImpl.lu = lu;
        int[] permutation = {1};
        realMatrixImpl.permutation = permutation;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        double[] doubleArray2 = {};
        data1[1] = doubleArray2;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} when: this.isSingular()
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testSolve_ThrowInvalidMatrixException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = -255;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = {null};
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.solve(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(bp, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {1.0E-11};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = -255;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.solve(realMatrixImpl1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method solve(org.apache.commons.math.linear.RealMatrix)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#solve(org.apache.commons.math.linear.RealMatrix)}
     */
    @Test
    public void testSolveThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[] doubleArray = {java.lang.Double.NaN, 0.0, java.lang.Double.NEGATIVE_INFINITY};
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray);
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:850) */
        realMatrixImpl.solve(realMatrixImpl1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method solve(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testSolve5() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {java.lang.Double.NaN};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = 0;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        data1[0] = doubleArray;
        realMatrixImpl1.data = data1;
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.solve(realMatrixImpl1));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data2 = new double[1][];
        double[] doubleArray1 = {java.lang.Double.NaN};
        data2[0] = doubleArray1;
        expected.data = data2;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    
    @Test
    public void testSolve6() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {-4.656612873077401E-10};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = 0;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = new double[34];
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.solve(realMatrixImpl1));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data2 = new double[1][];
        double[] doubleArray2 = new double[34];
        doubleArray2[0] = -0.0;
        doubleArray2[1] = -0.0;
        doubleArray2[2] = -0.0;
        doubleArray2[3] = -0.0;
        doubleArray2[4] = -0.0;
        doubleArray2[5] = -0.0;
        doubleArray2[6] = -0.0;
        doubleArray2[7] = -0.0;
        doubleArray2[8] = -0.0;
        doubleArray2[9] = -0.0;
        doubleArray2[10] = -0.0;
        doubleArray2[11] = -0.0;
        doubleArray2[12] = -0.0;
        doubleArray2[13] = -0.0;
        doubleArray2[14] = -0.0;
        doubleArray2[15] = -0.0;
        doubleArray2[16] = -0.0;
        doubleArray2[17] = -0.0;
        doubleArray2[18] = -0.0;
        doubleArray2[19] = -0.0;
        doubleArray2[20] = -0.0;
        doubleArray2[21] = -0.0;
        doubleArray2[22] = -0.0;
        doubleArray2[23] = -0.0;
        doubleArray2[24] = -0.0;
        doubleArray2[25] = -0.0;
        doubleArray2[26] = -0.0;
        doubleArray2[27] = -0.0;
        doubleArray2[28] = -0.0;
        doubleArray2[29] = -0.0;
        doubleArray2[30] = -0.0;
        doubleArray2[31] = -0.0;
        doubleArray2[32] = -0.0;
        doubleArray2[33] = -0.0;
        data2[0] = doubleArray2;
        expected.data = data2;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method solve(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testSolve7() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {2.2250738667962474E-308, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            2.0722615E-317, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = 0;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729)
            org.apache.commons.math.linear.RealMatrixImpl.solve(RealMatrixImpl.java:856) */
        realMatrixImpl.solve(realMatrixImpl);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(org.apache.commons.math.linear.RealMatrix)
    
    @Test(expected = MatrixIndexException.class)
    public void testSolve8() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[5][];
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        realMatrixImpl.data = data;
        double[][] lu = {
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null
        };
        realMatrixImpl.lu = lu;
        int[] permutation = {
            4, 29, 29, 29, 29, 29, 29, 29,
            29
        };
        realMatrixImpl.permutation = permutation;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[5][];
        double[] doubleArray1 = {0.0, 0.0};
        data1[0] = doubleArray1;
        data1[1] = ((double[]) null);
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        double[] doubleArray2 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data1[4] = doubleArray2;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.solve(realMatrixImpl1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isValidCoordinate(int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.returnsFrom {@code return !(row < 0 || row > nRows - 1 || col < 0 || col > nCols - 1);}
 *  */
    @Test
    public void testIsValidCoordinate_NotRowLessThanZeroOrRowLessOrEqualNRowsMinus1OrColLessThanZeroOrColLessOrEqualNColsMinus1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = realMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = -1;
        isValidCoordinateMethodArguments[1] = -255;
        boolean actual = ((Boolean) isValidCoordinateMethod.invoke(realMatrixImpl, isValidCoordinateMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.returnsFrom {@code return !(row < 0 || row > nRows - 1 || col < 0 || col > nCols - 1);}
 *  */
    @Test
    public void testIsValidCoordinate_NotRowGreaterOrEqualZeroOrRowGreaterThanNRowsMinus1OrColGreaterOrEqualZeroOrColGreaterThanNColsMinus1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = realMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = 1;
        isValidCoordinateMethodArguments[1] = -255;
        boolean actual = ((Boolean) isValidCoordinateMethod.invoke(realMatrixImpl, isValidCoordinateMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.returnsFrom {@code return !(row < 0 || row > nRows - 1 || col < 0 || col > nCols - 1);}
 *  */
    @Test
    public void testIsValidCoordinate_NotRowLessThanZeroOrRowLessOrEqualNRowsMinus1OrColLessThanZeroOrColLessOrEqualNColsMinus1_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = realMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = 0;
        isValidCoordinateMethodArguments[1] = -1;
        boolean actual = ((Boolean) isValidCoordinateMethod.invoke(realMatrixImpl, isValidCoordinateMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.returnsFrom {@code return !(row < 0 || row > nRows - 1 || col < 0 || col > nCols - 1);}
 *  */
    @Test
    public void testIsValidCoordinate_NotRowGreaterOrEqualZeroOrRowGreaterThanNRowsMinus1OrColGreaterOrEqualZeroOrColGreaterThanNColsMinus1_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = realMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = 0;
        isValidCoordinateMethodArguments[1] = 0;
        boolean actual = ((Boolean) isValidCoordinateMethod.invoke(realMatrixImpl, isValidCoordinateMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.returnsFrom {@code return !(row < 0 || row > nRows - 1 || col < 0 || col > nCols - 1);}
 *  */
    @Test
    public void testIsValidCoordinate_NotRowLessThanZeroOrRowLessOrEqualNRowsMinus1OrColLessThanZeroOrColLessOrEqualNColsMinus1_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = realMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = 0;
        isValidCoordinateMethodArguments[1] = 0;
        boolean actual = ((Boolean) isValidCoordinateMethod.invoke(realMatrixImpl, isValidCoordinateMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isValidCoordinate(int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = getColumnDimension();
 *  */
    @Test
    public void testIsValidCoordinate_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(RealMatrixImpl.java:1174) */
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = realMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = -255;
        isValidCoordinateMethodArguments[1] = -255;
        try {
            isValidCoordinateMethod.invoke(realMatrixImpl, isValidCoordinateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isValidCoordinate(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)}
     */
    @Test
    public void testIsValidCoordinateThrowsNPE() throws Throwable  {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(RealMatrixImpl.java:1173) */
        Class realMatrixImplClazz = Class.forName("org.apache.commons.math.linear.RealMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = realMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = 16384;
        isValidCoordinateMethodArguments[1] = -1;
        try {
            isValidCoordinateMethod.invoke(realMatrixImpl, isValidCoordinateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getRowDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowDimension()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.returnsFrom {@code return data.length;}
 *  */
    @Test
    public void testGetRowDimension_ReturnDataLength() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        
        int actual = realMatrixImpl.getRowDimension();
        
        assertEquals(1, actual);
        
        double[] finalRealMatrixImplData0 = realMatrixImpl.data[0];
        
        assertNull(finalRealMatrixImplData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowDimension()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data.length;
 *  */
    @Test
    public void testGetRowDimension_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getRowDimension] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743) */
        realMatrixImpl.getRowDimension();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRow(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRow(int)}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetRow_SystemArraycopy() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        double[] actual = realMatrixImpl.getRow(0);
        
        double[] expected = {0.0, 0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRow(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isValidCoordinate(row, 0)
 *  */
    @Test
    public void testGetRow_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(RealMatrixImpl.java:1174)
            org.apache.commons.math.linear.RealMatrixImpl.getRow(RealMatrixImpl.java:614) */
        realMatrixImpl.getRow(-255);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(data[row], 0, out, 0, ncols);
 *  */
    @Test
    public void testGetRow_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getRow] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for double[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.getRow(RealMatrixImpl.java:619) */
        realMatrixImpl.getRow(1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(data[row], 0, out, 0, ncols);
 *  */
    @Test
    public void testGetRow_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getRow] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.getRow(RealMatrixImpl.java:619) */
        realMatrixImpl.getRow(1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRow(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRow_ThrowMatrixIndexException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getRow(-1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRow_ThrowMatrixIndexException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getRow(0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRow_ThrowMatrixIndexException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getRow(1);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getRow(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getRow(int)}
     */
    @Test
    public void testGetRowThrowsNPEWithCornerCase() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getRow] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(RealMatrixImpl.java:1173)
            org.apache.commons.math.linear.RealMatrixImpl.getRow(RealMatrixImpl.java:614) */
        realMatrixImpl.getRow(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getColumn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumn(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumn(int)}
 * @utbot.executesCondition {@code (!isValidCoordinate(0, col)): False}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetColumn_IsValidCoordinate() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        double[] actual = realMatrixImpl.getColumn(0);
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumn(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumn(int)}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#isValidCoordinate(int,int)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isValidCoordinate(0, col)
 *  */
    @Test
    public void testGetColumn_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(RealMatrixImpl.java:1174)
            org.apache.commons.math.linear.RealMatrixImpl.getColumn(RealMatrixImpl.java:634) */
        realMatrixImpl.getColumn(-255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getColumn(int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumn(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(0, col)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetColumn_ThrowMatrixIndexException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getColumn(-1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumn(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(0, col)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetColumn_ThrowMatrixIndexException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getColumn(0);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getColumn(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getColumn(int)}
     */
    @Test
    public void testGetColumnThrowsNPEWithCornerCase() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getColumn] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.isValidCoordinate(RealMatrixImpl.java:1173)
            org.apache.commons.math.linear.RealMatrixImpl.getColumn(RealMatrixImpl.java:634) */
        realMatrixImpl.getColumn(Integer.MIN_VALUE);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getDeterminant
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDeterminant()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getDeterminant()}
 * @utbot.executesCondition {@code (isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.getRowDimension(); i++)} once
 * @utbot.returnsFrom {@code return det;}
 *  */
    @Test
    public void testGetDeterminant_NotIsSingular() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = data;
        realMatrixImpl.parity = -255;
        
        double actual = realMatrixImpl.getDeterminant();
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getDeterminant()}
 * @utbot.executesCondition {@code (isSingular()): True}
 * @utbot.returnsFrom {@code return 0d;}
 *  */
    @Test
    public void testGetDeterminant_IsSingular() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = 0;
        
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        double actual = realMatrixImpl.getDeterminant();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDeterminant()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getDeterminant()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isSquare()
 *  */
    @Test
    public void testGetDeterminant_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getDeterminant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isSquare(RealMatrixImpl.java:720)
            org.apache.commons.math.linear.RealMatrixImpl.getDeterminant(RealMatrixImpl.java:702) */
        realMatrixImpl.getDeterminant();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getDeterminant()}
 * @utbot.executesCondition {@code (!isSquare()): False}
 * @utbot.executesCondition {@code (isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: det *= lu[i][i];
 *  */
    @Test
    public void testGetDeterminant_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = {};
        realMatrixImpl.lu = lu;
        realMatrixImpl.parity = -255;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getDeterminant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getDeterminant(RealMatrixImpl.java:710) */
        realMatrixImpl.getDeterminant();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getDeterminant()}
 * @utbot.executesCondition {@code (!isSquare()): False}
 * @utbot.executesCondition {@code (isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: det *= lu[i][i];
 *  */
    @Test
    public void testGetDeterminant_ThrowArrayIndexOutOfBoundsException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = new double[1][];
        double[] doubleArray1 = {};
        lu[0] = doubleArray1;
        realMatrixImpl.lu = lu;
        realMatrixImpl.parity = -255;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getDeterminant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getDeterminant(RealMatrixImpl.java:710) */
        realMatrixImpl.getDeterminant();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getDeterminant()}
 * @utbot.executesCondition {@code (!isSquare()): False}
 * @utbot.executesCondition {@code (isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < this.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: det *= lu[i][i];
 *  */
    @Test
    public void testGetDeterminant_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        double[][] lu = {null};
        realMatrixImpl.lu = lu;
        realMatrixImpl.parity = -255;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getDeterminant] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getDeterminant(RealMatrixImpl.java:710) */
        realMatrixImpl.getDeterminant();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getDeterminant()}
 * @utbot.executesCondition {@code (!isSquare()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isSingular()
 *  */
    @Test
    public void testGetDeterminant_ThrowNullPointerException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getDeterminant] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729)
            org.apache.commons.math.linear.RealMatrixImpl.getDeterminant(RealMatrixImpl.java:705) */
        realMatrixImpl.getDeterminant();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDeterminant()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getDeterminant()}
 * @utbot.executesCondition {@code (!isSquare()): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#isSquare()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} when: !isSquare()
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testGetDeterminant_ThrowInvalidMatrixException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        
        realMatrixImpl.getDeterminant();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getDeterminant()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getDeterminant()}
     */
    @Test
    public void testGetDeterminantThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getDeterminant] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.isSquare(RealMatrixImpl.java:720)
            org.apache.commons.math.linear.RealMatrixImpl.getDeterminant(RealMatrixImpl.java:702) */
        realMatrixImpl.getDeterminant();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDeterminant()
    
    @Test
    public void testGetDeterminant1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {java.lang.Double.NaN, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {-2.315841784746324E77, 0.0};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = 0;
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        double actual = realMatrixImpl.getDeterminant();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(-1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDeterminant()
    
    @Test
    public void testGetDeterminant2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[7][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0
        };
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        data[4] = ((double[]) null);
        data[5] = ((double[]) null);
        data[6] = ((double[]) null);
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getDeterminant] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[7]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729)
            org.apache.commons.math.linear.RealMatrixImpl.getDeterminant(RealMatrixImpl.java:705) */
        realMatrixImpl.getDeterminant();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.isSingular
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSingular()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isSingular()}
 * @utbot.executesCondition {@code (lu == null): False}
 *  */
    @Test
    public void testIsSingular_LuNotEqualsNull() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] lu = {null};
        realMatrixImpl.lu = lu;
        
        boolean actual = realMatrixImpl.isSingular();
        
        assertFalse(actual);
        
        double[] finalRealMatrixImplLu0 = realMatrixImpl.lu[0];
        
        assertNull(finalRealMatrixImplLu0);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isSingular()}
 * @utbot.executesCondition {@code (lu == null): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#luDecompose()}
 * @utbot.returnsFrom {@code return true;}
 * @utbot.caughtException {@code InvalidMatrixException ex}
 *  */
    @Test
    public void testIsSingular_CatchInvalidMatrixException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        boolean actual = realMatrixImpl.isSingular();
        
        assertTrue(actual);
        
        double[] finalRealMatrixImplData1 = realMatrixImpl.data[1];
        
        assertNull(finalRealMatrixImplData1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isSingular()}
 * @utbot.executesCondition {@code (lu == null): True}
 *  */
    @Test
    public void testIsSingular_ReturnFalse() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {java.lang.Double.NaN};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = -255;
        
        double[][] initialRealMatrixImplLu = realMatrixImpl.lu;
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        boolean actual = realMatrixImpl.isSingular();
        
        assertFalse(actual);
        
        double[][] finalRealMatrixImplLu = realMatrixImpl.lu;
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplLu == finalRealMatrixImplLu);
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSingular()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isSingular()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: luDecompose();
 *  */
    @Test
    public void testIsSingular_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.isSingular] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:925)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729) */
        realMatrixImpl.isSingular();
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isSingular()}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testIsSingular_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.isSingular] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729) */
        realMatrixImpl.isSingular();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method isSingular()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#isSingular()}
     */
    @Test
    public void testIsSingularThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.isSingular] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:924)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729) */
        realMatrixImpl.isSingular();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isSingular()
    
    @Test
    public void testIsSingular1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {1.0E-11, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        realMatrixImpl.permutation = null;
        realMatrixImpl.parity = 0;
        
        int[] initialRealMatrixImplPermutation = realMatrixImpl.permutation;
        
        boolean actual = realMatrixImpl.isSingular();
        
        assertTrue(actual);
        
        int[] finalRealMatrixImplPermutation = realMatrixImpl.permutation;
        int finalRealMatrixImplParity = realMatrixImpl.parity;
        
        assertFalse(initialRealMatrixImplPermutation == finalRealMatrixImplPermutation);
        
        assertEquals(1, finalRealMatrixImplParity);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isSingular()
    
    @Test
    public void testIsSingular2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[4][];
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        double[] doubleArray2 = {};
        data[2] = doubleArray2;
        data[3] = doubleArray2;
        realMatrixImpl.data = data;
        realMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.isSingular] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last destination index 9 out of bounds for double[4]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1146)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406)
            org.apache.commons.math.linear.RealMatrixImpl.luDecompose(RealMatrixImpl.java:929)
            org.apache.commons.math.linear.RealMatrixImpl.isSingular(RealMatrixImpl.java:729) */
        realMatrixImpl.isSingular();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.linear.RealMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.returnsFrom {@code return new RealMatrixImpl(outData, false);}
 *  */
    @Test
    public void testAdd_RowCountEqualsMGetRowDimension() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = realMatrixImpl.add(realMatrixImpl);
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.linear.RealMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int columnCount = getColumnDimension();
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:217) */
        realMatrixImpl.add(((RealMatrixImpl) null));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = {};
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:218) */
        realMatrixImpl.add(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:218) */
        realMatrixImpl.add(((RealMatrixImpl) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.linear.RealMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.add(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        data1[0] = doubleArray;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.add(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.add(realMatrixImpl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.returnsFrom {@code return add((RealMatrixImpl) m);}
 *  */
    @Test
    public void testAdd_RealMatrixImplAdd() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.add(((RealMatrix) realMatrixImpl)));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        double[] doubleArray2 = {0.0};
        data1[1] = doubleArray2;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return add((RealMatrixImpl) m);
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:217)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:189) */
        realMatrixImpl.add(((RealMatrix) null));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return add((RealMatrixImpl) m);
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = {};
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:218)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:189) */
        realMatrixImpl.add(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return add((RealMatrixImpl) m);
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        data1[0] = doubleArray;
        data1[1] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:227)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:189) */
        realMatrixImpl.add(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return add((RealMatrixImpl) m);
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        data1[0] = doubleArray;
        double[] doubleArray2 = {};
        data1[1] = doubleArray2;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:227)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:189) */
        realMatrixImpl.add(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add((RealMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.add(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add((RealMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        data1[0] = doubleArray;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.add(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add((RealMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException_21() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        realMatrixImpl1.data = data;
        
        realMatrixImpl.add(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method add(org.apache.commons.math.linear.RealMatrix)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#add(org.apache.commons.math.linear.RealMatrix)}
     */
    @Test
    public void testAddThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[] doubleArray = {java.lang.Double.NaN, 0.0, java.lang.Double.NEGATIVE_INFINITY};
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray);
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:216)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:189) */
        realMatrixImpl.add(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testAdd1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[4][];
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = ((double[]) null);
        data[3] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[4][];
        double[] doubleArray2 = {0.0, 0.0, 0.0, 0.0};
        data1[0] = doubleArray2;
        data1[1] = doubleArray1;
        data1[2] = ((double[]) null);
        data1[3] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:227)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:189) */
        realMatrixImpl.add(((RealMatrix) realMatrixImpl1));
    }
    
    @Test
    public void testAdd2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[4][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = doubleArray1;
        double[] doubleArray2 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[3] = doubleArray2;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[4][];
        data1[0] = doubleArray;
        data1[1] = doubleArray1;
        data1[2] = doubleArray1;
        data1[3] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:227)
            org.apache.commons.math.linear.RealMatrixImpl.add(RealMatrixImpl.java:189) */
        realMatrixImpl.add(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof RealMatrixImpl == false): True}
 *  */
    @Test
    public void testEquals_ObjectInstanceOfRealMatrixImplEqualsFalse() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        boolean actual = realMatrixImpl.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): True}
 *  */
    @Test
    public void testEquals_Object() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        boolean actual = realMatrixImpl.equals(realMatrixImpl);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof RealMatrixImpl == false): False}
 * @utbot.executesCondition {@code (m.getColumnDimension() != nCols): True}
 *  */
    @Test
    public void testEquals_MGetColumnDimensionNotEqualsNCols() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        boolean actual = realMatrixImpl.equals(realMatrixImpl1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof RealMatrixImpl == false): False}
 * @utbot.executesCondition {@code (m.getColumnDimension() != nCols): False}
 * @utbot.executesCondition {@code (m.getRowDimension() != nRows): True}
 *  */
    @Test
    public void testEquals_MGetRowDimensionNotEqualsNRows() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        data1[0] = doubleArray;
        realMatrixImpl1.data = data1;
        
        boolean actual = realMatrixImpl.equals(realMatrixImpl1);
        
        assertFalse(actual);
        
        double[] finalRealMatrixImplData1 = realMatrixImpl.data[1];
        
        assertNull(finalRealMatrixImplData1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof RealMatrixImpl == false): False}
 * @utbot.executesCondition {@code (m.getColumnDimension() != nCols): False}
 * @utbot.executesCondition {@code (m.getRowDimension() != nRows): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 *  */
    @Test
    public void testEquals_DoubleDoubleToLongBits() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {java.lang.Double.NaN};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {-2.0000000000000004};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        boolean actual = realMatrixImpl.equals(realMatrixImpl1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof RealMatrixImpl == false): False}
 * @utbot.executesCondition {@code (m.getColumnDimension() != nCols): False}
 * @utbot.executesCondition {@code (m.getRowDimension() != nRows): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 *  */
    @Test
    public void testEquals_NotDoubleDoubleToLongBits() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {java.lang.Double.NaN};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {java.lang.Double.NaN};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        boolean actual = realMatrixImpl.equals(realMatrixImpl1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = getColumnDimension();
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.equals(RealMatrixImpl.java:1043) */
        realMatrixImpl.equals(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#equals(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrix#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: m.getColumnDimension() != nCols || m.getRowDimension() != nRows
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = {};
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.equals(RealMatrixImpl.java:1044) */
        realMatrixImpl.equals(realMatrixImpl1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#toString()}
 * @utbot.executesCondition {@code (data != null): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return res.toString();}
 *  */
    @Test
    public void testToString_DataNotEqualsNull() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        String actual = realMatrixImpl.toString();
        
        String expected = "RealMatrixImpl{}";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#toString()}
 * @utbot.executesCondition {@code (data != null): False}
 * @utbot.returnsFrom {@code return res.toString();}
 *  */
    @Test
    public void testToString_DataEqualsNull() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.data = null;
        
        String actual = realMatrixImpl.toString();
        
        String expected = "RealMatrixImpl{}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#toString()}
 * @utbot.executesCondition {@code (data != null): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int j = 0; j < data[0].length; j++)
 *  */
    @Test
    public void testToString_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.toString] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.toString(RealMatrixImpl.java:1012) */
        realMatrixImpl.toString();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
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
        realMatrixImpl.data = data;
        
        String actual = realMatrixImpl.toString();
        
        String expected = "RealMatrixImpl{{},{},{},{},{},{},{},{},{}}";
        
        assertEquals(expected, actual);
        
        double[] finalRealMatrixImplData1 = realMatrixImpl.data[1];
        double[] finalRealMatrixImplData2 = realMatrixImpl.data[2];
        double[] finalRealMatrixImplData3 = realMatrixImpl.data[3];
        double[] finalRealMatrixImplData4 = realMatrixImpl.data[4];
        double[] finalRealMatrixImplData5 = realMatrixImpl.data[5];
        double[] finalRealMatrixImplData6 = realMatrixImpl.data[6];
        double[] finalRealMatrixImplData7 = realMatrixImpl.data[7];
        double[] finalRealMatrixImplData8 = realMatrixImpl.data[8];
        
        assertNull(finalRealMatrixImplData1);
        
        assertNull(finalRealMatrixImplData2);
        
        assertNull(finalRealMatrixImplData3);
        
        assertNull(finalRealMatrixImplData4);
        
        assertNull(finalRealMatrixImplData5);
        
        assertNull(finalRealMatrixImplData6);
        
        assertNull(finalRealMatrixImplData7);
        
        assertNull(finalRealMatrixImplData8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toString()
    
    @Test
    public void testToString2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[9][];
        double[] doubleArray = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
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
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.toString] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.toString(RealMatrixImpl.java:1016) */
        realMatrixImpl.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#hashCode()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testHashCode_IterateForLoop() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        int actual = realMatrixImpl.hashCode();
        
        assertEquals(6758, actual);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#hashCode()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testHashCode_MathUtilsHash() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {2.2250738585072014E-308};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        int actual = realMatrixImpl.hashCode();
        
        assertEquals(29569657, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#hashCode()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = getColumnDimension();
 *  */
    @Test
    public void testHashCode_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.hashCode(RealMatrixImpl.java:1067) */
        realMatrixImpl.hashCode();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hashCode()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#hashCode()}
     */
    @Test
    public void testHashCodeThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.hashCode(RealMatrixImpl.java:1066) */
        realMatrixImpl.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.copy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copy()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copy()}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#copyOut()
 * @utbot.returnsFrom {@code return new RealMatrixImpl(copyOut(), false);}
 *  */
    @Test
    public void testCopy_RealMatrixImplCopyOut() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.copy());
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copy()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copy()}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#copyOut()
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new RealMatrixImpl(copyOut(), false);
 *  */
    @Test
    public void testCopy_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.copy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1143)
            org.apache.commons.math.linear.RealMatrixImpl.copy(RealMatrixImpl.java:177) */
        realMatrixImpl.copy();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copy()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copy()}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#copyOut()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(copyOut(), false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCopy_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.copy();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method copy()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#copy()}
     */
    @Test
    public void testCopyThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.copy] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1142)
            org.apache.commons.math.linear.RealMatrixImpl.copy(RealMatrixImpl.java:177) */
        realMatrixImpl.copy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.multiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math.linear.RealMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (this.getColumnDimension() != m.getRowDimension()): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return new RealMatrixImpl(outData, false);}
 *  */
    @Test
    public void testMultiply_ThisGetColumnDimensionEqualsMGetRowDimension() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = realMatrixImpl.multiply(realMatrixImpl);
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(org.apache.commons.math.linear.RealMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: this.getColumnDimension() != m.getRowDimension()
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:366) */
        realMatrixImpl.multiply(((RealMatrixImpl) null));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (this.getColumnDimension() != m.getRowDimension()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = m.getColumnDimension();
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = {};
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:370) */
        realMatrixImpl.multiply(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (this.getColumnDimension() != m.getRowDimension()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += dataRow[i] * m.data[i][col];
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        double[] doubleArray2 = {};
        data1[1] = doubleArray2;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:379) */
        realMatrixImpl.multiply(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.getColumnDimension() != m.getRowDimension()
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:366) */
        realMatrixImpl.multiply(((RealMatrixImpl) null));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (this.getColumnDimension() != m.getRowDimension()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sum += dataRow[i] * m.data[i][col];
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        data1[1] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:379) */
        realMatrixImpl.multiply(realMatrixImpl1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math.linear.RealMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (this.getColumnDimension() != m.getRowDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: this.getColumnDimension() != m.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = {
            null,
            null
        };
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.multiply(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (this.getColumnDimension() != m.getRowDimension()): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_ThrowIllegalArgumentException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.multiply(realMatrixImpl1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.multiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.returnsFrom {@code return multiply((RealMatrixImpl) m);}
 *  */
    @Test
    public void testMultiply_RealMatrixImplMultiply() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        data1[0] = doubleArray;
        realMatrixImpl1.data = data1;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.multiply(((RealMatrix) realMatrixImpl1)));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data2 = new double[2][];
        double[] doubleArray1 = {0.0};
        data2[0] = doubleArray1;
        double[] doubleArray2 = {0.0};
        data2[1] = doubleArray2;
        expected.data = data2;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return multiply((RealMatrixImpl) m);
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:366)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334) */
        realMatrixImpl.multiply(((RealMatrix) null));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return multiply((RealMatrixImpl) m);
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = {};
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:370)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334) */
        realMatrixImpl.multiply(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return multiply((RealMatrixImpl) m);
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_21() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        double[] doubleArray2 = {};
        data1[1] = doubleArray2;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:379)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334) */
        realMatrixImpl.multiply(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return multiply((RealMatrixImpl) m);
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        data1[1] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:379)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334) */
        realMatrixImpl.multiply(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return multiply((RealMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_ThrowIllegalArgumentException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        realMatrixImpl1.data = data;
        
        realMatrixImpl.multiply(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return multiply((RealMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_ThrowIllegalArgumentException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.multiply(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method multiply(org.apache.commons.math.linear.RealMatrix)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#multiply(org.apache.commons.math.linear.RealMatrix)}
     */
    @Test
    public void testMultiplyThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[] doubleArray = {1.0, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY};
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray);
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:366)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334) */
        realMatrixImpl.multiply(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testMultiply1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[5][];
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        data[2] = doubleArray1;
        data[3] = doubleArray1;
        data[4] = doubleArray1;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[5][];
        double[] doubleArray2 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data1[0] = doubleArray2;
        data1[1] = doubleArray2;
        data1[2] = doubleArray2;
        data1[3] = doubleArray2;
        data1[4] = doubleArray2;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:379)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334) */
        realMatrixImpl.multiply(((RealMatrix) realMatrixImpl1));
    }
    
    @Test
    public void testMultiply2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[3][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray2 = {0.0, 0.0};
        data1[0] = doubleArray2;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:379)
            org.apache.commons.math.linear.RealMatrixImpl.multiply(RealMatrixImpl.java:334) */
        realMatrixImpl.multiply(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getEntry(int,int)}
 * @utbot.returnsFrom {@code return data[row][column];}
 *  */
    @Test
    public void testGetEntry_ReturnColumnOfDatarow() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        data[0] = ((double[]) null);
        double[] doubleArray = {0.0, 0.0};
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        
        double actual = realMatrixImpl.getEntry(1, 1);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        
        double[] finalRealMatrixImplData0 = realMatrixImpl.data[0];
        
        assertNull(finalRealMatrixImplData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data[row][column];
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {
            null,
            null
        };
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getEntry(RealMatrixImpl.java:663) */
        realMatrixImpl.getEntry(1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data[row][column];
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        realMatrixImpl.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getEntry(RealMatrixImpl.java:663) */
        realMatrixImpl.getEntry(-255, -255);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return data[row][column];
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {null};
        realMatrixImpl.data = data;
        
        realMatrixImpl.getEntry(-256, -255);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return data[row][column];
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        data[0] = ((double[]) null);
        double[] doubleArray = {0.0, 0.0};
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.getEntry(1, 129);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.getData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getData()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getData()}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#copyOut()
 * @utbot.returnsFrom {@code return copyOut();}
 *  */
    @Test
    public void testGetData_RealMatrixImplCopyOut() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        double[][] actual = realMatrixImpl.getData();
        
        double[][] expected = new double[1][];
        double[] doubleArray1 = {};
        expected[0] = doubleArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        for (int i = 0; i < expectedSize; i++) {
            double[] expectedNestedElement1 = expected[i];
            double[] actualNestedElement1 = actual[i];
            
            if (expectedNestedElement1 == null) {
                assertNull(actualNestedElement1);
            } else {
                int expectedNestedElement1Size = expectedNestedElement1.length;
                assertEquals(expectedNestedElement1Size, actualNestedElement1.length);
                assertArrayEquals(expectedNestedElement1, actualNestedElement1, 1.0E-6);
            }
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getData()
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getData()}
 * @utbot.invokes org.apache.commons.math.linear.RealMatrixImpl#copyOut()
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return copyOut();
 *  */
    @Test
    public void testGetData_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1143)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406) */
        realMatrixImpl.getData();
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getData()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#getData()}
     */
    @Test
    public void testGetDataThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.getData] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.copyOut(RealMatrixImpl.java:1142)
            org.apache.commons.math.linear.RealMatrixImpl.getData(RealMatrixImpl.java:406) */
        realMatrixImpl.getData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.returnsFrom {@code return subtract((RealMatrixImpl) m);}
 *  */
    @Test
    public void testSubtract_RealMatrixImplSubtract() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = ((RealMatrixImpl) realMatrixImpl.subtract(((RealMatrix) realMatrixImpl)));
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        double[] doubleArray2 = {0.0};
        data1[1] = doubleArray2;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return subtract((RealMatrixImpl) m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:270)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:242) */
        realMatrixImpl.subtract(((RealMatrix) null));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return subtract((RealMatrixImpl) m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = {};
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:271)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:242) */
        realMatrixImpl.subtract(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return subtract((RealMatrixImpl) m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        data1[0] = doubleArray;
        data1[1] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:280)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:242) */
        realMatrixImpl.subtract(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return subtract((RealMatrixImpl) m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_3() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {0.0};
        data[1] = doubleArray1;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[2][];
        data1[0] = doubleArray;
        double[] doubleArray2 = {};
        data1[1] = doubleArray2;
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:280)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:242) */
        realMatrixImpl.subtract(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.linear.RealMatrix)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return subtract((RealMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.subtract(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return subtract((RealMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException_1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        data1[0] = doubleArray;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.subtract(((RealMatrix) realMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return subtract((RealMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException_2() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        realMatrixImpl1.data = data;
        
        realMatrixImpl.subtract(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method subtract(org.apache.commons.math.linear.RealMatrix)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl}
     * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrix)}
     */
    @Test
    public void testSubtractThrowsNPE() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[] doubleArray = {java.lang.Double.NaN, 0.0, java.lang.Double.NEGATIVE_INFINITY};
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray);
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.getRowDimension(RealMatrixImpl.java:743)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:269)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:242) */
        realMatrixImpl.subtract(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(org.apache.commons.math.linear.RealMatrix)
    
    @Test
    public void testSubtract1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[3][];
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0, 0.0};
        data[0] = doubleArray;
        double[] doubleArray1 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        data[1] = doubleArray1;
        data[2] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[3][];
        double[] doubleArray2 = {0.0, 0.0, 0.0, 0.0, 0.0};
        data1[0] = doubleArray2;
        data1[1] = doubleArray1;
        data1[2] = ((double[]) null);
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:280)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:242) */
        realMatrixImpl.subtract(((RealMatrix) realMatrixImpl1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.RealMatrixImpl.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.linear.RealMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.returnsFrom {@code return new RealMatrixImpl(outData, false);}
 *  */
    @Test
    public void testSubtract_RowCountEqualsMGetRowDimension() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        RealMatrixImpl actual = realMatrixImpl.subtract(realMatrixImpl);
        
        RealMatrixImpl expected = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        
        // org.apache.commons.math.linear.RealMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.RealMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int columnCount = getColumnDimension();
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = {};
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:270) */
        realMatrixImpl.subtract(((RealMatrixImpl) null));
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.invokes {@link org.apache.commons.math.linear.RealMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = {};
        realMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.RealMatrixImpl.getColumnDimension(RealMatrixImpl.java:750)
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:271) */
        realMatrixImpl.subtract(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.RealMatrixImpl.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.RealMatrixImpl.subtract(RealMatrixImpl.java:271) */
        realMatrixImpl.subtract(((RealMatrixImpl) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.linear.RealMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException1() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {0.0, 0.0};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        double[] doubleArray1 = {0.0};
        data1[0] = doubleArray1;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.subtract(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException_11() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[2][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        data[1] = ((double[]) null);
        realMatrixImpl.data = data;
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl();
        double[][] data1 = new double[1][];
        data1[0] = doubleArray;
        realMatrixImpl1.data = data1;
        
        realMatrixImpl.subtract(realMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link RealMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.RealMatrixImpl#subtract(org.apache.commons.math.linear.RealMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new RealMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException_21() {
        RealMatrixImpl realMatrixImpl = new RealMatrixImpl();
        double[][] data = new double[1][];
        double[] doubleArray = {};
        data[0] = doubleArray;
        realMatrixImpl.data = data;
        
        realMatrixImpl.subtract(realMatrixImpl);
    }
    ///endregion
    
    ///endregion
}

