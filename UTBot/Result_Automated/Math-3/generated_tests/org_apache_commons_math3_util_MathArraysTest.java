package org.apache.commons.math3.util;

import org.junit.Test;
import org.apache.commons.math3.util.MathArrays.OrderDirection;
import org.apache.commons.math3.exception.NonMonotonicSequenceException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.fraction.BigFractionField;
import org.apache.commons.math3.fraction.BigFraction;
import org.apache.commons.math3.fraction.FractionField;
import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.exception.NoDataException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.MathArithmeticException;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class org_apache_commons_math3_util_MathArraysTest {
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals([F, [F)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): True}
 *  */
    @Test
    public void testEquals_XLengthNotEqualsYLength() {
        float[] floatArray = {0.0f, 0.0f};
        float[] floatArray1 = {0.0f};
        
        boolean actual = MathArrays.equals(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_ReturnTrue() {
        float[] floatArray = {};
        
        boolean actual = MathArrays.equals(floatArray, floatArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 *  */
    @Test
    public void testEquals_NotPrecisionEquals() {
        float[] floatArray = {java.lang.Float.NaN};
        float[] floatArray1 = {-2.0000002f};
        
        boolean actual = MathArrays.equals(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 *  */
    @Test
    public void testEquals_NotPrecisionEquals_1() {
        float[] floatArray = {-2.0000002f};
        float[] floatArray1 = {java.lang.Float.NaN};
        
        boolean actual = MathArrays.equals(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEquals_NotXNotEqualsNullXorYNotEqualsNull() {
        float[] floatArray = {0.0f};
        
        boolean actual = MathArrays.equals(floatArray, ((float[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(float[],float[])}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEquals_NotXNotEqualsNullXorYNotEqualsNull_1() {
        float[] floatArray = {0.0f};
        
        boolean actual = MathArrays.equals(((float[]) null), floatArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(float[],float[])}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEquals_NotXEqualsNullXorYEqualsNull() {
        boolean actual = MathArrays.equals(((float[]) null), ((float[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): True}
 *  */
    @Test
    public void testEquals_XLengthNotEqualsYLength1() {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        boolean actual = MathArrays.equals(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_XLengthEqualsYLength() {
        double[] doubleArray = {};
        
        boolean actual = MathArrays.equals(doubleArray, doubleArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 *  */
    @Test
    public void testEquals_NotPrecisionEquals1() {
        double[] doubleArray = {-2.0000000000000004};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        boolean actual = MathArrays.equals(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 *  */
    @Test
    public void testEquals_NotPrecisionEquals_11() {
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {-0.0};
        
        boolean actual = MathArrays.equals(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_PrecisionEquals() {
        double[] doubleArray = {-2.0000000000000004};
        double[] doubleArray1 = {-2.0000000000000004};
        
        boolean actual = MathArrays.equals(doubleArray, doubleArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEquals_NotXNotEqualsNullXorYNotEqualsNull1() {
        double[] doubleArray = {0.0};
        
        boolean actual = MathArrays.equals(doubleArray, ((double[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(double[],double[])}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEquals_NotXNotEqualsNullXorYNotEqualsNull_11() {
        double[] doubleArray = {0.0};
        
        boolean actual = MathArrays.equals(((double[]) null), doubleArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equals(double[],double[])}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEquals_NotXEqualsNullXorYEqualsNull1() {
        boolean actual = MathArrays.equals(((double[]) null), ((double[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.copyOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyOf([I, int)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(int[],int)}
 * @utbot.returnsFrom {@code return output;}
 *  */
    @Test
    public void testCopyOf_ReturnOutput() {
        int[] intArray = {};
        
        int[] actual = MathArrays.copyOf(intArray, 0);
        
        int[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(int[],int)}
 * @utbot.returnsFrom {@code return output;}
 *  */
    @Test
    public void testCopyOf_ReturnOutput_1() {
        int[] intArray = {};
        
        int[] actual = MathArrays.copyOf(intArray, 1);
        
        int[] expected = {0};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyOf([I, int)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(int[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final int[] output = new int[len];
 *  */
    @Test
    public void testCopyOf_ThrowNegativeArraySizeException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.copyOf] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math3.util.MathArrays.copyOf(MathArrays.java:777) */
        MathArrays.copyOf(((int[]) null), -256);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(int[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(source, 0, output, 0, FastMath.min(len, source.length));
 *  */
    @Test
    public void testCopyOf_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.copyOf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.copyOf(MathArrays.java:778) */
        MathArrays.copyOf(((int[]) null), 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.copyOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyOf([D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(double[])}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathArrays#copyOf(double[],int)}
 * @utbot.returnsFrom {@code return copyOf(source, source.length);}
 *  */
    @Test
    public void testCopyOf_MathArraysCopyOf() {
        double[] doubleArray = {};
        
        double[] actual = MathArrays.copyOf(doubleArray);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyOf([D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return copyOf(source, source.length);
 *  */
    @Test
    public void testCopyOf_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.copyOf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.copyOf(MathArrays.java:764) */
        MathArrays.copyOf(((double[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.copyOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyOf([D, int)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(double[],int)}
 * @utbot.returnsFrom {@code return output;}
 *  */
    @Test
    public void testCopyOf_ReturnOutput1() {
        double[] doubleArray = {};
        
        double[] actual = MathArrays.copyOf(doubleArray, 0);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(double[],int)}
 * @utbot.returnsFrom {@code return output;}
 *  */
    @Test
    public void testCopyOf_ReturnOutput_11() {
        double[] doubleArray = {};
        
        double[] actual = MathArrays.copyOf(doubleArray, 1);
        
        double[] expected = {0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyOf([D, int)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(double[],int)}
 * @utbot.throwsException {@link java.lang.NegativeArraySizeException} in: final double[] output = new double[len];
 *  */
    @Test
    public void testCopyOf_ThrowNegativeArraySizeException1() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.copyOf] produces [java.lang.NegativeArraySizeException: -256]
            org.apache.commons.math3.util.MathArrays.copyOf(MathArrays.java:792) */
        MathArrays.copyOf(((double[]) null), -256);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(double[],int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: System.arraycopy(source, 0, output, 0, FastMath.min(len, source.length));
 *  */
    @Test
    public void testCopyOf_ThrowNullPointerException2() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.copyOf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.copyOf(MathArrays.java:793) */
        MathArrays.copyOf(((double[]) null), 1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.copyOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method copyOf([I)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(int[])}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathArrays#copyOf(int[],int)}
 * @utbot.returnsFrom {@code return copyOf(source, source.length);}
 *  */
    @Test
    public void testCopyOf_MathArraysCopyOf1() {
        int[] intArray = {};
        
        int[] actual = MathArrays.copyOf(intArray);
        
        int[] expected = {};
        
        assertArrayEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method copyOf([I)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#copyOf(int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return copyOf(source, source.length);
 *  */
    @Test
    public void testCopyOf_ThrowNullPointerException3() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.copyOf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.copyOf(MathArrays.java:754) */
        MathArrays.copyOf(((int[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.scale
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method scale(double, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#scale(double,double[])}
 * @utbot.returnsFrom {@code return newArr;}
 *  */
    @Test
    public void testScale_ReturnNewArr() {
        double[] doubleArray = {};
        
        double[] actual = MathArrays.scale(java.lang.Double.NaN, doubleArray);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#scale(double,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arr.length; i++)} once
 * @utbot.returnsFrom {@code return newArr;}
 *  */
    @Test
    public void testScale_IterateForLoop() {
        double[] doubleArray = {0.0};
        
        double[] actual = MathArrays.scale(java.lang.Double.NaN, doubleArray);
        
        double[] expected = {java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scale(double, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#scale(double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double[] newArr = new double[arr.length];
 *  */
    @Test
    public void testScale_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.scale] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.scale(MathArrays.java:86) */
        MathArrays.scale(java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method scale(double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#scale(double,double[])}
     */
    @Test
    public void testScaleWithCornerCaseAndNonEmptyPrimitiveArray() {
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        double[] actual = MathArrays.scale(0.0, doubleArray);
        
        double[] expected = {java.lang.Double.NaN, java.lang.Double.NaN, -0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.distance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method distance([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.returnsFrom {@code return FastMath.sqrt(sum);}
 *  */
    @Test
    public void testDistance_IterateForLoop() {
        double[] doubleArray = {0.0};
        
        double actual = MathArrays.distance(doubleArray, doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(double[],double[])}
 * @utbot.returnsFrom {@code return FastMath.sqrt(sum);}
 *  */
    @Test
    public void testDistance_ReturnFastMathSqrt() {
        double[] doubleArray = {};
        
        double actual = MathArrays.distance(doubleArray, ((double[]) null));
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distance([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double dp = p1[i] - p2[i];
 *  */
    @Test
    public void testDistance_ThrowArrayIndexOutOfBoundsException() {
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.distance(MathArrays.java:237) */
        MathArrays.distance(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double dp = p1[i] - p2[i];
 *  */
    @Test
    public void testDistance_ThrowNullPointerException_1() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distance(MathArrays.java:237) */
        MathArrays.distance(doubleArray, ((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < p1.length; i++)
 *  */
    @Test
    public void testDistance_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distance(MathArrays.java:236) */
        MathArrays.distance(((double[]) null), ((double[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method distance([D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(double[],double[])}
     */
    @Test
    public void testDistanceReturnsNanWithNonEmptyPrimitiveArrays() {
        double[] doubleArray = {java.lang.Double.NaN, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        double[] doubleArray1 = {0.0, 0.0, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY};
        
        double actual = MathArrays.distance(doubleArray, doubleArray1);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(double[],double[])}
     */
    @Test
    public void testDistanceReturnsNanWithNonEmptyPrimitiveArrays1() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 1.0};
        double[] doubleArray1 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -1.0, -1.0, -1.0};
        
        double actual = MathArrays.distance(doubleArray, doubleArray1);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.distance
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method distance([I, [I)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(int[],int[])}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#sqrt(double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.returnsFrom {@code return FastMath.sqrt(sum);}
 *  */
    @Test
    public void testDistance_FastMathSqrt() {
        int[] intArray = {-255};
        int[] intArray1 = {-255};
        
        double actual = MathArrays.distance(intArray, intArray1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distance([I, [I)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(int[],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double dp = p1[i] - p2[i];
 *  */
    @Test
    public void testDistance_ThrowArrayIndexOutOfBoundsException1() {
        int[] intArray = {-255};
        int[] intArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.distance(MathArrays.java:253) */
        MathArrays.distance(intArray, intArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(int[],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double dp = p1[i] - p2[i];
 *  */
    @Test
    public void testDistance_ThrowNullPointerException_11() {
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distance(MathArrays.java:253) */
        MathArrays.distance(intArray, ((int[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(int[],int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < p1.length; i++)
 *  */
    @Test
    public void testDistance_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distance(MathArrays.java:252) */
        MathArrays.distance(((int[]) null), ((int[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method distance([I, [I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(int[],int[])}
     */
    @Test
    public void testDistanceWithNonEmptyPrimitiveArrays() {
        int[] intArray = {0, -1, Integer.MAX_VALUE};
        int[] intArray1 = {1, 1, 0, Integer.MAX_VALUE};
        
        double actual = MathArrays.distance(intArray, intArray1);
        
        assertEquals(2.147483647E9, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance(int[],int[])}
     */
    @Test
    public void testDistanceWithNonEmptyPrimitiveArrays1() {
        int[] intArray = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] intArray1 = {Integer.MAX_VALUE, 1, -1, -1, -1};
        
        double actual = MathArrays.distance(intArray, intArray1);
        
        assertEquals(2.147483647E9, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.scaleInPlace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method scaleInPlace(double, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#scaleInPlace(double,double[])}
 *  */
    @Test
    public void testScaleInPlace() {
        double[] doubleArray = {};
        
        MathArrays.scaleInPlace(java.lang.Double.NaN, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#scaleInPlace(double,double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < arr.length; i++)} once
 *  */
    @Test
    public void testScaleInPlace_IterateForLoop() {
        double[] doubleArray = {0.0};
        
        MathArrays.scaleInPlace(java.lang.Double.NaN, doubleArray);
        
        double finalDoubleArray0 = doubleArray[0];
        
        assertEquals(java.lang.Double.NaN, finalDoubleArray0, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method scaleInPlace(double, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#scaleInPlace(double,double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < arr.length; i++)
 *  */
    @Test
    public void testScaleInPlace_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.scaleInPlace] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.scaleInPlace(MathArrays.java:103) */
        MathArrays.scaleInPlace(java.lang.Double.NaN, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method scaleInPlace(double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#scaleInPlace(double,double[])}
     */
    @Test
    public void testScaleInPlaceWithCornerCaseAndNonEmptyPrimitiveArray() {
        double[] doubleArray = {java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        
        MathArrays.scaleInPlace(0.0, doubleArray);
        
        double finalDoubleArray1 = doubleArray[1];
        double finalDoubleArray2 = doubleArray[2];
        
        assertEquals(java.lang.Double.NaN, finalDoubleArray1, 1.0E-6);
        
        assertEquals(-0.0, finalDoubleArray2, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.isMonotonic
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isMonotonic([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return checkOrder(val, dir, strict, false);}
 *  */
    @Test
    public void testIsMonotonic_ReturnCheckOrder() {
        double[] doubleArray = {4.9E-324, 4.9E-324};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.isMonotonic(doubleArray, orderDirection, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return checkOrder(val, dir, strict, false);}
 *  */
    @Test
    public void testIsMonotonic_ReturnCheckOrder_1() {
        double[] doubleArray = {-9.55661948907561E-299, 8.589934624001316E9};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.isMonotonic(doubleArray, orderDirection, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return checkOrder(val, dir, strict, false);}
 *  */
    @Test
    public void testIsMonotonic_ReturnCheckOrder_3() {
        double[] doubleArray = {4.9E-324, 4.9E-324};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.isMonotonic(doubleArray, orderDirection, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return checkOrder(val, dir, strict, false);}
 *  */
    @Test
    public void testIsMonotonic_ReturnCheckOrder_4() {
        double[] doubleArray = {java.lang.Double.NaN, 5.432640786713E-312};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.isMonotonic(doubleArray, orderDirection, true);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return checkOrder(val, dir, strict, false);}
 *  */
    @Test
    public void testIsMonotonic_ReturnCheckOrder_5() {
        double[] doubleArray = {3.621485032655E-312, 3.621485032655E-312};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.isMonotonic(doubleArray, orderDirection, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return checkOrder(val, dir, strict, false);}
 *  */
    @Test
    public void testIsMonotonic_ReturnCheckOrder_6() {
        double[] doubleArray = {-2.2250741237566757E-308, 32.000003814697266};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.isMonotonic(doubleArray, orderDirection, true);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.returnsFrom {@code return checkOrder(val, dir, strict, false);}
 *  */
    @Test
    public void testIsMonotonic_ReturnCheckOrder_7() {
        double[] doubleArray = {2.353997941664E-311, 2.353997941664E-311};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.isMonotonic(doubleArray, orderDirection, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.returnsFrom {@code return checkOrder(val, dir, strict, false);}
 *  */
    @Test
    public void testIsMonotonic_ReturnCheckOrder_8() {
        double[] doubleArray = {2.2251078104398573E-308, -5.966763629158544E-154};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.isMonotonic(doubleArray, orderDirection, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.returnsFrom {@code return checkOrder(val, dir, strict, false);}
 *  */
    @Test
    public void testIsMonotonic_ReturnCheckOrder_2() {
        double[] doubleArray = {0.0};
        
        boolean actual = MathArrays.isMonotonic(doubleArray, ((MathArrays.OrderDirection) null), false);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isMonotonic([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return checkOrder(val, dir, strict, false);
 *  */
    @Test
    public void testIsMonotonic_ThrowArrayIndexOutOfBoundsException() {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.checkOrder(MathArrays.java:376)
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:359) */
        MathArrays.isMonotonic(doubleArray, ((MathArrays.OrderDirection) null), false);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isMonotonic([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
     */
    @Test
    public void testIsMonotonicReturnsFalseWithNonEmptyPrimitiveArray() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.isMonotonic(doubleArray, orderDirection, true);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.isMonotonic
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isMonotonic([Ljava.lang.Comparable;, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 *  */
    @Test
    public void testIsMonotonic_CompGreaterOrEqualZero() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = 0;
        comparableArray[0] = ((Comparable) integer);
        comparableArray[1] = ((Comparable) integer);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.isMonotonic(comparableArray, orderDirection, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 *  */
    @Test
    public void testIsMonotonic_CompGreaterOrEqualZero_1() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = 0;
        comparableArray[0] = ((Comparable) integer);
        comparableArray[1] = ((Comparable) integer);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.isMonotonic(comparableArray, orderDirection, true);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsMonotonic_CompLessOrEqualZero() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = 0;
        comparableArray[0] = ((Comparable) integer);
        comparableArray[1] = ((Comparable) integer);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.isMonotonic(comparableArray, orderDirection, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsMonotonic_CompLessOrEqualZero_1() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = 0;
        comparableArray[0] = ((Comparable) integer);
        comparableArray[1] = ((Comparable) integer);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.isMonotonic(comparableArray, orderDirection, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 *  */
    @Test
    public void testIsMonotonic_CompGreaterThanZero() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = -2080374785;
        comparableArray[0] = ((Comparable) integer);
        Integer integer1 = 0;
        comparableArray[1] = ((Comparable) integer1);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.isMonotonic(comparableArray, orderDirection, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 *  */
    @Test
    public void testIsMonotonic_CompGreaterThanZero_1() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = 0;
        comparableArray[0] = ((Comparable) integer);
        Integer integer1 = -1;
        comparableArray[1] = ((Comparable) integer1);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.isMonotonic(comparableArray, orderDirection, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsMonotonic_CompLessThanZero() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = 1073741824;
        comparableArray[0] = ((Comparable) integer);
        Integer integer1 = 1073741823;
        comparableArray[1] = ((Comparable) integer1);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.isMonotonic(comparableArray, orderDirection, true);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsMonotonic_CompLessThanZero_1() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = 1073741823;
        comparableArray[0] = ((Comparable) integer);
        Integer integer1 = 1073741824;
        comparableArray[1] = ((Comparable) integer1);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.isMonotonic(comparableArray, orderDirection, true);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsMonotonic_ReturnTrue() {
        java.lang.Comparable[] comparableArray = {null};
        
        boolean actual = MathArrays.isMonotonic(comparableArray, ((MathArrays.OrderDirection) null), false);
        
        assertTrue(actual);
        
        Comparable finalComparableArray0 = comparableArray[0];
        
        assertNull(finalComparableArray0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isMonotonic([Ljava.lang.Comparable;, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: comp = val[i].compareTo(previous);
 *  */
    @Test
    public void testIsMonotonic_ThrowClassCastException() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Character character = '\u0000';
        comparableArray[0] = ((Comparable) character);
        Integer integer = 0;
        comparableArray[1] = ((Comparable) integer);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class java.lang.Integer (java.lang.Character and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:329) */
        MathArrays.isMonotonic(comparableArray, orderDirection, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: comp = val[i].compareTo(previous);
 *  */
    @Test
    public void testIsMonotonic_ThrowClassCastException_1() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = 0;
        comparableArray[0] = ((Comparable) integer);
        Character character = '\u0000';
        comparableArray[1] = ((Comparable) character);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.Character (java.lang.Integer and java.lang.Character are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Character.compareTo(Character.java:174)
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:329) */
        MathArrays.isMonotonic(comparableArray, orderDirection, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: comp = previous.compareTo(val[i]);
 *  */
    @Test
    public void testIsMonotonic_ThrowClassCastException_2() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[2];
        Integer integer = 0;
        comparableArray[0] = ((Comparable) integer);
        Character character = '\u0000';
        comparableArray[1] = ((Comparable) character);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.ClassCastException: class java.lang.Character cannot be cast to class java.lang.Integer (java.lang.Character and java.lang.Integer are in module java.base of loader 'bootstrap')]
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:317) */
        MathArrays.isMonotonic(comparableArray, orderDirection, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: T previous = val[0];
 *  */
    @Test
    public void testIsMonotonic_ThrowArrayIndexOutOfBoundsException1() {
        java.lang.Comparable[] comparableArray = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:311) */
        MathArrays.isMonotonic(comparableArray, ((MathArrays.OrderDirection) null), false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: comp = val[i].compareTo(previous);
 *  */
    @Test
    public void testIsMonotonic_ThrowNullPointerException_2() {
        java.lang.Comparable[] comparableArray = {null, null};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:329) */
        MathArrays.isMonotonic(comparableArray, orderDirection, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: comp = previous.compareTo(val[i]);
 *  */
    @Test
    public void testIsMonotonic_ThrowNullPointerException_3() {
        java.lang.Comparable[] comparableArray = {null, null};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:317) */
        MathArrays.isMonotonic(comparableArray, orderDirection, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < max; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(dir)
 *  */
    @Test
    public void testIsMonotonic_ThrowNullPointerException_1() {
        java.lang.Comparable[] comparableArray = {null, null};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:315) */
        MathArrays.isMonotonic(comparableArray, ((MathArrays.OrderDirection) null), false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#isMonotonic(java.lang.Comparable[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: T previous = val[0];
 *  */
    @Test
    public void testIsMonotonic_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:311) */
        MathArrays.isMonotonic(((java.lang.Comparable[]) null), ((MathArrays.OrderDirection) null), false);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isMonotonic([Ljava.lang.Comparable;, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    @Test
    public void testIsMonotonic1() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[5];
        Character character = '\u0000';
        comparableArray[0] = ((Comparable) character);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.NullPointerException]
            java.base/java.lang.Character.compareTo(Character.java:11214)
            java.base/java.lang.Character.compareTo(Character.java:174)
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:317) */
        MathArrays.isMonotonic(comparableArray, orderDirection, false);
    }
    
    @Test
    public void testIsMonotonic2() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[32];
        Character character = '\u0000';
        comparableArray[0] = ((Comparable) character);
        Character character1 = '\u0000';
        comparableArray[1] = ((Comparable) character1);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:329) */
        MathArrays.isMonotonic(comparableArray, orderDirection, false);
    }
    
    @Test
    public void testIsMonotonic3() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[3];
        Integer integer = 0;
        comparableArray[0] = ((Comparable) integer);
        Integer integer1 = 1;
        comparableArray[1] = ((Comparable) integer1);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:317) */
        MathArrays.isMonotonic(comparableArray, orderDirection, true);
    }
    
    @Test
    public void testIsMonotonic4() {
        java.lang.Comparable[] comparableArray = new java.lang.Comparable[5];
        Integer integer = 0;
        comparableArray[0] = ((Comparable) integer);
        Integer integer1 = 0;
        comparableArray[1] = ((Comparable) integer1);
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.isMonotonic] produces [java.lang.NullPointerException]
            java.base/java.lang.Integer.compareTo(Integer.java:1477)
            java.base/java.lang.Integer.compareTo(Integer.java:71)
            org.apache.commons.math3.util.MathArrays.isMonotonic(MathArrays.java:317) */
        MathArrays.isMonotonic(comparableArray, orderDirection, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.checkOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testCheckOrder_1() {
        double[] doubleArray = {4.9E-324, 4.9E-324};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testCheckOrder_2() {
        double[] doubleArray = {java.lang.Double.NaN, 5.432640786713E-312};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, true);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testCheckOrder_3() {
        double[] doubleArray = {2.2251191168609554E-308, 2.2251191168609554E-308};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): False}
 *  */
    @Test
    public void testCheckOrder_4() {
        double[] doubleArray = {-4.360150876171281E-106, 2.0303534698538854E-115};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, true);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 *  */
    @Test
    public void testCheckOrder() {
        double[] doubleArray = {0.0};
        
        MathArrays.checkOrder(doubleArray, null, false);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NonMonotonicSequenceException} in: checkOrder(val, dir, strict, true);
 *  */
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder_ThrowNonMonotonicSequenceException() {
        double[] doubleArray = {7.243051747127E-312, 7.243051747127E-312};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, true);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NonMonotonicSequenceException} in: checkOrder(val, dir, strict, true);
 *  */
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder_ThrowNonMonotonicSequenceException_1() {
        double[] doubleArray = {1.2491930519722303E-257, -1.4517891957286633E25};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): False}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NonMonotonicSequenceException} in: checkOrder(val, dir, strict, true);
 *  */
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder_ThrowNonMonotonicSequenceException_2() {
        double[] doubleArray = {-2.113178150127318E270, 1.7726623135583216E277};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.executesCondition {@code (null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NonMonotonicSequenceException} in: checkOrder(val, dir, strict, true);
 *  */
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder_ThrowNonMonotonicSequenceException_3() {
        double[] doubleArray = {2.734543940751859, 2.734543940751859};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, true);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkOrder(val, dir, strict, true);
 *  */
    @Test
    public void testCheckOrder_ThrowArrayIndexOutOfBoundsException() {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkOrder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.checkOrder(MathArrays.java:376)
            org.apache.commons.math3.util.MathArrays.checkOrder(MathArrays.java:437) */
        MathArrays.checkOrder(doubleArray, null, false);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
     */
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderThrowsNMSEWithNonEmptyPrimitiveArray() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, true);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
     */
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderThrowsNMSEWithNonEmptyPrimitiveArray1() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, false);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    @Test
    public void testCheckOrder1() {
        double[] doubleArray = new double[31];
        doubleArray[0] = java.lang.Double.NaN;
        doubleArray[1] = java.lang.Double.NaN;
        doubleArray[2] = 7.50438741555589E-301;
        doubleArray[3] = -2.9706391625425405E-272;
        doubleArray[4] = java.lang.Double.NaN;
        doubleArray[5] = java.lang.Double.NaN;
        doubleArray[6] = java.lang.Double.NaN;
        doubleArray[7] = java.lang.Double.NaN;
        doubleArray[8] = java.lang.Double.NaN;
        doubleArray[9] = java.lang.Double.NaN;
        doubleArray[10] = java.lang.Double.NaN;
        doubleArray[11] = java.lang.Double.NaN;
        doubleArray[12] = java.lang.Double.NaN;
        doubleArray[13] = 4.382035050169482E298;
        doubleArray[14] = java.lang.Double.NaN;
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, false);
    }
    
    @Test
    public void testCheckOrder2() {
        double[] doubleArray = new double[39];
        doubleArray[1] = -0.0;
        doubleArray[2] = -0.0;
        doubleArray[3] = -0.0;
        doubleArray[4] = -0.0;
        doubleArray[5] = -0.0;
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, false);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean)
    
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder3() {
        double[] doubleArray = new double[31];
        doubleArray[0] = java.lang.Double.NaN;
        doubleArray[1] = -1.3096253489407173E260;
        doubleArray[2] = java.lang.Double.NaN;
        doubleArray[3] = 3.697694712782237E19;
        doubleArray[4] = 2.004524320400613;
        doubleArray[5] = -4.104536801298378E-289;
        doubleArray[6] = java.lang.Double.NaN;
        doubleArray[7] = -1.0078125;
        doubleArray[8] = java.lang.Double.NaN;
        doubleArray[9] = java.lang.Double.NaN;
        doubleArray[10] = java.lang.Double.NaN;
        doubleArray[11] = java.lang.Double.NaN;
        doubleArray[12] = java.lang.Double.NaN;
        doubleArray[13] = 1.8386274327822152E-184;
        doubleArray[14] = java.lang.Double.NaN;
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, true);
    }
    
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder4() {
        double[] doubleArray = new double[15];
        doubleArray[0] = -1.5191102311762685E197;
        doubleArray[1] = -1.0249446880625493E118;
        doubleArray[2] = -2.4499283048522763E-181;
        doubleArray[3] = -1.6317917697279165E-231;
        doubleArray[4] = 9.011875065507863E-307;
        doubleArray[5] = 4.979172970630718E78;
        doubleArray[6] = 9.720660749208386E154;
        doubleArray[7] = 1.2013605504520932E157;
        doubleArray[8] = 4.50330742216843E159;
        doubleArray[9] = 1.5836528034432255E164;
        doubleArray[10] = 1.2973283765806901E168;
        doubleArray[11] = 3.7117513125683233E239;
        doubleArray[12] = java.lang.Double.NaN;
        doubleArray[13] = 3.1185004836479997E290;
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.checkOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.executesCondition {@code (index == max): False}
 * @utbot.executesCondition {@code (abort): False}
 * @utbot.iterates iterate the loop {@code for(index = 1; index < max; index++)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCheckOrder_IndexOfValGreaterOrEqualPrevious() {
        double[] doubleArray = {4.9E-324, 4.9E-324};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.checkOrder(doubleArray, orderDirection, true, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.executesCondition {@code (index == max): False}
 * @utbot.executesCondition {@code (abort): False}
 * @utbot.iterates iterate the loop {@code for(index = 1; index < max; index++)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCheckOrder_IndexOfValGreaterThanPrevious() {
        double[] doubleArray = {-5.365250875878653E154, 4.948570489928975E173};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.checkOrder(doubleArray, orderDirection, false, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.executesCondition {@code (index == max): False}
 * @utbot.executesCondition {@code (abort): False}
 * @utbot.iterates iterate the loop {@code for(index = 1; index < max; index++)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCheckOrder_IndexOfValLessThanPrevious() {
        double[] doubleArray = {5.393554687500001, -5.322804399589189E19};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.checkOrder(doubleArray, orderDirection, false, false);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.executesCondition {@code (index == max): True}
 * @utbot.iterates iterate the loop {@code for(index = 1; index < max; index++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCheckOrder_IndexOfValLessThanPrevious_1() {
        double[] doubleArray = {java.lang.Double.NaN, 1.0864618449742E-311};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.checkOrder(doubleArray, orderDirection, true, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.executesCondition {@code (index == max): True}
 * @utbot.iterates iterate the loop {@code for(index = 1; index < max; index++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCheckOrder_IndexOfValLessOrEqualPrevious() {
        double[] doubleArray = {-4.9E-324, -4.9E-324};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.checkOrder(doubleArray, orderDirection, false, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.executesCondition {@code (index == max): True}
 * @utbot.iterates iterate the loop {@code for(index = 1; index < max; index++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCheckOrder_IndexOfValGreaterThanPrevious_1() {
        double[] doubleArray = {-2.1132610972104806E-132, 5.065525509171813E-226};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.checkOrder(doubleArray, orderDirection, true, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.executesCondition {@code (index == max): True}
 * @utbot.iterates iterate the loop {@code for(index = 1; index < max; index++)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCheckOrder_IndexOfValGreaterOrEqualPrevious_1() {
        double[] doubleArray = {4.9E-324, 4.9E-324};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.checkOrder(doubleArray, orderDirection, false, false);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.executesCondition {@code (index == max): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testCheckOrder_IndexEqualsMax() {
        double[] doubleArray = {0.0};
        
        boolean actual = MathArrays.checkOrder(doubleArray, null, false, false);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.executesCondition {@code (index == max): False}
 * @utbot.executesCondition {@code (abort): True}
 * @utbot.iterates iterate the loop {@code for(index = 1; index < max; index++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NonMonotonicSequenceException} when: abort
 *  */
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder_ThrowNonMonotonicSequenceException1() {
        double[] doubleArray = {-1.5379070334713426E-205, -1.5379070334713426E-205};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, true, true);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean, boolean)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double previous = val[0];
 *  */
    @Test
    public void testCheckOrder_ThrowArrayIndexOutOfBoundsException1() {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkOrder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.checkOrder(MathArrays.java:376) */
        MathArrays.checkOrder(doubleArray, null, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.iterates iterate the loop {@code for(index = 1; index < max; index++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(dir)
 *  */
    @Test
    public void testCheckOrder_ThrowNullPointerException_1() {
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkOrder] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.checkOrder(MathArrays.java:382) */
        MathArrays.checkOrder(doubleArray, null, false, false);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double previous = val[0];
 *  */
    @Test
    public void testCheckOrder_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkOrder] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.checkOrder(MathArrays.java:376) */
        MathArrays.checkOrder(null, null, false, false);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean, boolean)
    
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderByFuzzer() {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, false, true);
    }
    
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrderByFuzzer1() {
        double[] doubleArray = {-1.0, 1.0, 1.0, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        MathArrays.checkOrder(doubleArray, orderDirection, true, true);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkOrder([D, org.apache.commons.math3.util.MathArrays$OrderDirection, boolean, boolean)
    
    @Test
    public void testCheckOrder5() {
        double[] doubleArray = new double[31];
        doubleArray[0] = java.lang.Double.NaN;
        doubleArray[1] = 1.0940844540139222E-303;
        doubleArray[2] = 6.675970596632964E-308;
        doubleArray[3] = 2.294896088313889E-308;
        doubleArray[4] = 8.347422162667713E-309;
        doubleArray[5] = 2.78682005697902E-309;
        doubleArray[6] = java.lang.Double.NaN;
        doubleArray[7] = 1.3906817742982E-309;
        doubleArray[8] = 1.32624737E-314;
        doubleArray[9] = java.lang.Double.NaN;
        doubleArray[10] = java.lang.Double.NaN;
        doubleArray[11] = 2.6770487764038172E-307;
        doubleArray[12] = 1.3543018655020247E-307;
        doubleArray[13] = java.lang.Double.NaN;
        doubleArray[14] = java.lang.Double.NaN;
        doubleArray[15] = java.lang.Double.NaN;
        doubleArray[16] = 4.8975828679843E-311;
        doubleArray[17] = -1.158609710353E-311;
        doubleArray[18] = -1.4924448670576336E-154;
        doubleArray[19] = -2.0003051757814774;
        doubleArray[20] = -139281.07737779664;
        doubleArray[21] = -9.144701678531258E9;
        doubleArray[22] = -2.341043627392004E12;
        doubleArray[23] = -2.4606008688836376E77;
        doubleArray[24] = -9.550254676545934E307;
        doubleArray[25] = java.lang.Double.NaN;
        doubleArray[26] = 5.283267756749192E269;
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        
        boolean actual = MathArrays.checkOrder(doubleArray, orderDirection, true, false);
        
        assertFalse(actual);
    }
    
    @Test
    public void testCheckOrder6() {
        double[] doubleArray = {0.0, 0.0};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        
        boolean actual = MathArrays.checkOrder(doubleArray, orderDirection, true, false);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.checkOrder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkOrder([D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[])}
 *  */
    @Test
    public void testCheckOrder7() {
        double[] doubleArray = {java.lang.Double.NaN};
        
        MathArrays.checkOrder(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[])}
 *  */
    @Test
    public void testCheckOrder_11() {
        double[] doubleArray = {-4.00000011920929, 4.45014784963914E-308};
        
        MathArrays.checkOrder(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkOrder([D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[])}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean,boolean)}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NonMonotonicSequenceException} in: checkOrder(val, OrderDirection.INCREASING, true);
 *  */
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder_ThrowNonMonotonicSequenceException2() {
        double[] doubleArray = {4.9E-324, 4.9E-324};
        
        MathArrays.checkOrder(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkOrder([D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[])}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathArrays#checkOrder(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,boolean)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: checkOrder(val, OrderDirection.INCREASING, true);
 *  */
    @Test
    public void testCheckOrder_ThrowArrayIndexOutOfBoundsException2() {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkOrder] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.checkOrder(MathArrays.java:376)
            org.apache.commons.math3.util.MathArrays.checkOrder(MathArrays.java:437)
            org.apache.commons.math3.util.MathArrays.checkOrder(MathArrays.java:448) */
        MathArrays.checkOrder(doubleArray);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkOrder([D)
    
    @Test
    public void testCheckOrder8() {
        double[] doubleArray = new double[27];
        doubleArray[0] = -1.6750560521365403E-114;
        doubleArray[1] = -9.140592517547357E-115;
        doubleArray[2] = -1.409179955914175E-308;
        doubleArray[3] = 1.6885330018558083E-308;
        doubleArray[4] = 4.811129965554565E-299;
        doubleArray[5] = 2.40542442343305E-153;
        doubleArray[6] = 82432.75000238593;
        doubleArray[7] = java.lang.Double.NaN;
        doubleArray[8] = 1.4718457261642575E-231;
        doubleArray[9] = 2.3643219787969407E-221;
        doubleArray[10] = 1.297918124941285E-144;
        doubleArray[11] = 1.0709403994130398E-22;
        doubleArray[12] = java.lang.Double.NaN;
        doubleArray[13] = 2.1875000000001155;
        doubleArray[14] = 2.3437500018626602;
        doubleArray[15] = 2.617200825710832E115;
        doubleArray[16] = 7.898308698827732E173;
        doubleArray[17] = 2.3837280588885914E193;
        doubleArray[18] = java.lang.Double.NaN;
        doubleArray[19] = java.lang.Double.NEGATIVE_INFINITY;
        doubleArray[20] = 3.31561842E-316;
        doubleArray[21] = 1.45624086308127E-309;
        doubleArray[22] = 2.9878341741541E-309;
        doubleArray[23] = 12.193374782858896;
        doubleArray[24] = 512.0;
        doubleArray[25] = java.lang.Double.NaN;
        
        MathArrays.checkOrder(doubleArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkOrder([D)
    
    @Test(expected = NonMonotonicSequenceException.class)
    public void testCheckOrder9() {
        double[] doubleArray = new double[27];
        doubleArray[0] = java.lang.Double.NaN;
        doubleArray[1] = -4.665069213708067E-277;
        doubleArray[2] = 3.770638124521394E-265;
        doubleArray[3] = 1.1294137248826257;
        doubleArray[4] = java.lang.Double.NaN;
        doubleArray[5] = -1.4435652728168546E155;
        doubleArray[6] = -7.070523766759508E154;
        doubleArray[7] = -6.21847582504864E-270;
        doubleArray[8] = -4.104650324789986E-288;
        doubleArray[9] = -1.8363758317755218E-296;
        doubleArray[10] = -7.91758668713224E-299;
        doubleArray[11] = 3.5012962938E-313;
        doubleArray[12] = 1.1256479455299963E-308;
        doubleArray[13] = 2.2557349759213555E-154;
        doubleArray[14] = 5.938322877354565E-39;
        doubleArray[15] = 7.876018414861144E231;
        doubleArray[16] = 7.908140073918195E231;
        doubleArray[17] = java.lang.Double.NaN;
        doubleArray[18] = -1.7485272936897718E233;
        doubleArray[19] = -5.433813323052481E231;
        doubleArray[20] = -8.044684757965562E154;
        doubleArray[21] = -4.0223423789827803E154;
        doubleArray[22] = -3.000000000000001;
        doubleArray[23] = -1.112536929253601E-308;
        doubleArray[24] = -5.30499012E-315;
        doubleArray[25] = 2.225073858507265E-308;
        
        MathArrays.checkOrder(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.distance1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method distance1([I, [I)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(int[],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testDistance1_FastMathAbs() {
        int[] intArray = {-255};
        int[] intArray1 = {1};
        
        int actual = MathArrays.distance1(intArray, intArray1);
        
        org.junit.Assert.assertEquals(256, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(int[],int[])}
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testDistance1_ReturnSum() {
        int[] intArray = {};
        
        int actual = MathArrays.distance1(intArray, ((int[]) null));
        
        org.junit.Assert.assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distance1([I, [I)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(int[],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += FastMath.abs(p1[i] - p2[i]);
 *  */
    @Test
    public void testDistance1_ThrowArrayIndexOutOfBoundsException() {
        int[] intArray = {-255};
        int[] intArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.distance1(MathArrays.java:222) */
        MathArrays.distance1(intArray, intArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(int[],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sum += FastMath.abs(p1[i] - p2[i]);
 *  */
    @Test
    public void testDistance1_ThrowNullPointerException_1() {
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance1] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distance1(MathArrays.java:222) */
        MathArrays.distance1(intArray, ((int[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(int[],int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < p1.length; i++)
 *  */
    @Test
    public void testDistance1_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance1] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distance1(MathArrays.java:221) */
        MathArrays.distance1(((int[]) null), ((int[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method distance1([I, [I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(int[],int[])}
     */
    @Test
    public void testDistance1WithNonEmptyPrimitiveArrays() {
        int[] intArray = {0, -1, Integer.MAX_VALUE};
        int[] intArray1 = {1, 1, 0, Integer.MAX_VALUE};
        
        int actual = MathArrays.distance1(intArray, intArray1);
        
        org.junit.Assert.assertEquals(-2147483646, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(int[],int[])}
     */
    @Test
    public void testDistance1WithNonEmptyPrimitiveArrays1() {
        int[] intArray = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int[] intArray1 = {Integer.MAX_VALUE, 1, -1, -1, -1};
        
        int actual = MathArrays.distance1(intArray, intArray1);
        
        org.junit.Assert.assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.distance1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method distance1([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testDistance1_FastMathAbs1() {
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0};
        
        double actual = MathArrays.distance1(doubleArray, doubleArray1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(double[],double[])}
 * @utbot.returnsFrom {@code return sum;}
 *  */
    @Test
    public void testDistance1_ReturnSum1() {
        double[] doubleArray = {};
        
        double actual = MathArrays.distance1(doubleArray, ((double[]) null));
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distance1([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: sum += FastMath.abs(p1[i] - p2[i]);
 *  */
    @Test
    public void testDistance1_ThrowArrayIndexOutOfBoundsException1() {
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance1] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.distance1(MathArrays.java:207) */
        MathArrays.distance1(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: sum += FastMath.abs(p1[i] - p2[i]);
 *  */
    @Test
    public void testDistance1_ThrowNullPointerException_11() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance1] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distance1(MathArrays.java:207) */
        MathArrays.distance1(doubleArray, ((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < p1.length; i++)
 *  */
    @Test
    public void testDistance1_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distance1] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distance1(MathArrays.java:206) */
        MathArrays.distance1(((double[]) null), ((double[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method distance1([D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(double[],double[])}
     */
    @Test
    public void testDistance1ReturnsNanWithNonEmptyPrimitiveArrays() {
        double[] doubleArray = {java.lang.Double.NaN, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        double[] doubleArray1 = {0.0, 0.0, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY};
        
        double actual = MathArrays.distance1(doubleArray, doubleArray1);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distance1(double[],double[])}
     */
    @Test
    public void testDistance1ReturnsNanWithNonEmptyPrimitiveArrays1() {
        double[] doubleArray = {java.lang.Double.NEGATIVE_INFINITY, 1.0};
        double[] doubleArray1 = {java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, -1.0, -1.0, -1.0};
        
        double actual = MathArrays.distance1(doubleArray, doubleArray1);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.checkNonNegative
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkNonNegative([J)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[])}
 *  */
    @Test
    public void testCheckNonNegative() {
        long[] longArray = {};
        
        MathArrays.checkNonNegative(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 *  */
    @Test
    public void testCheckNonNegative_IOfInGreaterOrEqualZero() {
        long[] longArray = {0L};
        
        MathArrays.checkNonNegative(longArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkNonNegative([J)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotPositiveException} when: in[i] < 0
 *  */
    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegative_ThrowNotPositiveException() {
        long[] longArray = {-248L};
        
        MathArrays.checkNonNegative(longArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkNonNegative([J)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < in.length; i++)
 *  */
    @Test
    public void testCheckNonNegative_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkNonNegative] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.checkNonNegative(MathArrays.java:497) */
        MathArrays.checkNonNegative(((long[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.checkNonNegative
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkNonNegative([[J)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[][])}
 *  */
    @Test
    public void testCheckNonNegative1() {
        long[][] longArray = {};
        
        MathArrays.checkNonNegative(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 *  */
    @Test
    public void testCheckNonNegative_IterateForLoop() {
        long[][] longArray = new long[1][];
        long[] longArray1 = {};
        longArray[0] = longArray1;
        
        MathArrays.checkNonNegative(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 *  */
    @Test
    public void testCheckNonNegative_JOfIniGreaterOrEqualZero() {
        long[][] longArray = new long[1][];
        long[] longArray1 = {0L};
        longArray[0] = longArray1;
        
        MathArrays.checkNonNegative(longArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkNonNegative([[J)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotPositiveException} when: in[i][j] < 0
 *  */
    @Test(expected = NotPositiveException.class)
    public void testCheckNonNegative_ThrowNotPositiveException1() {
        long[][] longArray = new long[1][];
        long[] longArray1 = {-9223372036854775807L};
        longArray[0] = longArray1;
        
        MathArrays.checkNonNegative(longArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkNonNegative([[J)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int j = 0; j < in[i].length; j++)
 *  */
    @Test
    public void testCheckNonNegative_ThrowNullPointerException_1() {
        long[][] longArray = {null};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkNonNegative] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.checkNonNegative(MathArrays.java:514) */
        MathArrays.checkNonNegative(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkNonNegative(long[][])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < in.length; i++)
 *  */
    @Test
    public void testCheckNonNegative_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkNonNegative] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.checkNonNegative(MathArrays.java:513) */
        MathArrays.checkNonNegative(((long[][]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.ebeMultiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeMultiply([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeMultiply(double[],double[])}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testEbeMultiply_ReturnResult() {
        double[] doubleArray = {};
        
        double[] actual = MathArrays.ebeMultiply(doubleArray, doubleArray);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeMultiply(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < a.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testEbeMultiply_IterateForLoop() {
        double[] doubleArray = {0.0};
        
        double[] actual = MathArrays.ebeMultiply(doubleArray, doubleArray);
        
        double[] expected = {0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeMultiply([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeMultiply(double[],double[])}
 * @utbot.executesCondition {@code (a.length != b.length): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: a.length != b.length
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeMultiply_ThrowDimensionMismatchException() {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        MathArrays.ebeMultiply(doubleArray, doubleArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeMultiply([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeMultiply(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.length != b.length
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException_1() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.ebeMultiply(MathArrays.java:164) */
        MathArrays.ebeMultiply(doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeMultiply(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.length != b.length
 *  */
    @Test
    public void testEbeMultiply_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.ebeMultiply] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.ebeMultiply(MathArrays.java:164) */
        MathArrays.ebeMultiply(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.safeNorm
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method safeNorm([D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#safeNorm(double[])}
 * @utbot.returnsFrom {@code return norm;}
 *  */
    @Test
    public void testSafeNorm_ReturnNorm() {
        double[] doubleArray = {};
        
        double actual = MathArrays.safeNorm(doubleArray);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#safeNorm(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < v.length; i++)} once
 * @utbot.returnsFrom {@code return norm;}
 *  */
    @Test
    public void testSafeNorm_XabsGreaterThanX3max() {
        double[] doubleArray = {-2.225073858507217E-308};
        
        double actual = MathArrays.safeNorm(doubleArray);
        
        assertEquals(2.225073858507217E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method safeNorm([D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#safeNorm(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: double floatn = v.length;
 *  */
    @Test
    public void testSafeNorm_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.safeNorm] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.safeNorm(MathArrays.java:590) */
        MathArrays.safeNorm(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method safeNorm([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#safeNorm(double[])}
     */
    @Test
    public void testSafeNormReturnsOneWithNonEmptyPrimitiveArray() {
        double[] doubleArray = {3.834E-20, -1.0, 0.0};
        
        double actual = MathArrays.safeNorm(doubleArray);
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method safeNorm([D)
    
    @Test
    public void testSafeNorm1() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        
        double actual = MathArrays.safeNorm(doubleArray);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    @Test
    public void testSafeNorm2() {
        double[] doubleArray = {
            -0.0, -3.834E-20, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        double actual = MathArrays.safeNorm(doubleArray);
        
        assertEquals(3.834E-20, actual, 1.0E-6);
    }
    
    @Test
    public void testSafeNorm3() {
        double[] doubleArray = {
            -0.0, 3.337610787760802E-308, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        double actual = MathArrays.safeNorm(doubleArray);
        
        assertEquals(3.337610787760802E-308, actual, 1.0E-6);
    }
    
    @Test
    public void testSafeNorm4() {
        double[] doubleArray = {
            -2.84809453888922E-306, -2.84809453888922E-306, -2.84809453888922E-306, -2.84809453888922E-306, -2.84809453888922E-306, -2.84809453888922E-306,
            -2.84809453888922E-306, -2.84809453888922E-306, -2.84809453888922E-306
        };
        
        double actual = MathArrays.safeNorm(doubleArray);
        
        assertEquals(8.544283616667661E-306, actual, 1.0E-6);
    }
    
    @Test
    public void testSafeNorm5() {
        double[] doubleArray = {
            -2.2250738585072014E-308, 3.834E-20, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        
        double actual = MathArrays.safeNorm(doubleArray);
        
        assertEquals(3.834E-20, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.sortInPlace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sortInPlace([D, org.apache.commons.math3.util.MathArrays$OrderDirection, [[D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,double[][])}
 * @utbot.executesCondition {@code (dir == MathArrays.OrderDirection.INCREASING): True}
 *  */
    @Test
    public void testSortInPlace_DirEqualsMathArraysOrderDirectionINCREASING() {
        double[] doubleArray = {};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = {};
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,double[][])}
 * @utbot.executesCondition {@code (dir == MathArrays.OrderDirection.INCREASING): True}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < yListLen; j++)} once
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < yListLen; j++)} once
 *  */
    @Test
    public void testSortInPlace_YLengthEqualsLen() {
        double[] doubleArray = {};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {};
        doubleArray1[0] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,double[][])}
 * @utbot.executesCondition {@code (dir == MathArrays.OrderDirection.INCREASING): False}
 *  */
    @Test
    public void testSortInPlace_DirNotEqualsMathArraysOrderDirectionINCREASING() {
        double[] doubleArray = {};
        double[][] doubleArray1 = {};
        
        MathArrays.sortInPlace(doubleArray, null, doubleArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sortInPlace([D, org.apache.commons.math3.util.MathArrays$OrderDirection, [[D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,double[][])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < yListLen; j++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: y.length != len
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testSortInPlace_ThrowDimensionMismatchException() {
        double[] doubleArray = {0.0, 0.0};
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, null, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,double[][])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < yListLen; j++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: y == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSortInPlace_ThrowNullArgumentException_1() {
        double[] doubleArray = {0.0};
        double[][] doubleArray1 = {null};
        
        MathArrays.sortInPlace(doubleArray, null, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,double[][])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.iterates iterate the loop {@code for(int j = 0; j < yListLen; j++)} twice
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: y == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSortInPlace_ThrowNullArgumentException_2() {
        double[] doubleArray = {};
        double[][] doubleArray1 = new double[2][];
        double[] doubleArray2 = {};
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = ((double[]) null);
        
        MathArrays.sortInPlace(doubleArray, null, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,double[][])}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: x == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSortInPlace_ThrowNullArgumentException() {
        MathArrays.sortInPlace(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method sortInPlace([D, org.apache.commons.math3.util.MathArrays$OrderDirection, [[D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],org.apache.commons.math3.util.MathArrays.OrderDirection,double[][])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int yListLen = yList.length;
 *  */
    @Test
    public void testSortInPlace_ThrowNullPointerException() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.sortInPlace] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.sortInPlace(MathArrays.java:686) */
        MathArrays.sortInPlace(doubleArray, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sortInPlace([D, org.apache.commons.math3.util.MathArrays$OrderDirection, [[D)
    
    @Test
    public void testSortInPlace1() {
        double[] doubleArray = {};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray1 = new double[3][];
        double[] doubleArray2 = {};
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = doubleArray2;
        doubleArray1[2] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace2() {
        double[] doubleArray = {0.0};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = new double[3][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        double[] doubleArray3 = {0.0};
        doubleArray1[1] = doubleArray3;
        doubleArray1[2] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace3() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0, 0.0
        };
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray1 = {};
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace4() {
        double[] doubleArray = {0.0, 0.0};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = new double[2][];
        double[] doubleArray2 = {0.0, 0.0};
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace5() {
        double[] doubleArray = {java.lang.Double.NaN};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray1 = {};
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace6() {
        double[] doubleArray = {0.0};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace7() {
        double[] doubleArray = {0.0};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace8() {
        double[] doubleArray = {};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.DECREASING;
        double[][] doubleArray1 = new double[2][];
        double[] doubleArray2 = {};
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace9() {
        double[] doubleArray = {};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = new double[2][];
        double[] doubleArray2 = {};
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace10() {
        double[] doubleArray = {java.lang.Double.NaN};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = {};
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace11() {
        double[] doubleArray = {0.0, 0.0, 0.0, 0.0};
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0, 0.0, 0.0, 0.0};
        doubleArray1[0] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace12() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        MathArrays.OrderDirection orderDirection = MathArrays.OrderDirection.INCREASING;
        double[][] doubleArray1 = new double[9][];
        double[] doubleArray2 = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN
        };
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = doubleArray2;
        doubleArray1[2] = doubleArray2;
        doubleArray1[3] = doubleArray2;
        doubleArray1[4] = doubleArray2;
        doubleArray1[5] = doubleArray2;
        doubleArray1[6] = doubleArray2;
        doubleArray1[7] = doubleArray2;
        doubleArray1[8] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, orderDirection, doubleArray1);
    }
    
    @Test
    public void testSortInPlace13() {
        double[] doubleArray = {0.0};
        double[][] doubleArray1 = new double[2][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, null, doubleArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.sortInPlace
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sortInPlace([D, [[D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],double[][])}
 *  */
    @Test
    public void testSortInPlace() {
        double[] doubleArray = {};
        double[][] doubleArray1 = {};
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],double[][])}
 *  */
    @Test
    public void testSortInPlace_1() {
        double[] doubleArray = {};
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {};
        doubleArray1[0] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],double[][])}
 *  */
    @Test
    public void testSortInPlace_2() {
        double[] doubleArray = {1.0361308E-317};
        double[][] doubleArray1 = {};
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method sortInPlace([D, [[D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],double[][])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: sortInPlace(x, OrderDirection.INCREASING, yList);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testSortInPlace_ThrowDimensionMismatchException1() {
        double[] doubleArray = {0.0, 0.0};
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],double[][])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: sortInPlace(x, OrderDirection.INCREASING, yList);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSortInPlace_ThrowNullArgumentException1() {
        double[] doubleArray = {0.0};
        double[][] doubleArray1 = {null};
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],double[][])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: sortInPlace(x, OrderDirection.INCREASING, yList);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSortInPlace_ThrowNullArgumentException_21() {
        double[] doubleArray = {};
        double[][] doubleArray1 = new double[2][];
        double[] doubleArray2 = {};
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = ((double[]) null);
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],double[][])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} in: sortInPlace(x, OrderDirection.INCREASING, yList);
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testSortInPlace_ThrowDimensionMismatchException_1() {
        double[] doubleArray = {0.0, 0.0};
        double[][] doubleArray1 = new double[2][];
        double[] doubleArray2 = {0.0, 0.0};
        doubleArray1[0] = doubleArray2;
        double[] doubleArray3 = {0.0};
        doubleArray1[1] = doubleArray3;
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#sortInPlace(double[],double[][])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: sortInPlace(x, OrderDirection.INCREASING, yList);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSortInPlace_ThrowNullArgumentException_11() {
        MathArrays.sortInPlace(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sortInPlace([D, [[D)
    
    @Test
    public void testSortInPlace14() {
        double[] doubleArray = {-2.2250738585072014E-308};
        double[][] doubleArray1 = new double[4][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = doubleArray2;
        double[] doubleArray3 = {0.0};
        doubleArray1[2] = doubleArray3;
        doubleArray1[3] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    
    @Test
    public void testSortInPlace15() {
        double[] doubleArray = new double[32];
        double[][] doubleArray1 = new double[6][];
        double[] doubleArray2 = new double[32];
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = doubleArray2;
        doubleArray1[2] = doubleArray2;
        doubleArray1[3] = doubleArray2;
        doubleArray1[4] = doubleArray2;
        doubleArray1[5] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    
    @Test
    public void testSortInPlace16() {
        double[] doubleArray = {};
        double[][] doubleArray1 = new double[3][];
        double[] doubleArray2 = {};
        doubleArray1[0] = doubleArray2;
        doubleArray1[1] = doubleArray2;
        doubleArray1[2] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    
    @Test
    public void testSortInPlace17() {
        double[] doubleArray = {
            java.lang.Double.NaN, 5.562684646268003E-309, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        double[][] doubleArray1 = new double[3][];
        double[] doubleArray2 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        doubleArray1[0] = doubleArray2;
        double[] doubleArray3 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        doubleArray1[1] = doubleArray3;
        double[] doubleArray4 = {
            0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
            0.0, 0.0, 0.0
        };
        doubleArray1[2] = doubleArray4;
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        double finalDoubleArray7 = doubleArray[7];
        double finalDoubleArray8 = doubleArray[8];
        
        assertEquals(0.0, finalDoubleArray0, 1.0E-6);
        
        assertEquals(0.0, finalDoubleArray1, 1.0E-6);
        
        assertEquals(5.562684646268003E-309, finalDoubleArray7, 1.0E-6);
        
        assertEquals(java.lang.Double.NaN, finalDoubleArray8, 1.0E-6);
    }
    
    @Test
    public void testSortInPlace18() {
        double[] doubleArray = {0.0};
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    
    @Test
    public void testSortInPlace19() {
        double[] doubleArray = {2.2250738585072014E-308, 0.0};
        double[][] doubleArray1 = new double[1][];
        double[] doubleArray2 = {0.0, 0.0};
        doubleArray1[0] = doubleArray2;
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        
        assertEquals(0.0, finalDoubleArray0, 1.0E-6);
        
        assertEquals(2.2250738585072014E-308, finalDoubleArray1, 1.0E-6);
    }
    
    @Test
    public void testSortInPlace20() {
        double[] doubleArray = {0.0};
        double[][] doubleArray1 = new double[2][];
        double[] doubleArray2 = {0.0};
        doubleArray1[0] = doubleArray2;
        double[] doubleArray3 = {0.0};
        doubleArray1[1] = doubleArray3;
        
        MathArrays.sortInPlace(doubleArray, doubleArray1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.ebeSubtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeSubtract([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeSubtract(double[],double[])}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testEbeSubtract_ReturnResult() {
        double[] doubleArray = {};
        
        double[] actual = MathArrays.ebeSubtract(doubleArray, doubleArray);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeSubtract(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < a.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testEbeSubtract_IterateForLoop() {
        double[] doubleArray = {0.0};
        
        double[] actual = MathArrays.ebeSubtract(doubleArray, doubleArray);
        
        double[] expected = {0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeSubtract([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeSubtract(double[],double[])}
 * @utbot.executesCondition {@code (a.length != b.length): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: a.length != b.length
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeSubtract_ThrowDimensionMismatchException() {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        MathArrays.ebeSubtract(doubleArray, doubleArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeSubtract([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeSubtract(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.length != b.length
 *  */
    @Test
    public void testEbeSubtract_ThrowNullPointerException_1() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.ebeSubtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.ebeSubtract(MathArrays.java:142) */
        MathArrays.ebeSubtract(doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeSubtract(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.length != b.length
 *  */
    @Test
    public void testEbeSubtract_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.ebeSubtract] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.ebeSubtract(MathArrays.java:142) */
        MathArrays.ebeSubtract(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.ebeDivide
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeDivide([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeDivide(double[],double[])}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testEbeDivide_ReturnResult() {
        double[] doubleArray = {};
        
        double[] actual = MathArrays.ebeDivide(doubleArray, doubleArray);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeDivide(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < a.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testEbeDivide_IterateForLoop() {
        double[] doubleArray = {0.0};
        
        double[] actual = MathArrays.ebeDivide(doubleArray, doubleArray);
        
        double[] expected = {java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeDivide([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeDivide(double[],double[])}
 * @utbot.executesCondition {@code (a.length != b.length): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: a.length != b.length
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeDivide_ThrowDimensionMismatchException() {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        MathArrays.ebeDivide(doubleArray, doubleArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeDivide([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeDivide(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.length != b.length
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException_1() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.ebeDivide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.ebeDivide(MathArrays.java:186) */
        MathArrays.ebeDivide(doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeDivide(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.length != b.length
 *  */
    @Test
    public void testEbeDivide_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.ebeDivide] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.ebeDivide(MathArrays.java:186) */
        MathArrays.ebeDivide(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.distanceInf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method distanceInf([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testDistanceInf_FastMathMax() {
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0};
        
        double actual = MathArrays.distanceInf(doubleArray, doubleArray1);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(double[],double[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testDistanceInf_ReturnMax() {
        double[] doubleArray = {};
        
        double actual = MathArrays.distanceInf(doubleArray, ((double[]) null));
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distanceInf([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: max = FastMath.max(max, FastMath.abs(p1[i] - p2[i]));
 *  */
    @Test
    public void testDistanceInf_ThrowArrayIndexOutOfBoundsException() {
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distanceInf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.distanceInf(MathArrays.java:269) */
        MathArrays.distanceInf(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: max = FastMath.max(max, FastMath.abs(p1[i] - p2[i]));
 *  */
    @Test
    public void testDistanceInf_ThrowNullPointerException_1() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distanceInf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distanceInf(MathArrays.java:269) */
        MathArrays.distanceInf(doubleArray, ((double[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < p1.length; i++)
 *  */
    @Test
    public void testDistanceInf_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distanceInf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distanceInf(MathArrays.java:268) */
        MathArrays.distanceInf(((double[]) null), ((double[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method distanceInf([D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(double[],double[])}
     */
    @Test
    public void testDistanceInfReturnsNanWithNonEmptyPrimitiveArrays() {
        double[] doubleArray = {java.lang.Double.NaN, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        double[] doubleArray1 = {0.0, 0.0, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY};
        
        double actual = MathArrays.distanceInf(doubleArray, doubleArray1);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.distanceInf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method distanceInf([I, [I)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(int[],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testDistanceInf_IterateForLoop() {
        int[] intArray = {1024};
        int[] intArray1 = {-2147482624};
        
        int actual = MathArrays.distanceInf(intArray, intArray1);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(int[],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testDistanceInf_IterateForLoop_1() {
        int[] intArray = {-254};
        int[] intArray1 = {-254};
        
        int actual = MathArrays.distanceInf(intArray, intArray1);
        
        org.junit.Assert.assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(int[],int[])}
 * @utbot.returnsFrom {@code return max;}
 *  */
    @Test
    public void testDistanceInf_ReturnMax1() {
        int[] intArray = {};
        
        int actual = MathArrays.distanceInf(intArray, ((int[]) null));
        
        org.junit.Assert.assertEquals(0, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method distanceInf([I, [I)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(int[],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: max = FastMath.max(max, FastMath.abs(p1[i] - p2[i]));
 *  */
    @Test
    public void testDistanceInf_ThrowArrayIndexOutOfBoundsException1() {
        int[] intArray = {-255};
        int[] intArray1 = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distanceInf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.distanceInf(MathArrays.java:284) */
        MathArrays.distanceInf(intArray, intArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(int[],int[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < p1.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: max = FastMath.max(max, FastMath.abs(p1[i] - p2[i]));
 *  */
    @Test
    public void testDistanceInf_ThrowNullPointerException_11() {
        int[] intArray = {-255};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distanceInf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distanceInf(MathArrays.java:284) */
        MathArrays.distanceInf(intArray, ((int[]) null));
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(int[],int[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < p1.length; i++)
 *  */
    @Test
    public void testDistanceInf_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.distanceInf] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.distanceInf(MathArrays.java:283) */
        MathArrays.distanceInf(((int[]) null), ((int[]) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method distanceInf([I, [I)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#distanceInf(int[],int[])}
     */
    @Test
    public void testDistanceInfWithNonEmptyPrimitiveArrays() {
        int[] intArray = {0, -1, Integer.MAX_VALUE};
        int[] intArray1 = {1, 1, 0, Integer.MAX_VALUE};
        
        int actual = MathArrays.distanceInf(intArray, intArray1);
        
        org.junit.Assert.assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.ebeAdd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ebeAdd([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeAdd(double[],double[])}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testEbeAdd_ReturnResult() {
        double[] doubleArray = {};
        
        double[] actual = MathArrays.ebeAdd(doubleArray, doubleArray);
        
        double[] expected = {};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeAdd(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < a.length; i++)} once
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testEbeAdd_IterateForLoop() {
        double[] doubleArray = {0.0};
        
        double[] actual = MathArrays.ebeAdd(doubleArray, doubleArray);
        
        double[] expected = {0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ebeAdd([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeAdd(double[],double[])}
 * @utbot.executesCondition {@code (a.length != b.length): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: a.length != b.length
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testEbeAdd_ThrowDimensionMismatchException() {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        MathArrays.ebeAdd(doubleArray, doubleArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ebeAdd([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeAdd(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.length != b.length
 *  */
    @Test
    public void testEbeAdd_ThrowNullPointerException_1() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.ebeAdd] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.ebeAdd(MathArrays.java:120) */
        MathArrays.ebeAdd(doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#ebeAdd(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.length != b.length
 *  */
    @Test
    public void testEbeAdd_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.ebeAdd] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.ebeAdd(MathArrays.java:120) */
        MathArrays.ebeAdd(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.checkPositive
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkPositive([D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkPositive(double[])}
 *  */
    @Test
    public void testCheckPositive() {
        double[] doubleArray = {};
        
        MathArrays.checkPositive(doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkPositive(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 *  */
    @Test
    public void testCheckPositive_IOfInGreaterThanZero() {
        double[] doubleArray = {3.337610787760802E-308};
        
        MathArrays.checkPositive(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkPositive([D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkPositive(double[])}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < in.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NotStrictlyPositiveException} when: in[i] <= 0
 *  */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositive_ThrowNotStrictlyPositiveException() {
        double[] doubleArray = {-0.0};
        
        MathArrays.checkPositive(doubleArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkPositive([D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkPositive(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < in.length; i++)
 *  */
    @Test
    public void testCheckPositive_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkPositive] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.checkPositive(MathArrays.java:481) */
        MathArrays.checkPositive(null);
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkPositive([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkPositive(double[])}
     */
    @Test(expected = NotStrictlyPositiveException.class)
    public void testCheckPositiveThrowsNSPEWithNonEmptyPrimitiveArray() {
        double[] doubleArray = {java.lang.Double.NaN, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        MathArrays.checkPositive(doubleArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.checkRectangular
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkRectangular([[J)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkRectangular(long[][])}
 *  */
    @Test
    public void testCheckRectangular() {
        long[][] longArray = {null};
        
        MathArrays.checkRectangular(longArray);
        
        long[] finalLongArray0 = longArray[0];
        
        assertNull(finalLongArray0);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkRectangular(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < in.length; i++)} once
 *  */
    @Test
    public void testCheckRectangular_IniLengthEqualsIn0Length() {
        long[][] longArray = new long[2][];
        long[] longArray1 = {};
        longArray[0] = longArray1;
        longArray[1] = longArray1;
        
        MathArrays.checkRectangular(longArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkRectangular([[J)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkRectangular(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < in.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: in[i].length != in[0].length
 *  */
    @Test
    public void testCheckRectangular_ThrowNullPointerException() {
        long[][] longArray = {
            null,
            null
        };
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkRectangular] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.checkRectangular(MathArrays.java:463) */
        MathArrays.checkRectangular(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkRectangular(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < in.length; i++)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: in[i].length != in[0].length
 *  */
    @Test
    public void testCheckRectangular_ThrowNullPointerException_1() {
        long[][] longArray = new long[2][];
        longArray[0] = ((long[]) null);
        long[] longArray1 = {0L};
        longArray[1] = longArray1;
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.checkRectangular] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.checkRectangular(MathArrays.java:463) */
        MathArrays.checkRectangular(longArray);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkRectangular([[J)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkRectangular(long[][])}
 * @utbot.iterates iterate the loop {@code for(int i = 1; i < in.length; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: in[i].length != in[0].length
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testCheckRectangular_ThrowDimensionMismatchException() {
        long[][] longArray = new long[2][];
        long[] longArray1 = {0L};
        longArray[0] = longArray1;
        long[] longArray2 = {0L, 0L};
        longArray[1] = longArray2;
        
        MathArrays.checkRectangular(longArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkRectangular(long[][])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: MathUtils.checkNotNull(in);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testCheckRectangular_ThrowNullArgumentException() {
        MathArrays.checkRectangular(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method checkRectangular([[J)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkRectangular(long[][])}
     */
    @Test
    public void testCheckRectangularWithNonEmptyObjectArray() {
        long[][] longArray = new long[3][];
        long[] longArray1 = {java.lang.Long.MIN_VALUE, 0L, 1L};
        longArray[0] = longArray1;
        long[] longArray2 = {1L, 1L, 1L};
        longArray[1] = longArray2;
        long[] longArray3 = {0L, java.lang.Long.MAX_VALUE, 1L};
        longArray[2] = longArray3;
        
        MathArrays.checkRectangular(longArray);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#checkRectangular(long[][])}
     */
    @Test
    public void testCheckRectangularWithNonEmptyObjectArray1() {
        long[][] longArray = new long[5][];
        long[] longArray1 = {java.lang.Long.MAX_VALUE, java.lang.Long.MIN_VALUE, 0L, 1L, 0L};
        longArray[0] = longArray1;
        long[] longArray2 = {-1L, -1L, -1L, java.lang.Long.MAX_VALUE, 1L};
        longArray[1] = longArray2;
        long[] longArray3 = {java.lang.Long.MAX_VALUE, java.lang.Long.MAX_VALUE, java.lang.Long.MAX_VALUE, java.lang.Long.MAX_VALUE, java.lang.Long.MAX_VALUE};
        longArray[2] = longArray3;
        long[] longArray4 = {0L, 1L, java.lang.Long.MIN_VALUE, 1L, 1L};
        longArray[3] = longArray4;
        long[] longArray5 = {java.lang.Long.MAX_VALUE, 0L, 0L, 1L, 0L};
        longArray[4] = longArray5;
        
        MathArrays.checkRectangular(longArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.linearCombination
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method linearCombination(double, double, double, double, double, double, double, double)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#linearCombination(double,double,double,double,double,double,double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(result)): True}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.returnsFrom {@code return result;}
 *  */
    @Test
    public void testLinearCombination_DoubleIsNaN() {
        double actual = MathArrays.linearCombination(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.linearCombination
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method linearCombination([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#linearCombination(double[],double[])}
 * @utbot.executesCondition {@code (len != b.length): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.DimensionMismatchException} when: len != b.length
 *  */
    @Test(expected = DimensionMismatchException.class)
    public void testLinearCombination_ThrowDimensionMismatchException() {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        MathArrays.linearCombination(doubleArray, doubleArray1);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method linearCombination([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#linearCombination(double[],double[])}
 * @utbot.executesCondition {@code (len != b.length): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double prodHighCur = prodHigh[0];
 *  */
    @Test
    public void testLinearCombination_ThrowArrayIndexOutOfBoundsException() {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.linearCombination] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math3.util.MathArrays.linearCombination(MathArrays.java:845) */
        MathArrays.linearCombination(doubleArray, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#linearCombination(double[],double[])}
 * @utbot.executesCondition {@code (len != b.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: double prodHighNext = prodHigh[1];
 *  */
    @Test
    public void testLinearCombination_ThrowArrayIndexOutOfBoundsException_1() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.linearCombination] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math3.util.MathArrays.linearCombination(MathArrays.java:846) */
        MathArrays.linearCombination(doubleArray, doubleArray);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#linearCombination(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: len != b.length
 *  */
    @Test
    public void testLinearCombination_ThrowNullPointerException_1() {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.linearCombination] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.linearCombination(MathArrays.java:817) */
        MathArrays.linearCombination(doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#linearCombination(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int len = a.length;
 *  */
    @Test
    public void testLinearCombination_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.linearCombination] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.linearCombination(MathArrays.java:816) */
        MathArrays.linearCombination(null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method linearCombination([D, [D)
    
    @Test
    public void testLinearCombination1() {
        double[] doubleArray = {
            java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN,
            java.lang.Double.NaN
        };
        
        double actual = MathArrays.linearCombination(doubleArray, doubleArray);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.linearCombination
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method linearCombination(double, double, double, double)
    
    @Test
    public void testLinearCombination2() {
        double actual = MathArrays.linearCombination(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.linearCombination
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method linearCombination(double, double, double, double, double, double)
    
    @Test
    public void testLinearCombination3() {
        double actual = MathArrays.linearCombination(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.buildArray
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildArray(org.apache.commons.math3.Field, int)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#buildArray(org.apache.commons.math3.Field,int)}
 * @utbot.invokes {@link org.apache.commons.math3.Field#getRuntimeClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: array = (T[]) Array.newInstance(field.getRuntimeClass(), length)
 *  */
    @Test
    public void testBuildArray_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.buildArray] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.buildArray(MathArrays.java:1335) */
        MathArrays.buildArray(null, -255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method buildArray(org.apache.commons.math3.Field, int)
    
    @Test
    public void testBuildArray1() throws Exception  {
        BigFractionField bigFractionField = ((BigFractionField) createInstance("org.apache.commons.math3.fraction.BigFractionField"));
        
        org.apache.commons.math3.fraction.BigFraction[] actual = ((org.apache.commons.math3.fraction.BigFraction[]) MathArrays.buildArray(bigFractionField, 0));
        
        org.apache.commons.math3.fraction.BigFraction[] expected = {};
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.buildArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method buildArray(org.apache.commons.math3.Field, int, int)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#buildArray(org.apache.commons.math3.Field,int,int)}
 * @utbot.returnsFrom {@code return array;}
 *  */
    @Test
    public void testBuildArray_ReturnArray() throws Exception  {
        BigFractionField bigFractionField = ((BigFractionField) createInstance("org.apache.commons.math3.fraction.BigFractionField"));
        
        org.apache.commons.math3.fraction.BigFraction[][] actual = ((org.apache.commons.math3.fraction.BigFraction[][]) MathArrays.buildArray(bigFractionField, 0, 0));
        
        org.apache.commons.math3.fraction.BigFraction[][] expected = {};
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#buildArray(org.apache.commons.math3.Field,int,int)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < rows; ++i)} once
 *  */
    @Test
    public void testBuildArray_IterateForLoop() throws Exception  {
        BigFractionField bigFractionField = ((BigFractionField) createInstance("org.apache.commons.math3.fraction.BigFractionField"));
        
        org.apache.commons.math3.fraction.BigFraction[][] actual = ((org.apache.commons.math3.fraction.BigFraction[][]) MathArrays.buildArray(bigFractionField, 1, 0));
        
        org.apache.commons.math3.fraction.BigFraction[][] expected = new org.apache.commons.math3.fraction.BigFraction[1][];
        org.apache.commons.math3.fraction.BigFraction[] bigFractionArray = {};
        expected[0] = bigFractionArray;
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#buildArray(org.apache.commons.math3.Field,int,int)}
 * @utbot.returnsFrom {@code return array;}
 *  */
    @Test
    public void testBuildArray_ReturnArray_1() throws Exception  {
        FractionField fractionField = ((FractionField) createInstance("org.apache.commons.math3.fraction.FractionField"));
        
        org.apache.commons.math3.fraction.Fraction[][] actual = ((org.apache.commons.math3.fraction.Fraction[][]) MathArrays.buildArray(fractionField, 0, 0));
        
        org.apache.commons.math3.fraction.Fraction[][] expected = {};
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method buildArray(org.apache.commons.math3.Field, int, int)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#buildArray(org.apache.commons.math3.Field,int,int)}
 * @utbot.executesCondition {@code (columns < 0): False}
 * @utbot.invokes {@link org.apache.commons.math3.Field#getRuntimeClass()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: array = (T[][]) Array.newInstance(field.getRuntimeClass(), new int[] { rows, columns });
 *  */
    @Test
    public void testBuildArray_ThrowNullPointerException1() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.buildArray] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.buildArray(MathArrays.java:1359) */
        MathArrays.buildArray(null, -255, 0);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method buildArray(org.apache.commons.math3.Field, int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#buildArray(org.apache.commons.math3.Field,int,int)}
     */
    @Test
    public void testBuildArrayThrowsNPE() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.buildArray] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.buildArray(MathArrays.java:1335)
            org.apache.commons.math3.util.MathArrays.buildArray(MathArrays.java:1356) */
        MathArrays.buildArray(null, 16385, -1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method buildArray(org.apache.commons.math3.Field, int, int)
    
    @Test
    public void testBuildArray2() throws Exception  {
        BigFractionField bigFractionField = ((BigFractionField) createInstance("org.apache.commons.math3.fraction.BigFractionField"));
        
        org.apache.commons.math3.fraction.BigFraction[][] actual = ((org.apache.commons.math3.fraction.BigFraction[][]) MathArrays.buildArray(bigFractionField, 2, 0));
        
        org.apache.commons.math3.fraction.BigFraction[][] expected = new org.apache.commons.math3.fraction.BigFraction[2][];
        org.apache.commons.math3.fraction.BigFraction[] bigFractionArray = {};
        expected[0] = bigFractionArray;
        org.apache.commons.math3.fraction.BigFraction[] bigFractionArray1 = {};
        expected[1] = bigFractionArray1;
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testBuildArray3() throws Exception  {
        BigFractionField bigFractionField = ((BigFractionField) createInstance("org.apache.commons.math3.fraction.BigFractionField"));
        
        org.apache.commons.math3.fraction.BigFraction[][] actual = ((org.apache.commons.math3.fraction.BigFraction[][]) MathArrays.buildArray(bigFractionField, 0, Integer.MIN_VALUE));
        
        org.apache.commons.math3.fraction.BigFraction[][] expected = {};
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testBuildArray4() throws Exception  {
        FractionField fractionField = ((FractionField) createInstance("org.apache.commons.math3.fraction.FractionField"));
        
        org.apache.commons.math3.fraction.Fraction[][] actual = ((org.apache.commons.math3.fraction.Fraction[][]) MathArrays.buildArray(fractionField, 0, Integer.MIN_VALUE));
        
        org.apache.commons.math3.fraction.Fraction[][] expected = {};
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testBuildArray5() throws Exception  {
        FractionField fractionField = ((FractionField) createInstance("org.apache.commons.math3.fraction.FractionField"));
        
        org.apache.commons.math3.fraction.Fraction[][] actual = ((org.apache.commons.math3.fraction.Fraction[][]) MathArrays.buildArray(fractionField, 1, 0));
        
        org.apache.commons.math3.fraction.Fraction[][] expected = new org.apache.commons.math3.fraction.Fraction[1][];
        org.apache.commons.math3.fraction.Fraction[] fractionArray = {};
        expected[0] = fractionArray;
        
        int expectedSize = expected.length;
        org.junit.Assert.assertEquals(expectedSize, actual.length);
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.equalsIncludingNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equalsIncludingNaN([F, [F)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): True}
 *  */
    @Test
    public void testEqualsIncludingNaN_XLengthNotEqualsYLength() {
        float[] floatArray = {0.0f, 0.0f};
        float[] floatArray1 = {0.0f};
        
        boolean actual = MathArrays.equalsIncludingNaN(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqualsIncludingNaN_XLengthEqualsYLength() {
        float[] floatArray = {};
        
        boolean actual = MathArrays.equalsIncludingNaN(floatArray, floatArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqualsIncludingNaN_PrecisionEqualsIncludingNaN() {
        float[] floatArray = {java.lang.Float.NaN};
        float[] floatArray1 = {java.lang.Float.NaN};
        
        boolean actual = MathArrays.equalsIncludingNaN(floatArray, floatArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 *  */
    @Test
    public void testEqualsIncludingNaN_NotPrecisionEqualsIncludingNaN() {
        float[] floatArray = {-2.0000002f};
        float[] floatArray1 = {-2.0000002f};
        
        boolean actual = MathArrays.equalsIncludingNaN(floatArray, floatArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 *  */
    @Test
    public void testEqualsIncludingNaN_NotPrecisionEqualsIncludingNaN_1() {
        float[] floatArray = {java.lang.Float.NaN};
        float[] floatArray1 = {-2.0000002f};
        
        boolean actual = MathArrays.equalsIncludingNaN(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 *  */
    @Test
    public void testEqualsIncludingNaN_NotPrecisionEqualsIncludingNaN_2() {
        float[] floatArray = {-1.4E-45f};
        float[] floatArray1 = {java.lang.Float.NaN};
        
        boolean actual = MathArrays.equalsIncludingNaN(floatArray, floatArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEqualsIncludingNaN_NotXNotEqualsNullXorYNotEqualsNull() {
        float[] floatArray = {0.0f};
        
        boolean actual = MathArrays.equalsIncludingNaN(floatArray, ((float[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float[])}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEqualsIncludingNaN_NotXNotEqualsNullXorYNotEqualsNull_1() {
        float[] floatArray = {0.0f};
        
        boolean actual = MathArrays.equalsIncludingNaN(((float[]) null), floatArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(float[],float[])}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEqualsIncludingNaN_NotXEqualsNullXorYEqualsNull() {
        boolean actual = MathArrays.equalsIncludingNaN(((float[]) null), ((float[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.equalsIncludingNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equalsIncludingNaN([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): True}
 *  */
    @Test
    public void testEqualsIncludingNaN_XLengthNotEqualsYLength1() {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        boolean actual = MathArrays.equalsIncludingNaN(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqualsIncludingNaN_XLengthEqualsYLength1() {
        double[] doubleArray = {};
        
        boolean actual = MathArrays.equalsIncludingNaN(doubleArray, doubleArray);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEqualsIncludingNaN_PrecisionEqualsIncludingNaN1() {
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {java.lang.Double.NaN};
        
        boolean actual = MathArrays.equalsIncludingNaN(doubleArray, doubleArray1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 *  */
    @Test
    public void testEqualsIncludingNaN_NotPrecisionEqualsIncludingNaN1() {
        double[] doubleArray = {-2.0};
        double[] doubleArray1 = {-2.00048828125};
        
        boolean actual = MathArrays.equalsIncludingNaN(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): False}
 * @utbot.executesCondition {@code (x.length != y.length): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < x.length; ++i)} once
 *  */
    @Test
    public void testEqualsIncludingNaN_NotPrecisionEqualsIncludingNaN_11() {
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {3.785766995733679E-270};
        
        boolean actual = MathArrays.equalsIncludingNaN(doubleArray, doubleArray1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(double[],double[])}
 * @utbot.executesCondition {@code (x == null): False}
 * @utbot.executesCondition {@code (y == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEqualsIncludingNaN_NotXNotEqualsNullXorYNotEqualsNull1() {
        double[] doubleArray = {0.0};
        
        boolean actual = MathArrays.equalsIncludingNaN(doubleArray, ((double[]) null));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(double[],double[])}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEqualsIncludingNaN_NotXNotEqualsNullXorYNotEqualsNull_11() {
        double[] doubleArray = {0.0};
        
        boolean actual = MathArrays.equalsIncludingNaN(((double[]) null), doubleArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#equalsIncludingNaN(double[],double[])}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.returnsFrom {@code return !((x == null) ^ (y == null));}
 *  */
    @Test
    public void testEqualsIncludingNaN_NotXEqualsNullXorYEqualsNull1() {
        boolean actual = MathArrays.equalsIncludingNaN(((double[]) null), ((double[]) null));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.convolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method convolve([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#convolve(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int n = 0; n < totalLength; n++)} once
 * @utbot.returnsFrom {@code return y;}
 *  */
    @Test
    public void testConvolve_IterateWhileLoop() {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        double[] actual = MathArrays.convolve(doubleArray, doubleArray1);
        
        double[] expected = {0.0, 0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#convolve(double[],double[])}
 * @utbot.iterates iterate the loop {@code for(int n = 0; n < totalLength; n++)} once
 * @utbot.returnsFrom {@code return y;}
 *  */
    @Test
    public void testConvolve_KLessThanHLenAndJLessThanZero() {
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0, 0.0};
        
        double[] actual = MathArrays.convolve(doubleArray, doubleArray1);
        
        double[] expected = {0.0, 0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method convolve([D, [D)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#convolve(double[],double[])}
 * @utbot.executesCondition {@code (xLen == 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} when: xLen == 0 || hLen == 0
 *  */
    @Test(expected = NoDataException.class)
    public void testConvolve_ThrowNoDataException() {
        double[] doubleArray = {};
        double[] doubleArray1 = {0.0};
        
        MathArrays.convolve(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#convolve(double[],double[])}
 * @utbot.executesCondition {@code (xLen == 0): False}
 * @utbot.executesCondition {@code (hLen == 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NoDataException} when: xLen == 0 || hLen == 0
 *  */
    @Test(expected = NoDataException.class)
    public void testConvolve_ThrowNoDataException_1() {
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        MathArrays.convolve(doubleArray, doubleArray1);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#convolve(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: MathUtils.checkNotNull(h);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testConvolve_ThrowNullArgumentException_1() {
        double[] doubleArray = {0.0};
        
        MathArrays.convolve(doubleArray, null);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#convolve(double[],double[])}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: MathUtils.checkNotNull(x);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testConvolve_ThrowNullArgumentException() {
        MathArrays.convolve(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method convolve([D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.MathArrays}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#convolve(double[],double[])}
     */
    @Test
    public void testConvolveWithNonEmptyPrimitiveArrays() {
        double[] doubleArray = {java.lang.Double.NaN, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        double[] doubleArray1 = {0.0, 0.0, java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY};
        
        double[] actual = MathArrays.convolve(doubleArray, doubleArray1);
        
        double[] expected = {java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.MathArrays.normalizeArray
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeArray([D, double)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#normalizeArray(double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testNormalizeArray_IterateForLoop() {
        double[] doubleArray = {-3.337610787760802E-308};
        
        double[] actual = MathArrays.normalizeArray(doubleArray, 3.337610787760802E-308);
        
        double[] expected = {0.0};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#normalizeArray(double[],double)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} twice
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} twice
 * @utbot.returnsFrom {@code return out;}
 *  */
    @Test
    public void testNormalizeArray_DoubleIsNaN() {
        double[] doubleArray = {-3.337610787760802E-308, java.lang.Double.NaN};
        
        double[] actual = MathArrays.normalizeArray(doubleArray, 2.225073860579463E-308);
        
        double[] expected = {0.0, java.lang.Double.NaN};
        
        org.junit.Assert.assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method normalizeArray([D, double)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#normalizeArray(double[],double)}
 * @utbot.executesCondition {@code (Double.isInfinite(normalizedSum)): False}
 * @utbot.executesCondition {@code (Double.isNaN(normalizedSum)): False}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathIllegalArgumentException} when: Double.isInfinite(values[i])
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArray_ThrowMathIllegalArgumentException() {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY};
        
        MathArrays.normalizeArray(doubleArray, 4.9E-324);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#normalizeArray(double[],double)}
 * @utbot.executesCondition {@code (Double.isInfinite(normalizedSum)): False}
 * @utbot.executesCondition {@code (Double.isNaN(normalizedSum)): False}
 * @utbot.executesCondition {@code (sum == 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} when: sum == 0
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testNormalizeArray_ThrowMathArithmeticException() {
        double[] doubleArray = {};
        
        MathArrays.normalizeArray(doubleArray, 4.9E-324);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#normalizeArray(double[],double)}
 * @utbot.executesCondition {@code (Double.isInfinite(normalizedSum)): False}
 * @utbot.executesCondition {@code (Double.isNaN(normalizedSum)): False}
 * @utbot.executesCondition {@code (sum == 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} when: sum == 0
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testNormalizeArray_ThrowMathArithmeticException_1() {
        double[] doubleArray = {java.lang.Double.NaN};
        
        MathArrays.normalizeArray(doubleArray, 3.337610787760802E-308);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#normalizeArray(double[],double)}
 * @utbot.executesCondition {@code (Double.isInfinite(normalizedSum)): False}
 * @utbot.executesCondition {@code (Double.isNaN(normalizedSum)): False}
 * @utbot.executesCondition {@code (sum == 0): True}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < len; i++)} once
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} when: sum == 0
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testNormalizeArray_ThrowMathArithmeticException_2() {
        double[] doubleArray = {-0.0};
        
        MathArrays.normalizeArray(doubleArray, 1.288229753919445E-231);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#normalizeArray(double[],double)}
 * @utbot.executesCondition {@code (Double.isInfinite(normalizedSum)): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathIllegalArgumentException} when: Double.isInfinite(normalizedSum)
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArray_ThrowMathIllegalArgumentException_1() {
        MathArrays.normalizeArray(null, java.lang.Double.POSITIVE_INFINITY);
    }
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#normalizeArray(double[],double)}
 * @utbot.executesCondition {@code (Double.isInfinite(normalizedSum)): False}
 * @utbot.executesCondition {@code (Double.isNaN(normalizedSum)): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathIllegalArgumentException} when: Double.isNaN(normalizedSum)
 *  */
    @Test(expected = MathIllegalArgumentException.class)
    public void testNormalizeArray_ThrowMathIllegalArgumentException_2() {
        MathArrays.normalizeArray(null, java.lang.Double.NaN);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalizeArray([D, double)
    
    /**
    @utbot.classUnderTest {@link MathArrays}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.MathArrays#normalizeArray(double[],double)}
 * @utbot.executesCondition {@code (Double.isInfinite(normalizedSum)): False}
 * @utbot.executesCondition {@code (Double.isNaN(normalizedSum)): False}
 * @utbot.invokes {@link java.lang.Double#isInfinite(double)}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final int len = values.length;
 *  */
    @Test
    public void testNormalizeArray_ThrowNullPointerException() {
        /* This test fails because method [org.apache.commons.math3.util.MathArrays.normalizeArray] produces [java.lang.NullPointerException]
            org.apache.commons.math3.util.MathArrays.normalizeArray(MathArrays.java:1300) */
        MathArrays.normalizeArray(null, 3.337610787760802E-308);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
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

