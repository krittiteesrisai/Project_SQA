package org.apache.commons.math.linear;

import org.junit.Test;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.lang.reflect.Method;
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
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math_linear_BigMatrixImplTest {
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.linear.BigMatrix)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return add((BigMatrixImpl) m);
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.add(BigMatrixImpl.java:288)
            org.apache.commons.math.linear.BigMatrixImpl.add(BigMatrixImpl.java:260) */
        bigMatrixImpl.add(((BigMatrix) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return add((BigMatrixImpl) m);
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = {};
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.add(BigMatrixImpl.java:289)
            org.apache.commons.math.linear.BigMatrixImpl.add(BigMatrixImpl.java:260) */
        bigMatrixImpl.add(((BigMatrix) bigMatrixImpl1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.linear.BigMatrix)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add((BigMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.add(((BigMatrix) bigMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return add((BigMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        data1[0] = bigDecimalArray;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.add(((BigMatrix) bigMatrixImpl1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.add
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.linear.BigMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int columnCount = getColumnDimension();
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.add(BigMatrixImpl.java:288) */
        bigMatrixImpl.add(((BigMatrixImpl) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test
    public void testAdd_ThrowArrayIndexOutOfBoundsException_11() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = {};
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.add] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.add(BigMatrixImpl.java:289) */
        bigMatrixImpl.add(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.add(BigMatrixImpl.java:289) */
        bigMatrixImpl.add(((BigMatrixImpl) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: outDataRow[col] = dataRow[col].add(mRow[col]);
 *  */
    @Test
    public void testAdd_ThrowNullPointerException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.add(BigMatrixImpl.java:298) */
        bigMatrixImpl.add(bigMatrixImpl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.linear.BigMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.add(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException_11() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        data1[0] = bigDecimalArray;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.add(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#add(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAdd_ThrowIllegalArgumentException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.add(bigMatrixImpl);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): True}
 *  */
    @Test
    public void testEquals_Object() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        boolean actual = bigMatrixImpl.equals(bigMatrixImpl);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof BigMatrixImpl == false): True}
 *  */
    @Test
    public void testEquals_ObjectInstanceOfBigMatrixImplEqualsFalse() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        boolean actual = bigMatrixImpl.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof BigMatrixImpl == false): False}
 * @utbot.executesCondition {@code (m.getColumnDimension() != nCols): True}
 *  */
    @Test
    public void testEquals_MGetColumnDimensionNotEqualsNCols() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        boolean actual = bigMatrixImpl.equals(bigMatrixImpl1);
        
        assertFalse(actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        BigDecimal finalBigMatrixImplData01 = bigMatrixImpl.data[0][1];
        
        BigDecimal finalBigMatrixImpl1Data00 = bigMatrixImpl1.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigMatrixImplData01);
        
        assertNull(finalBigMatrixImpl1Data00);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof BigMatrixImpl == false): False}
 * @utbot.executesCondition {@code (m.getColumnDimension() != nCols): False}
 * @utbot.executesCondition {@code (m.getRowDimension() != nRows): True}
 *  */
    @Test
    public void testEquals_MGetRowDimensionNotEqualsNRows() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        data1[0] = bigDecimalArray;
        bigMatrixImpl1.data = data1;
        
        boolean actual = bigMatrixImpl.equals(bigMatrixImpl1);
        
        assertFalse(actual);
        
        java.math.BigDecimal[] finalBigMatrixImplData1 = bigMatrixImpl.data[1];
        
        assertNull(finalBigMatrixImplData1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof BigMatrixImpl == false): False}
 * @utbot.executesCondition {@code (m.getColumnDimension() != nCols): False}
 * @utbot.executesCondition {@code (m.getRowDimension() != nRows): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 *  */
    @Test
    public void testEquals_NotDataRowcolEquals() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = new BigDecimal(0);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        boolean actual = bigMatrixImpl.equals(bigMatrixImpl1);
        
        assertFalse(actual);
        
        BigDecimal finalBigMatrixImpl1Data00 = bigMatrixImpl1.data[0][0];
        
        assertNull(finalBigMatrixImpl1Data00);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (object): False}
 * @utbot.executesCondition {@code (object instanceof BigMatrixImpl == false): False}
 * @utbot.executesCondition {@code (m.getColumnDimension() != nCols): False}
 * @utbot.executesCondition {@code (m.getRowDimension() != nRows): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 *  */
    @Test
    public void testEquals_DataRowcolEquals() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = new BigDecimal(0);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        bigMatrixImpl1.data = data;
        
        boolean actual = bigMatrixImpl.equals(bigMatrixImpl1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = getColumnDimension();
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.equals(BigMatrixImpl.java:1293) */
        bigMatrixImpl.equals(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: m.getColumnDimension() != nCols || m.getRowDimension() != nRows
 *  */
    @Test
    public void testEquals_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = {};
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.equals] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.equals(BigMatrixImpl.java:1294) */
        bigMatrixImpl.equals(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (m.getColumnDimension() != nCols): False}
 * @utbot.executesCondition {@code (m.getRowDimension() != nRows): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrix#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !dataRow[col].equals(m.getEntry(row, col))
 *  */
    @Test
    public void testEquals_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        bigMatrixImpl1.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.equals] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.equals(BigMatrixImpl.java:1300) */
        bigMatrixImpl.equals(bigMatrixImpl1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#toString()}
 * @utbot.executesCondition {@code (data != null): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuffer#toString()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.returnsFrom {@code return res.toString();}
 *  */
    @Test
    public void testToString_DataNotEqualsNull() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        String actual = bigMatrixImpl.toString();
        
        String expected = "BigMatrixImpl{}";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toString()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#toString()}
 * @utbot.executesCondition {@code (data != null): True}
 * @utbot.invokes {@link java.lang.StringBuffer#append(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < data.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int j = 0; j < data[0].length; j++)
 *  */
    @Test
    public void testToString_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.toString] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.toString(BigMatrixImpl.java:1262) */
        bigMatrixImpl.toString();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#hashCode()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testHashCode_IterateForLoop() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        int actual = bigMatrixImpl.hashCode();
        
        assertEquals(6758, actual);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#hashCode()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testHashCode_BigDecimalHashCode() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        int actual = bigMatrixImpl.hashCode();
        
        assertEquals(209529, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hashCode()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#hashCode()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = getColumnDimension();
 *  */
    @Test
    public void testHashCode_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.hashCode] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.hashCode(BigMatrixImpl.java:1316) */
        bigMatrixImpl.hashCode();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#hashCode()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: dataRow[col].hashCode()
 *  */
    @Test
    public void testHashCode_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.hashCode] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.hashCode(BigMatrixImpl.java:1323) */
        bigMatrixImpl.hashCode();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.copy
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copy()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copy()}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#copyOut()
 * @utbot.returnsFrom {@code return new BigMatrixImpl(this.copyOut(), false);}
 *  */
    @Test
    public void testCopy_BigMatrixImplCopyOut() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.copy());
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copy()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copy()}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#copyOut()
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(this.copyOut(), false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCopy_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.copy();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copy()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copy()}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#copyOut()
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return new BigMatrixImpl(this.copyOut(), false);
 *  */
    @Test
    public void testCopy_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.copy] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.copyOut(BigMatrixImpl.java:1392)
            org.apache.commons.math.linear.BigMatrixImpl.copy(BigMatrixImpl.java:248) */
        bigMatrixImpl.copy();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.multiply
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(org.apache.commons.math.linear.BigMatrix)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#multiply(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return multiply((BigMatrixImpl) m);
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:437)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:405) */
        bigMatrixImpl.multiply(((BigMatrix) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#multiply(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return multiply((BigMatrixImpl) m);
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = {};
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:441)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:405) */
        bigMatrixImpl.multiply(((BigMatrix) bigMatrixImpl1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math.linear.BigMatrix)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#multiply(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return multiply((BigMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        bigMatrixImpl1.data = data;
        
        bigMatrixImpl.multiply(((BigMatrix) bigMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#multiply(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return multiply((BigMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_ThrowIllegalArgumentException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.multiply(((BigMatrix) bigMatrixImpl1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.multiply
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(org.apache.commons.math.linear.BigMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#multiply(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: this.getColumnDimension() != m.getRowDimension()
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:437) */
        bigMatrixImpl.multiply(((BigMatrixImpl) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#multiply(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (this.getColumnDimension() != m.getRowDimension()): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = m.getColumnDimension();
 *  */
    @Test
    public void testMultiply_ThrowArrayIndexOutOfBoundsException_11() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = {};
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.multiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:441) */
        bigMatrixImpl.multiply(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#multiply(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: this.getColumnDimension() != m.getRowDimension()
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:437) */
        bigMatrixImpl.multiply(((BigMatrixImpl) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math.linear.BigMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#multiply(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (this.getColumnDimension() != m.getRowDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: this.getColumnDimension() != m.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_ThrowIllegalArgumentException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        bigMatrixImpl1.data = data;
        
        bigMatrixImpl.multiply(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#multiply(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (this.getColumnDimension() != m.getRowDimension()): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMultiply_ThrowIllegalArgumentException_11() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.multiply(bigMatrixImpl1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method multiply(org.apache.commons.math.linear.BigMatrixImpl)
    
    @Test
    public void testMultiply1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:450) */
        bigMatrixImpl.multiply(bigMatrixImpl1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getEntry
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getEntry(int,int)}
 * @utbot.returnsFrom {@code return data[row][column];}
 *  */
    @Test
    public void testGetEntry_ReturnColumnOfDatarow() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        data[0] = ((java.math.BigDecimal[]) null);
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        BigDecimal actual = bigMatrixImpl.getEntry(1, 1);
        
        assertNull(actual);
        
        java.math.BigDecimal[] finalBigMatrixImplData0 = bigMatrixImpl.data[0];
        BigDecimal finalBigMatrixImplData10 = bigMatrixImpl.data[1][0];
        BigDecimal finalBigMatrixImplData11 = bigMatrixImpl.data[1][1];
        
        assertNull(finalBigMatrixImplData0);
        
        assertNull(finalBigMatrixImplData10);
        
        assertNull(finalBigMatrixImplData11);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return data[row][column];
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getEntry(-256, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getEntry(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return data[row][column];
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntry_ThrowMatrixIndexException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        data[0] = ((java.math.BigDecimal[]) null);
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getEntry(1, 129);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntry(int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data[row][column];
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {
            null,
            null
        };
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getEntry(BigMatrixImpl.java:841) */
        bigMatrixImpl.getEntry(1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data[row][column];
 *  */
    @Test
    public void testGetEntry_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getEntry] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getEntry(BigMatrixImpl.java:841) */
        bigMatrixImpl.getEntry(-255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getData
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getData()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getData()}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#copyOut()
 * @utbot.returnsFrom {@code return copyOut();}
 *  */
    @Test
    public void testGetData_BigMatrixImplCopyOut() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        java.math.BigDecimal[][] actual = bigMatrixImpl.getData();
        
        java.math.BigDecimal[][] expected = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        expected[0] = bigDecimalArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getData()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getData()}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#copyOut()
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return copyOut();
 *  */
    @Test
    public void testGetData_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getData] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.copyOut(BigMatrixImpl.java:1392)
            org.apache.commons.math.linear.BigMatrixImpl.getData(BigMatrixImpl.java:477) */
        bigMatrixImpl.getData();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.BigMatrix)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return subtract((BigMatrixImpl) m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:341)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:313) */
        bigMatrixImpl.subtract(((BigMatrix) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return subtract((BigMatrixImpl) m);
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = {};
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:342)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:313) */
        bigMatrixImpl.subtract(((BigMatrix) bigMatrixImpl1));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.linear.BigMatrix)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return subtract((BigMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.subtract(((BigMatrix) bigMatrixImpl1));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return subtract((BigMatrixImpl) m);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        data1[0] = bigDecimalArray;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.subtract(((BigMatrix) bigMatrixImpl1));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.linear.BigMatrix)
    
    @Test
    public void testSubtract1() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[1];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray1[0] = bigDecimal1;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.subtract(((BigMatrix) bigMatrixImpl1)));
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data2 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[1];
        BigDecimal bigDecimal2 = new BigDecimal(0);
        bigDecimalArray2[0] = bigDecimal2;
        data2[0] = bigDecimalArray2;
        expected.data = data2;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(org.apache.commons.math.linear.BigMatrix)
    
    @Test
    public void testSubtract2() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", -1056702464);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 9223372036854775805L);
        bigDecimalArray[0] = bigDecimal;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", -3);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[1] = bigDecimal1;
        bigDecimalArray[2] = bigDecimal1;
        bigDecimalArray[3] = bigDecimal1;
        bigDecimalArray[4] = bigDecimal1;
        bigDecimalArray[5] = bigDecimal1;
        bigDecimalArray[6] = bigDecimal1;
        bigDecimalArray[7] = bigDecimal1;
        bigDecimalArray[8] = bigDecimal1;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        bigDecimalArray1[0] = bigDecimal1;
        bigDecimalArray1[1] = bigDecimal1;
        bigDecimalArray1[2] = bigDecimal1;
        bigDecimalArray1[3] = bigDecimal1;
        bigDecimalArray1[4] = bigDecimal1;
        bigDecimalArray1[5] = bigDecimal1;
        bigDecimalArray1[6] = bigDecimal1;
        bigDecimalArray1[7] = bigDecimal1;
        bigDecimalArray1[8] = bigDecimal1;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.ArithmeticException: BigInteger would overflow supported range]
            java.base/java.math.BigInteger.reportOverflow(BigInteger.java:1171)
            java.base/java.math.BigInteger.pow(BigInteger.java:2504)
            java.base/java.math.BigDecimal.bigTenToThe(BigDecimal.java:4095)
            java.base/java.math.BigDecimal.bigMultiplyPowerTen(BigDecimal.java:5073)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5037)
            java.base/java.math.BigDecimal.subtract(BigDecimal.java:1530)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:313) */
        bigMatrixImpl.subtract(((BigMatrix) bigMatrixImpl1));
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", 3);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", -3L);
        bigDecimalArray1[0] = bigDecimal1;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.ArithmeticException: Underflow]
            java.base/java.math.BigDecimal.checkScale(BigDecimal.java:4522)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5014)
            java.base/java.math.BigDecimal.subtract(BigDecimal.java:1528)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:313) */
        bigMatrixImpl.subtract(((BigMatrix) bigMatrixImpl1));
    }
    
    @Test
    public void testSubtract4() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", 3);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray1[0] = bigDecimal1;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:313) */
        bigMatrixImpl.subtract(((BigMatrix) bigMatrixImpl1));
    }
    
    @Test
    public void testSubtract5() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", -3);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[1] = bigDecimal1;
        bigDecimalArray[2] = bigDecimal1;
        bigDecimalArray[3] = bigDecimal1;
        bigDecimalArray[4] = bigDecimal1;
        bigDecimalArray[5] = bigDecimal1;
        bigDecimalArray[6] = bigDecimal1;
        bigDecimalArray[7] = bigDecimal1;
        bigDecimalArray[8] = bigDecimal1;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        bigDecimalArray1[0] = bigDecimal1;
        bigDecimalArray1[1] = bigDecimal1;
        bigDecimalArray1[2] = bigDecimal1;
        bigDecimalArray1[3] = bigDecimal1;
        bigDecimalArray1[4] = bigDecimal1;
        bigDecimalArray1[5] = bigDecimal1;
        bigDecimalArray1[6] = bigDecimal1;
        bigDecimalArray1[7] = bigDecimal1;
        bigDecimalArray1[8] = bigDecimal1;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.add(BigDecimal.java:5064)
            java.base/java.math.BigDecimal.subtract(BigDecimal.java:1539)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:313) */
        bigMatrixImpl.subtract(((BigMatrix) bigMatrixImpl1));
    }
    
    @Test
    public void testSubtract6() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 50331714);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        bigDecimalArray[1] = bigDecimal;
        bigDecimalArray[2] = bigDecimal;
        bigDecimalArray[3] = bigDecimal;
        bigDecimalArray[4] = bigDecimal;
        bigDecimalArray[5] = bigDecimal;
        bigDecimalArray[6] = bigDecimal;
        bigDecimalArray[7] = bigDecimal;
        bigDecimalArray[8] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray1[0] = bigDecimal1;
        bigDecimalArray1[1] = bigDecimal;
        bigDecimalArray1[2] = bigDecimal;
        bigDecimalArray1[3] = bigDecimal;
        bigDecimalArray1[4] = bigDecimal;
        bigDecimalArray1[5] = bigDecimal;
        bigDecimalArray1[6] = bigDecimal;
        bigDecimalArray1[7] = bigDecimal;
        bigDecimalArray1[8] = bigDecimal;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigDecimal.subtract(BigDecimal.java:1539)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:313) */
        bigMatrixImpl.subtract(((BigMatrix) bigMatrixImpl1));
    }
    
    @Test
    public void testSubtract7() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        bigDecimalArray[1] = bigDecimal;
        bigDecimalArray[2] = bigDecimal;
        bigDecimalArray[3] = bigDecimal;
        bigDecimalArray[4] = bigDecimal;
        bigDecimalArray[5] = bigDecimal;
        bigDecimalArray[6] = bigDecimal;
        bigDecimalArray[7] = bigDecimal;
        bigDecimalArray[8] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray1[0] = bigDecimal1;
        bigDecimalArray1[1] = bigDecimal;
        bigDecimalArray1[2] = bigDecimal;
        bigDecimalArray1[3] = bigDecimal;
        bigDecimalArray1[4] = bigDecimal;
        bigDecimalArray1[5] = bigDecimal;
        bigDecimalArray1[6] = bigDecimal;
        bigDecimalArray1[7] = bigDecimal;
        bigDecimalArray1[8] = bigDecimal;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compactValFor(BigDecimal.java:4422)
            java.base/java.math.BigDecimal.valueOf(BigDecimal.java:1330)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5048)
            java.base/java.math.BigDecimal.subtract(BigDecimal.java:1537)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:313) */
        bigMatrixImpl.subtract(((BigMatrix) bigMatrixImpl1));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.subtract
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.linear.BigMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int columnCount = getColumnDimension();
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:341) */
        bigMatrixImpl.subtract(((BigMatrixImpl) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test
    public void testSubtract_ThrowArrayIndexOutOfBoundsException_11() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = {};
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:342) */
        bigMatrixImpl.subtract(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: outDataRow[col] = dataRow[col].subtract(mRow[col]);
 *  */
    @Test
    public void testSubtract_ThrowArithmeticException() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 1L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[1];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray1[0] = bigDecimal1;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.ArithmeticException: Underflow]
            java.base/java.math.BigDecimal.checkScale(BigDecimal.java:4522)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5003)
            java.base/java.math.BigDecimal.subtract(BigDecimal.java:1528)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351) */
        bigMatrixImpl.subtract(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:342) */
        bigMatrixImpl.subtract(((BigMatrixImpl) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: outDataRow[col] = dataRow[col].subtract(mRow[col]);
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351) */
        bigMatrixImpl.subtract(bigMatrixImpl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.linear.BigMatrixImpl)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.subtract(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: columnCount != m.getColumnDimension() || rowCount != m.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException_11() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        data1[0] = bigDecimalArray;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.subtract(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#subtract(org.apache.commons.math.linear.BigMatrixImpl)}
 * @utbot.executesCondition {@code (columnCount != m.getColumnDimension()): False}
 * @utbot.executesCondition {@code (rowCount != m.getRowDimension()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSubtract_ThrowIllegalArgumentException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.subtract(bigMatrixImpl);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.linear.BigMatrixImpl)
    
    @Test
    public void testSubtract8() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", -3);
        int[] mag = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[1] = bigDecimal1;
        bigDecimalArray[2] = bigDecimal1;
        bigDecimalArray[3] = bigDecimal1;
        bigDecimalArray[4] = bigDecimal1;
        bigDecimalArray[5] = bigDecimal1;
        bigDecimalArray[6] = bigDecimal1;
        bigDecimalArray[7] = bigDecimal1;
        bigDecimalArray[8] = bigDecimal1;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        bigDecimalArray1[0] = bigDecimal1;
        bigDecimalArray1[1] = bigDecimal1;
        bigDecimalArray1[2] = bigDecimal1;
        bigDecimalArray1[3] = bigDecimal1;
        bigDecimalArray1[4] = bigDecimal1;
        bigDecimalArray1[5] = bigDecimal1;
        bigDecimalArray1[6] = bigDecimal1;
        bigDecimalArray1[7] = bigDecimal1;
        bigDecimalArray1[8] = bigDecimal1;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        BigMatrixImpl actual = bigMatrixImpl.subtract(bigMatrixImpl1);
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data2 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal2 = new BigDecimal(0);
        bigDecimalArray2[0] = bigDecimal2;
        BigDecimal bigDecimal3 = new BigDecimal(0);
        bigDecimalArray2[1] = bigDecimal3;
        BigDecimal bigDecimal4 = new BigDecimal(0);
        bigDecimalArray2[2] = bigDecimal4;
        BigDecimal bigDecimal5 = new BigDecimal(0);
        bigDecimalArray2[3] = bigDecimal5;
        BigDecimal bigDecimal6 = new BigDecimal(0);
        bigDecimalArray2[4] = bigDecimal6;
        BigDecimal bigDecimal7 = new BigDecimal(0);
        bigDecimalArray2[5] = bigDecimal7;
        BigDecimal bigDecimal8 = new BigDecimal(0);
        bigDecimalArray2[6] = bigDecimal8;
        BigDecimal bigDecimal9 = new BigDecimal(0);
        bigDecimalArray2[7] = bigDecimal9;
        BigDecimal bigDecimal10 = new BigDecimal(0);
        bigDecimalArray2[8] = bigDecimal10;
        data2[0] = bigDecimalArray2;
        expected.data = data2;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(org.apache.commons.math.linear.BigMatrixImpl)
    
    @Test
    public void testSubtract9() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray1[0] = bigDecimal1;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.ArithmeticException: BigInteger would overflow supported range]
            java.base/java.math.BigInteger.reportOverflow(BigInteger.java:1171)
            java.base/java.math.BigInteger.pow(BigInteger.java:2504)
            java.base/java.math.BigDecimal.bigTenToThe(BigDecimal.java:4095)
            java.base/java.math.BigDecimal.bigMultiplyPowerTen(BigDecimal.java:5082)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5058)
            java.base/java.math.BigDecimal.subtract(BigDecimal.java:1539)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351) */
        bigMatrixImpl.subtract(bigMatrixImpl1);
    }
    
    @Test
    public void testSubtract10() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        bigDecimalArray[1] = bigDecimal;
        bigDecimalArray[2] = bigDecimal;
        bigDecimalArray[3] = bigDecimal;
        bigDecimalArray[4] = bigDecimal;
        bigDecimalArray[5] = bigDecimal;
        bigDecimalArray[6] = bigDecimal;
        bigDecimalArray[7] = bigDecimal;
        bigDecimalArray[8] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray1[0] = bigDecimal1;
        bigDecimalArray1[1] = bigDecimal;
        bigDecimalArray1[2] = bigDecimal;
        bigDecimalArray1[3] = bigDecimal;
        bigDecimalArray1[4] = bigDecimal;
        bigDecimalArray1[5] = bigDecimal;
        bigDecimalArray1[6] = bigDecimal;
        bigDecimalArray1[7] = bigDecimal;
        bigDecimalArray1[8] = bigDecimal;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.<init>(BigInteger.java:1138)
            java.base/java.math.BigInteger.negate(BigInteger.java:2683)
            java.base/java.math.BigDecimal.subtract(BigDecimal.java:1539)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351) */
        bigMatrixImpl.subtract(bigMatrixImpl1);
    }
    
    @Test
    public void testSubtract11() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        bigDecimalArray[1] = bigDecimal;
        bigDecimalArray[2] = bigDecimal;
        bigDecimalArray[3] = bigDecimal;
        bigDecimalArray[4] = bigDecimal;
        bigDecimalArray[5] = bigDecimal;
        bigDecimalArray[6] = bigDecimal;
        bigDecimalArray[7] = bigDecimal;
        bigDecimalArray[8] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray1[0] = bigDecimal1;
        bigDecimalArray1[1] = bigDecimal;
        bigDecimalArray1[2] = bigDecimal;
        bigDecimalArray1[3] = bigDecimal;
        bigDecimalArray1[4] = bigDecimal;
        bigDecimalArray1[5] = bigDecimal;
        bigDecimalArray1[6] = bigDecimal;
        bigDecimalArray1[7] = bigDecimal;
        bigDecimalArray1[8] = bigDecimal;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compactValFor(BigDecimal.java:4422)
            java.base/java.math.BigDecimal.valueOf(BigDecimal.java:1330)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5048)
            java.base/java.math.BigDecimal.subtract(BigDecimal.java:1537)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351) */
        bigMatrixImpl.subtract(bigMatrixImpl1);
    }
    
    @Test
    public void testSubtract12() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", -1207951359);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", -1208090626);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[1] = bigDecimal1;
        bigDecimalArray[2] = bigDecimal1;
        bigDecimalArray[3] = bigDecimal1;
        bigDecimalArray[4] = bigDecimal1;
        bigDecimalArray[5] = bigDecimal1;
        bigDecimalArray[6] = bigDecimal1;
        bigDecimalArray[7] = bigDecimal1;
        bigDecimalArray[8] = bigDecimal1;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        bigDecimalArray1[0] = bigDecimal1;
        bigDecimalArray1[1] = bigDecimal1;
        bigDecimalArray1[2] = bigDecimal1;
        bigDecimalArray1[3] = bigDecimal1;
        bigDecimalArray1[4] = bigDecimal1;
        bigDecimalArray1[5] = bigDecimal1;
        bigDecimalArray1[6] = bigDecimal1;
        bigDecimalArray1[7] = bigDecimal1;
        bigDecimalArray1[8] = bigDecimal1;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.add(BigDecimal.java:5064)
            java.base/java.math.BigDecimal.subtract(BigDecimal.java:1539)
            org.apache.commons.math.linear.BigMatrixImpl.subtract(BigMatrixImpl.java:351) */
        bigMatrixImpl.subtract(bigMatrixImpl1);
    }
    
    @Test
    public void testSubtract13() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2038431746);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        bigDecimalArray[1] = bigDecimal;
        bigDecimalArray[2] = bigDecimal;
        bigDecimalArray[3] = bigDecimal;
        bigDecimalArray[4] = bigDecimal;
        bigDecimalArray[5] = bigDecimal;
        bigDecimalArray[6] = bigDecimal;
        bigDecimalArray[7] = bigDecimal;
        bigDecimalArray[8] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 2038431746);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", -3L);
        bigDecimalArray1[0] = bigDecimal1;
        bigDecimalArray1[1] = bigDecimal;
        bigDecimalArray1[2] = bigDecimal;
        bigDecimalArray1[3] = bigDecimal;
        bigDecimalArray1[4] = bigDecimal;
        bigDecimalArray1[5] = bigDecimal;
        bigDecimalArray1[6] = bigDecimal;
        bigDecimalArray1[7] = bigDecimal;
        bigDecimalArray1[8] = bigDecimal;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.subtract] produces [java.lang.NullPointerException] */
        bigMatrixImpl.subtract(bigMatrixImpl1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.setScale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setScale(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setScale(int)}
 *  */
    @Test
    public void testSetScale() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.setScale(-255);
        
        bigMatrixImpl.setScale(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getRoundingMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRoundingMode()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRoundingMode()}
 * @utbot.returnsFrom {@code return roundingMode;}
 *  */
    @Test
    public void testGetRoundingMode_ReturnRoundingMode() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.setRoundingMode(-255);
        
        int actual = bigMatrixImpl.getRoundingMode();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.setRoundingMode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setRoundingMode(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setRoundingMode(int)}
 *  */
    @Test
    public void testSetRoundingMode() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.setRoundingMode(-255);
        
        bigMatrixImpl.setRoundingMode(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataAsDoubleArray()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getDataAsDoubleArray()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 * @utbot.returnsFrom {@code return d;}
 *  */
    @Test
    public void testGetDataAsDoubleArray_IterateForLoop() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        double[][] actual = bigMatrixImpl.getDataAsDoubleArray();
        
        double[][] expected = new double[1][];
        double[] doubleArray = {};
        expected[0] = doubleArray;
        
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
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getDataAsDoubleArray()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 * @utbot.returnsFrom {@code return d;}
 *  */
    @Test
    public void testGetDataAsDoubleArray_BigDecimalDoubleValue() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        double[][] actual = bigMatrixImpl.getDataAsDoubleArray();
        
        double[][] expected = new double[1][];
        double[] doubleArray = {0.0};
        expected[0] = doubleArray;
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDataAsDoubleArray()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getDataAsDoubleArray()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = getColumnDimension();
 *  */
    @Test
    public void testGetDataAsDoubleArray_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray(BigMatrixImpl.java:490) */
        bigMatrixImpl.getDataAsDoubleArray();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getDataAsDoubleArray()}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: d[i][j] = data[i][j].doubleValue();
 *  */
    @Test
    public void testGetDataAsDoubleArray_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray(BigMatrixImpl.java:494) */
        bigMatrixImpl.getDataAsDoubleArray();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getDataAsDoubleArray()
    
    @Test
    public void testGetDataAsDoubleArray1() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {
            1, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        bigDecimalArray[1] = bigDecimal;
        bigDecimalArray[2] = bigDecimal;
        bigDecimalArray[3] = bigDecimal;
        bigDecimalArray[4] = bigDecimal;
        bigDecimalArray[5] = bigDecimal;
        bigDecimalArray[6] = bigDecimal;
        bigDecimalArray[7] = bigDecimal;
        bigDecimalArray[8] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        double[][] actual = bigMatrixImpl.getDataAsDoubleArray();
        
        double[][] expected = new double[1][];
        double[] doubleArray = {
            1.157920892373162E77, 1.157920892373162E77, 1.157920892373162E77, 1.157920892373162E77, 1.157920892373162E77, 1.157920892373162E77,
            1.157920892373162E77, 1.157920892373162E77, 1.157920892373162E77
        };
        expected[0] = doubleArray;
        
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
        
        BigDecimal bigDecimal1 = bigMatrixImpl.data[0][0];
        BigInteger bigDecimal1Data00IntVal = ((BigInteger) getFieldValue(bigDecimal1, "java.math.BigDecimal", "intVal"));
        int finalBigMatrixImplData00IntValBitLengthPlusOne = ((Integer) getFieldValue(bigDecimal1Data00IntVal, "java.math.BigInteger", "bitLengthPlusOne"));
        
        assertEquals(258, finalBigMatrixImplData00IntValBitLengthPlusOne);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDataAsDoubleArray()
    
    @Test
    public void testGetDataAsDoubleArray2() throws Exception  {
        BigMatrixImpl bigMatrixImpl = ((BigMatrixImpl) createInstance("org.apache.commons.math.linear.BigMatrixImpl"));
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "\u0001";
        setField(bigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray(BigMatrixImpl.java:494) */
        bigMatrixImpl.getDataAsDoubleArray();
    }
    
    @Test
    public void testGetDataAsDoubleArray3() throws Exception  {
        BigMatrixImpl bigMatrixImpl = ((BigMatrixImpl) createInstance("org.apache.commons.math.linear.BigMatrixImpl"));
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "!";
        setField(bigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray] produces [java.lang.NumberFormatException: For input string: "!"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray(BigMatrixImpl.java:494) */
        bigMatrixImpl.getDataAsDoubleArray();
    }
    
    @Test
    public void testGetDataAsDoubleArray4() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        bigDecimalArray[1] = bigDecimal;
        bigDecimalArray[2] = bigDecimal;
        bigDecimalArray[3] = bigDecimal;
        bigDecimalArray[4] = bigDecimal;
        bigDecimalArray[5] = bigDecimal;
        bigDecimalArray[6] = bigDecimal;
        bigDecimalArray[7] = bigDecimal;
        bigDecimalArray[8] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            java.base/java.math.BigInteger.smallToString(BigInteger.java:4038)
            java.base/java.math.BigInteger.toString(BigInteger.java:4087)
            java.base/java.math.BigInteger.toString(BigInteger.java:3982)
            java.base/java.math.BigInteger.toString(BigInteger.java:4156)
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:3980)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray(BigMatrixImpl.java:494) */
        bigMatrixImpl.getDataAsDoubleArray();
    }
    
    @Test
    public void testGetDataAsDoubleArray5() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 2305843011361177601L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getDataAsDoubleArray(BigMatrixImpl.java:494) */
        bigMatrixImpl.getDataAsDoubleArray();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnAsDoubleArray(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnAsDoubleArray(int)}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nrows; i++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetColumnAsDoubleArray_BigDecimalDoubleValue() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        double[] actual = bigMatrixImpl.getColumnAsDoubleArray(0);
        
        double[] expected = {0.0};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getColumnAsDoubleArray(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnAsDoubleArray(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(0, col)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetColumnAsDoubleArray_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getColumnAsDoubleArray(-1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnAsDoubleArray(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(0, col)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetColumnAsDoubleArray_ThrowMatrixIndexException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getColumnAsDoubleArray(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnAsDoubleArray(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnAsDoubleArray(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isValidCoordinate(0, col)
 *  */
    @Test
    public void testGetColumnAsDoubleArray_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isValidCoordinate(BigMatrixImpl.java:1462)
            org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray(BigMatrixImpl.java:812) */
        bigMatrixImpl.getColumnAsDoubleArray(-255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnAsDoubleArray(int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nrows; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out[i] = data[i][col].doubleValue();
 *  */
    @Test
    public void testGetColumnAsDoubleArray_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray(BigMatrixImpl.java:818) */
        bigMatrixImpl.getColumnAsDoubleArray(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getColumnAsDoubleArray(int)
    
    @Test
    public void testGetColumnAsDoubleArray1() throws Exception  {
        BigMatrixImpl bigMatrixImpl = ((BigMatrixImpl) createInstance("org.apache.commons.math.linear.BigMatrixImpl"));
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "\u0001";
        setField(bigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray(BigMatrixImpl.java:818) */
        bigMatrixImpl.getColumnAsDoubleArray(0);
    }
    
    @Test
    public void testGetColumnAsDoubleArray2() throws Exception  {
        BigMatrixImpl bigMatrixImpl = ((BigMatrixImpl) createInstance("org.apache.commons.math.linear.BigMatrixImpl"));
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "!\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        setField(bigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray] produces [java.lang.NumberFormatException: For input string: "!              !"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray(BigMatrixImpl.java:818) */
        bigMatrixImpl.getColumnAsDoubleArray(0);
    }
    
    @Test
    public void testGetColumnAsDoubleArray3() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.layoutChars(BigDecimal.java:4000)
            java.base/java.math.BigDecimal.toString(BigDecimal.java:3397)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            org.apache.commons.math.linear.BigMatrixImpl.getColumnAsDoubleArray(BigMatrixImpl.java:818) */
        bigMatrixImpl.getColumnAsDoubleArray(0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowAsDoubleArray(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowAsDoubleArray(int)}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < ncols; i++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetRowAsDoubleArray_BigDecimalDoubleValue() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", -3L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        double[] actual = bigMatrixImpl.getRowAsDoubleArray(1);
        
        double[] expected = {-0.3};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRowAsDoubleArray(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowAsDoubleArray(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRowAsDoubleArray_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getRowAsDoubleArray(129);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowAsDoubleArray(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRowAsDoubleArray_ThrowMatrixIndexException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getRowAsDoubleArray(-1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowAsDoubleArray(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRowAsDoubleArray_ThrowMatrixIndexException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getRowAsDoubleArray(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowAsDoubleArray(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowAsDoubleArray(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isValidCoordinate(row, 0)
 *  */
    @Test
    public void testGetRowAsDoubleArray_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isValidCoordinate(BigMatrixImpl.java:1462)
            org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray(BigMatrixImpl.java:767) */
        bigMatrixImpl.getRowAsDoubleArray(-255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowAsDoubleArray(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < ncols; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: out[i] = data[row][i].doubleValue();
 *  */
    @Test
    public void testGetRowAsDoubleArray_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data[1] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray(BigMatrixImpl.java:773) */
        bigMatrixImpl.getRowAsDoubleArray(1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowAsDoubleArray(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < ncols; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out[i] = data[row][i].doubleValue();
 *  */
    @Test
    public void testGetRowAsDoubleArray_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray(BigMatrixImpl.java:773) */
        bigMatrixImpl.getRowAsDoubleArray(1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowAsDoubleArray(int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < ncols; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: out[i] = data[row][i].doubleValue();
 *  */
    @Test
    public void testGetRowAsDoubleArray_ThrowNullPointerException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray(BigMatrixImpl.java:773) */
        bigMatrixImpl.getRowAsDoubleArray(0);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getRowAsDoubleArray(int)
    
    @Test
    public void testGetRowAsDoubleArray1() throws Exception  {
        BigMatrixImpl bigMatrixImpl = ((BigMatrixImpl) createInstance("org.apache.commons.math.linear.BigMatrixImpl"));
        java.math.BigDecimal[][] data = new java.math.BigDecimal[11][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data[1] = bigDecimalArray1;
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        String stringCache = "";
        setField(bigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray2[0] = bigDecimal;
        data[2] = bigDecimalArray2;
        data[3] = bigDecimalArray1;
        data[4] = bigDecimalArray1;
        data[5] = bigDecimalArray1;
        data[6] = bigDecimalArray1;
        data[7] = bigDecimalArray1;
        data[8] = bigDecimalArray1;
        data[9] = bigDecimalArray1;
        data[10] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray(BigMatrixImpl.java:773) */
        bigMatrixImpl.getRowAsDoubleArray(2);
    }
    
    @Test
    public void testGetRowAsDoubleArray2() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[11][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data[1] = bigDecimalArray1;
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", -1073741846);
        String stringCache = "!";
        setField(bigDecimal, "java.math.BigDecimal", "stringCache", stringCache);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 1L);
        bigDecimalArray2[0] = bigDecimal;
        data[2] = bigDecimalArray2;
        data[3] = bigDecimalArray1;
        data[4] = bigDecimalArray1;
        data[5] = bigDecimalArray1;
        data[6] = bigDecimalArray1;
        data[7] = bigDecimalArray1;
        data[8] = bigDecimalArray1;
        data[9] = bigDecimalArray1;
        data[10] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray] produces [java.lang.NumberFormatException: For input string: "!"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.math.BigDecimal.doubleValue(BigDecimal.java:3829)
            org.apache.commons.math.linear.BigMatrixImpl.getRowAsDoubleArray(BigMatrixImpl.java:773) */
        bigMatrixImpl.getRowAsDoubleArray(2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getScale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getScale()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getScale()}
 * @utbot.returnsFrom {@code return scale;}
 *  */
    @Test
    public void testGetScale_ReturnScale() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.setScale(-255);
        
        int actual = bigMatrixImpl.getScale();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.preMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method preMultiply([Ljava.math.BigDecimal;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#preMultiply(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (v.length != nRows): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testPreMultiply_VLengthEqualsNRows() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        
        java.math.BigDecimal[] actual = bigMatrixImpl.preMultiply(bigDecimalArray1);
        
        java.math.BigDecimal[] expected = {};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        BigDecimal finalBigDecimalArray10 = bigDecimalArray1[0];
        
        assertNull(finalBigDecimalArray10);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method preMultiply([Ljava.math.BigDecimal;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#preMultiply(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (v.length != nRows): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: v.length != nRows
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiply_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        
        bigMatrixImpl.preMultiply(bigDecimalArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method preMultiply([Ljava.math.BigDecimal;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#preMultiply(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (v.length != nRows): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = this.getColumnDimension();
 *  */
    @Test
    public void testPreMultiply_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        java.math.BigDecimal[] bigDecimalArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.preMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.preMultiply(BigMatrixImpl.java:1029) */
        bigMatrixImpl.preMultiply(bigDecimalArray);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#preMultiply(java.math.BigDecimal[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: v.length != nRows
 *  */
    @Test
    public void testPreMultiply_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.preMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.preMultiply(BigMatrixImpl.java:1026) */
        bigMatrixImpl.preMultiply(((java.math.BigDecimal[]) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method preMultiply([Ljava.math.BigDecimal;)
    
    @Test
    public void testPreMultiply1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        data[2] = ((java.math.BigDecimal[]) null);
        data[3] = ((java.math.BigDecimal[]) null);
        data[4] = ((java.math.BigDecimal[]) null);
        data[5] = ((java.math.BigDecimal[]) null);
        data[6] = ((java.math.BigDecimal[]) null);
        data[7] = ((java.math.BigDecimal[]) null);
        data[8] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        java.math.BigDecimal[] bigDecimalArray1 = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.preMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.preMultiply(BigMatrixImpl.java:1034) */
        bigMatrixImpl.preMultiply(bigDecimalArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.preMultiply
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method preMultiply(org.apache.commons.math.linear.BigMatrix)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#preMultiply(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testPreMultiply_ThrowArrayIndexOutOfBoundsException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.preMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:437)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:405)
            org.apache.commons.math.linear.BigMatrixImpl.preMultiply(BigMatrixImpl.java:466) */
        bigMatrixImpl.preMultiply(bigMatrixImpl);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#preMultiply(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testPreMultiply_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data1[0] = bigDecimalArray;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.preMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:441)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:405)
            org.apache.commons.math.linear.BigMatrixImpl.preMultiply(BigMatrixImpl.java:466) */
        bigMatrixImpl.preMultiply(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#preMultiply(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrix#multiply(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return m.multiply(this);
 *  */
    @Test
    public void testPreMultiply_ThrowNullPointerException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.preMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.preMultiply(BigMatrixImpl.java:466) */
        bigMatrixImpl.preMultiply(((BigMatrix) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method preMultiply(org.apache.commons.math.linear.BigMatrix)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#preMultiply(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return m.multiply(this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiply_ThrowIllegalArgumentException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        bigMatrixImpl1.data = data;
        
        bigMatrixImpl.preMultiply(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#preMultiply(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return m.multiply(this);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testPreMultiply_ThrowIllegalArgumentException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.preMultiply(bigMatrixImpl1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method preMultiply(org.apache.commons.math.linear.BigMatrix)
    
    @Test
    public void testPreMultiply2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {null, null, null, null, null, null, null, null, null};
        data[0] = bigDecimalArray;
        data[1] = bigDecimalArray;
        data[2] = bigDecimalArray;
        data[3] = bigDecimalArray;
        data[4] = bigDecimalArray;
        data[5] = bigDecimalArray;
        data[6] = bigDecimalArray;
        data[7] = bigDecimalArray;
        data[8] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        data1[0] = bigDecimalArray;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.preMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:450)
            org.apache.commons.math.linear.BigMatrixImpl.multiply(BigMatrixImpl.java:405)
            org.apache.commons.math.linear.BigMatrixImpl.preMultiply(BigMatrixImpl.java:466) */
        bigMatrixImpl.preMultiply(bigMatrixImpl1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getNorm
    
    ///region OTHER: ERROR SUITE for method getNorm()
    
    @Test
    public void testGetNorm1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getNorm] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.getNorm(BigMatrixImpl.java:557) */
        bigMatrixImpl.getNorm();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSubMatrix([I, [I)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: selectedRows.length * selectedColumns.length == 0
 *  */
    @Test
    public void testGetSubMatrix_ThrowNullPointerException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(BigMatrixImpl.java:611) */
        bigMatrixImpl.getSubMatrix(intArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: selectedRows.length * selectedColumns.length == 0
 *  */
    @Test
    public void testGetSubMatrix_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(BigMatrixImpl.java:611) */
        bigMatrixImpl.getSubMatrix(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSubMatrix([I, [I)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.executesCondition {@code (selectedRows.length * selectedColumns.length == 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: selectedRows.length * selectedColumns.length == 0
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        int[] intArray = {};
        int[] intArray1 = {-255, -255};
        
        bigMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.executesCondition {@code (selectedRows.length * selectedColumns.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < selectedRows.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final BigDecimal[] dataSelectedI = data[selectedRows[i]];
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        int[] intArray = {-256};
        int[] intArray1 = {-255};
        
        bigMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.executesCondition {@code (selectedRows.length * selectedColumns.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < selectedRows.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: subI[j] = dataSelectedI[selectedColumns[j]];
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        data[0] = ((java.math.BigDecimal[]) null);
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        int[] intArray = {1};
        int[] intArray1 = {65};
        
        bigMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int[],int[])}
 * @utbot.executesCondition {@code (selectedRows.length * selectedColumns.length == 0): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < selectedRows.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: subI[j] = dataSelectedI[selectedColumns[j]];
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_3() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        data[0] = ((java.math.BigDecimal[]) null);
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        int[] intArray = {1};
        int[] intArray1 = {1, -256};
        
        bigMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getSubMatrix([I, [I)
    
    @Test
    public void testGetSubMatrix1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {null, null, null, null, null, null, null, null, null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        data[2] = ((java.math.BigDecimal[]) null);
        data[3] = ((java.math.BigDecimal[]) null);
        data[4] = ((java.math.BigDecimal[]) null);
        data[5] = ((java.math.BigDecimal[]) null);
        data[6] = ((java.math.BigDecimal[]) null);
        data[7] = ((java.math.BigDecimal[]) null);
        data[8] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        int[] intArray = {0, 0, 0};
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.getSubMatrix(intArray, intArray));
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[3][];
        java.math.BigDecimal[] bigDecimalArray1 = {null, null, null};
        data1[0] = bigDecimalArray1;
        java.math.BigDecimal[] bigDecimalArray2 = {null, null, null};
        data1[1] = bigDecimalArray2;
        java.math.BigDecimal[] bigDecimalArray3 = {null, null, null};
        data1[2] = bigDecimalArray3;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        BigDecimal finalBigMatrixImplData01 = bigMatrixImpl.data[0][1];
        BigDecimal finalBigMatrixImplData02 = bigMatrixImpl.data[0][2];
        BigDecimal finalBigMatrixImplData03 = bigMatrixImpl.data[0][3];
        BigDecimal finalBigMatrixImplData04 = bigMatrixImpl.data[0][4];
        BigDecimal finalBigMatrixImplData05 = bigMatrixImpl.data[0][5];
        BigDecimal finalBigMatrixImplData06 = bigMatrixImpl.data[0][6];
        BigDecimal finalBigMatrixImplData07 = bigMatrixImpl.data[0][7];
        BigDecimal finalBigMatrixImplData08 = bigMatrixImpl.data[0][8];
        java.math.BigDecimal[] finalBigMatrixImplData1 = bigMatrixImpl.data[1];
        java.math.BigDecimal[] finalBigMatrixImplData2 = bigMatrixImpl.data[2];
        java.math.BigDecimal[] finalBigMatrixImplData3 = bigMatrixImpl.data[3];
        java.math.BigDecimal[] finalBigMatrixImplData4 = bigMatrixImpl.data[4];
        java.math.BigDecimal[] finalBigMatrixImplData5 = bigMatrixImpl.data[5];
        java.math.BigDecimal[] finalBigMatrixImplData6 = bigMatrixImpl.data[6];
        java.math.BigDecimal[] finalBigMatrixImplData7 = bigMatrixImpl.data[7];
        java.math.BigDecimal[] finalBigMatrixImplData8 = bigMatrixImpl.data[8];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigMatrixImplData01);
        
        assertNull(finalBigMatrixImplData02);
        
        assertNull(finalBigMatrixImplData03);
        
        assertNull(finalBigMatrixImplData04);
        
        assertNull(finalBigMatrixImplData05);
        
        assertNull(finalBigMatrixImplData06);
        
        assertNull(finalBigMatrixImplData07);
        
        assertNull(finalBigMatrixImplData08);
        
        assertNull(finalBigMatrixImplData1);
        
        assertNull(finalBigMatrixImplData2);
        
        assertNull(finalBigMatrixImplData3);
        
        assertNull(finalBigMatrixImplData4);
        
        assertNull(finalBigMatrixImplData5);
        
        assertNull(finalBigMatrixImplData6);
        
        assertNull(finalBigMatrixImplData7);
        
        assertNull(finalBigMatrixImplData8);
    }
    
    @Test
    public void testGetSubMatrix2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {null, null, null, null, null, null, null, null, null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        data[2] = ((java.math.BigDecimal[]) null);
        data[3] = ((java.math.BigDecimal[]) null);
        data[4] = ((java.math.BigDecimal[]) null);
        data[5] = ((java.math.BigDecimal[]) null);
        data[6] = ((java.math.BigDecimal[]) null);
        data[7] = ((java.math.BigDecimal[]) null);
        data[8] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        int[] intArray = {0, 0};
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.getSubMatrix(intArray, intArray));
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray1 = {null, null};
        data1[0] = bigDecimalArray1;
        java.math.BigDecimal[] bigDecimalArray2 = {null, null};
        data1[1] = bigDecimalArray2;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        BigDecimal finalBigMatrixImplData01 = bigMatrixImpl.data[0][1];
        BigDecimal finalBigMatrixImplData02 = bigMatrixImpl.data[0][2];
        BigDecimal finalBigMatrixImplData03 = bigMatrixImpl.data[0][3];
        BigDecimal finalBigMatrixImplData04 = bigMatrixImpl.data[0][4];
        BigDecimal finalBigMatrixImplData05 = bigMatrixImpl.data[0][5];
        BigDecimal finalBigMatrixImplData06 = bigMatrixImpl.data[0][6];
        BigDecimal finalBigMatrixImplData07 = bigMatrixImpl.data[0][7];
        BigDecimal finalBigMatrixImplData08 = bigMatrixImpl.data[0][8];
        java.math.BigDecimal[] finalBigMatrixImplData1 = bigMatrixImpl.data[1];
        java.math.BigDecimal[] finalBigMatrixImplData2 = bigMatrixImpl.data[2];
        java.math.BigDecimal[] finalBigMatrixImplData3 = bigMatrixImpl.data[3];
        java.math.BigDecimal[] finalBigMatrixImplData4 = bigMatrixImpl.data[4];
        java.math.BigDecimal[] finalBigMatrixImplData5 = bigMatrixImpl.data[5];
        java.math.BigDecimal[] finalBigMatrixImplData6 = bigMatrixImpl.data[6];
        java.math.BigDecimal[] finalBigMatrixImplData7 = bigMatrixImpl.data[7];
        java.math.BigDecimal[] finalBigMatrixImplData8 = bigMatrixImpl.data[8];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigMatrixImplData01);
        
        assertNull(finalBigMatrixImplData02);
        
        assertNull(finalBigMatrixImplData03);
        
        assertNull(finalBigMatrixImplData04);
        
        assertNull(finalBigMatrixImplData05);
        
        assertNull(finalBigMatrixImplData06);
        
        assertNull(finalBigMatrixImplData07);
        
        assertNull(finalBigMatrixImplData08);
        
        assertNull(finalBigMatrixImplData1);
        
        assertNull(finalBigMatrixImplData2);
        
        assertNull(finalBigMatrixImplData3);
        
        assertNull(finalBigMatrixImplData4);
        
        assertNull(finalBigMatrixImplData5);
        
        assertNull(finalBigMatrixImplData6);
        
        assertNull(finalBigMatrixImplData7);
        
        assertNull(finalBigMatrixImplData8);
    }
    
    @Test
    public void testGetSubMatrix3() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {null, null, null, null, null, null, null, null, null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        data[2] = ((java.math.BigDecimal[]) null);
        data[3] = ((java.math.BigDecimal[]) null);
        data[4] = ((java.math.BigDecimal[]) null);
        data[5] = ((java.math.BigDecimal[]) null);
        data[6] = ((java.math.BigDecimal[]) null);
        data[7] = ((java.math.BigDecimal[]) null);
        data[8] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        int[] intArray = {0, 0, 0};
        int[] intArray1 = {0};
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.getSubMatrix(intArray, intArray1));
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[3][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        java.math.BigDecimal[] bigDecimalArray2 = {null};
        data1[1] = bigDecimalArray2;
        java.math.BigDecimal[] bigDecimalArray3 = {null};
        data1[2] = bigDecimalArray3;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        BigDecimal finalBigMatrixImplData01 = bigMatrixImpl.data[0][1];
        BigDecimal finalBigMatrixImplData02 = bigMatrixImpl.data[0][2];
        BigDecimal finalBigMatrixImplData03 = bigMatrixImpl.data[0][3];
        BigDecimal finalBigMatrixImplData04 = bigMatrixImpl.data[0][4];
        BigDecimal finalBigMatrixImplData05 = bigMatrixImpl.data[0][5];
        BigDecimal finalBigMatrixImplData06 = bigMatrixImpl.data[0][6];
        BigDecimal finalBigMatrixImplData07 = bigMatrixImpl.data[0][7];
        BigDecimal finalBigMatrixImplData08 = bigMatrixImpl.data[0][8];
        java.math.BigDecimal[] finalBigMatrixImplData1 = bigMatrixImpl.data[1];
        java.math.BigDecimal[] finalBigMatrixImplData2 = bigMatrixImpl.data[2];
        java.math.BigDecimal[] finalBigMatrixImplData3 = bigMatrixImpl.data[3];
        java.math.BigDecimal[] finalBigMatrixImplData4 = bigMatrixImpl.data[4];
        java.math.BigDecimal[] finalBigMatrixImplData5 = bigMatrixImpl.data[5];
        java.math.BigDecimal[] finalBigMatrixImplData6 = bigMatrixImpl.data[6];
        java.math.BigDecimal[] finalBigMatrixImplData7 = bigMatrixImpl.data[7];
        java.math.BigDecimal[] finalBigMatrixImplData8 = bigMatrixImpl.data[8];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigMatrixImplData01);
        
        assertNull(finalBigMatrixImplData02);
        
        assertNull(finalBigMatrixImplData03);
        
        assertNull(finalBigMatrixImplData04);
        
        assertNull(finalBigMatrixImplData05);
        
        assertNull(finalBigMatrixImplData06);
        
        assertNull(finalBigMatrixImplData07);
        
        assertNull(finalBigMatrixImplData08);
        
        assertNull(finalBigMatrixImplData1);
        
        assertNull(finalBigMatrixImplData2);
        
        assertNull(finalBigMatrixImplData3);
        
        assertNull(finalBigMatrixImplData4);
        
        assertNull(finalBigMatrixImplData5);
        
        assertNull(finalBigMatrixImplData6);
        
        assertNull(finalBigMatrixImplData7);
        
        assertNull(finalBigMatrixImplData8);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSubMatrix([I, [I)
    
    @Test
    public void testGetSubMatrix4() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        int[] intArray = new int[38];
        int[] intArray1 = {0};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(BigMatrixImpl.java:620) */
        bigMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    
    @Test
    public void testGetSubMatrix5() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[11][];
        data[0] = ((java.math.BigDecimal[]) null);
        data[1] = ((java.math.BigDecimal[]) null);
        java.math.BigDecimal[] bigDecimalArray = {null, null, null, null, null, null, null, null, null};
        data[2] = bigDecimalArray;
        data[3] = ((java.math.BigDecimal[]) null);
        data[4] = ((java.math.BigDecimal[]) null);
        data[5] = ((java.math.BigDecimal[]) null);
        data[6] = ((java.math.BigDecimal[]) null);
        data[7] = ((java.math.BigDecimal[]) null);
        data[8] = ((java.math.BigDecimal[]) null);
        data[9] = ((java.math.BigDecimal[]) null);
        data[10] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        int[] intArray = {2, 0, 0};
        int[] intArray1 = {0, 0, 0, 0};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(BigMatrixImpl.java:622) */
        bigMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSubMatrix([I, [I)
    
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix6() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {null, null, null, null, null, null, null, null, null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {null, null};
        data[1] = bigDecimalArray1;
        data[2] = bigDecimalArray1;
        data[3] = bigDecimalArray1;
        data[4] = bigDecimalArray1;
        data[5] = bigDecimalArray1;
        data[6] = bigDecimalArray1;
        data[7] = bigDecimalArray1;
        data[8] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        int[] intArray = {0, 0, 116, 116};
        int[] intArray1 = {0, 0};
        
        bigMatrixImpl.getSubMatrix(intArray, intArray1);
    }
    ///endregion
    
    ///region Errors report for getSubMatrix
    
    public void testGetSubMatrix_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Default concrete execution failed
        
        // 1 occurrences of:
        // Concrete execution failed
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSubMatrix(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): False}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.executesCondition {@code (endColumn > data[0].length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startRow; i <= endRow; i++)} once
 * @utbot.returnsFrom {@code return new BigMatrixImpl(subMatrixData, false);}
 *  */
    @Test
    public void testGetSubMatrix_EndColumnLessOrEqualData0Length() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {null, null};
        data[1] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.getSubMatrix(1, 1, 1, 1));
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray2 = {null};
        data1[0] = bigDecimalArray2;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        BigDecimal finalBigMatrixImplData10 = bigMatrixImpl.data[1][0];
        BigDecimal finalBigMatrixImplData11 = bigMatrixImpl.data[1][1];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigMatrixImplData10);
        
        assertNull(finalBigMatrixImplData11);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getSubMatrix(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        bigMatrixImpl.getSubMatrix(-1, -255, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_11() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        bigMatrixImpl.getSubMatrix(0, -1, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): False}
 * @utbot.executesCondition {@code (endRow > data.length): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_21() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {
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
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getSubMatrix(14, 139, -255, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): False}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_31() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getSubMatrix(0, 0, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (startRow < 0): False}
 * @utbot.executesCondition {@code (startRow > endRow): False}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetSubMatrix_ThrowMatrixIndexException_4() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getSubMatrix(0, 0, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
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
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null, null, null, null, null, null, null, null, null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data[1] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getSubMatrix(1, 1, 14, 139);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSubMatrix(int, int, int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test
    public void testGetSubMatrix_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(BigMatrixImpl.java:582) */
        bigMatrixImpl.getSubMatrix(0, 0, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.executesCondition {@code (endColumn > data[0].length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startRow; i <= endRow; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(data[i], startColumn, subMatrixData[i - startRow], 0, endColumn - startColumn + 1);
 *  */
    @Test
    public void testGetSubMatrix_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(BigMatrixImpl.java:591) */
        bigMatrixImpl.getSubMatrix(1, 1, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.executesCondition {@code (endColumn > data[0].length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startRow; i <= endRow; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(data[i], startColumn, subMatrixData[i - startRow], 0, endColumn - startColumn + 1);
 *  */
    @Test
    public void testGetSubMatrix_ThrowArrayIndexOutOfBoundsException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 3 out of bounds for object array[2]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(BigMatrixImpl.java:591) */
        bigMatrixImpl.getSubMatrix(1, 1, 2, 2);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test
    public void testGetSubMatrix_ThrowNullPointerException_11() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        data[0] = ((java.math.BigDecimal[]) null);
        java.math.BigDecimal[] bigDecimalArray = {};
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(BigMatrixImpl.java:582) */
        bigMatrixImpl.getSubMatrix(1, 1, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.executesCondition {@code (endRow > data.length): False}
 * @utbot.executesCondition {@code (startColumn < 0): False}
 * @utbot.executesCondition {@code (startColumn > endColumn): False}
 * @utbot.executesCondition {@code (endColumn > data[0].length): False}
 * @utbot.iterates iterate the loop {@code for(int i = startRow; i <= endRow; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(data[i], startColumn, subMatrixData[i - startRow], 0, endColumn - startColumn + 1);
 *  */
    @Test
    public void testGetSubMatrix_ThrowNullPointerException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(BigMatrixImpl.java:591) */
        bigMatrixImpl.getSubMatrix(1, 1, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getSubMatrix(int,int,int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: startRow < 0 || startRow > endRow || endRow > data.length || startColumn < 0 || startColumn > endColumn || endColumn > data[0].length
 *  */
    @Test
    public void testGetSubMatrix_ThrowNullPointerException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getSubMatrix(BigMatrixImpl.java:582) */
        bigMatrixImpl.getSubMatrix(0, 0, -255, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scalarMultiply(java.math.BigDecimal)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#scalarMultiply(java.math.BigDecimal)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.ArithmeticException} in: outDataRow[col] = dataRow[col].multiply(d);
 *  */
    @Test
    public void testScalarMultiply_ThrowArithmeticException() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 1L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", -1073742339);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply] produces [java.lang.ArithmeticException: Overflow]
            java.base/java.math.BigDecimal.checkScale(BigDecimal.java:4410)
            java.base/java.math.BigDecimal.multiply(BigDecimal.java:1572)
            org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(BigMatrixImpl.java:390) */
        bigMatrixImpl.scalarMultiply(bigDecimal1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#scalarMultiply(java.math.BigDecimal)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int columnCount = getColumnDimension();
 *  */
    @Test
    public void testScalarMultiply_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(BigMatrixImpl.java:384) */
        bigMatrixImpl.scalarMultiply(null);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#scalarMultiply(java.math.BigDecimal)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: outDataRow[col] = dataRow[col].multiply(d);
 *  */
    @Test
    public void testScalarMultiply_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(BigMatrixImpl.java:390) */
        bigMatrixImpl.scalarMultiply(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method scalarMultiply(java.math.BigDecimal)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#scalarMultiply(java.math.BigDecimal)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testScalarMultiply_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.scalarMultiply(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method scalarMultiply(java.math.BigDecimal)
    
    @Test
    public void testScalarMultiply1() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MAX_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 1L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.scalarMultiply(bigDecimal1));
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[1];
        BigDecimal bigDecimal2 = new BigDecimal(0);
        bigDecimalArray1[0] = bigDecimal2;
        data1[0] = bigDecimalArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testScalarMultiply2() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[1] = bigDecimal1;
        bigDecimalArray[2] = bigDecimal1;
        bigDecimalArray[3] = bigDecimal1;
        bigDecimalArray[4] = bigDecimal1;
        bigDecimalArray[5] = bigDecimal1;
        bigDecimalArray[6] = bigDecimal1;
        bigDecimalArray[7] = bigDecimal1;
        bigDecimalArray[8] = bigDecimal1;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.scalarMultiply(bigDecimal1));
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal2 = new BigDecimal(0);
        bigDecimalArray1[0] = bigDecimal2;
        BigDecimal bigDecimal3 = new BigDecimal(0);
        bigDecimalArray1[1] = bigDecimal3;
        BigDecimal bigDecimal4 = new BigDecimal(0);
        bigDecimalArray1[2] = bigDecimal4;
        BigDecimal bigDecimal5 = new BigDecimal(0);
        bigDecimalArray1[3] = bigDecimal5;
        BigDecimal bigDecimal6 = new BigDecimal(0);
        bigDecimalArray1[4] = bigDecimal6;
        BigDecimal bigDecimal7 = new BigDecimal(0);
        bigDecimalArray1[5] = bigDecimal7;
        BigDecimal bigDecimal8 = new BigDecimal(0);
        bigDecimalArray1[6] = bigDecimal8;
        BigDecimal bigDecimal9 = new BigDecimal(0);
        bigDecimalArray1[7] = bigDecimal9;
        BigDecimal bigDecimal10 = new BigDecimal(0);
        bigDecimalArray1[8] = bigDecimal10;
        data1[0] = bigDecimalArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method scalarMultiply(java.math.BigDecimal)
    
    @Test
    public void testScalarMultiply3() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal1, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0
        };
        setField(intVal1, "java.math.BigInteger", "mag", mag1);
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal1);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 33554432);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply] produces [java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0]
            java.base/java.math.BigInteger.implMultiplyToLen(BigInteger.java:1771)
            java.base/java.math.BigInteger.multiplyToLen(BigInteger.java:1758)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1617)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            java.base/java.math.BigDecimal.multiply(BigDecimal.java:5611)
            java.base/java.math.BigDecimal.multiply(BigDecimal.java:1583)
            org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(BigMatrixImpl.java:390) */
        bigMatrixImpl.scalarMultiply(bigDecimal1);
    }
    
    @Test
    public void testScalarMultiply4() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[10];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", -2147483646);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", -2147483647);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(BigMatrixImpl.java:390) */
        bigMatrixImpl.scalarMultiply(bigDecimal1);
    }
    
    @Test
    public void testScalarMultiply5() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[26];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", -2147483647);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 1L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal1, "java.math.BigInteger", "signum", 1);
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal1);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", -2147467264);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1724)
            java.base/java.math.BigDecimal.multiply(BigDecimal.java:5607)
            java.base/java.math.BigDecimal.multiply(BigDecimal.java:1577)
            org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(BigMatrixImpl.java:390) */
        bigMatrixImpl.scalarMultiply(bigDecimal1);
    }
    
    @Test
    public void testScalarMultiply6() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2143289345);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 4194304);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.multiply(BigInteger.java:1598)
            java.base/java.math.BigInteger.multiply(BigInteger.java:1586)
            java.base/java.math.BigDecimal.multiply(BigDecimal.java:5611)
            java.base/java.math.BigDecimal.multiply(BigDecimal.java:1583)
            org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(BigMatrixImpl.java:390) */
        bigMatrixImpl.scalarMultiply(bigDecimal1);
    }
    
    @Test
    public void testScalarMultiply7() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", -2147483647);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 33554432);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[1] = bigDecimal1;
        bigDecimalArray[2] = bigDecimal1;
        bigDecimalArray[3] = bigDecimal1;
        bigDecimalArray[4] = bigDecimal1;
        bigDecimalArray[5] = bigDecimal1;
        bigDecimalArray[6] = bigDecimal1;
        bigDecimalArray[7] = bigDecimal1;
        bigDecimalArray[8] = bigDecimal1;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.multiply(BigDecimal.java:5611)
            java.base/java.math.BigDecimal.multiply(BigDecimal.java:1583)
            org.apache.commons.math.linear.BigMatrixImpl.scalarMultiply(BigMatrixImpl.java:390) */
        bigMatrixImpl.scalarMultiply(bigDecimal1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getDataRef
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDataRef()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getDataRef()}
 * @utbot.returnsFrom {@code return data;}
 *  */
    @Test
    public void testGetDataRef_ReturnData() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        
        java.math.BigDecimal[][] actual = bigMatrixImpl.getDataRef();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.scalarAdd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scalarAdd(java.math.BigDecimal)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#scalarAdd(java.math.BigDecimal)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int columnCount = getColumnDimension();
 *  */
    @Test
    public void testScalarAdd_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(BigMatrixImpl.java:365) */
        bigMatrixImpl.scalarAdd(null);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#scalarAdd(java.math.BigDecimal)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: outDataRow[col] = dataRow[col].add(d);
 *  */
    @Test
    public void testScalarAdd_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarAdd] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(BigMatrixImpl.java:371) */
        bigMatrixImpl.scalarAdd(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method scalarAdd(java.math.BigDecimal)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#scalarAdd(java.math.BigDecimal)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < rowCount; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testScalarAdd_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.scalarAdd(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method scalarAdd(java.math.BigDecimal)
    
    @Test
    public void testScalarAdd1() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[1] = bigDecimal1;
        bigDecimalArray[2] = bigDecimal1;
        bigDecimalArray[3] = bigDecimal1;
        bigDecimalArray[4] = bigDecimal1;
        bigDecimalArray[5] = bigDecimal1;
        bigDecimalArray[6] = bigDecimal1;
        bigDecimalArray[7] = bigDecimal1;
        bigDecimalArray[8] = bigDecimal1;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.scalarAdd(bigDecimal1));
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal2 = new BigDecimal(0);
        bigDecimalArray1[0] = bigDecimal2;
        BigDecimal bigDecimal3 = new BigDecimal(0);
        bigDecimalArray1[1] = bigDecimal3;
        BigDecimal bigDecimal4 = new BigDecimal(0);
        bigDecimalArray1[2] = bigDecimal4;
        BigDecimal bigDecimal5 = new BigDecimal(0);
        bigDecimalArray1[3] = bigDecimal5;
        BigDecimal bigDecimal6 = new BigDecimal(0);
        bigDecimalArray1[4] = bigDecimal6;
        BigDecimal bigDecimal7 = new BigDecimal(0);
        bigDecimalArray1[5] = bigDecimal7;
        BigDecimal bigDecimal8 = new BigDecimal(0);
        bigDecimalArray1[6] = bigDecimal8;
        BigDecimal bigDecimal9 = new BigDecimal(0);
        bigDecimalArray1[7] = bigDecimal9;
        BigDecimal bigDecimal10 = new BigDecimal(0);
        bigDecimalArray1[8] = bigDecimal10;
        data1[0] = bigDecimalArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method scalarAdd(java.math.BigDecimal)
    
    @Test
    public void testScalarAdd2() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[2];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", -1073741824);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 1136656384);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 9223372036854775805L);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarAdd] produces [java.lang.ArithmeticException: BigInteger would overflow supported range]
            java.base/java.math.BigInteger.reportOverflow(BigInteger.java:1171)
            java.base/java.math.BigInteger.pow(BigInteger.java:2504)
            java.base/java.math.BigDecimal.bigTenToThe(BigDecimal.java:4095)
            java.base/java.math.BigDecimal.bigMultiplyPowerTen(BigDecimal.java:5082)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5043)
            java.base/java.math.BigDecimal.add(BigDecimal.java:1389)
            org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(BigMatrixImpl.java:371) */
        bigMatrixImpl.scalarAdd(bigDecimal1);
    }
    
    @Test
    public void testScalarAdd3() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 9223372036854775805L);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarAdd] produces [java.lang.ArithmeticException: Underflow]
            java.base/java.math.BigDecimal.checkScale(BigDecimal.java:4522)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5033)
            java.base/java.math.BigDecimal.add(BigDecimal.java:1389)
            org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(BigMatrixImpl.java:371) */
        bigMatrixImpl.scalarAdd(bigDecimal1);
    }
    
    @Test
    public void testScalarAdd4() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        BigDecimal bigDecimal1 = new BigDecimal(0);
        bigDecimalArray[1] = bigDecimal1;
        bigDecimalArray[2] = bigDecimal1;
        bigDecimalArray[3] = bigDecimal1;
        bigDecimalArray[4] = bigDecimal1;
        bigDecimalArray[5] = bigDecimal1;
        bigDecimalArray[6] = bigDecimal1;
        bigDecimalArray[7] = bigDecimal1;
        bigDecimalArray[8] = bigDecimal1;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal2 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal2, "java.math.BigDecimal", "intVal", intVal1);
        setField(bigDecimal2, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal2, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarAdd] produces [java.lang.ArithmeticException: BigInteger would overflow supported range]
            java.base/java.math.BigInteger.reportOverflow(BigInteger.java:1171)
            java.base/java.math.BigInteger.pow(BigInteger.java:2504)
            java.base/java.math.BigDecimal.bigTenToThe(BigDecimal.java:4095)
            java.base/java.math.BigDecimal.bigMultiplyPowerTen(BigDecimal.java:5082)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5043)
            java.base/java.math.BigDecimal.add(BigDecimal.java:1385)
            org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(BigMatrixImpl.java:371) */
        bigMatrixImpl.scalarAdd(bigDecimal2);
    }
    
    @Test
    public void testScalarAdd5() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarAdd] produces [java.lang.ArithmeticException: Underflow]
            java.base/java.math.BigDecimal.checkScale(BigDecimal.java:4532)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5056)
            java.base/java.math.BigDecimal.add(BigDecimal.java:1391)
            org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(BigMatrixImpl.java:371) */
        bigMatrixImpl.scalarAdd(bigDecimal1);
    }
    
    @Test
    public void testScalarAdd6() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarAdd] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(BigMatrixImpl.java:371) */
        bigMatrixImpl.scalarAdd(bigDecimal1);
    }
    
    @Test
    public void testScalarAdd7() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", -2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarAdd] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.add(BigDecimal.java:5064)
            java.base/java.math.BigDecimal.add(BigDecimal.java:1391)
            org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(BigMatrixImpl.java:371) */
        bigMatrixImpl.scalarAdd(bigDecimal1);
    }
    
    @Test
    public void testScalarAdd8() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.scalarAdd] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compactValFor(BigDecimal.java:4422)
            java.base/java.math.BigDecimal.valueOf(BigDecimal.java:1330)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5048)
            java.base/java.math.BigDecimal.add(BigDecimal.java:1385)
            org.apache.commons.math.linear.BigMatrixImpl.scalarAdd(BigMatrixImpl.java:371) */
        bigMatrixImpl.scalarAdd(bigDecimal1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnDimension()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.returnsFrom {@code return data[0].length;}
 *  */
    @Test
    public void testGetColumnDimension_ReturnData0Length() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        int actual = bigMatrixImpl.getColumnDimension();
        
        assertEquals(1, actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnDimension()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return data[0].length;
 *  */
    @Test
    public void testGetColumnDimension_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956) */
        bigMatrixImpl.getColumnDimension();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data[0].length;
 *  */
    @Test
    public void testGetColumnDimension_ThrowNullPointerException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956) */
        bigMatrixImpl.getColumnDimension();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data[0].length;
 *  */
    @Test
    public void testGetColumnDimension_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956) */
        bigMatrixImpl.getColumnDimension();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getDeterminant
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getDeterminant()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getDeterminant()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#isSquare()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isSquare()
 *  */
    @Test
    public void testGetDeterminant_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getDeterminant] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isSquare(BigMatrixImpl.java:921)
            org.apache.commons.math.linear.BigMatrixImpl.getDeterminant(BigMatrixImpl.java:902) */
        bigMatrixImpl.getDeterminant();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getDeterminant()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getDeterminant()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#isSquare()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} when: !isSquare()
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testGetDeterminant_ThrowInvalidMatrixException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getDeterminant();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getDeterminant()
    
    @Test
    public void testGetDeterminant1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = {
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
        bigMatrixImpl.lu = lu;
        bigMatrixImpl.parity = 0;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getDeterminant] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getDeterminant(BigMatrixImpl.java:910) */
        bigMatrixImpl.getDeterminant();
    }
    
    @Test
    public void testGetDeterminant2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = {
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
        bigMatrixImpl.lu = lu;
        bigMatrixImpl.parity = 1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getDeterminant] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getDeterminant(BigMatrixImpl.java:910) */
        bigMatrixImpl.getDeterminant();
    }
    
    @Test
    public void testGetDeterminant3() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {null, null, null, null, null, null, null, null, null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        data[2] = ((java.math.BigDecimal[]) null);
        data[3] = ((java.math.BigDecimal[]) null);
        data[4] = ((java.math.BigDecimal[]) null);
        data[5] = ((java.math.BigDecimal[]) null);
        data[6] = ((java.math.BigDecimal[]) null);
        data[7] = ((java.math.BigDecimal[]) null);
        data[8] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getDeterminant] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.copyOut(BigMatrixImpl.java:1395)
            org.apache.commons.math.linear.BigMatrixImpl.getData(BigMatrixImpl.java:477)
            org.apache.commons.math.linear.BigMatrixImpl.luDecompose(BigMatrixImpl.java:1176)
            org.apache.commons.math.linear.BigMatrixImpl.isSingular(BigMatrixImpl.java:931)
            org.apache.commons.math.linear.BigMatrixImpl.getDeterminant(BigMatrixImpl.java:905) */
        bigMatrixImpl.getDeterminant();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getTrace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTrace()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getTrace()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#isSquare()}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < this.getRowDimension(); i++)} once
 * @utbot.returnsFrom {@code return trace;}
 *  */
    @Test
    public void testGetTrace_BigMatrixImplIsSquare() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        BigDecimal actual = bigMatrixImpl.getTrace();
        
        assertNull(actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getTrace()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getTrace()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isSquare()
 *  */
    @Test
    public void testGetTrace_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getTrace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isSquare(BigMatrixImpl.java:921)
            org.apache.commons.math.linear.BigMatrixImpl.getTrace(BigMatrixImpl.java:968) */
        bigMatrixImpl.getTrace();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getTrace()}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < this.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: trace = trace.add(data[i][i]);
 *  */
    @Test
    public void testGetTrace_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data[1] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getTrace] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getTrace(BigMatrixImpl.java:973) */
        bigMatrixImpl.getTrace();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getTrace()}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < this.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: trace = trace.add(data[i][i]);
 *  */
    @Test
    public void testGetTrace_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getTrace] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getTrace(BigMatrixImpl.java:973) */
        bigMatrixImpl.getTrace();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getTrace()}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < this.getRowDimension(); i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: trace = trace.add(data[i][i]);
 *  */
    @Test
    public void testGetTrace_ThrowNullPointerException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getTrace] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getTrace(BigMatrixImpl.java:973) */
        bigMatrixImpl.getTrace();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getTrace()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getTrace()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#isSquare()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: !isSquare()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTrace_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getTrace();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getTrace()
    
    @Test
    public void testGetTrace1() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[2];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        int[] mag = {0};
        setField(intVal, "java.math.BigInteger", "mag", mag);
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[10];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal1 = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal1, "java.math.BigInteger", "signum", 1);
        int[] mag1 = {0, 0};
        setField(intVal1, "java.math.BigInteger", "mag", mag1);
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal1);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray1[1] = bigDecimal1;
        data[1] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        BigDecimal actual = bigMatrixImpl.getTrace();
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
        
        BigDecimal finalBigMatrixImplData01 = bigMatrixImpl.data[0][1];
        BigDecimal finalBigMatrixImplData10 = bigMatrixImpl.data[1][0];
        BigDecimal finalBigMatrixImplData12 = bigMatrixImpl.data[1][2];
        BigDecimal finalBigMatrixImplData13 = bigMatrixImpl.data[1][3];
        BigDecimal finalBigMatrixImplData14 = bigMatrixImpl.data[1][4];
        BigDecimal finalBigMatrixImplData15 = bigMatrixImpl.data[1][5];
        BigDecimal finalBigMatrixImplData16 = bigMatrixImpl.data[1][6];
        BigDecimal finalBigMatrixImplData17 = bigMatrixImpl.data[1][7];
        BigDecimal finalBigMatrixImplData18 = bigMatrixImpl.data[1][8];
        BigDecimal finalBigMatrixImplData19 = bigMatrixImpl.data[1][9];
        
        assertNull(finalBigMatrixImplData01);
        
        assertNull(finalBigMatrixImplData10);
        
        assertNull(finalBigMatrixImplData12);
        
        assertNull(finalBigMatrixImplData13);
        
        assertNull(finalBigMatrixImplData14);
        
        assertNull(finalBigMatrixImplData15);
        
        assertNull(finalBigMatrixImplData16);
        
        assertNull(finalBigMatrixImplData17);
        
        assertNull(finalBigMatrixImplData18);
        
        assertNull(finalBigMatrixImplData19);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getTrace()
    
    @Test
    public void testGetTrace2() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[2];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[10];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray1[1] = bigDecimal1;
        data[1] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getTrace] produces [java.lang.ArithmeticException: BigInteger would overflow supported range]
            java.base/java.math.BigInteger.reportOverflow(BigInteger.java:1171)
            java.base/java.math.BigInteger.pow(BigInteger.java:2504)
            java.base/java.math.BigDecimal.bigTenToThe(BigDecimal.java:4095)
            java.base/java.math.BigDecimal.bigMultiplyPowerTen(BigDecimal.java:5082)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5058)
            java.base/java.math.BigDecimal.add(BigDecimal.java:1391)
            org.apache.commons.math.linear.BigMatrixImpl.getTrace(BigMatrixImpl.java:973) */
        bigMatrixImpl.getTrace();
    }
    
    @Test
    public void testGetTrace3() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[8][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[8];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal, "java.math.BigDecimal", "scale", -2);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[10];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray1[1] = bigDecimal1;
        data[1] = bigDecimalArray1;
        data[2] = ((java.math.BigDecimal[]) null);
        data[3] = ((java.math.BigDecimal[]) null);
        data[4] = ((java.math.BigDecimal[]) null);
        data[5] = ((java.math.BigDecimal[]) null);
        data[6] = ((java.math.BigDecimal[]) null);
        data[7] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getTrace] produces [java.lang.NullPointerException]
            java.base/java.math.BigInteger.add(BigInteger.java:1326)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5064)
            java.base/java.math.BigDecimal.add(BigDecimal.java:1391)
            org.apache.commons.math.linear.BigMatrixImpl.getTrace(BigMatrixImpl.java:973) */
        bigMatrixImpl.getTrace();
    }
    
    @Test
    public void testGetTrace4() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[2];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[10];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", -2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray1[1] = bigDecimal1;
        data[1] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getTrace] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.add(BigDecimal.java:5064)
            java.base/java.math.BigDecimal.add(BigDecimal.java:1391)
            org.apache.commons.math.linear.BigMatrixImpl.getTrace(BigMatrixImpl.java:973) */
        bigMatrixImpl.getTrace();
    }
    
    @Test
    public void testGetTrace5() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[2];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", Integer.MIN_VALUE);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[10];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        BigInteger intVal = ((BigInteger) createInstance("java.math.BigInteger"));
        setField(intVal, "java.math.BigInteger", "signum", 1);
        setField(bigDecimal1, "java.math.BigDecimal", "intVal", intVal);
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 2);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray1[1] = bigDecimal1;
        data[1] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getTrace] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.compactValFor(BigDecimal.java:4422)
            java.base/java.math.BigDecimal.valueOf(BigDecimal.java:1330)
            java.base/java.math.BigDecimal.add(BigDecimal.java:5048)
            java.base/java.math.BigDecimal.add(BigDecimal.java:1385)
            org.apache.commons.math.linear.BigMatrixImpl.getTrace(BigMatrixImpl.java:973) */
        bigMatrixImpl.getTrace();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.operate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method operate([D)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#operate(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < bd.length; i++)} once
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: bd[i] = new BigDecimal(v[i]);
 *  */
    @Test
    public void testOperate_ThrowNumberFormatException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.NumberFormatException: Infinite or NaN]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:985)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:964)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:1012) */
        bigMatrixImpl.operate(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#operate(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#operate(java.math.BigDecimal[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return operate(bd);
 *  */
    @Test
    public void testOperate_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:986)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:1014) */
        bigMatrixImpl.operate(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#operate(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final BigDecimal[] bd = new BigDecimal[v.length];
 *  */
    @Test
    public void testOperate_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:1010) */
        bigMatrixImpl.operate(((double[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method operate([D)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#operate(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#operate(java.math.BigDecimal[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return operate(bd);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testOperate_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        double[] doubleArray = {};
        
        bigMatrixImpl.operate(doubleArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method operate([D)
    
    @Test
    public void testOperate1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        double[] doubleArray = {3.337610787760802E-308};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:986)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:1014) */
        bigMatrixImpl.operate(doubleArray);
    }
    
    @Test
    public void testOperate2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data[1] = bigDecimalArray1;
        data[2] = bigDecimalArray1;
        data[3] = bigDecimalArray1;
        data[4] = bigDecimalArray1;
        data[5] = bigDecimalArray1;
        data[6] = bigDecimalArray1;
        data[7] = bigDecimalArray1;
        data[8] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:997)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:1014) */
        bigMatrixImpl.operate(doubleArray);
    }
    
    @Test
    public void testOperate3() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        double[] doubleArray = {2.2250738585072014E-308};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:986)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:1014) */
        bigMatrixImpl.operate(doubleArray);
    }
    
    @Test
    public void testOperate4() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        double[] doubleArray = {
            -2.2250738585072014E-308, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:986)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:1014) */
        bigMatrixImpl.operate(doubleArray);
    }
    
    @Test
    public void testOperate5() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data[1] = bigDecimalArray1;
        data[2] = bigDecimalArray1;
        data[3] = bigDecimalArray1;
        data[4] = bigDecimalArray1;
        data[5] = bigDecimalArray1;
        data[6] = bigDecimalArray1;
        data[7] = bigDecimalArray1;
        data[8] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        double[] doubleArray = {2.2250738585072014E-308};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:995)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:1014) */
        bigMatrixImpl.operate(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.operate
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method operate([Ljava.math.BigDecimal;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#operate(java.math.BigDecimal[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: v.length != this.getColumnDimension()
 *  */
    @Test
    public void testOperate_ThrowArrayIndexOutOfBoundsException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        java.math.BigDecimal[] bigDecimalArray = {null};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:986) */
        bigMatrixImpl.operate(bigDecimalArray);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#operate(java.math.BigDecimal[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: v.length != this.getColumnDimension()
 *  */
    @Test
    public void testOperate_ThrowNullPointerException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:986) */
        bigMatrixImpl.operate(((java.math.BigDecimal[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method operate([Ljava.math.BigDecimal;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#operate(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (v.length != this.getColumnDimension()): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: v.length != this.getColumnDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testOperate_ThrowIllegalArgumentException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[] bigDecimalArray1 = {};
        
        bigMatrixImpl.operate(bigDecimalArray1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method operate([Ljava.math.BigDecimal;)
    
    @Test
    public void testOperate6() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        data[2] = ((java.math.BigDecimal[]) null);
        data[3] = ((java.math.BigDecimal[]) null);
        data[4] = ((java.math.BigDecimal[]) null);
        data[5] = ((java.math.BigDecimal[]) null);
        data[6] = ((java.math.BigDecimal[]) null);
        data[7] = ((java.math.BigDecimal[]) null);
        data[8] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        java.math.BigDecimal[] bigDecimalArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:997) */
        bigMatrixImpl.operate(bigDecimalArray1);
    }
    
    @Test
    public void testOperate7() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray = {null, null, null, null, null, null, null, null, null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {null, null, null, null, null, null, null, null, null};
        data[1] = bigDecimalArray1;
        data[2] = bigDecimalArray1;
        data[3] = bigDecimalArray1;
        data[4] = bigDecimalArray1;
        data[5] = bigDecimalArray1;
        data[6] = bigDecimalArray1;
        data[7] = bigDecimalArray1;
        data[8] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.operate] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.operate(BigMatrixImpl.java:995) */
        bigMatrixImpl.operate(bigDecimalArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getColumn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumn(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumn(int)}
 * @utbot.executesCondition {@code (!isValidCoordinate(0, col)): False}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetColumn_IsValidCoordinate() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        java.math.BigDecimal[] actual = bigMatrixImpl.getColumn(0);
        
        java.math.BigDecimal[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getColumn(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumn(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(0, col)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetColumn_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getColumn(-1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumn(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(0, col)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetColumn_ThrowMatrixIndexException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getColumn(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumn(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumn(int)}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isValidCoordinate(0, col)
 *  */
    @Test
    public void testGetColumn_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getColumn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isValidCoordinate(BigMatrixImpl.java:1462)
            org.apache.commons.math.linear.BigMatrixImpl.getColumn(BigMatrixImpl.java:789) */
        bigMatrixImpl.getColumn(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.inverse
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method inverse()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#inverse()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.MatrixUtils#createBigIdentityMatrix(int)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return solve(MatrixUtils.createBigIdentityMatrix(getRowDimension()));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testInverse_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.inverse();
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inverse()
    
    @Test
    public void testInverse1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.inverse] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isSquare(BigMatrixImpl.java:921)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1100)
            org.apache.commons.math.linear.BigMatrixImpl.inverse(BigMatrixImpl.java:892) */
        bigMatrixImpl.inverse();
    }
    
    @Test
    public void testInverse2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {
            null,
            null
        };
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.inverse] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isSquare(BigMatrixImpl.java:921)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1100)
            org.apache.commons.math.linear.BigMatrixImpl.inverse(BigMatrixImpl.java:892) */
        bigMatrixImpl.inverse();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.solve
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve([D)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < bd.length; i++)} once
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: bd[i] = new BigDecimal(b[i]);
 *  */
    @Test
    public void testSolve_ThrowNumberFormatException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        double[] doubleArray = {java.lang.Double.NaN};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NumberFormatException: Infinite or NaN]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:985)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:964)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1080) */
        bigMatrixImpl.solve(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isSquare(BigMatrixImpl.java:921)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1100)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1058)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1082) */
        bigMatrixImpl.solve(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final BigDecimal[] bd = new BigDecimal[b.length];
 *  */
    @Test
    public void testSolve_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1078) */
        bigMatrixImpl.solve(((double[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve([D)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(double[])}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return solve(bd);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        double[] doubleArray = {};
        
        bigMatrixImpl.solve(doubleArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method solve([D)
    
    @Test
    public void testSolve1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        double[] doubleArray = {2.2250759805029923E-308};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getRowDimension(BigMatrixImpl.java:947)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1053)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1082) */
        bigMatrixImpl.solve(doubleArray);
    }
    
    @Test
    public void testSolve2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        double[] doubleArray = {
            1.4916681462400413E-154, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getRowDimension(BigMatrixImpl.java:947)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1053)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1082) */
        bigMatrixImpl.solve(doubleArray);
    }
    
    @Test
    public void testSolve3() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        double[] doubleArray = {2.2294197058870983E-308};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isSquare(BigMatrixImpl.java:921)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1100)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1058)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1082) */
        bigMatrixImpl.solve(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.solve
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve([Ljava.math.BigDecimal;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (b.length != nRows): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: b.length != nRows
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        
        bigMatrixImpl.solve(bigDecimalArray);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} in: final BigDecimal[][] solution = ((BigMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testSolve_ThrowInvalidMatrixException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        
        bigMatrixImpl.solve(bigDecimalArray1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: final BigDecimal[][] solution = ((BigMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSolve_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = {null};
        bigMatrixImpl.lu = lu;
        int[] permutation = {-256};
        bigMatrixImpl.permutation = permutation;
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        
        bigMatrixImpl.solve(bigDecimalArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve([Ljava.math.BigDecimal;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        java.math.BigDecimal[] bigDecimalArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isSquare(BigMatrixImpl.java:921)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1100)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1058) */
        bigMatrixImpl.solve(bigDecimalArray);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final BigDecimal[][] solution = ((BigMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = {null};
        bigMatrixImpl.lu = lu;
        int[] permutation = {};
        bigMatrixImpl.permutation = permutation;
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1116)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1058) */
        bigMatrixImpl.solve(bigDecimalArray1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final BigDecimal[][] solution = ((BigMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = {};
        bigMatrixImpl.lu = lu;
        int[] permutation = {0};
        bigMatrixImpl.permutation = permutation;
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1134)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1058) */
        bigMatrixImpl.solve(bigDecimalArray1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final BigDecimal[][] solution = ((BigMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_3() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        lu[0] = bigDecimalArray1;
        bigMatrixImpl.lu = lu;
        int[] permutation = {0};
        bigMatrixImpl.permutation = permutation;
        java.math.BigDecimal[] bigDecimalArray2 = {null};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1134)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1058) */
        bigMatrixImpl.solve(bigDecimalArray2);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.executesCondition {@code (b.length != nRows): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: final BigDecimal[][] solution = ((BigMatrixImpl) (solve(bMatrix))).getDataRef();
 *  */
    @Test
    public void testSolve_ThrowIllegalArgumentException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = data;
        int[] permutation = {0};
        bigMatrixImpl.permutation = permutation;
        bigMatrixImpl.setRoundingMode(-1);
        bigMatrixImpl.setScale(-255);
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = new BigDecimal(0);
        bigDecimalArray1[0] = bigDecimal;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.IllegalArgumentException: Invalid rounding mode]
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1647)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1136)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1058) */
        bigMatrixImpl.solve(bigDecimalArray1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(java.math.BigDecimal[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: b.length != nRows
 *  */
    @Test
    public void testSolve_ThrowNullPointerException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1054) */
        bigMatrixImpl.solve(((java.math.BigDecimal[]) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method solve([Ljava.math.BigDecimal;)
    
    @Test
    public void testSolve4() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", 2147352577);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray1[0] = bigDecimal;
        lu[0] = bigDecimalArray1;
        lu[1] = ((java.math.BigDecimal[]) null);
        lu[2] = ((java.math.BigDecimal[]) null);
        lu[3] = ((java.math.BigDecimal[]) null);
        lu[4] = ((java.math.BigDecimal[]) null);
        lu[5] = ((java.math.BigDecimal[]) null);
        lu[6] = ((java.math.BigDecimal[]) null);
        lu[7] = ((java.math.BigDecimal[]) null);
        lu[8] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.lu = lu;
        int[] permutation = {
            0, 0, 0, 0, 0, 0, 0, 0,
            0, 0
        };
        bigMatrixImpl.permutation = permutation;
        bigMatrixImpl.setRoundingMode(0);
        bigMatrixImpl.setScale(131072);
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[1];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", Integer.MAX_VALUE);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray2[0] = bigDecimal1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.divideAndRound(BigDecimal.java:4888)
            java.base/java.math.BigDecimal.divide(BigDecimal.java:5801)
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1652)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1136)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1058) */
        bigMatrixImpl.solve(bigDecimalArray2);
    }
    
    @Test
    public void testSolve5() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = new java.math.BigDecimal[9][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "scale", -534708087);
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", java.lang.Long.MIN_VALUE);
        bigDecimalArray1[0] = bigDecimal;
        lu[0] = bigDecimalArray1;
        lu[1] = ((java.math.BigDecimal[]) null);
        lu[2] = ((java.math.BigDecimal[]) null);
        lu[3] = ((java.math.BigDecimal[]) null);
        lu[4] = ((java.math.BigDecimal[]) null);
        lu[5] = ((java.math.BigDecimal[]) null);
        lu[6] = ((java.math.BigDecimal[]) null);
        lu[7] = ((java.math.BigDecimal[]) null);
        lu[8] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.lu = lu;
        int[] permutation = {
            0, 138, 138, 138, 138, 138, 138, 138,
            138
        };
        bigMatrixImpl.permutation = permutation;
        bigMatrixImpl.setRoundingMode(0);
        bigMatrixImpl.setScale(Integer.MIN_VALUE);
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[1];
        BigDecimal bigDecimal1 = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal1, "java.math.BigDecimal", "scale", 138);
        setField(bigDecimal1, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray2[0] = bigDecimal1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            java.base/java.math.BigDecimal.checkScale(BigDecimal.java:4531)
            java.base/java.math.BigDecimal.divide(BigDecimal.java:5798)
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1652)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1136)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1058) */
        bigMatrixImpl.solve(bigDecimalArray2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.solve
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method solve(org.apache.commons.math.linear.BigMatrix)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !this.isSquare()
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isSquare(BigMatrixImpl.java:921)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1100) */
        bigMatrixImpl.solve(bigMatrixImpl);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final BigDecimal luDiag = lu[col][col];
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_21() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = {};
        bigMatrixImpl.lu = lu;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1134) */
        bigMatrixImpl.solve(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final BigDecimal luDiag = lu[col][col];
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_31() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        lu[0] = bigDecimalArray1;
        bigMatrixImpl.lu = lu;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        bigMatrixImpl1.data = lu;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1134) */
        bigMatrixImpl.solve(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: bpCol[j] = bpCol[j].divide(luDiag, scale, roundingMode);
 *  */
    @Test
    public void testSolve_ThrowIllegalArgumentException2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = data;
        int[] permutation = {0};
        bigMatrixImpl.permutation = permutation;
        bigMatrixImpl.setRoundingMode(-1);
        bigMatrixImpl.setScale(-255);
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = new java.math.BigDecimal[1];
        BigDecimal bigDecimal = new BigDecimal(0);
        bigDecimalArray1[0] = bigDecimal;
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.IllegalArgumentException: Invalid rounding mode]
            java.base/java.math.BigDecimal.divide(BigDecimal.java:1647)
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1136) */
        bigMatrixImpl.solve(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: bpRow[col] = b.getEntry(permutation[row], col);
 *  */
    @Test
    public void testSolve_ThrowArrayIndexOutOfBoundsException_11() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = data;
        int[] permutation = {};
        bigMatrixImpl.permutation = permutation;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1116) */
        bigMatrixImpl.solve(bigMatrixImpl);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrix#getRowDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: b.getRowDimension() != this.getRowDimension()
 *  */
    @Test
    public void testSolve_ThrowNullPointerException2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1097) */
        bigMatrixImpl.solve(((BigMatrix) null));
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final BigDecimal luDiag = lu[col][col];
 *  */
    @Test
    public void testSolve_ThrowNullPointerException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] lu = {null};
        bigMatrixImpl.lu = lu;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1134) */
        bigMatrixImpl.solve(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bpRow[col] = b.getEntry(permutation[row], col);
 *  */
    @Test
    public void testSolve_ThrowNullPointerException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = data;
        bigMatrixImpl.permutation = null;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1116) */
        bigMatrixImpl.solve(bigMatrixImpl);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: bpCol[j] = bpCol[j].divide(luDiag, scale, roundingMode);
 *  */
    @Test
    public void testSolve_ThrowNullPointerException_3() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = data;
        int[] permutation = {0};
        bigMatrixImpl.permutation = permutation;
        bigMatrixImpl.setRoundingMode(-255);
        bigMatrixImpl.setScale(-255);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.solve] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.solve(BigMatrixImpl.java:1136) */
        bigMatrixImpl.solve(bigMatrixImpl);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method solve(org.apache.commons.math.linear.BigMatrix)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: b.getRowDimension() != this.getRowDimension()
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException_11() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = {
            null,
            null
        };
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.solve(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} when: !this.isSquare()
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testSolve_ThrowInvalidMatrixException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.solve(bigMatrixImpl);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.iterates iterate the loop {@code for(int col = 0; col < nCol; col++)} once
 * @utbot.iterates iterate the loop {@code for(int col = nCol - 1; col >= 0; col--)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(bp, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSolve_ThrowIllegalArgumentException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = data;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data1[0] = bigDecimalArray1;
        bigMatrixImpl1.data = data1;
        
        bigMatrixImpl.solve(bigMatrixImpl1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#solve(org.apache.commons.math.linear.BigMatrix)}
 * @utbot.executesCondition {@code (b.getRowDimension() != this.getRowDimension()): False}
 * @utbot.executesCondition {@code (!this.isSquare()): False}
 * @utbot.executesCondition {@code (this.isSingular()): False}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRowB; row++)} once
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: bpRow[col] = b.getEntry(permutation[row], col);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSolve_ThrowMatrixIndexException1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = data;
        int[] permutation = {2};
        bigMatrixImpl.permutation = permutation;
        BigMatrixImpl bigMatrixImpl1 = new BigMatrixImpl();
        bigMatrixImpl1.data = data;
        
        bigMatrixImpl.solve(bigMatrixImpl1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getEntryAsDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEntryAsDouble(int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getEntryAsDouble(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getEntry(int,int)}
 * @utbot.invokes {@link java.math.BigDecimal#doubleValue()}
 * @utbot.returnsFrom {@code return getEntry(row, column).doubleValue();}
 *  */
    @Test
    public void testGetEntryAsDouble_BigDecimalDoubleValue() throws Exception  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[9];
        BigDecimal bigDecimal = ((BigDecimal) createInstance("java.math.BigDecimal"));
        setField(bigDecimal, "java.math.BigDecimal", "intCompact", 0L);
        bigDecimalArray[0] = bigDecimal;
        data[0] = bigDecimalArray;
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        double actual = bigMatrixImpl.getEntryAsDouble(1, 0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
        
        BigDecimal finalBigMatrixImplData01 = bigMatrixImpl.data[0][1];
        BigDecimal finalBigMatrixImplData02 = bigMatrixImpl.data[0][2];
        BigDecimal finalBigMatrixImplData03 = bigMatrixImpl.data[0][3];
        BigDecimal finalBigMatrixImplData04 = bigMatrixImpl.data[0][4];
        BigDecimal finalBigMatrixImplData05 = bigMatrixImpl.data[0][5];
        BigDecimal finalBigMatrixImplData06 = bigMatrixImpl.data[0][6];
        BigDecimal finalBigMatrixImplData07 = bigMatrixImpl.data[0][7];
        BigDecimal finalBigMatrixImplData08 = bigMatrixImpl.data[0][8];
        
        assertNull(finalBigMatrixImplData01);
        
        assertNull(finalBigMatrixImplData02);
        
        assertNull(finalBigMatrixImplData03);
        
        assertNull(finalBigMatrixImplData04);
        
        assertNull(finalBigMatrixImplData05);
        
        assertNull(finalBigMatrixImplData06);
        
        assertNull(finalBigMatrixImplData07);
        
        assertNull(finalBigMatrixImplData08);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEntryAsDouble(int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getEntryAsDouble(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getEntry(int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getEntry(row, column).doubleValue();
 *  */
    @Test
    public void testGetEntryAsDouble_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        data[0] = ((java.math.BigDecimal[]) null);
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getEntryAsDouble] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getEntryAsDouble(BigMatrixImpl.java:864) */
        bigMatrixImpl.getEntryAsDouble(1, 1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEntryAsDouble(int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getEntryAsDouble(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return getEntry(row, column).doubleValue();
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntryAsDouble_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        data[0] = ((java.math.BigDecimal[]) null);
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[1] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getEntryAsDouble(1, -256);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getEntryAsDouble(int,int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: return getEntry(row, column).doubleValue();
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetEntryAsDouble_ThrowMatrixIndexException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getEntryAsDouble(-256, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method setSubMatrix([[Ljava.math.BigDecimal;, int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (data == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 *  */
    @Test
    public void testSetSubMatrix_DataNotEqualsNull() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = null;
        java.math.BigDecimal[][] bigDecimalArray1 = new java.math.BigDecimal[1][];
        bigDecimalArray1[0] = bigDecimalArray;
        
        bigMatrixImpl.setSubMatrix(bigDecimalArray1, 0, 0);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        BigDecimal finalBigDecimalArray100 = bigDecimalArray1[0][0];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigDecimalArray100);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (data == null): True}
 * @utbot.executesCondition {@code (row > 0): False}
 * @utbot.executesCondition {@code (column > 0): False}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 *  */
    @Test
    public void testSetSubMatrix_ColumnLessOrEqualZero() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        bigMatrixImpl.lu = null;
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        bigDecimalArray[0] = bigDecimalArray1;
        
        java.math.BigDecimal[][] initialBigMatrixImplData = bigMatrixImpl.data;
        
        bigMatrixImpl.setSubMatrix(bigDecimalArray, 0, 0);
        
        java.math.BigDecimal[][] finalBigMatrixImplData = bigMatrixImpl.data;
        
        BigDecimal finalBigDecimalArray00 = bigDecimalArray[0][0];
        
        assertFalse(initialBigMatrixImplData == finalBigMatrixImplData);
        
        assertNull(finalBigDecimalArray00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method setSubMatrix([[Ljava.math.BigDecimal;, int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: nRows == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] bigDecimalArray = {};
        
        bigMatrixImpl.setSubMatrix(bigDecimalArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: nCols == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_ThrowIllegalArgumentException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        bigDecimalArray[0] = bigDecimalArray1;
        
        bigMatrixImpl.setSubMatrix(bigDecimalArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.iterates iterate the loop {@code for(int r = 1; r < nRows; r++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: subMatrix[r].length != nCols
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testSetSubMatrix_ThrowIllegalArgumentException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray1 = {null, null};
        bigDecimalArray[0] = bigDecimalArray1;
        java.math.BigDecimal[] bigDecimalArray2 = {null};
        bigDecimalArray[1] = bigDecimalArray2;
        
        bigMatrixImpl.setSubMatrix(bigDecimalArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: (row < 0) || (column < 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        bigMatrixImpl.setSubMatrix(null, -1, -255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: (row < 0) || (column < 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_ThrowMatrixIndexException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        bigMatrixImpl.setSubMatrix(null, 0, -1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.executesCondition {@code (data == null): False}
 * @utbot.executesCondition {@code ((nRows + row) > this.getRowDimension()): True}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: ((nRows + row) > this.getRowDimension()) || (nCols + column > this.getColumnDimension())
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_ThrowMatrixIndexException_3() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        bigDecimalArray[0] = bigDecimalArray1;
        
        bigMatrixImpl.setSubMatrix(bigDecimalArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (row < 0): False}
 * @utbot.executesCondition {@code (column < 0): False}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.executesCondition {@code (data == null): False}
 * @utbot.executesCondition {@code ((nRows + row) > this.getRowDimension()): False}
 * @utbot.executesCondition {@code ((nCols + column > this.getColumnDimension())): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: ((nRows + row) > this.getRowDimension()) || (nCols + column > this.getColumnDimension())
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testSetSubMatrix_ThrowMatrixIndexException_4() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] bigDecimalArray1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray2 = {null};
        bigDecimalArray1[0] = bigDecimalArray2;
        
        bigMatrixImpl.setSubMatrix(bigDecimalArray1, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
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
    public void testSetSubMatrix_ThrowMatrixIndexException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        bigDecimalArray[0] = bigDecimalArray1;
        
        bigMatrixImpl.setSubMatrix(bigDecimalArray, 0, 1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
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
    public void testSetSubMatrix_ThrowMatrixIndexException_5() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        bigDecimalArray[0] = bigDecimalArray1;
        bigDecimalArray[1] = bigDecimalArray1;
        
        bigMatrixImpl.setSubMatrix(bigDecimalArray, 1, 0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method setSubMatrix([[Ljava.math.BigDecimal;, int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
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
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[40][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        data[2] = ((java.math.BigDecimal[]) null);
        data[3] = ((java.math.BigDecimal[]) null);
        data[4] = ((java.math.BigDecimal[]) null);
        data[5] = ((java.math.BigDecimal[]) null);
        data[6] = ((java.math.BigDecimal[]) null);
        data[7] = ((java.math.BigDecimal[]) null);
        data[8] = ((java.math.BigDecimal[]) null);
        data[9] = ((java.math.BigDecimal[]) null);
        data[10] = ((java.math.BigDecimal[]) null);
        data[11] = ((java.math.BigDecimal[]) null);
        data[12] = ((java.math.BigDecimal[]) null);
        data[13] = ((java.math.BigDecimal[]) null);
        data[14] = ((java.math.BigDecimal[]) null);
        data[15] = ((java.math.BigDecimal[]) null);
        data[16] = ((java.math.BigDecimal[]) null);
        data[17] = ((java.math.BigDecimal[]) null);
        data[18] = ((java.math.BigDecimal[]) null);
        data[19] = ((java.math.BigDecimal[]) null);
        data[20] = ((java.math.BigDecimal[]) null);
        data[21] = ((java.math.BigDecimal[]) null);
        data[22] = ((java.math.BigDecimal[]) null);
        data[23] = ((java.math.BigDecimal[]) null);
        data[24] = ((java.math.BigDecimal[]) null);
        data[25] = ((java.math.BigDecimal[]) null);
        data[26] = ((java.math.BigDecimal[]) null);
        data[27] = ((java.math.BigDecimal[]) null);
        data[28] = ((java.math.BigDecimal[]) null);
        data[29] = ((java.math.BigDecimal[]) null);
        data[30] = ((java.math.BigDecimal[]) null);
        data[31] = ((java.math.BigDecimal[]) null);
        data[32] = ((java.math.BigDecimal[]) null);
        data[33] = ((java.math.BigDecimal[]) null);
        data[34] = ((java.math.BigDecimal[]) null);
        data[35] = ((java.math.BigDecimal[]) null);
        data[36] = ((java.math.BigDecimal[]) null);
        data[37] = ((java.math.BigDecimal[]) null);
        data[38] = ((java.math.BigDecimal[]) null);
        data[39] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] bigDecimalArray1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray2 = {null};
        bigDecimalArray1[0] = bigDecimalArray2;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2147483647 out of bounds for length 40]
            org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix(BigMatrixImpl.java:692) */
        bigMatrixImpl.setSubMatrix(bigDecimalArray1, Integer.MAX_VALUE, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.executesCondition {@code (data == null): False}
 * @utbot.executesCondition {@code ((nRows + row) > this.getRowDimension()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: (nCols + column > this.getColumnDimension())
 *  */
    @Test
    public void testSetSubMatrix_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        bigDecimalArray[0] = bigDecimalArray1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix(BigMatrixImpl.java:688) */
        bigMatrixImpl.setSubMatrix(bigDecimalArray, Integer.MAX_VALUE, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nCols = subMatrix[0].length;
 *  */
    @Test
    public void testSetSubMatrix_ThrowNullPointerException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] bigDecimalArray = {null};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix(BigMatrixImpl.java:670) */
        bigMatrixImpl.setSubMatrix(bigDecimalArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.executesCondition {@code (nRows == 0): False}
 * @utbot.executesCondition {@code (nCols == 0): False}
 * @utbot.iterates iterate the loop {@code for(int r = 1; r < nRows; r++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: subMatrix[r].length != nCols
 *  */
    @Test
    public void testSetSubMatrix_ThrowNullPointerException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        bigDecimalArray[0] = bigDecimalArray1;
        bigDecimalArray[1] = ((java.math.BigDecimal[]) null);
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix(BigMatrixImpl.java:676) */
        bigMatrixImpl.setSubMatrix(bigDecimalArray, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nRows = subMatrix.length;
 *  */
    @Test
    public void testSetSubMatrix_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix(BigMatrixImpl.java:665) */
        bigMatrixImpl.setSubMatrix(null, 0, 0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#setSubMatrix(java.math.BigDecimal[][],int,int)}
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
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] bigDecimalArray1 = new java.math.BigDecimal[1][];
        bigDecimalArray1[0] = bigDecimalArray;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BigMatrixImpl.setSubMatrix(BigMatrixImpl.java:692) */
        bigMatrixImpl.setSubMatrix(bigDecimalArray1, 1, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.isSingular
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSingular()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isSingular()}
 * @utbot.executesCondition {@code (lu == null): False}
 *  */
    @Test
    public void testIsSingular_LuNotEqualsNull() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] lu = {null};
        bigMatrixImpl.lu = lu;
        
        boolean actual = bigMatrixImpl.isSingular();
        
        assertFalse(actual);
        
        java.math.BigDecimal[] finalBigMatrixImplLu0 = bigMatrixImpl.lu[0];
        
        assertNull(finalBigMatrixImplLu0);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isSingular()}
 * @utbot.executesCondition {@code (lu == null): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#luDecompose()}
 * @utbot.returnsFrom {@code return true;}
 * @utbot.caughtException {@code InvalidMatrixException ex}
 *  */
    @Test
    public void testIsSingular_CatchInvalidMatrixException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = null;
        
        boolean actual = bigMatrixImpl.isSingular();
        
        assertTrue(actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        java.math.BigDecimal[] finalBigMatrixImplData1 = bigMatrixImpl.data[1];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigMatrixImplData1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSingular()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isSingular()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: luDecompose();
 *  */
    @Test
    public void testIsSingular_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.isSingular] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.luDecompose(BigMatrixImpl.java:1172)
            org.apache.commons.math.linear.BigMatrixImpl.isSingular(BigMatrixImpl.java:931) */
        bigMatrixImpl.isSingular();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isSingular()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: luDecompose();
 *  */
    @Test
    public void testIsSingular_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.isSingular] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.copyOut(BigMatrixImpl.java:1395)
            org.apache.commons.math.linear.BigMatrixImpl.getData(BigMatrixImpl.java:477)
            org.apache.commons.math.linear.BigMatrixImpl.luDecompose(BigMatrixImpl.java:1176)
            org.apache.commons.math.linear.BigMatrixImpl.isSingular(BigMatrixImpl.java:931) */
        bigMatrixImpl.isSingular();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.transpose
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method transpose()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#transpose()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.returnsFrom {@code return new BigMatrixImpl(outData, false);}
 *  */
    @Test
    public void testTranspose_BigMatrixImplGetColumnDimension() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.transpose());
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method transpose()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#transpose()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = this.getColumnDimension();
 *  */
    @Test
    public void testTranspose_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.transpose] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.transpose(BigMatrixImpl.java:874) */
        bigMatrixImpl.transpose();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method transpose()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#transpose()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(outData, false);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTranspose_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.transpose();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getRow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRow(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRow(int)}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetRow_SystemArraycopy() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        java.math.BigDecimal[] actual = bigMatrixImpl.getRow(0);
        
        java.math.BigDecimal[] expected = {null};
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRow(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRow_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getRow(129);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRow_ThrowMatrixIndexException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getRow(-1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRow_ThrowMatrixIndexException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getRow(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRow(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isValidCoordinate(row, 0)
 *  */
    @Test
    public void testGetRow_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRow] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isValidCoordinate(BigMatrixImpl.java:1462)
            org.apache.commons.math.linear.BigMatrixImpl.getRow(BigMatrixImpl.java:746) */
        bigMatrixImpl.getRow(-255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(data[row], 0, out, 0, ncols);
 *  */
    @Test
    public void testGetRow_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data[1] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRow] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 1 out of bounds for object array[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BigMatrixImpl.getRow(BigMatrixImpl.java:751) */
        bigMatrixImpl.getRow(1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRow(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(data[row], 0, out, 0, ncols);
 *  */
    @Test
    public void testGetRow_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRow] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BigMatrixImpl.getRow(BigMatrixImpl.java:751) */
        bigMatrixImpl.getRow(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getColumnMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getColumnMatrix(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnMatrix(int)}
 * @utbot.executesCondition {@code (!isValidCoordinate(0, column)): False}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.iterates iterate the loop {@code for(int row = 0; row < nRows; row++)} once
 *  */
    @Test
    public void testGetColumnMatrix_IsValidCoordinate() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = new java.math.BigDecimal[32];
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.getColumnMatrix(2));
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        BigDecimal finalBigMatrixImplData01 = bigMatrixImpl.data[0][1];
        BigDecimal finalBigMatrixImplData02 = bigMatrixImpl.data[0][2];
        BigDecimal finalBigMatrixImplData03 = bigMatrixImpl.data[0][3];
        BigDecimal finalBigMatrixImplData04 = bigMatrixImpl.data[0][4];
        BigDecimal finalBigMatrixImplData05 = bigMatrixImpl.data[0][5];
        BigDecimal finalBigMatrixImplData06 = bigMatrixImpl.data[0][6];
        BigDecimal finalBigMatrixImplData07 = bigMatrixImpl.data[0][7];
        BigDecimal finalBigMatrixImplData08 = bigMatrixImpl.data[0][8];
        BigDecimal finalBigMatrixImplData09 = bigMatrixImpl.data[0][9];
        BigDecimal finalBigMatrixImplData010 = bigMatrixImpl.data[0][10];
        BigDecimal finalBigMatrixImplData011 = bigMatrixImpl.data[0][11];
        BigDecimal finalBigMatrixImplData012 = bigMatrixImpl.data[0][12];
        BigDecimal finalBigMatrixImplData013 = bigMatrixImpl.data[0][13];
        BigDecimal finalBigMatrixImplData014 = bigMatrixImpl.data[0][14];
        BigDecimal finalBigMatrixImplData015 = bigMatrixImpl.data[0][15];
        BigDecimal finalBigMatrixImplData016 = bigMatrixImpl.data[0][16];
        BigDecimal finalBigMatrixImplData017 = bigMatrixImpl.data[0][17];
        BigDecimal finalBigMatrixImplData018 = bigMatrixImpl.data[0][18];
        BigDecimal finalBigMatrixImplData019 = bigMatrixImpl.data[0][19];
        BigDecimal finalBigMatrixImplData020 = bigMatrixImpl.data[0][20];
        BigDecimal finalBigMatrixImplData021 = bigMatrixImpl.data[0][21];
        BigDecimal finalBigMatrixImplData022 = bigMatrixImpl.data[0][22];
        BigDecimal finalBigMatrixImplData023 = bigMatrixImpl.data[0][23];
        BigDecimal finalBigMatrixImplData024 = bigMatrixImpl.data[0][24];
        BigDecimal finalBigMatrixImplData025 = bigMatrixImpl.data[0][25];
        BigDecimal finalBigMatrixImplData026 = bigMatrixImpl.data[0][26];
        BigDecimal finalBigMatrixImplData027 = bigMatrixImpl.data[0][27];
        BigDecimal finalBigMatrixImplData028 = bigMatrixImpl.data[0][28];
        BigDecimal finalBigMatrixImplData029 = bigMatrixImpl.data[0][29];
        BigDecimal finalBigMatrixImplData030 = bigMatrixImpl.data[0][30];
        BigDecimal finalBigMatrixImplData031 = bigMatrixImpl.data[0][31];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigMatrixImplData01);
        
        assertNull(finalBigMatrixImplData02);
        
        assertNull(finalBigMatrixImplData03);
        
        assertNull(finalBigMatrixImplData04);
        
        assertNull(finalBigMatrixImplData05);
        
        assertNull(finalBigMatrixImplData06);
        
        assertNull(finalBigMatrixImplData07);
        
        assertNull(finalBigMatrixImplData08);
        
        assertNull(finalBigMatrixImplData09);
        
        assertNull(finalBigMatrixImplData010);
        
        assertNull(finalBigMatrixImplData011);
        
        assertNull(finalBigMatrixImplData012);
        
        assertNull(finalBigMatrixImplData013);
        
        assertNull(finalBigMatrixImplData014);
        
        assertNull(finalBigMatrixImplData015);
        
        assertNull(finalBigMatrixImplData016);
        
        assertNull(finalBigMatrixImplData017);
        
        assertNull(finalBigMatrixImplData018);
        
        assertNull(finalBigMatrixImplData019);
        
        assertNull(finalBigMatrixImplData020);
        
        assertNull(finalBigMatrixImplData021);
        
        assertNull(finalBigMatrixImplData022);
        
        assertNull(finalBigMatrixImplData023);
        
        assertNull(finalBigMatrixImplData024);
        
        assertNull(finalBigMatrixImplData025);
        
        assertNull(finalBigMatrixImplData026);
        
        assertNull(finalBigMatrixImplData027);
        
        assertNull(finalBigMatrixImplData028);
        
        assertNull(finalBigMatrixImplData029);
        
        assertNull(finalBigMatrixImplData030);
        
        assertNull(finalBigMatrixImplData031);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getColumnMatrix(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnMatrix(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(0, column)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrix_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getColumnMatrix(-1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnMatrix(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(0, column)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetColumnMatrix_ThrowMatrixIndexException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getColumnMatrix(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getColumnMatrix(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnMatrix(int)}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isValidCoordinate(0, column)
 *  */
    @Test
    public void testGetColumnMatrix_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getColumnMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isValidCoordinate(BigMatrixImpl.java:1462)
            org.apache.commons.math.linear.BigMatrixImpl.getColumnMatrix(BigMatrixImpl.java:724) */
        bigMatrixImpl.getColumnMatrix(-255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.isSquare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isSquare()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isSquare()}
 * @utbot.returnsFrom {@code return (this.getColumnDimension() == this.getRowDimension());}
 *  */
    @Test
    public void testIsSquare_ThisGetColumnDimensionEqualsThisGetRowDimension() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        boolean actual = bigMatrixImpl.isSquare();
        
        assertTrue(actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isSquare()}
 * @utbot.returnsFrom {@code return (this.getColumnDimension() == this.getRowDimension());}
 *  */
    @Test
    public void testIsSquare_ThisGetColumnDimensionNotEqualsThisGetRowDimension() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        boolean actual = bigMatrixImpl.isSquare();
        
        assertFalse(actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        java.math.BigDecimal[] finalBigMatrixImplData1 = bigMatrixImpl.data[1];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigMatrixImplData1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isSquare()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isSquare()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return (this.getColumnDimension() == this.getRowDimension());
 *  */
    @Test
    public void testIsSquare_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.isSquare] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isSquare(BigMatrixImpl.java:921) */
        bigMatrixImpl.isSquare();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowMatrix(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowMatrix(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.invokes org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return new BigMatrixImpl(out, false);}
 *  */
    @Test
    public void testGetRowMatrix_SystemArraycopy() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        BigMatrixImpl actual = ((BigMatrixImpl) bigMatrixImpl.getRowMatrix(0));
        
        BigMatrixImpl expected = new BigMatrixImpl();
        java.math.BigDecimal[][] data1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        data1[0] = bigDecimalArray1;
        expected.data = data1;
        expected.lu = null;
        expected.permutation = null;
        expected.parity = 1;
        expected.setRoundingMode(4);
        expected.setScale(64);
        
        // org.apache.commons.math.linear.BigMatrixImpl has overridden equals method
        assertEquals(expected, actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getRowMatrix(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowMatrix(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrix_ThrowMatrixIndexException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getRowMatrix(129);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowMatrix(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrix_ThrowMatrixIndexException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getRowMatrix(-1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowMatrix(int)}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} when: !isValidCoordinate(row, 0)
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testGetRowMatrix_ThrowMatrixIndexException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.getRowMatrix(0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowMatrix(int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowMatrix(int)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: !isValidCoordinate(row, 0)
 *  */
    @Test
    public void testGetRowMatrix_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isValidCoordinate(BigMatrixImpl.java:1462)
            org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix(BigMatrixImpl.java:706) */
        bigMatrixImpl.getRowMatrix(-255);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowMatrix(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: System.arraycopy(data[row], 0, out[0], 0, ncols);
 *  */
    @Test
    public void testGetRowMatrix_ThrowArrayIndexOutOfBoundsException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {};
        data[1] = bigDecimalArray1;
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: arraycopy: last source index 2 out of bounds for object array[0]]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix(BigMatrixImpl.java:711) */
        bigMatrixImpl.getRowMatrix(1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowMatrix(int)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(data[row], 0, out[0], 0, ncols);
 *  */
    @Test
    public void testGetRowMatrix_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix] produces [java.lang.NullPointerException]
            java.base/java.lang.System.arraycopy(Native Method)
            org.apache.commons.math.linear.BigMatrixImpl.getRowMatrix(BigMatrixImpl.java:711) */
        bigMatrixImpl.getRowMatrix(1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getRowDimension
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getRowDimension()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.returnsFrom {@code return data.length;}
 *  */
    @Test
    public void testGetRowDimension_ReturnDataLength() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        
        int actual = bigMatrixImpl.getRowDimension();
        
        assertEquals(1, actual);
        
        java.math.BigDecimal[] finalBigMatrixImplData0 = bigMatrixImpl.data[0];
        
        assertNull(finalBigMatrixImplData0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getRowDimension()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return data.length;
 *  */
    @Test
    public void testGetRowDimension_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getRowDimension] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getRowDimension(BigMatrixImpl.java:947) */
        bigMatrixImpl.getRowDimension();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getPermutation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPermutation()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getPermutation()}
 * @utbot.invokes {@link java.lang.System#arraycopy(java.lang.Object,int,java.lang.Object,int,int)}
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testGetPermutation_SystemArraycopy() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        int[] permutation = {};
        bigMatrixImpl.permutation = permutation;
        
        int[] actual = bigMatrixImpl.getPermutation();
        
        int[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPermutation()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getPermutation()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int[] out = new int[permutation.length];
 *  */
    @Test
    public void testGetPermutation_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.permutation = null;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getPermutation] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.getPermutation(BigMatrixImpl.java:1378) */
        bigMatrixImpl.getPermutation();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.copyOut
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyOut()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyOut()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testCopyOut_SystemArraycopy() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Method copyOutMethod = bigMatrixImplClazz.getDeclaredMethod("copyOut");
        copyOutMethod.setAccessible(true);
        java.lang.Object[] copyOutMethodArguments = new java.lang.Object[0];
        java.math.BigDecimal[][] actual = ((java.math.BigDecimal[][]) copyOutMethod.invoke(bigMatrixImpl, copyOutMethodArguments));
        
        java.math.BigDecimal[][] expected = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        expected[0] = bigDecimalArray1;
        
        int expectedSize = expected.length;
        assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyOut()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyOut()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final BigDecimal[][] out = new BigDecimal[nRows][this.getColumnDimension()];
 *  */
    @Test
    public void testCopyOut_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.copyOut] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.copyOut(BigMatrixImpl.java:1392) */
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Method copyOutMethod = bigMatrixImplClazz.getDeclaredMethod("copyOut");
        copyOutMethod.setAccessible(true);
        java.lang.Object[] copyOutMethodArguments = new java.lang.Object[0];
        try {
            copyOutMethod.invoke(bigMatrixImpl, copyOutMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.copyIn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyIn([[Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.lang.String[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 *  */
    @Test
    public void testCopyIn_IterateForLoop() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        bigMatrixImpl.lu = null;
        java.lang.String[][] stringArray = new java.lang.String[1][];
        java.lang.String[] stringArray1 = {};
        stringArray[0] = stringArray1;
        
        java.math.BigDecimal[][] initialBigMatrixImplData = bigMatrixImpl.data;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class stringArrayType = Class.forName("[[Ljava.lang.String;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", stringArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) stringArray);
        copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        
        java.math.BigDecimal[][] finalBigMatrixImplData = bigMatrixImpl.data;
        
        assertFalse(initialBigMatrixImplData == finalBigMatrixImplData);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyIn([[Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.lang.String[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = in[0].length;
 *  */
    @Test
    public void testCopyIn_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.lang.String[][] stringArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.copyIn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.copyIn(BigMatrixImpl.java:1441) */
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class stringArrayType = Class.forName("[[Ljava.lang.String;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", stringArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) stringArray);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.lang.String[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nCols = in[0].length;
 *  */
    @Test
    public void testCopyIn_ThrowNullPointerException_1() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.lang.String[][] stringArray = {null};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.copyIn] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.copyIn(BigMatrixImpl.java:1441) */
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class stringArrayType = Class.forName("[[Ljava.lang.String;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", stringArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) stringArray);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.lang.String[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nRows = in.length;
 *  */
    @Test
    public void testCopyIn_ThrowNullPointerException() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.copyIn] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.copyIn(BigMatrixImpl.java:1440) */
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class stringArrayType = Class.forName("[[Ljava.lang.String;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", stringArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) null);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.copyIn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyIn([[D)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(double[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 *  */
    @Test
    public void testCopyIn_IterateForLoop1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        bigMatrixImpl.lu = null;
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {};
        doubleArray[0] = doubleArray1;
        
        java.math.BigDecimal[][] initialBigMatrixImplData = bigMatrixImpl.data;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        
        java.math.BigDecimal[][] finalBigMatrixImplData = bigMatrixImpl.data;
        
        assertFalse(initialBigMatrixImplData == finalBigMatrixImplData);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(double[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 *  */
    @Test
    public void testCopyIn_IterateForLoop_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        bigMatrixImpl.lu = null;
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {3.337610787760802E-308};
        doubleArray[0] = doubleArray1;
        
        java.math.BigDecimal[][] initialBigMatrixImplData = bigMatrixImpl.data;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        
        java.math.BigDecimal[][] finalBigMatrixImplData = bigMatrixImpl.data;
        
        assertFalse(initialBigMatrixImplData == finalBigMatrixImplData);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyIn([[D)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(double[][])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = in[0].length;
 *  */
    @Test
    public void testCopyIn_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        double[][] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.copyIn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.copyIn(BigMatrixImpl.java:1421) */
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(double[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < nRows; i++)} once
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: dataI[j] = new BigDecimal(inI[j]);
 *  */
    @Test
    public void testCopyIn_ThrowNumberFormatException() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        double[][] doubleArray = new double[1][];
        double[] doubleArray1 = {java.lang.Double.NEGATIVE_INFINITY};
        doubleArray[0] = doubleArray1;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.copyIn] produces [java.lang.NumberFormatException: Infinite or NaN]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:985)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:964)
            org.apache.commons.math.linear.BigMatrixImpl.copyIn(BigMatrixImpl.java:1427) */
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(double[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nCols = in[0].length;
 *  */
    @Test
    public void testCopyIn_ThrowNullPointerException_11() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        double[][] doubleArray = {null};
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.copyIn] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.copyIn(BigMatrixImpl.java:1421) */
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) doubleArray);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(double[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int nRows = in.length;
 *  */
    @Test
    public void testCopyIn_ThrowNullPointerException1() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.copyIn] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.copyIn(BigMatrixImpl.java:1420) */
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class doubleArrayType = Class.forName("[[D");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", doubleArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) null);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.copyIn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyIn([[Ljava.math.BigDecimal;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.math.BigDecimal[][])}
 *  */
    @Test
    public void testCopyIn() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = null;
        java.math.BigDecimal[][] bigDecimalArray1 = new java.math.BigDecimal[1][];
        bigDecimalArray1[0] = bigDecimalArray;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class bigDecimalArray1Type = Class.forName("[[Ljava.math.BigDecimal;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", bigDecimalArray1Type);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) bigDecimalArray1);
        copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        BigDecimal finalBigDecimalArray100 = bigDecimalArray1[0][0];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigDecimalArray100);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.math.BigDecimal[][])}
 *  */
    @Test
    public void testCopyIn_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        bigMatrixImpl.data = null;
        bigMatrixImpl.lu = null;
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        bigDecimalArray[0] = bigDecimalArray1;
        
        java.math.BigDecimal[][] initialBigMatrixImplData = bigMatrixImpl.data;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class bigDecimalArrayType = Class.forName("[[Ljava.math.BigDecimal;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", bigDecimalArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) bigDecimalArray);
        copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        
        java.math.BigDecimal[][] finalBigMatrixImplData = bigMatrixImpl.data;
        
        BigDecimal finalBigDecimalArray00 = bigDecimalArray[0][0];
        
        assertFalse(initialBigMatrixImplData == finalBigMatrixImplData);
        
        assertNull(finalBigDecimalArray00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method copyIn([[Ljava.math.BigDecimal;)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.math.BigDecimal[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCopyIn_ThrowIllegalArgumentException() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] bigDecimalArray = {};
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class bigDecimalArrayType = Class.forName("[[Ljava.math.BigDecimal;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", bigDecimalArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) bigDecimalArray);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.math.BigDecimal[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCopyIn_ThrowIllegalArgumentException_1() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {};
        bigDecimalArray[0] = bigDecimalArray1;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class bigDecimalArrayType = Class.forName("[[Ljava.math.BigDecimal;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", bigDecimalArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) bigDecimalArray);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.math.BigDecimal[][])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCopyIn_ThrowIllegalArgumentException_2() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray1 = {null, null};
        bigDecimalArray[0] = bigDecimalArray1;
        java.math.BigDecimal[] bigDecimalArray2 = {null};
        bigDecimalArray[1] = bigDecimalArray2;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class bigDecimalArrayType = Class.forName("[[Ljava.math.BigDecimal;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", bigDecimalArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) bigDecimalArray);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.math.BigDecimal[][])}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testCopyIn_ThrowMatrixIndexException() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        bigDecimalArray[0] = bigDecimalArray1;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class bigDecimalArrayType = Class.forName("[[Ljava.math.BigDecimal;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", bigDecimalArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) bigDecimalArray);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.math.BigDecimal[][])}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testCopyIn_ThrowMatrixIndexException_1() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {null};
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] bigDecimalArray = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        bigDecimalArray[0] = bigDecimalArray1;
        bigDecimalArray[1] = bigDecimalArray1;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class bigDecimalArrayType = Class.forName("[[Ljava.math.BigDecimal;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", bigDecimalArrayType);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) bigDecimalArray);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#copyIn(java.math.BigDecimal[][])}
 * @utbot.throwsException {@link org.apache.commons.math.linear.MatrixIndexException} in: setSubMatrix(in, 0, 0);
 *  */
    @Test(expected = MatrixIndexException.class)
    public void testCopyIn_ThrowMatrixIndexException_2() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        java.math.BigDecimal[][] bigDecimalArray1 = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray2 = {null, null};
        bigDecimalArray1[0] = bigDecimalArray2;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class bigDecimalArray1Type = Class.forName("[[Ljava.math.BigDecimal;");
        Method copyInMethod = bigMatrixImplClazz.getDeclaredMethod("copyIn", bigDecimalArray1Type);
        copyInMethod.setAccessible(true);
        java.lang.Object[] copyInMethodArguments = new java.lang.Object[1];
        copyInMethodArguments[0] = ((Object) bigDecimalArray1);
        try {
            copyInMethod.invoke(bigMatrixImpl, copyInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.isValidCoordinate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isValidCoordinate(int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.returnsFrom {@code return !(row < 0 || row >= nRows || col < 0 || col >= nCols);}
 *  */
    @Test
    public void testIsValidCoordinate_NotRowLessThanZeroOrRowLessThanNRowsOrColLessThanZeroOrColLessThanNCols() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = bigMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = -1;
        isValidCoordinateMethodArguments[1] = -255;
        boolean actual = ((Boolean) isValidCoordinateMethod.invoke(bigMatrixImpl, isValidCoordinateMethodArguments));
        
        assertFalse(actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.returnsFrom {@code return !(row < 0 || row >= nRows || col < 0 || col >= nCols);}
 *  */
    @Test
    public void testIsValidCoordinate_NotRowGreaterOrEqualZeroOrRowGreaterOrEqualNRowsOrColGreaterOrEqualZeroOrColGreaterOrEqualNCols() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = bigMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = 129;
        isValidCoordinateMethodArguments[1] = -255;
        boolean actual = ((Boolean) isValidCoordinateMethod.invoke(bigMatrixImpl, isValidCoordinateMethodArguments));
        
        assertFalse(actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        java.math.BigDecimal[] finalBigMatrixImplData1 = bigMatrixImpl.data[1];
        
        assertNull(finalBigMatrixImplData00);
        
        assertNull(finalBigMatrixImplData1);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.returnsFrom {@code return !(row < 0 || row >= nRows || col < 0 || col >= nCols);}
 *  */
    @Test
    public void testIsValidCoordinate_NotRowGreaterOrEqualZeroOrRowGreaterOrEqualNRowsOrColGreaterOrEqualZeroOrColGreaterOrEqualNCols_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = bigMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = 0;
        isValidCoordinateMethodArguments[1] = 0;
        boolean actual = ((Boolean) isValidCoordinateMethod.invoke(bigMatrixImpl, isValidCoordinateMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.returnsFrom {@code return !(row < 0 || row >= nRows || col < 0 || col >= nCols);}
 *  */
    @Test
    public void testIsValidCoordinate_NotRowLessThanZeroOrRowLessThanNRowsOrColLessThanZeroOrColLessThanNCols_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = bigMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = 0;
        isValidCoordinateMethodArguments[1] = -1;
        boolean actual = ((Boolean) isValidCoordinateMethod.invoke(bigMatrixImpl, isValidCoordinateMethodArguments));
        
        assertFalse(actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.returnsFrom {@code return !(row < 0 || row >= nRows || col < 0 || col >= nCols);}
 *  */
    @Test
    public void testIsValidCoordinate_NotRowLessThanZeroOrRowLessThanNRowsOrColLessThanZeroOrColLessThanNCols_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        bigMatrixImpl.data = data;
        
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = bigMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = 0;
        isValidCoordinateMethodArguments[1] = 0;
        boolean actual = ((Boolean) isValidCoordinateMethod.invoke(bigMatrixImpl, isValidCoordinateMethodArguments));
        
        assertTrue(actual);
        
        BigDecimal finalBigMatrixImplData00 = bigMatrixImpl.data[0][0];
        
        assertNull(finalBigMatrixImplData00);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isValidCoordinate(int, int)
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#isValidCoordinate(int,int)}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = this.getColumnDimension();
 *  */
    @Test
    public void testIsValidCoordinate_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.isValidCoordinate] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.isValidCoordinate(BigMatrixImpl.java:1462) */
        Class bigMatrixImplClazz = Class.forName("org.apache.commons.math.linear.BigMatrixImpl");
        Class intType = int.class;
        Method isValidCoordinateMethod = bigMatrixImplClazz.getDeclaredMethod("isValidCoordinate", intType, intType);
        isValidCoordinateMethod.setAccessible(true);
        java.lang.Object[] isValidCoordinateMethodArguments = new java.lang.Object[2];
        isValidCoordinateMethodArguments[0] = -255;
        isValidCoordinateMethodArguments[1] = -255;
        try {
            isValidCoordinateMethod.invoke(bigMatrixImpl, isValidCoordinateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.luDecompose
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method luDecompose()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#luDecompose()}
 * @utbot.executesCondition {@code (nRows != nCols): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getRowDimension()}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getColumnDimension()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} when: nRows != nCols
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testLuDecompose_ThrowInvalidMatrixException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        bigMatrixImpl.luDecompose();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method luDecompose()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#luDecompose()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final int nCols = this.getColumnDimension();
 *  */
    @Test
    public void testLuDecompose_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.luDecompose] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.luDecompose(BigMatrixImpl.java:1172) */
        bigMatrixImpl.luDecompose();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#luDecompose()}
 * @utbot.executesCondition {@code (nRows != nCols): False}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#getData()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lu = this.getData();
 *  */
    @Test
    public void testLuDecompose_ThrowNullPointerException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.luDecompose] produces [java.lang.NullPointerException]
            org.apache.commons.math.linear.BigMatrixImpl.copyOut(BigMatrixImpl.java:1395)
            org.apache.commons.math.linear.BigMatrixImpl.getData(BigMatrixImpl.java:477)
            org.apache.commons.math.linear.BigMatrixImpl.luDecompose(BigMatrixImpl.java:1176) */
        bigMatrixImpl.luDecompose();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.linear.BigMatrixImpl.getLUMatrix
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getLUMatrix()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(lu);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLUMatrix_ThrowIllegalArgumentException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] lu = {};
        bigMatrixImpl.lu = lu;
        
        bigMatrixImpl.getLUMatrix();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(lu);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLUMatrix_ThrowIllegalArgumentException_1() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] lu = new java.math.BigDecimal[1][];
        java.math.BigDecimal[] bigDecimalArray = {};
        lu[0] = bigDecimalArray;
        bigMatrixImpl.lu = lu;
        
        bigMatrixImpl.getLUMatrix();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(lu);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLUMatrix_ThrowIllegalArgumentException_2() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] lu = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        lu[0] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        lu[1] = bigDecimalArray1;
        bigMatrixImpl.lu = lu;
        
        bigMatrixImpl.getLUMatrix();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new BigMatrixImpl(lu);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testGetLUMatrix_ThrowIllegalArgumentException_3() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] lu = new java.math.BigDecimal[11][];
        java.math.BigDecimal[] bigDecimalArray = {null, null};
        lu[0] = bigDecimalArray;
        lu[1] = bigDecimalArray;
        java.math.BigDecimal[] bigDecimalArray1 = {null};
        lu[2] = bigDecimalArray1;
        lu[3] = ((java.math.BigDecimal[]) null);
        lu[4] = ((java.math.BigDecimal[]) null);
        lu[5] = ((java.math.BigDecimal[]) null);
        lu[6] = ((java.math.BigDecimal[]) null);
        lu[7] = ((java.math.BigDecimal[]) null);
        lu[8] = ((java.math.BigDecimal[]) null);
        lu[9] = ((java.math.BigDecimal[]) null);
        lu[10] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.lu = lu;
        
        bigMatrixImpl.getLUMatrix();
    }
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#luDecompose()}
 * @utbot.throwsException {@link org.apache.commons.math.linear.InvalidMatrixException} in: luDecompose();
 *  */
    @Test(expected = InvalidMatrixException.class)
    public void testGetLUMatrix_ThrowInvalidMatrixException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = new java.math.BigDecimal[2][];
        java.math.BigDecimal[] bigDecimalArray = {null};
        data[0] = bigDecimalArray;
        data[1] = ((java.math.BigDecimal[]) null);
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = null;
        
        bigMatrixImpl.getLUMatrix();
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getLUMatrix()
    
    /**
    @utbot.classUnderTest {@link BigMatrixImpl}
 * @utbot.methodUnderTest {@link org.apache.commons.math.linear.BigMatrixImpl#getLUMatrix()}
 * @utbot.executesCondition {@code (lu == null): True}
 * @utbot.invokes {@link org.apache.commons.math.linear.BigMatrixImpl#luDecompose()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: luDecompose();
 *  */
    @Test
    public void testGetLUMatrix_ThrowArrayIndexOutOfBoundsException() {
        BigMatrixImpl bigMatrixImpl = new BigMatrixImpl();
        java.math.BigDecimal[][] data = {};
        bigMatrixImpl.data = data;
        bigMatrixImpl.lu = null;
        
        /* This test fails because method [org.apache.commons.math.linear.BigMatrixImpl.getLUMatrix] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.linear.BigMatrixImpl.getColumnDimension(BigMatrixImpl.java:956)
            org.apache.commons.math.linear.BigMatrixImpl.luDecompose(BigMatrixImpl.java:1172)
            org.apache.commons.math.linear.BigMatrixImpl.getLUMatrix(BigMatrixImpl.java:1360) */
        bigMatrixImpl.getLUMatrix();
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
        
                java.lang.reflect.Method methodForGetDeclaredFields788227126432600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields788227126432600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass788227126443200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields788227126432600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass788227126443200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields788227131159000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields788227131159000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass788227131165400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields788227131159000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass788227131165400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

