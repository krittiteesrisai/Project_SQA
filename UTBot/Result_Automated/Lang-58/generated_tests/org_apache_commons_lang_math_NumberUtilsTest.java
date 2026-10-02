package org.apache.commons.lang.math;

import org.junit.Test;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_lang_math_NumberUtilsTest {
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals([I, [I)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (array1 == array2): False},
    ///     {@code (array1 == null): False},
    ///     {@code (array2 == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(int[],int[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 *  */
    @Test
    public void testEquals_Array1LengthNotEqualsArray2Length() {
        int[] intArray = {1, -255};
        int[] intArray1 = {-255};
        
        boolean actual = NumberUtils.equals(intArray, intArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(int[],int[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_IOfArray1NotEqualsIOfArray2() {
        int[] intArray = {2};
        int[] intArray1 = {1};
        
        boolean actual = NumberUtils.equals(intArray, intArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(int[],int[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_IOfArray1EqualsIOfArray2() {
        int[] intArray = {1};
        int[] intArray1 = {1};
        
        boolean actual = NumberUtils.equals(intArray, intArray1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals([I, [I)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(int[],int[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): True}
 *  */
    @Test
    public void testEquals_Array1EqualsNull() {
        int[] intArray = {-255};
        
        boolean actual = NumberUtils.equals(((int[]) null), intArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(int[],int[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 *  */
    @Test
    public void testEquals_Array2EqualsNull() {
        int[] intArray = {-255};
        
        boolean actual = NumberUtils.equals(intArray, ((int[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(int[],int[])}
 * @utbot.executesCondition {@code (array1 == array2): True}
 *  */
    @Test
    public void testEquals_Array1EqualsArray2() {
        boolean actual = NumberUtils.equals(((int[]) null), ((int[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals([J, [J)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (array1 == array2): False},
    ///     {@code (array1 == null): False},
    ///     {@code (array2 == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(long[],long[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 *  */
    @Test
    public void testEquals_Array1LengthNotEqualsArray2Length1() {
        long[] longArray = {-255L, 1L};
        long[] longArray1 = {-255L};
        
        boolean actual = NumberUtils.equals(longArray, longArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(long[],long[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_IOfArray1NotEqualsIOfArray21() {
        long[] longArray = {-253L};
        long[] longArray1 = {-254L};
        
        boolean actual = NumberUtils.equals(longArray, longArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(long[],long[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_IOfArray1EqualsIOfArray21() {
        long[] longArray = {-255L};
        long[] longArray1 = {-255L};
        
        boolean actual = NumberUtils.equals(longArray, longArray1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals([J, [J)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(long[],long[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): True}
 *  */
    @Test
    public void testEquals_Array1EqualsNull1() {
        long[] longArray = {-255L};
        
        boolean actual = NumberUtils.equals(((long[]) null), longArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(long[],long[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 *  */
    @Test
    public void testEquals_Array2EqualsNull1() {
        long[] longArray = {-255L};
        
        boolean actual = NumberUtils.equals(longArray, ((long[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(long[],long[])}
 * @utbot.executesCondition {@code (array1 == array2): True}
 *  */
    @Test
    public void testEquals_Array1EqualsArray21() {
        boolean actual = NumberUtils.equals(((long[]) null), ((long[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals([F, [F)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (array1 == array2): False},
    ///     {@code (array1 == null): False},
    ///     {@code (array2 == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(float[],float[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 *  */
    @Test
    public void testEquals_Array1LengthNotEqualsArray2Length2() {
        float[] floatArray = {0.0f, 0.0f};
        float[] floatArray1 = {0.0f};
        
        boolean actual = NumberUtils.equals(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(float[],float[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 *  */
    @Test
    public void testEquals_Array1LengthEqualsArray2Length() {
        float[] floatArray = {};
        float[] floatArray1 = {};
        
        boolean actual = NumberUtils.equals(floatArray, floatArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(float[],float[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_CompareNotEqualsZero() {
        float[] floatArray = {2.53327479E15f};
        float[] floatArray1 = {-8.077937E-28f};
        
        boolean actual = NumberUtils.equals(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(float[],float[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_CompareNotEqualsZero_1() {
        float[] floatArray = {-2.30732405E18f};
        float[] floatArray1 = {-2.89519313E17f};
        
        boolean actual = NumberUtils.equals(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(float[],float[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_CompareEqualsZero() {
        float[] floatArray = {java.lang.Float.NaN};
        float[] floatArray1 = {1.4E-45f};
        
        boolean actual = NumberUtils.equals(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals([F, [F)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(float[],float[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): True}
 *  */
    @Test
    public void testEquals_Array1EqualsNull2() {
        float[] floatArray = {0.0f};
        
        boolean actual = NumberUtils.equals(((float[]) null), floatArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(float[],float[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 *  */
    @Test
    public void testEquals_Array2EqualsNull2() {
        float[] floatArray = {0.0f};
        
        boolean actual = NumberUtils.equals(floatArray, ((float[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(float[],float[])}
 * @utbot.executesCondition {@code (array1 == array2): True}
 *  */
    @Test
    public void testEquals_Array1EqualsArray22() {
        boolean actual = NumberUtils.equals(((float[]) null), ((float[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals([D, [D)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (array1 == array2): False},
    ///     {@code (array1 == null): False},
    ///     {@code (array2 == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(double[],double[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 *  */
    @Test
    public void testEquals_Array1LengthNotEqualsArray2Length3() {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        boolean actual = NumberUtils.equals(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(double[],double[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 *  */
    @Test
    public void testEquals_ReturnTrue() {
        double[] doubleArray = {};
        double[] doubleArray1 = {};
        
        boolean actual = NumberUtils.equals(doubleArray, doubleArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(double[],double[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_CompareNotEqualsZero1() {
        double[] doubleArray = {1.45230848E8};
        double[] doubleArray1 = {-1.5833865828247771E-292};
        
        boolean actual = NumberUtils.equals(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(double[],double[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_CompareNotEqualsZero_11() {
        double[] doubleArray = {-2.6427177400704297E77};
        double[] doubleArray1 = {2.7406580438529897E-231};
        
        boolean actual = NumberUtils.equals(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(double[],double[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_CompareNotEqualsZero_2() {
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {2.0000000000000004};
        
        boolean actual = NumberUtils.equals(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals([D, [D)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(double[],double[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): True}
 *  */
    @Test
    public void testEquals_Array1EqualsNull3() {
        double[] doubleArray = {0.0};
        
        boolean actual = NumberUtils.equals(((double[]) null), doubleArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(double[],double[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 *  */
    @Test
    public void testEquals_Array2EqualsNull3() {
        double[] doubleArray = {0.0};
        
        boolean actual = NumberUtils.equals(doubleArray, ((double[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(double[],double[])}
 * @utbot.executesCondition {@code (array1 == array2): True}
 *  */
    @Test
    public void testEquals_Array1EqualsArray23() {
        boolean actual = NumberUtils.equals(((double[]) null), ((double[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals([B, [B)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (array1 == array2): False},
    ///     {@code (array1 == null): False},
    ///     {@code (array2 == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(byte[],byte[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 *  */
    @Test
    public void testEquals_Array1LengthNotEqualsArray2Length4() {
        byte[] byteArray = {(byte) -127, (byte) -127};
        byte[] byteArray1 = {(byte) -127};
        
        boolean actual = NumberUtils.equals(byteArray, byteArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(byte[],byte[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_IOfArray1NotEqualsIOfArray22() {
        byte[] byteArray = {(byte) -126};
        byte[] byteArray1 = {(byte) -127};
        
        boolean actual = NumberUtils.equals(byteArray, byteArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(byte[],byte[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_IOfArray1EqualsIOfArray22() {
        byte[] byteArray = {(byte) -127};
        byte[] byteArray1 = {(byte) -127};
        
        boolean actual = NumberUtils.equals(byteArray, byteArray1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals([B, [B)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): True}
 *  */
    @Test
    public void testEquals_Array1EqualsNull4() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = NumberUtils.equals(((byte[]) null), byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 *  */
    @Test
    public void testEquals_Array2EqualsNull4() {
        byte[] byteArray = {(byte) -127};
        
        boolean actual = NumberUtils.equals(byteArray, ((byte[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(byte[],byte[])}
 * @utbot.executesCondition {@code (array1 == array2): True}
 *  */
    @Test
    public void testEquals_Array1EqualsArray24() {
        boolean actual = NumberUtils.equals(((byte[]) null), ((byte[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals([S, [S)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (array1 == array2): False},
    ///     {@code (array1 == null): False},
    ///     {@code (array2 == null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(short[],short[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): True}
 *  */
    @Test
    public void testEquals_Array1LengthNotEqualsArray2Length5() {
        short[] shortArray = {(short) 1, (short) -255};
        short[] shortArray1 = {(short) -255};
        
        boolean actual = NumberUtils.equals(shortArray, shortArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(short[],short[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_IOfArray1NotEqualsIOfArray23() {
        short[] shortArray = {(short) 1};
        short[] shortArray1 = {(short) -255};
        
        boolean actual = NumberUtils.equals(shortArray, shortArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(short[],short[])}
 * @utbot.executesCondition {@code (array1.length != array2.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < array1.length; i++)} once
 *  */
    @Test
    public void testEquals_IOfArray1EqualsIOfArray23() {
        short[] shortArray = {(short) 1};
        short[] shortArray1 = {(short) 1};
        
        boolean actual = NumberUtils.equals(shortArray, shortArray1);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals([S, [S)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(short[],short[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): True}
 *  */
    @Test
    public void testEquals_Array1EqualsNull5() {
        short[] shortArray = {(short) -255};
        
        boolean actual = NumberUtils.equals(((short[]) null), shortArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(short[],short[])}
 * @utbot.executesCondition {@code (array1 == array2): False}
 * @utbot.executesCondition {@code (array1 == null): False}
 * @utbot.executesCondition {@code (array2 == null): True}
 *  */
    @Test
    public void testEquals_Array2EqualsNull5() {
        short[] shortArray = {(short) 1};
        
        boolean actual = NumberUtils.equals(shortArray, ((short[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#equals(short[],short[])}
 * @utbot.executesCondition {@code (array1 == array2): True}
 *  */
    @Test
    public void testEquals_Array1EqualsArray25() {
        boolean actual = NumberUtils.equals(((short[]) null), ((short[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([I)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(int[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin() {
        int[] intArray = {1};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(int[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_JOfArrayLessThanMin() {
        int[] intArray = {256, 255};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(int[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_JOfArrayGreaterOrEqualMin() {
        int[] intArray = {5, 5};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(5, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method min([I)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException_1() {
        int[] intArray = {};
        
        NumberUtils.min(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(int[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException() {
        NumberUtils.min(((int[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(int[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray() {
        int[] intArray = {1, Integer.MIN_VALUE, -1};
        
        int actual = NumberUtils.min(intArray);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([J)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(long[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin1() {
        long[] longArray = {-255L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(long[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayLessThanMin() {
        long[] longArray = {130L, 3L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(3L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(long[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayGreaterOrEqualMin() {
        long[] longArray = {177L, 177L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(177L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method min([J)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException_11() {
        long[] longArray = {};
        
        NumberUtils.min(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(long[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException1() {
        NumberUtils.min(((long[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(long[])}
     */
    @Test
    public void testMinReturnsZeroWithNonEmptyPrimitiveArray() {
        long[] longArray = {0L, 0L, 1L};
        
        long actual = NumberUtils.min(longArray);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(float, float, float)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(float,float,float)}
 * @utbot.invokes {@link java.lang.Math#min(float,float)}
 * @utbot.invokes {@link java.lang.Math#min(float,float)}
 * @utbot.returnsFrom {@code return Math.min(Math.min(a, b), c);}
 *  */
    @Test
    public void testMin_MathMin() {
        float actual = NumberUtils.min(-0.0f, java.lang.Float.NaN, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(int, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(int,int,int)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CGreaterOrEqualA() {
        int actual = NumberUtils.min(256, 255, 255);
        
        assertEquals(255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(int,int,int)}
 * @utbot.executesCondition {@code (b < a): False}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_BGreaterOrEqualA() {
        int actual = NumberUtils.min(-255, -255, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(int,int,int)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CLessThanA() {
        int actual = NumberUtils.min(5, 4, 3);
        
        assertEquals(3, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(short, short, short)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(short,short,short)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CGreaterOrEqualA1() {
        short actual = NumberUtils.min((short) 256, (short) 255, (short) 255);
        
        assertEquals((short) 255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(short,short,short)}
 * @utbot.executesCondition {@code (b < a): False}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_BGreaterOrEqualA1() {
        short actual = NumberUtils.min((short) -256, (short) -256, (short) -256);
        
        assertEquals((short) -256, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(short,short,short)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CLessThanA1() {
        short actual = NumberUtils.min((short) 33, (short) 32, (short) 31);
        
        assertEquals((short) 31, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(byte, byte, byte)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(byte,byte,byte)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CGreaterOrEqualA2() {
        byte actual = NumberUtils.min((byte) 64, (byte) 63, (byte) 63);
        
        assertEquals((byte) 63, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(byte,byte,byte)}
 * @utbot.executesCondition {@code (b < a): False}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_BGreaterOrEqualA2() {
        byte actual = NumberUtils.min((byte) -127, (byte) -127, (byte) -127);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(byte,byte,byte)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CLessThanA2() {
        byte actual = NumberUtils.min((byte) 65, (byte) 64, (byte) 63);
        
        assertEquals((byte) 63, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(double, double, double)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(double,double,double)}
 * @utbot.invokes {@link java.lang.Math#min(double,double)}
 * @utbot.invokes {@link java.lang.Math#min(double,double)}
 * @utbot.returnsFrom {@code return Math.min(Math.min(a, b), c);}
 *  */
    @Test
    public void testMin_MathMin1() {
        double actual = NumberUtils.min(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([S)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(short[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin2() {
        short[] shortArray = {(short) 1};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals((short) 1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(short[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayLessThanMin1() {
        short[] shortArray = {(short) 256, (short) 255};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals((short) 255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(short[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayGreaterOrEqualMin1() {
        short[] shortArray = {(short) 117, (short) 117};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals((short) 117, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method min([S)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException_12() {
        short[] shortArray = {};
        
        NumberUtils.min(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(short[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException2() {
        NumberUtils.min(((short[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([S)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(short[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray1() {
        short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        short actual = NumberUtils.min(shortArray);
        
        assertEquals(java.lang.Short.MIN_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([D)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(double[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin3() {
        double[] doubleArray = {0.0};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayLessThanMin2() {
        double[] doubleArray = {1.7598628495360004E13, 2.1296811772631053E-292};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(2.1296811772631053E-292, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayGreaterOrEqualMin2() {
        double[] doubleArray = {1.2280279329303218E-296, 1.2280279329303218E-296};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(1.2280279329303218E-296, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method min([D)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException_13() {
        double[] doubleArray = {};
        
        NumberUtils.min(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(double[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException3() {
        NumberUtils.min(((double[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(double[])}
     */
    @Test
    public void testMinReturnsInfinityWithNonEmptyPrimitiveArray() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        double actual = NumberUtils.min(doubleArray);
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([F)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(float[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin4() {
        float[] floatArray = {0.0f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(float[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayLessThanMin3() {
        float[] floatArray = {1.1754949E-38f, -2.5f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(-2.5f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(float[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayGreaterOrEqualMin3() {
        float[] floatArray = {java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(java.lang.Float.POSITIVE_INFINITY, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method min([F)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException_14() {
        float[] floatArray = {};
        
        NumberUtils.min(floatArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(float[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException4() {
        NumberUtils.min(((float[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([F)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(float[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray2() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float actual = NumberUtils.min(floatArray);
        
        org.junit.Assert.assertEquals(java.lang.Float.NEGATIVE_INFINITY, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(long, long, long)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(long,long,long)}
 * @utbot.executesCondition {@code (b < a): True}
 * @utbot.executesCondition {@code (c < a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CLessThanA3() {
        long actual = NumberUtils.min(130L, 10L, -245L);
        
        assertEquals(-245L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(long,long,long)}
 * @utbot.executesCondition {@code (b < a): False}
 * @utbot.executesCondition {@code (c < a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMin_CGreaterOrEqualA3() {
        long actual = NumberUtils.min(-110L, -110L, -110L);
        
        assertEquals(-110L, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(long, long, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(long,long,long)}
     */
    @Test
    public void testMinReturnsZeroWithCornerCases() {
        long actual = NumberUtils.min(8192L, 0L, 0L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min([B)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(byte[])}
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_ReturnMin5() {
        byte[] byteArray = {(byte) -127};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayLessThanMin4() {
        byte[] byteArray = {(byte) 64, (byte) 63};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals((byte) 63, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return min;}
 *  */
    @Test
    public void testMin_IOfArrayGreaterOrEqualMin4() {
        byte[] byteArray = {(byte) -43, (byte) -43};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals((byte) -43, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method min([B)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException_15() {
        byte[] byteArray = {};
        
        NumberUtils.min(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMin_ThrowIllegalArgumentException5() {
        NumberUtils.min(((byte[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#min(byte[])}
     */
    @Test
    public void testMinWithNonEmptyPrimitiveArray3() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte actual = NumberUtils.min(byteArray);
        
        assertEquals(java.lang.Byte.MIN_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([J)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(long[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax() {
        long[] longArray = {-255L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(long[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayGreaterThanMax() {
        long[] longArray = {-254L, 3L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(3L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(long[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayLessOrEqualMax() {
        long[] longArray = {-250L, -250L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(-250L, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method max([J)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(long[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException_1() {
        long[] longArray = {};
        
        NumberUtils.max(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(long[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException() {
        NumberUtils.max(((long[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(long[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray() {
        long[] longArray = {0L, 0L, 1L};
        
        long actual = NumberUtils.max(longArray);
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(int, int, int)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(int,int,int)}
 * @utbot.executesCondition {@code (b > a): False}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_BLessOrEqualA() {
        int actual = NumberUtils.max(-255, -255, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(int,int,int)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CLessOrEqualA() {
        int actual = NumberUtils.max(-3, -2, -2);
        
        assertEquals(-2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(int,int,int)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CGreaterThanA() {
        int actual = NumberUtils.max(-4, -3, -2);
        
        assertEquals(-2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(long, long, long)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(long,long,long)}
 * @utbot.executesCondition {@code (b > a): False}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CLessOrEqualA1() {
        long actual = NumberUtils.max(-219L, -219L, -219L);
        
        assertEquals(-219L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(long,long,long)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CGreaterThanA1() {
        long actual = NumberUtils.max(-254L, -251L, -249L);
        
        assertEquals(-249L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([D)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(double[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax1() {
        double[] doubleArray = {0.0};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayGreaterThanMax1() {
        double[] doubleArray = {-401.06250000000006, 322.501953125};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(322.501953125, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(double[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayLessOrEqualMax1() {
        double[] doubleArray = {-1.5645016715327538, -1.5645016715327538};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(-1.5645016715327538, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method max([D)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(double[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException_11() {
        double[] doubleArray = {};
        
        NumberUtils.max(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(double[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException1() {
        NumberUtils.max(((double[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(double[])}
     */
    @Test
    public void testMaxReturnsZeroWithNonEmptyPrimitiveArray() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        double actual = NumberUtils.max(doubleArray);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([B)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(byte[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax2() {
        byte[] byteArray = {(byte) -127};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IOfArrayGreaterThanMax() {
        byte[] byteArray = {(byte) -2, (byte) -1};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) -1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(byte[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IOfArrayLessOrEqualMax() {
        byte[] byteArray = {(byte) -43, (byte) -43};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) -43, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method max([B)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(byte[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException_12() {
        byte[] byteArray = {};
        
        NumberUtils.max(byteArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(byte[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException2() {
        NumberUtils.max(((byte[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([B)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(byte[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray1() {
        byte[] byteArray = {(byte) 1, java.lang.Byte.MIN_VALUE, (byte) -1};
        
        byte actual = NumberUtils.max(byteArray);
        
        assertEquals((byte) 1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([S)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(short[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax3() {
        short[] shortArray = {(short) 1};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) 1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(short[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IOfArrayGreaterThanMax1() {
        short[] shortArray = {(short) -2, (short) -1};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) -1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(short[])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < array.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_IOfArrayLessOrEqualMax1() {
        short[] shortArray = {(short) 117, (short) 117};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) 117, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method max([S)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(short[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException_13() {
        short[] shortArray = {};
        
        NumberUtils.max(shortArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(short[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException3() {
        NumberUtils.max(((short[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([S)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(short[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray2() {
        short[] shortArray = {(short) 1, java.lang.Short.MIN_VALUE, (short) -1};
        
        short actual = NumberUtils.max(shortArray);
        
        assertEquals((short) 1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([I)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(int[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax4() {
        int[] intArray = {1};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(int[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayGreaterThanMax2() {
        int[] intArray = {-2, -1};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(int[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayLessOrEqualMax2() {
        int[] intArray = {5, 5};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(5, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method max([I)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(int[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException_14() {
        int[] intArray = {};
        
        NumberUtils.max(intArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(int[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException4() {
        NumberUtils.max(((int[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(int[])}
     */
    @Test
    public void testMaxReturnsOneWithNonEmptyPrimitiveArray3() {
        int[] intArray = {1, Integer.MIN_VALUE, -1};
        
        int actual = NumberUtils.max(intArray);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(float, float, float)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(float,float,float)}
 * @utbot.invokes {@link java.lang.Math#max(float,float)}
 * @utbot.invokes {@link java.lang.Math#max(float,float)}
 * @utbot.returnsFrom {@code return Math.max(Math.max(a, b), c);}
 *  */
    @Test
    public void testMax_MathMax() {
        float actual = NumberUtils.max(-0.0f, java.lang.Float.NaN, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max([F)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(float[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_ReturnMax5() {
        float[] floatArray = {0.0f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(float[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayGreaterThanMax3() {
        float[] floatArray = {2.718331E-38f, 6.5475455E-29f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(6.5475455E-29f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(float[])}
 * @utbot.iterates iterate the loop {@code for(int j = 1; j < array.length; j++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testMax_JOfArrayLessOrEqualMax3() {
        float[] floatArray = {8.569789E37f, 8.569789E37f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(8.569789E37f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method max([F)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(float[])}
 * @utbot.executesCondition {@code (array == null): False}
 * @utbot.executesCondition {@code (array.length == 0): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array.length == 0
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException_15() {
        float[] floatArray = {};
        
        NumberUtils.max(floatArray);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(float[])}
 * @utbot.executesCondition {@code (array == null): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} when: array == null
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testMax_ThrowIllegalArgumentException5() {
        NumberUtils.max(((float[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max([F)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(float[])}
     */
    @Test
    public void testMaxReturnsZeroWithNonEmptyPrimitiveArray1() {
        float[] floatArray = {0.0f, java.lang.Float.NEGATIVE_INFINITY, -1.0f};
        
        float actual = NumberUtils.max(floatArray);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(double, double, double)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(double,double,double)}
 * @utbot.invokes {@link java.lang.Math#max(double,double)}
 * @utbot.invokes {@link java.lang.Math#max(double,double)}
 * @utbot.returnsFrom {@code return Math.max(Math.max(a, b), c);}
 *  */
    @Test
    public void testMax_MathMax1() {
        double actual = NumberUtils.max(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(byte, byte, byte)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(byte,byte,byte)}
 * @utbot.executesCondition {@code (b > a): False}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_BLessOrEqualA1() {
        byte actual = NumberUtils.max((byte) -127, (byte) -127, (byte) -127);
        
        assertEquals((byte) -127, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(byte,byte,byte)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CLessOrEqualA2() {
        byte actual = NumberUtils.max((byte) -3, (byte) -2, (byte) -2);
        
        assertEquals((byte) -2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(byte,byte,byte)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CGreaterThanA2() {
        byte actual = NumberUtils.max((byte) -4, (byte) -3, (byte) -2);
        
        assertEquals((byte) -2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(short, short, short)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(short,short,short)}
 * @utbot.executesCondition {@code (b > a): False}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_BLessOrEqualA2() {
        short actual = NumberUtils.max((short) -255, (short) -255, (short) -255);
        
        assertEquals((short) -255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(short,short,short)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): False}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CLessOrEqualA3() {
        short actual = NumberUtils.max((short) -3, (short) -2, (short) -2);
        
        assertEquals((short) -2, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#max(short,short,short)}
 * @utbot.executesCondition {@code (b > a): True}
 * @utbot.executesCondition {@code (c > a): True}
 * @utbot.returnsFrom {@code return a;}
 *  */
    @Test
    public void testMax_CGreaterThanA3() {
        short actual = NumberUtils.max((short) -4, (short) -3, (short) -2);
        
        assertEquals((short) -2, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.compare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compare(float, float)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#compare(float,float)}
 * @utbot.executesCondition {@code (lhs < rhs): True}
 *  */
    @Test
    public void testCompare_LhsLessThanRhs() {
        int actual = NumberUtils.compare(-2.0025344f, 1.1768266E-38f);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#compare(float,float)}
 * @utbot.executesCondition {@code (lhs < rhs): False}
 * @utbot.executesCondition {@code (lhs > rhs): True}
 *  */
    @Test
    public void testCompare_LhsGreaterThanRhs() {
        int actual = NumberUtils.compare(1.1024663E-19f, -1.1024663E-19f);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#compare(float,float)}
 * @utbot.executesCondition {@code (lhs < rhs): False}
 * @utbot.executesCondition {@code (lhs > rhs): False}
 * @utbot.executesCondition {@code (lhsBits == rhsBits): False}
 * @utbot.executesCondition {@code (lhsBits < rhsBits): False}
 * @utbot.invokes {@link java.lang.Float#floatToIntBits(float)}
 * @utbot.invokes {@link java.lang.Float#floatToIntBits(float)}
 *  */
    @Test
    public void testCompare_LhsBitsGreaterOrEqualRhsBits() {
        int actual = NumberUtils.compare(java.lang.Float.NEGATIVE_INFINITY, java.lang.Float.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.compare
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compare(double, double)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#compare(double,double)}
 * @utbot.executesCondition {@code (lhs < rhs): True}
 *  */
    @Test
    public void testCompare_LhsLessThanRhs1() {
        int actual = NumberUtils.compare(-5.263672889675945, 7.77185010349554E-304);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#compare(double,double)}
 * @utbot.executesCondition {@code (lhs < rhs): False}
 * @utbot.executesCondition {@code (lhs > rhs): True}
 *  */
    @Test
    public void testCompare_LhsGreaterThanRhs1() {
        int actual = NumberUtils.compare(5.1889428326E-314, -5.1889428326E-314);
        
        assertEquals(1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#compare(double,double)}
 * @utbot.executesCondition {@code (lhs < rhs): False}
 * @utbot.executesCondition {@code (lhs > rhs): False}
 * @utbot.executesCondition {@code (lhsBits == rhsBits): False}
 * @utbot.executesCondition {@code (lhsBits < rhsBits): False}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 *  */
    @Test
    public void testCompare_LhsBitsGreaterOrEqualRhsBits1() {
        int actual = NumberUtils.compare(-3.337364828689445E240, java.lang.Double.NaN);
        
        assertEquals(-1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.createLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createLong(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateLong_StrEqualsNull() {
        Long actual = NumberUtils.createLong(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createLong(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Long.valueOf(str);
 *  */
    @Test
    public void testCreateLong_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createLong] produces [java.lang.NumberFormatException: For input string: ""]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Long.parseLong(Long.java:721)
            java.base/java.lang.Long.valueOf(Long.java:1163)
            org.apache.commons.lang.math.NumberUtils.createLong(NumberUtils.java:631) */
        NumberUtils.createLong(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.toInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toInt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toInt(java.lang.String)}
 * @utbot.returnsFrom {@code return toInt(str, 0);}
 *  */
    @Test
    public void testToInt_ReturnToInt() {
        String string = "";
        
        int actual = NumberUtils.toInt(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toInt(java.lang.String)}
 * @utbot.returnsFrom {@code return toInt(str, 0);}
 *  */
    @Test
    public void testToInt_ReturnToInt_1() {
        int actual = NumberUtils.toInt(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.toInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toInt(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toInt(java.lang.String,int)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link java.lang.Integer#parseInt(java.lang.String)}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testToInt_CatchNumberFormatException() {
        String string = "";
        
        int actual = NumberUtils.toInt(string, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toInt(java.lang.String,int)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToInt_StrEqualsNull() {
        int actual = NumberUtils.toInt(null, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.toLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toLong(java.lang.String, long)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toLong(java.lang.String,long)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link java.lang.Long#parseLong(java.lang.String)}
 * @utbot.caughtException {@code NumberFormatException nfe}
 *  */
    @Test
    public void testToLong_CatchNumberFormatException() {
        String string = "";
        
        long actual = NumberUtils.toLong(string, -255L);
        
        assertEquals(-255L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toLong(java.lang.String,long)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToLong_StrEqualsNull() {
        long actual = NumberUtils.toLong(null, -255L);
        
        assertEquals(-255L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.toLong
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toLong(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toLong(java.lang.String)}
 * @utbot.returnsFrom {@code return toLong(str, 0L);}
 *  */
    @Test
    public void testToLong_ReturnToLong() {
        String string = "";
        
        long actual = NumberUtils.toLong(string);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toLong(java.lang.String)}
 * @utbot.returnsFrom {@code return toLong(str, 0L);}
 *  */
    @Test
    public void testToLong_ReturnToLong_1() {
        long actual = NumberUtils.toLong(null);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.toFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toFloat(java.lang.String, float)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toFloat(java.lang.String,float)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link java.lang.Float#parseFloat(java.lang.String)}
 *  */
    @Test
    public void testToFloat_StrNotEqualsNull() {
        String string = "";
        
        float actual = NumberUtils.toFloat(string, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toFloat(java.lang.String,float)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToFloat_StrEqualsNull() {
        float actual = NumberUtils.toFloat(null, java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.toFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toFloat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toFloat(java.lang.String)}
 * @utbot.returnsFrom {@code return toFloat(str, 0.0f);}
 *  */
    @Test
    public void testToFloat_ReturnToFloat() {
        String string = "";
        
        float actual = NumberUtils.toFloat(string);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toFloat(java.lang.String)}
 * @utbot.returnsFrom {@code return toFloat(str, 0.0f);}
 *  */
    @Test
    public void testToFloat_ReturnToFloat_1() {
        float actual = NumberUtils.toFloat(null);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toFloat(java.lang.String)}
 * @utbot.returnsFrom {@code return toFloat(str, 0.0f);}
 *  */
    @Test
    public void testToFloat_ReturnToFloat_2() {
        String string = "-9 ";
        
        float actual = NumberUtils.toFloat(string);
        
        org.junit.Assert.assertEquals(-9.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.toDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toDouble(java.lang.String, double)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toDouble(java.lang.String,double)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link java.lang.Double#parseDouble(java.lang.String)}
 *  */
    @Test
    public void testToDouble_StrNotEqualsNull() {
        String string = "";
        
        double actual = NumberUtils.toDouble(string, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toDouble(java.lang.String,double)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testToDouble_StrEqualsNull() {
        double actual = NumberUtils.toDouble(null, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toDouble(java.lang.String, double)
    
    @Test
    public void testToDouble1() {
        String string = "-0\u0001";
        
        double actual = NumberUtils.toDouble(string, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.toDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toDouble(java.lang.String)}
 * @utbot.returnsFrom {@code return toDouble(str, 0.0d);}
 *  */
    @Test
    public void testToDouble_ReturnToDouble() {
        String string = "";
        
        double actual = NumberUtils.toDouble(string);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toDouble(java.lang.String)}
 * @utbot.returnsFrom {@code return toDouble(str, 0.0d);}
 *  */
    @Test
    public void testToDouble_ReturnToDouble_1() {
        double actual = NumberUtils.toDouble(null);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#toDouble(java.lang.String)}
 * @utbot.returnsFrom {@code return toDouble(str, 0.0d);}
 *  */
    @Test
    public void testToDouble_ReturnToDouble_2() {
        String string = "-9 ";
        
        double actual = NumberUtils.toDouble(string);
        
        org.junit.Assert.assertEquals(-9.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.isNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): True}
 *  */
    @Test
    public void testIsNumber_IEqualsSz() {
        String string = "0x";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): False}
 * @utbot.executesCondition {@code (!allowSigns): True}
 * @utbot.executesCondition {@code (chars[i] == 'd'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return foundDigit;}
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsD() {
        String string = "d";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): False}
 * @utbot.executesCondition {@code (!allowSigns): True}
 * @utbot.executesCondition {@code (chars[i] == 'd'): False}
 * @utbot.executesCondition {@code (chars[i] == 'D'): False}
 * @utbot.executesCondition {@code (chars[i] == 'f'): False}
 * @utbot.executesCondition {@code (chars[i] == 'F'): False}
 * @utbot.executesCondition {@code (chars[i] == 'l'): False}
 * @utbot.executesCondition {@code (chars[i] == 'L'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsNotEqualsL() {
        String string = "/";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): False}
 * @utbot.iterates iterate the loop {@code for(; i < chars.length; i++)} once
 *  */
    @Test
    public void testIsNumber_IOfCharsLessOrEqualF() {
        String string = "0xF";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): False}
 * @utbot.iterates iterate the loop {@code for(; i < chars.length; i++)} once
 *  */
    @Test
    public void testIsNumber_IOfCharsLessOrEqualF_1() {
        String string = "0xc";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): False}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} twice
 *  */
    @Test
    public void testIsNumber_HasDecPointOrHasExp() {
        String string = "..  ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): True}
 *  */
    @Test
    public void testIsNumber_StringUtilsIsEmpty() {
        boolean actual = NumberUtils.isNumber(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): True}
 *  */
    @Test
    public void testIsNumber_StringUtilsIsEmpty_1() {
        String string = "";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): True}
 *  */
    @Test
    public void testIsNumber_IEqualsSz_1() {
        String string = "-0x";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): False}
 * @utbot.iterates iterate the loop {@code for(; i < chars.length; i++)} once
 *  */
    @Test
    public void testIsNumber_IOfCharsLessThanA() {
        String string = "-0x/";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsNotEqualsChar() {
        String string = "-/ ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_NotAllowSigns() {
        String string = "-+ ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsE() {
        String string = "-e";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return !allowSigns && foundDigit;}
 *  */
    @Test
    public void testIsNumber_NotAllowSignsAndFoundDigit() {
        String string = "-";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_ILessThanSzOrILessThanSzPlus1AndAllowSignsAndNotFoundDigit() {
        String string = "-e ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsE_1() {
        String string = "-E";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): False}
 * @utbot.iterates iterate the loop {@code for(; i < chars.length; i++)} once
 *  */
    @Test
    public void testIsNumber_IOfCharsGreaterThanF() {
        String string = "-0xg";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} twice
 *  */
    @Test
    public void testIsNumber_IOfCharsLessOrEqual9() {
        String string = "-.2";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): False}
 * @utbot.executesCondition {@code (!allowSigns): True}
 * @utbot.executesCondition {@code (chars[i] == 'd'): False}
 * @utbot.executesCondition {@code (chars[i] == 'D'): False}
 * @utbot.executesCondition {@code (chars[i] == 'f'): False}
 * @utbot.executesCondition {@code (chars[i] == 'F'): False}
 * @utbot.executesCondition {@code (chars[i] == 'l'): False}
 * @utbot.executesCondition {@code (chars[i] == 'L'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return foundDigit && !hasExp;}
 *  */
    @Test
    public void testIsNumber_FoundDigitAndNotHasExp() {
        String string = "-L";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): True}
 * @utbot.executesCondition {@code (i == sz): False}
 * @utbot.iterates iterate the loop {@code for(; i < chars.length; i++)} once
 *  */
    @Test
    public void testIsNumber_IOfCharsLessOrEqual9_1() {
        String string = "-0x2";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): False}
 * @utbot.executesCondition {@code (!allowSigns): False}
 * @utbot.executesCondition {@code (chars[i] == 'l'): False}
 * @utbot.executesCondition {@code (chars[i] == 'L'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} 3 times
 *  */
    @Test
    public void testIsNumber_IOfCharsNotEqualsL_1() {
        String string = "-0e/";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): False}
 * @utbot.executesCondition {@code (!allowSigns): True}
 * @utbot.executesCondition {@code (chars[i] == 'd'): False}
 * @utbot.executesCondition {@code (chars[i] == 'D'): False}
 * @utbot.executesCondition {@code (chars[i] == 'f'): False}
 * @utbot.executesCondition {@code (chars[i] == 'F'): False}
 * @utbot.executesCondition {@code (chars[i] == 'l'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} twice
 * @utbot.returnsFrom {@code return foundDigit && !hasExp;}
 *  */
    @Test
    public void testIsNumber_FoundDigitAndNotHasExp_1() {
        String string = "-0l";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): False}
 * @utbot.executesCondition {@code (chars[i] == 'e'): False}
 * @utbot.executesCondition {@code (chars[i] == 'E'): False}
 * @utbot.executesCondition {@code (!allowSigns): False}
 * @utbot.executesCondition {@code (chars[i] == 'l'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} 3 times
 * @utbot.returnsFrom {@code return foundDigit && !hasExp;}
 *  */
    @Test
    public void testIsNumber_FoundDigitAndNotHasExp_2() {
        String string = "-0el";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} 3 times
 *  */
    @Test
    public void testIsNumber_HasDecPointOrHasExp_1() {
        String string = "-0e. ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): False}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} 3 times
 *  */
    @Test
    public void testIsNumber_HasExp() {
        String string = "-0Ee ";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.executesCondition {@code ((chars[0] == '-')): True}
 * @utbot.executesCondition {@code (sz > start + 1): True}
 * @utbot.executesCondition {@code (chars[start] == '0'): True}
 * @utbot.executesCondition {@code (chars[start + 1] == 'x'): False}
 * @utbot.executesCondition {@code (chars[i] >= '0'): True}
 * @utbot.executesCondition {@code (chars[i] <= '9'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} 4 times
 *  */
    @Test
    public void testIsNumber_AllowSigns() {
        String string = "-0E-2";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isNumber(java.lang.String)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (StringUtils.isEmpty(str)): False}
    /// invoke:
    ///     {@link java.lang.String#toCharArray()} once
    /// execute conditions:
    ///     {@code ((chars[0] == '-')): True},
    ///     {@code (sz > start + 1): False},
    ///     {@code (chars[i] >= '0'): True},
    ///     {@code (chars[i] <= '9'): False},
    ///     {@code (chars[i] == 'e'): False},
    ///     {@code (chars[i] == 'E'): False},
    ///     {@code (!allowSigns): True},
    ///     {@code (chars[i] == 'd'): False}
    /// return from: {@code return foundDigit;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (chars[i] == 'D'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return foundDigit;}
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsD_1() {
        String string = "-D";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (chars[i] == 'D'): False}
 * @utbot.executesCondition {@code (chars[i] == 'f'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return foundDigit;}
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsF() {
        String string = "-f";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
 * @utbot.executesCondition {@code (chars[i] == 'D'): False}
 * @utbot.executesCondition {@code (chars[i] == 'f'): False}
 * @utbot.executesCondition {@code (chars[i] == 'F'): True}
 * @utbot.iterates iterate the loop {@code while(i < sz || (i < sz + 1 && allowSigns && !foundDigit))} once
 * @utbot.returnsFrom {@code return foundDigit;}
 *  */
    @Test
    public void testIsNumber_IOfCharsEqualsF_1() {
        String string = "-F";
        
        boolean actual = NumberUtils.isNumber(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isNumber(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.lang.math.NumberUtils}
     * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isNumber(java.lang.String)}
     */
    @Test
    public void testIsNumberReturnsFalseWithNonEmptyString() {
        boolean actual = NumberUtils.isNumber("\u0014\n\t\r");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.createNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 *  */
    @Test
    public void testCreateNumber_StrEqualsNull() {
        Number actual = NumberUtils.createNumber(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createNumber(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link org.apache.commons.lang.StringUtils#isBlank(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 *  */
    @Test
    public void testCreateNumber_StrNotEqualsNull() {
        String string = "--";
        
        Number actual = NumberUtils.createNumber(string);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createNumber(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createNumber(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: StringUtils.isBlank(str)
 *  */
    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ThrowNumberFormatException() {
        String string = "";
        
        NumberUtils.createNumber(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createNumber(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: StringUtils.isBlank(str)
 *  */
    @Test(expected = NumberFormatException.class)
    public void testCreateNumber_ThrowNumberFormatException_1() {
        String string = "\n";
        
        NumberUtils.createNumber(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createNumber(java.lang.String)
    
    @Test(expected = NumberFormatException.class)
    public void testCreateNumber1() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        NumberUtils.createNumber(string);
    }
    
    @Test(expected = NumberFormatException.class)
    public void testCreateNumber2() {
        String string = "\r\f\r\u0000";
        
        NumberUtils.createNumber(string);
    }
    
    @Test(expected = NumberFormatException.class)
    public void testCreateNumber3() {
        String string = "\t\f\n\r";
        
        NumberUtils.createNumber(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.stringToInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stringToInt(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#stringToInt(java.lang.String)}
 * @utbot.returnsFrom {@code return toInt(str);}
 *  */
    @Test
    public void testStringToInt_ReturnToInt() {
        String string = "";
        
        int actual = NumberUtils.stringToInt(string);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#stringToInt(java.lang.String)}
 * @utbot.returnsFrom {@code return toInt(str);}
 *  */
    @Test
    public void testStringToInt_ReturnToInt_1() {
        int actual = NumberUtils.stringToInt(null);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.stringToInt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stringToInt(java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#stringToInt(java.lang.String,int)}
 * @utbot.returnsFrom {@code return toInt(str, defaultValue);}
 *  */
    @Test
    public void testStringToInt_ReturnToInt1() {
        String string = "";
        
        int actual = NumberUtils.stringToInt(string, -255);
        
        assertEquals(-255, actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#stringToInt(java.lang.String,int)}
 * @utbot.returnsFrom {@code return toInt(str, defaultValue);}
 *  */
    @Test
    public void testStringToInt_ReturnToInt_11() {
        int actual = NumberUtils.stringToInt(null, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.createInteger
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createInteger(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateInteger_StrEqualsNull() {
        Integer actual = NumberUtils.createInteger(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException() {
        String string = "+0x";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: For input string: "" under radix 16]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:678)
            java.base/java.lang.Integer.valueOf(Integer.java:973)
            java.base/java.lang.Integer.decode(Integer.java:1458)
            org.apache.commons.lang.math.NumberUtils.createInteger(NumberUtils.java:615) */
        NumberUtils.createInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.decode(str);
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException_1() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: Zero length string]
            java.base/java.lang.Integer.decode(Integer.java:1423)
            org.apache.commons.lang.math.NumberUtils.createInteger(NumberUtils.java:615) */
        NumberUtils.createInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Integer.decode(str);
 *  */
    @Test
    public void testCreateInteger_ThrowNumberFormatException_2() {
        String string = "-0x-    ";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createInteger] produces [java.lang.NumberFormatException: Sign character in wrong position]
            java.base/java.lang.Integer.decode(Integer.java:1447)
            org.apache.commons.lang.math.NumberUtils.createInteger(NumberUtils.java:615) */
        NumberUtils.createInteger(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createInteger(java.lang.String)
    
    @Test
    public void testCreateInteger1() {
        String string = "+0";
        
        Integer actual = NumberUtils.createInteger(string);
        
        Integer expected = 0;
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.createBigInteger
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createBigInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createBigInteger(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateBigInteger_StrEqualsNull() {
        BigInteger actual = NumberUtils.createBigInteger(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBigInteger(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createBigInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigInteger(str);
 *  */
    @Test
    public void testCreateBigInteger_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Zero length BigInteger]
            java.base/java.math.BigInteger.<init>(BigInteger.java:488)
            java.base/java.math.BigInteger.<init>(BigInteger.java:676)
            org.apache.commons.lang.math.NumberUtils.createBigInteger(NumberUtils.java:647) */
        NumberUtils.createBigInteger(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createBigInteger(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigInteger(str);
 *  */
    @Test
    public void testCreateBigInteger_ThrowNumberFormatException_1() {
        String string = "+";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Zero length BigInteger]
            java.base/java.math.BigInteger.<init>(BigInteger.java:507)
            java.base/java.math.BigInteger.<init>(BigInteger.java:676)
            org.apache.commons.lang.math.NumberUtils.createBigInteger(NumberUtils.java:647) */
        NumberUtils.createBigInteger(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createBigInteger(java.lang.String)
    
    @Test
    public void testCreateBigInteger1() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: For input string: "         "]
            java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
            java.base/java.lang.Integer.parseInt(Integer.java:654)
            java.base/java.math.BigInteger.<init>(BigInteger.java:538)
            java.base/java.math.BigInteger.<init>(BigInteger.java:676)
            org.apache.commons.lang.math.NumberUtils.createBigInteger(NumberUtils.java:647) */
        NumberUtils.createBigInteger(string);
    }
    
    @Test
    public void testCreateBigInteger2() {
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000-\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigInteger] produces [java.lang.NumberFormatException: Illegal embedded sign character]
            java.base/java.math.BigInteger.<init>(BigInteger.java:496)
            java.base/java.math.BigInteger.<init>(BigInteger.java:676)
            org.apache.commons.lang.math.NumberUtils.createBigInteger(NumberUtils.java:647) */
        NumberUtils.createBigInteger(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.createFloat
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createFloat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createFloat(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateFloat_StrEqualsNull() {
        Float actual = NumberUtils.createFloat(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createFloat(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createFloat(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Float.valueOf(str);
 *  */
    @Test
    public void testCreateFloat_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang.math.NumberUtils.createFloat(NumberUtils.java:581) */
        NumberUtils.createFloat(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createFloat(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testCreateFloat_ThrowNumberFormatException_1() {
        String string = "-";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang.math.NumberUtils.createFloat(NumberUtils.java:581) */
        NumberUtils.createFloat(string);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method createFloat(java.lang.String)
    
    @Test
    public void testCreateFloat1() {
        String string = "\u00010\u0001";
        
        Float actual = NumberUtils.createFloat(string);
        
        Float expected = 0.0f;
        
        org.junit.Assert.assertEquals(expected, actual, 1.0E-6f);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createFloat(java.lang.String)
    
    @Test
    public void testCreateFloat2() {
        String string = "\u00010X\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000!\u0001";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createFloat] produces [java.lang.NumberFormatException: For input string: "0X                           !"]
            java.base/jdk.internal.math.FloatingDecimal.parseHexString(FloatingDecimal.java:2082)
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1870)
            java.base/jdk.internal.math.FloatingDecimal.parseFloat(FloatingDecimal.java:122)
            java.base/java.lang.Float.parseFloat(Float.java:476)
            java.base/java.lang.Float.valueOf(Float.java:440)
            org.apache.commons.lang.math.NumberUtils.createFloat(NumberUtils.java:581) */
        NumberUtils.createFloat(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.createBigDecimal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createBigDecimal(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateBigDecimal_StrEqualsNull() {
        BigDecimal actual = NumberUtils.createBigDecimal(null);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link org.apache.commons.lang.StringUtils#isBlank(java.lang.String)}
 * @utbot.returnsFrom {@code return new BigDecimal(str);}
 *  */
    @Test
    public void testCreateBigDecimal_StrNotEqualsNull() {
        String string = "1";
        
        BigDecimal actual = NumberUtils.createBigDecimal(string);
        
        BigDecimal expected = new BigDecimal(0);
        
        // java.math.BigDecimal has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createBigDecimal(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.invokes {@link org.apache.commons.lang.StringUtils#isBlank(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return new BigDecimal(str);
 *  */
    @Test
    public void testCreateBigDecimal_ThrowNumberFormatException() {
        String string = "+";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: No digits found.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:592)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.math.NumberUtils.createBigDecimal(NumberUtils.java:667) */
        NumberUtils.createBigDecimal(string);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createBigDecimal(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: StringUtils.isBlank(str)
 *  */
    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_ThrowNumberFormatException_1() {
        String string = "";
        
        NumberUtils.createBigDecimal(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createBigDecimal(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} when: StringUtils.isBlank(str)
 *  */
    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal_ThrowNumberFormatException_2() {
        String string = "\n";
        
        NumberUtils.createBigDecimal(string);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method createBigDecimal(java.lang.String)
    
    @Test
    public void testCreateBigDecimal1() {
        String string = "-\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Character   is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.math.NumberUtils.createBigDecimal(NumberUtils.java:667) */
        NumberUtils.createBigDecimal(string);
    }
    
    @Test
    public void testCreateBigDecimal2() {
        String string = "-E-0\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Too many nonzero exponent digits.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:734)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.math.NumberUtils.createBigDecimal(NumberUtils.java:667) */
        NumberUtils.createBigDecimal(string);
    }
    
    @Test
    public void testCreateBigDecimal3() {
        String string = "-E-\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Not a digit.]
            java.base/java.math.BigDecimal.parseExp(BigDecimal.java:743)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:580)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.math.NumberUtils.createBigDecimal(NumberUtils.java:667) */
        NumberUtils.createBigDecimal(string);
    }
    
    @Test
    public void testCreateBigDecimal4() {
        String string = "+.2\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Character array is missing "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:645)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.math.NumberUtils.createBigDecimal(NumberUtils.java:667) */
        NumberUtils.createBigDecimal(string);
    }
    
    @Test
    public void testCreateBigDecimal5() {
        String string = "\r\u0000";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Character 
         is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.math.NumberUtils.createBigDecimal(NumberUtils.java:667) */
        NumberUtils.createBigDecimal(string);
    }
    
    @Test
    public void testCreateBigDecimal6() {
        String string = "\f\f\u0000";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createBigDecimal] produces [java.lang.NumberFormatException: Character  is neither a decimal digit number, decimal point, nor "e" notation exponential mark.]
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:586)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:471)
            java.base/java.math.BigDecimal.<init>(BigDecimal.java:900)
            org.apache.commons.lang.math.NumberUtils.createBigDecimal(NumberUtils.java:667) */
        NumberUtils.createBigDecimal(string);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createBigDecimal(java.lang.String)
    
    @Test(expected = NumberFormatException.class)
    public void testCreateBigDecimal7() {
        String string = "\t\t";
        
        NumberUtils.createBigDecimal(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.isDigits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDigits(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < str.length(); i++)} once
 *  */
    @Test
    public void testIsDigits_NotCharacterIsDigit() {
        String string = "/";
        
        boolean actual = NumberUtils.isDigits(string);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < str.length(); i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsDigits_CharacterIsDigit() {
        String string = "2";
        
        boolean actual = NumberUtils.isDigits(string);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): True}
 *  */
    @Test
    public void testIsDigits_StringUtilsIsEmpty() {
        boolean actual = NumberUtils.isDigits(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isDigits(java.lang.String)}
 * @utbot.executesCondition {@code (StringUtils.isEmpty(str)): True}
 *  */
    @Test
    public void testIsDigits_StringUtilsIsEmpty_1() {
        String string = "";
        
        boolean actual = NumberUtils.isDigits(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.isAllZeros
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAllZeros(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = str.length() - 1; i >= 0; i--)} once
 *  */
    @Test
    public void testIsAllZeros_StrCharAtNotEquals0() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = " ";
        
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = string;
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAllZeros_StrEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.returnsFrom {@code return str.length() > 0;}
 *  */
    @Test
    public void testIsAllZeros_StrLengthLessOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = string;
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#isAllZeros(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): False}
 * @utbot.iterates iterate the loop {@code for(int i = str.length() - 1; i >= 0; i--)} once
 * @utbot.returnsFrom {@code return str.length() > 0;}
 *  */
    @Test
    public void testIsAllZeros_StrLengthGreaterThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "0";
        
        Class numberUtilsClazz = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class stringType = Class.forName("java.lang.String");
        Method isAllZerosMethod = numberUtilsClazz.getDeclaredMethod("isAllZeros", stringType);
        isAllZerosMethod.setAccessible(true);
        java.lang.Object[] isAllZerosMethodArguments = new java.lang.Object[1];
        isAllZerosMethodArguments[0] = string;
        boolean actual = ((Boolean) isAllZerosMethod.invoke(null, isAllZerosMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.lang.math.NumberUtils.createDouble
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createDouble(java.lang.String)}
 * @utbot.executesCondition {@code (str == null): True}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testCreateDouble_StrEqualsNull() {
        Double actual = NumberUtils.createDouble(null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createDouble(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} in: return Double.valueOf(str);
 *  */
    @Test
    public void testCreateDouble_ThrowNumberFormatException() {
        String string = "";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: empty String]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:1842)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang.math.NumberUtils.createDouble(NumberUtils.java:597) */
        NumberUtils.createDouble(string);
    }
    
    /**
    @utbot.classUnderTest {@link NumberUtils}
 * @utbot.methodUnderTest {@link org.apache.commons.lang.math.NumberUtils#createDouble(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NumberFormatException} 
 *  */
    @Test
    public void testCreateDouble_ThrowNumberFormatException_1() {
        String string = "-";
        
        /* This test fails because method [org.apache.commons.lang.math.NumberUtils.createDouble] produces [java.lang.NumberFormatException: For input string: "-"]
            java.base/jdk.internal.math.FloatingDecimal.readJavaFormatString(FloatingDecimal.java:2054)
            java.base/jdk.internal.math.FloatingDecimal.parseDouble(FloatingDecimal.java:110)
            java.base/java.lang.Double.parseDouble(Double.java:651)
            java.base/java.lang.Double.valueOf(Double.java:614)
            org.apache.commons.lang.math.NumberUtils.createDouble(NumberUtils.java:597) */
        NumberUtils.createDouble(string);
    }
    ///endregion
    
    ///endregion
}

