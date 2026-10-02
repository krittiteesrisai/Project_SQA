package org.apache.commons.math.util;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public final class org_apache_commons_math_util_FastMathTest {
    ///region Test suites for executable org.apache.commons.math.util.FastMath.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs(long)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#abs(long)}
 * @utbot.executesCondition {@code ((x < 0l)): False}
 * @utbot.returnsFrom {@code return (x < 0l) ? -x : x;}
 *  */
    @Test
    public void testAbs_XGreaterOrEqualZero() {
        long actual = FastMath.abs(0L);
        
        assertEquals(0L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#abs(long)}
 * @utbot.executesCondition {@code ((x < 0l)): True}
 * @utbot.returnsFrom {@code return (x < 0l) ? -x : x;}
 *  */
    @Test
    public void testAbs_XLessThanZero() {
        long actual = FastMath.abs(-254L);
        
        assertEquals(254L, actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method abs(long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#abs(long)}
     */
    @Test
    public void testAbsReturns5() {
        long actual = FastMath.abs(-5L);
        
        assertEquals(5L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs(float)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#abs(float)}
 * @utbot.executesCondition {@code ((x < 0.0f)): True}
 * @utbot.returnsFrom {@code return (x < 0.0f) ? -x : x;}
 *  */
    @Test
    public void testAbs_XLessThanZero1() {
        float actual = FastMath.abs(-1.1754946E-38f);
        
        org.junit.Assert.assertEquals(1.1754946E-38f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#abs(float)}
 * @utbot.executesCondition {@code ((x < 0.0f)): False}
 * @utbot.returnsFrom {@code return (x < 0.0f) ? -x : x;}
 *  */
    @Test
    public void testAbs_XGreaterOrEqualZero1() {
        float actual = FastMath.abs(-0.0f);
        
        org.junit.Assert.assertEquals(-0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.executesCondition {@code ((x < 0.0)): True}
 * @utbot.returnsFrom {@code return (x < 0.0) ? -x : x;}
 *  */
    @Test
    public void testAbs_XLessThanZero2() {
        double actual = FastMath.abs(-2.225073858507202E-308);
        
        org.junit.Assert.assertEquals(2.225073858507202E-308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.executesCondition {@code ((x < 0.0)): False}
 * @utbot.returnsFrom {@code return (x < 0.0) ? -x : x;}
 *  */
    @Test
    public void testAbs_XGreaterOrEqualZero2() {
        double actual = FastMath.abs(-0.0);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs(int)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#abs(int)}
 * @utbot.executesCondition {@code ((x < 0)): False}
 * @utbot.returnsFrom {@code return (x < 0) ? -x : x;}
 *  */
    @Test
    public void testAbs_XGreaterOrEqualZero3() {
        int actual = FastMath.abs(0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#abs(int)}
 * @utbot.executesCondition {@code ((x < 0)): True}
 * @utbot.returnsFrom {@code return (x < 0) ? -x : x;}
 *  */
    @Test
    public void testAbs_XLessThanZero3() {
        int actual = FastMath.abs(-1);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.sin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method sin(double)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (xa == 0.0): False}
    /// return from: {@code return Double.NaN;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#sin(double)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (xa != xa): True}
 *  */
    @Test
    public void testSin_XaNotEqualsXa() {
        double actual = FastMath.sin(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#sin(double)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (xa != xa): False}
 * @utbot.executesCondition {@code (xa == Double.POSITIVE_INFINITY): True}
 *  */
    @Test
    public void testSin_XaEqualsDoublePOSITIVE_INFINITY() {
        double actual = FastMath.sin(java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#sin(double)}
 * @utbot.executesCondition {@code (x < 0): True}
 * @utbot.executesCondition {@code (xa != xa): False}
 * @utbot.executesCondition {@code (xa == Double.POSITIVE_INFINITY): True}
 *  */
    @Test
    public void testSin_XLessThanZero() {
        double actual = FastMath.sin(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method sin(double)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (x < 0): False},
    ///     {@code (xa == 0.0): True}
    /// invoke:
    ///     {@link java.lang.Double#doubleToLongBits(double)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#sin(double)}
 * @utbot.executesCondition {@code (bits < 0): True}
 * @utbot.returnsFrom {@code return -0.0;}
 *  */
    @Test
    public void testSin_BitsLessThanZero() {
        double actual = FastMath.sin(-0.0);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#sin(double)}
 * @utbot.executesCondition {@code (bits < 0): False}
 * @utbot.returnsFrom {@code return 0.0;}
 *  */
    @Test
    public void testSin_BitsGreaterOrEqualZero() {
        double actual = FastMath.sin(0.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sin(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#sin(double)}
     */
    @Test
    public void testSin() {
        double actual = FastMath.sin(-7.549789948768648E-8);
        
        org.junit.Assert.assertEquals(-7.549789948768642E-8, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.cos
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cos(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#cos(double)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (xa != xa): True}
 *  */
    @Test
    public void testCos_XaNotEqualsXa() {
        double actual = FastMath.cos(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#cos(double)}
 * @utbot.executesCondition {@code (x < 0): True}
 * @utbot.executesCondition {@code (xa != xa): False}
 * @utbot.executesCondition {@code (xa == Double.POSITIVE_INFINITY): True}
 *  */
    @Test
    public void testCos_XaEqualsDoublePOSITIVE_INFINITY() {
        double actual = FastMath.cos(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cos(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#cos(double)}
     */
    @Test
    public void testCos() {
        double actual = FastMath.cos(-7.549789948768648E-8);
        
        org.junit.Assert.assertEquals(0.9999999999999971, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.tan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tan(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#tan(double)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (xa != xa): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testTan_XaNotEqualsXa() {
        double actual = FastMath.tan(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#tan(double)}
 * @utbot.executesCondition {@code (x < 0): True}
 * @utbot.executesCondition {@code (xa != xa): False}
 * @utbot.executesCondition {@code (xa == Double.POSITIVE_INFINITY): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testTan_XaEqualsDoublePOSITIVE_INFINITY() {
        double actual = FastMath.tan(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method tan(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#tan(double)}
     */
    @Test
    public void testTan() {
        double actual = FastMath.tan(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-1.1125369292536007E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.atan2
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method atan2(double, double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (y == Double.NEGATIVE_INFINITY): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (x == Double.NEGATIVE_INFINITY): True}
 * @utbot.executesCondition {@code (y > 0.0): True}
 *  */
    @Test
    public void testAtan2_YGreaterThanZero() {
        double actual = FastMath.atan2(3.337610787760802E-308, java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(3.141592653589793, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (y == Double.NEGATIVE_INFINITY): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (y > 0.0): True}
 *  */
    @Test
    public void testAtan2_YGreaterThanZero_1() {
        double actual = FastMath.atan2(3.337610787760802E-308, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testAtan2_XNotEqualsX() {
        double actual = FastMath.atan2(java.lang.Double.NaN, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testAtan2_YNotEqualsY() {
        double actual = FastMath.atan2(java.lang.Double.NaN, -2.0000000000000004);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): True}
 * @utbot.returnsFrom {@code return Math.PI / 4.0;}
 *  */
    @Test
    public void testAtan2_XEqualsDoublePOSITIVE_INFINITY() {
        double actual = FastMath.atan2(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(0.7853981633974483, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (x == Double.NEGATIVE_INFINITY): True}
 * @utbot.returnsFrom {@code return Math.PI * 3.0 / 4.0;}
 *  */
    @Test
    public void testAtan2_XEqualsDoubleNEGATIVE_INFINITY() {
        double actual = FastMath.atan2(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(2.356194490192345, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (x == Double.NEGATIVE_INFINITY): False}
 *  */
    @Test
    public void testAtan2_XNotEqualsDoubleNEGATIVE_INFINITY() {
        double actual = FastMath.atan2(java.lang.Double.POSITIVE_INFINITY, -2.0000000000000004);
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (y == Double.NEGATIVE_INFINITY): True}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): True}
 * @utbot.returnsFrom {@code return -Math.PI / 4.0;}
 *  */
    @Test
    public void testAtan2_XEqualsDoublePOSITIVE_INFINITY_1() {
        double actual = FastMath.atan2(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(-0.7853981633974483, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.sqrt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sqrt(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#sqrt(double)}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 * @utbot.returnsFrom {@code return Math.sqrt(a);}
 *  */
    @Test
    public void testSqrt_MathSqrt() {
        double actual = FastMath.sqrt(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.log
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method log(double, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
 * @utbot.executesCondition {@code ((bits & 0x8000000000000000L) != 0): False}
 * @utbot.executesCondition {@code (x != x): True}
 * @utbot.executesCondition {@code (x != 0.0): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testLog_HiPrecNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = java.lang.Double.NaN;
        logMethodArguments[1] = ((Object) doubleArray);
        double actual = ((Double) logMethod.invoke(null, logMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray0, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
 * @utbot.executesCondition {@code ((bits & 0x8000000000000000L) != 0): False}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testLog_HiPrecNotEqualsNull_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = java.lang.Double.POSITIVE_INFINITY;
        logMethodArguments[1] = ((Object) doubleArray);
        double actual = ((Double) logMethod.invoke(null, logMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalDoubleArray0, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
 * @utbot.executesCondition {@code ((bits & 0x8000000000000000L) != 0): True}
 * @utbot.executesCondition {@code (x != 0.0): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code ((bits & 0x7ff0000000000000L) == 0): True}
 * @utbot.executesCondition {@code (x == 0): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.returnsFrom {@code return Double.NEGATIVE_INFINITY;}
 *  */
    @Test
    public void testLog_HiPrecNotEqualsNull_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = -0.0;
        logMethodArguments[1] = ((Object) doubleArray);
        double actual = ((Double) logMethod.invoke(null, logMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, finalDoubleArray0, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
 * @utbot.executesCondition {@code ((bits & 0x8000000000000000L) != 0): False}
 * @utbot.executesCondition {@code (x != x): True}
 * @utbot.executesCondition {@code (x != 0.0): True}
 * @utbot.executesCondition {@code (hiPrec != null): False}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testLog_HiPrecEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = java.lang.Double.NaN;
        logMethodArguments[1] = ((Object) null);
        double actual = ((Double) logMethod.invoke(null, logMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
 * @utbot.executesCondition {@code ((bits & 0x8000000000000000L) != 0): False}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (hiPrec != null): False}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testLog_HiPrecEqualsNull_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = java.lang.Double.POSITIVE_INFINITY;
        logMethodArguments[1] = ((Object) null);
        double actual = ((Double) logMethod.invoke(null, logMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
 * @utbot.executesCondition {@code ((bits & 0x8000000000000000L) != 0): True}
 * @utbot.executesCondition {@code (x != 0.0): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code ((bits & 0x7ff0000000000000L) == 0): True}
 * @utbot.executesCondition {@code (x == 0): True}
 * @utbot.executesCondition {@code (hiPrec != null): False}
 * @utbot.returnsFrom {@code return Double.NEGATIVE_INFINITY;}
 *  */
    @Test
    public void testLog_HiPrecEqualsNull_2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = -0.0;
        logMethodArguments[1] = ((Object) null);
        double actual = ((Double) logMethod.invoke(null, logMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method log(double, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
 * @utbot.executesCondition {@code ((bits & 0x8000000000000000L) != 0): False}
 * @utbot.executesCondition {@code (x != x): True}
 * @utbot.executesCondition {@code (x != 0.0): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hiPrec[0] = Double.NaN;
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.log(FastMath.java:1171) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = java.lang.Double.NaN;
        logMethodArguments[1] = ((Object) doubleArray);
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
 * @utbot.executesCondition {@code ((bits & 0x8000000000000000L) != 0): True}
 * @utbot.executesCondition {@code (x != 0.0): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hiPrec[0] = Double.NaN;
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.log(FastMath.java:1376) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = 2.225073858507202E-308;
        logMethodArguments[1] = ((Object) doubleArray);
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
 * @utbot.executesCondition {@code ((bits & 0x8000000000000000L) != 0): False}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hiPrec[0] = Double.POSITIVE_INFINITY;
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.log(FastMath.java:1181) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = java.lang.Double.POSITIVE_INFINITY;
        logMethodArguments[1] = ((Object) doubleArray);
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
 * @utbot.executesCondition {@code ((bits & 0x8000000000000000L) != 0): True}
 * @utbot.executesCondition {@code (x != 0.0): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code ((bits & 0x7ff0000000000000L) == 0): True}
 * @utbot.executesCondition {@code (x == 0): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hiPrec[0] = Double.NEGATIVE_INFINITY;
 *  */
    @Test
    public void testLog_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.log] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.log(FastMath.java:1195) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = -0.0;
        logMethodArguments[1] = ((Object) doubleArray);
        try {
            logMethod.invoke(null, logMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method log(double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double,double[])}
     */
    @Test
    public void testLogWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.19999954120254515, java.lang.Double.POSITIVE_INFINITY, 0.99};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method logMethod = fastMathClazz.getDeclaredMethod("log", doubleType, doubleArrayType);
        logMethod.setAccessible(true);
        java.lang.Object[] logMethodArguments = new java.lang.Object[2];
        logMethodArguments[0] = 4.503599627370496E15;
        logMethodArguments[1] = ((Object) doubleArray);
        double actual = ((Double) logMethod.invoke(null, logMethodArguments));
        
        org.junit.Assert.assertEquals(36.04365338911715, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        
        org.junit.Assert.assertEquals(36.04365338911715, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(2.53817149589719E-15, finalDoubleArray1, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.log
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method log(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double)}
 * @utbot.returnsFrom {@code return log(x, null);}
 *  */
    @Test
    public void testLog_ReturnLog() {
        double actual = FastMath.log(-2.0000000000000004);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double)}
 * @utbot.returnsFrom {@code return log(x, null);}
 *  */
    @Test
    public void testLog_ReturnLog_1() {
        double actual = FastMath.log(java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double)}
 * @utbot.returnsFrom {@code return log(x, null);}
 *  */
    @Test
    public void testLog_ReturnLog_2() {
        double actual = FastMath.log(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log(double)}
 * @utbot.returnsFrom {@code return log(x, null);}
 *  */
    @Test
    public void testLog_ReturnLog_3() {
        double actual = FastMath.log(-0.0);
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.log10
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method log10(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log10(double)}
 * @utbot.returnsFrom {@code return rln10b * lnb + rln10b * lna + rln10a * lnb + rln10a * lna;}
 *  */
    @Test
    public void testLog10_ReturnRln10bMultiplyLnbPlusRln10bMultiplyLnaPlusRln10aMultiplyLnbPlusRln10aMultiplyLna() {
        double actual = FastMath.log10(-2.0000000000000004);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log10(double)}
 * @utbot.returnsFrom {@code return rln10b * lnb + rln10b * lna + rln10a * lnb + rln10a * lna;}
 *  */
    @Test
    public void testLog10_ReturnRln10bMultiplyLnbPlusRln10bMultiplyLnaPlusRln10aMultiplyLnbPlusRln10aMultiplyLna_1() {
        double actual = FastMath.log10(java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log10(double)}
 * @utbot.returnsFrom {@code return rln10b * lnb + rln10b * lna + rln10a * lnb + rln10a * lna;}
 *  */
    @Test
    public void testLog10_ReturnRln10bMultiplyLnbPlusRln10bMultiplyLnaPlusRln10aMultiplyLnbPlusRln10aMultiplyLna_2() {
        double actual = FastMath.log10(-0.0);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log10(double)}
 * @utbot.returnsFrom {@code return rln10b * lnb + rln10b * lna + rln10a * lnb + rln10a * lna;}
 *  */
    @Test
    public void testLog10_ReturnRln10bMultiplyLnbPlusRln10bMultiplyLnaPlusRln10aMultiplyLnbPlusRln10aMultiplyLna_3() {
        double actual = FastMath.log10(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.pow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pow(double, double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#pow(double,double)}
 * @utbot.executesCondition {@code (y == 0.0): True}
 * @utbot.returnsFrom {@code return 1.0;}
 *  */
    @Test
    public void testPow_YEqualsZero() {
        double actual = FastMath.pow(java.lang.Double.NaN, 0.0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#pow(double,double)}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (x != x): True}
 * @utbot.returnsFrom {@code return x;}
 *  */
    @Test
    public void testPow_XNotEqualsX() {
        double actual = FastMath.pow(java.lang.Double.NaN, 2.225073858507202E-308);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#pow(double,double)}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x == 0): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (x == Double.NEGATIVE_INFINITY): True}
 *  */
    @Test
    public void testPow_YNotEqualsY() {
        double actual = FastMath.pow(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#pow(double,double)}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x == 0): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (x * x == 1.0): False}
 * @utbot.executesCondition {@code (x * x > 1.0): False}
 *  */
    @Test
    public void testPow_XMultiplyXLessOrEqual1d() {
        double actual = FastMath.pow(3.337610787760802E-308, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#pow(double,double)}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x == 0): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (x == Double.NEGATIVE_INFINITY): True}
 * @utbot.executesCondition {@code (y < 0): True}
 * @utbot.executesCondition {@code (y == yi): False}
 *  */
    @Test
    public void testPow_YNotEqualsYi() {
        double actual = FastMath.pow(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#pow(double,double)}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x == 0): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (x * x == 1.0): False}
 * @utbot.executesCondition {@code (x * x > 1.0): True}
 *  */
    @Test
    public void testPow_XMultiplyXGreaterThan1d() {
        double actual = FastMath.pow(1.9691519834075015E177, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#pow(double,double)}
 * @utbot.executesCondition {@code (y == 0.0): False}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x == 0): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (y != y): True}
 *  */
    @Test
    public void testPow_YNotEqualsY_1() {
        double actual = FastMath.pow(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pow(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#pow(double,double)}
     */
    @Test
    public void testPowReturnsZeroWithCornerCase() {
        double actual = FastMath.pow(0.0, 1.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.exp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exp(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double)}
 * @utbot.returnsFrom {@code return exp(x, 0.0, null);}
 *  */
    @Test
    public void testExp_ReturnExp() {
        double actual = FastMath.exp(-747.0000023949178);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double)}
 * @utbot.returnsFrom {@code return exp(x, 0.0, null);}
 *  */
    @Test
    public void testExp_ReturnExp_1() {
        double actual = FastMath.exp(722.8909319723792);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.exp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exp(double, double, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double,double,double[])}
 * @utbot.executesCondition {@code (x < 0.0): True}
 * @utbot.executesCondition {@code (intVal > 746): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.returnsFrom {@code return 0.0;}
 *  */
    @Test
    public void testExp_HiPrecNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, 0.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expMethod = fastMathClazz.getDeclaredMethod("exp", doubleType, doubleType, doubleArrayType);
        expMethod.setAccessible(true);
        java.lang.Object[] expMethodArguments = new java.lang.Object[3];
        expMethodArguments[0] = -747.0039063412733;
        expMethodArguments[1] = java.lang.Double.NaN;
        expMethodArguments[2] = ((Object) doubleArray);
        double actual = ((Double) expMethod.invoke(null, expMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double,double,double[])}
 * @utbot.executesCondition {@code (x < 0.0): False}
 * @utbot.executesCondition {@code (intVal > 709): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testExp_HiPrecNotEqualsNull_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, 0.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expMethod = fastMathClazz.getDeclaredMethod("exp", doubleType, doubleType, doubleArrayType);
        expMethod.setAccessible(true);
        java.lang.Object[] expMethodArguments = new java.lang.Object[3];
        expMethodArguments[0] = 1.1928341728791876E116;
        expMethodArguments[1] = java.lang.Double.NaN;
        expMethodArguments[2] = ((Object) doubleArray);
        double actual = ((Double) expMethod.invoke(null, expMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, finalDoubleArray0, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double,double,double[])}
 * @utbot.executesCondition {@code (x < 0.0): True}
 * @utbot.executesCondition {@code (intVal > 746): True}
 * @utbot.executesCondition {@code (hiPrec != null): False}
 * @utbot.returnsFrom {@code return 0.0;}
 *  */
    @Test
    public void testExp_HiPrecEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expMethod = fastMathClazz.getDeclaredMethod("exp", doubleType, doubleType, doubleArrayType);
        expMethod.setAccessible(true);
        java.lang.Object[] expMethodArguments = new java.lang.Object[3];
        expMethodArguments[0] = -747.0358448037889;
        expMethodArguments[1] = java.lang.Double.NaN;
        expMethodArguments[2] = ((Object) null);
        double actual = ((Double) expMethod.invoke(null, expMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double,double,double[])}
 * @utbot.executesCondition {@code (x < 0.0): False}
 * @utbot.executesCondition {@code (intVal > 709): True}
 * @utbot.executesCondition {@code (hiPrec != null): False}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testExp_HiPrecEqualsNull_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expMethod = fastMathClazz.getDeclaredMethod("exp", doubleType, doubleType, doubleArrayType);
        expMethod.setAccessible(true);
        java.lang.Object[] expMethodArguments = new java.lang.Object[3];
        expMethodArguments[0] = 4.294967298E9;
        expMethodArguments[1] = java.lang.Double.NaN;
        expMethodArguments[2] = ((Object) null);
        double actual = ((Double) expMethod.invoke(null, expMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exp(double, double, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double,double,double[])}
 * @utbot.executesCondition {@code (x < 0.0): True}
 * @utbot.executesCondition {@code (intVal > 746): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hiPrec[0] = 0.0;
 *  */
    @Test
    public void testExp_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.exp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.exp(FastMath.java:645) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expMethod = fastMathClazz.getDeclaredMethod("exp", doubleType, doubleType, doubleArrayType);
        expMethod.setAccessible(true);
        java.lang.Object[] expMethodArguments = new java.lang.Object[3];
        expMethodArguments[0] = -747.0000000000073;
        expMethodArguments[1] = java.lang.Double.NaN;
        expMethodArguments[2] = ((Object) doubleArray);
        try {
            expMethod.invoke(null, expMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double,double,double[])}
 * @utbot.executesCondition {@code (x < 0.0): True}
 * @utbot.executesCondition {@code (intVal > 746): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hiPrec[1] = 0.0;
 *  */
    @Test
    public void testExp_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.exp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.exp(FastMath.java:646) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expMethod = fastMathClazz.getDeclaredMethod("exp", doubleType, doubleType, doubleArrayType);
        expMethod.setAccessible(true);
        java.lang.Object[] expMethodArguments = new java.lang.Object[3];
        expMethodArguments[0] = -747.0293579329921;
        expMethodArguments[1] = java.lang.Double.NaN;
        expMethodArguments[2] = ((Object) doubleArray);
        try {
            expMethod.invoke(null, expMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double,double,double[])}
 * @utbot.executesCondition {@code (x < 0.0): False}
 * @utbot.executesCondition {@code (intVal > 709): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hiPrec[0] = Double.POSITIVE_INFINITY;
 *  */
    @Test
    public void testExp_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.exp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.exp(FastMath.java:682) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expMethod = fastMathClazz.getDeclaredMethod("exp", doubleType, doubleType, doubleArrayType);
        expMethod.setAccessible(true);
        java.lang.Object[] expMethodArguments = new java.lang.Object[3];
        expMethodArguments[0] = 1.286811163209378E10;
        expMethodArguments[1] = java.lang.Double.NaN;
        expMethodArguments[2] = ((Object) doubleArray);
        try {
            expMethod.invoke(null, expMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double,double,double[])}
 * @utbot.executesCondition {@code (x < 0.0): False}
 * @utbot.executesCondition {@code (intVal > 709): True}
 * @utbot.executesCondition {@code (hiPrec != null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: hiPrec[1] = 0.0;
 *  */
    @Test
    public void testExp_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.exp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.exp(FastMath.java:683) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expMethod = fastMathClazz.getDeclaredMethod("exp", doubleType, doubleType, doubleArrayType);
        expMethod.setAccessible(true);
        java.lang.Object[] expMethodArguments = new java.lang.Object[3];
        expMethodArguments[0] = 4096.125000000001;
        expMethodArguments[1] = java.lang.Double.NaN;
        expMethodArguments[2] = ((Object) doubleArray);
        try {
            expMethod.invoke(null, expMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method exp(double, double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#exp(double,double,double[])}
     */
    @Test
    public void testExpWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, 0.0, 40.19140625};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expMethod = fastMathClazz.getDeclaredMethod("exp", doubleType, doubleType, doubleArrayType);
        expMethod.setAccessible(true);
        java.lang.Object[] expMethodArguments = new java.lang.Object[3];
        expMethodArguments[0] = 1.1125369292536007E-308;
        expMethodArguments[1] = 0.5000000000042687;
        expMethodArguments[2] = ((Object) doubleArray);
        double actual = ((Double) expMethod.invoke(null, expMethodArguments));
        
        org.junit.Assert.assertEquals(1.5000000000042686, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        
        org.junit.Assert.assertEquals(1.0, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.5000000000042687, finalDoubleArray1, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(int, int)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#min(int,int)}
 * @utbot.executesCondition {@code ((a <= b)): False}
 * @utbot.returnsFrom {@code return (a <= b) ? a : b;}
 *  */
    @Test
    public void testMin_AGreaterThanB() {
        int actual = FastMath.min(-3, -4);
        
        assertEquals(-4, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#min(int,int)}
 * @utbot.executesCondition {@code ((a <= b)): True}
 * @utbot.returnsFrom {@code return (a <= b) ? a : b;}
 *  */
    @Test
    public void testMin_ALessOrEqualB() {
        int actual = FastMath.min(-255, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(long, long)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#min(long,long)}
 * @utbot.executesCondition {@code ((a <= b)): True}
 * @utbot.returnsFrom {@code return (a <= b) ? a : b;}
 *  */
    @Test
    public void testMin_ALessOrEqualB1() {
        long actual = FastMath.min(8L, 8L);
        
        assertEquals(8L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#min(long,long)}
 * @utbot.executesCondition {@code ((a <= b)): False}
 * @utbot.returnsFrom {@code return (a <= b) ? a : b;}
 *  */
    @Test
    public void testMin_AGreaterThanB1() {
        long actual = FastMath.min(5L, -254L);
        
        assertEquals(-254L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(float, float)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#min(float,float)}
 * @utbot.executesCondition {@code (Float.isNaN(a + b)): True}
 * @utbot.returnsFrom {@code return (a <= b) ? a : (Float.isNaN(a + b) ? Float.NaN : b);}
 *  */
    @Test
    public void testMin_FloatIsNaN() {
        float actual = FastMath.min(java.lang.Float.NaN, -1.8652711E-36f);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#min(float,float)}
 * @utbot.returnsFrom {@code return (a <= b) ? a : (Float.isNaN(a + b) ? Float.NaN : b);}
 *  */
    @Test
    public void testMin_ALessOrEqualB2() {
        float actual = FastMath.min(-0.0f, 0.0f);
        
        org.junit.Assert.assertEquals(-0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#min(float,float)}
 * @utbot.executesCondition {@code (Float.isNaN(a + b)): False}
 * @utbot.returnsFrom {@code return (a <= b) ? a : (Float.isNaN(a + b) ? Float.NaN : b);}
 *  */
    @Test
    public void testMin_NotFloatIsNaN() {
        float actual = FastMath.min(192.0f, 4.5E-44f);
        
        org.junit.Assert.assertEquals(4.5E-44f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.min
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method min(double, double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#min(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(a + b)): False}
 * @utbot.returnsFrom {@code return (a <= b) ? a : (Double.isNaN(a + b) ? Double.NaN : b);}
 *  */
    @Test
    public void testMin_NotDoubleIsNaN() {
        double actual = FastMath.min(-0.0, -1.0797709233925293E-270);
        
        org.junit.Assert.assertEquals(-1.0797709233925293E-270, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#min(double,double)}
 * @utbot.returnsFrom {@code return (a <= b) ? a : (Double.isNaN(a + b) ? Double.NaN : b);}
 *  */
    @Test
    public void testMin_ALessOrEqualB3() {
        double actual = FastMath.min(3.4913542899315027E-308, 3.4913542899315027E-308);
        
        org.junit.Assert.assertEquals(3.4913542899315027E-308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#min(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(a + b)): True}
 * @utbot.returnsFrom {@code return (a <= b) ? a : (Double.isNaN(a + b) ? Double.NaN : b);}
 *  */
    @Test
    public void testMin_DoubleIsNaN() {
        double actual = FastMath.min(java.lang.Double.NaN, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(float, float)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#max(float,float)}
 * @utbot.executesCondition {@code (Float.isNaN(a + b)): True}
 * @utbot.returnsFrom {@code return (a <= b) ? b : (Float.isNaN(a + b) ? Float.NaN : b);}
 *  */
    @Test
    public void testMax_FloatIsNaN() {
        float actual = FastMath.max(java.lang.Float.NaN, -1.8652711E-36f);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#max(float,float)}
 * @utbot.returnsFrom {@code return (a <= b) ? b : (Float.isNaN(a + b) ? Float.NaN : b);}
 *  */
    @Test
    public void testMax_ALessOrEqualB() {
        float actual = FastMath.max(-0.0f, 0.0f);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#max(float,float)}
 * @utbot.executesCondition {@code (Float.isNaN(a + b)): False}
 * @utbot.returnsFrom {@code return (a <= b) ? b : (Float.isNaN(a + b) ? Float.NaN : b);}
 *  */
    @Test
    public void testMax_NotFloatIsNaN() {
        float actual = FastMath.max(192.0f, 4.5E-44f);
        
        org.junit.Assert.assertEquals(4.5E-44f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(long, long)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#max(long,long)}
 * @utbot.executesCondition {@code ((a <= b)): True}
 * @utbot.returnsFrom {@code return (a <= b) ? b : a;}
 *  */
    @Test
    public void testMax_ALessOrEqualB1() {
        long actual = FastMath.max(8L, 8L);
        
        assertEquals(8L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#max(long,long)}
 * @utbot.executesCondition {@code ((a <= b)): False}
 * @utbot.returnsFrom {@code return (a <= b) ? b : a;}
 *  */
    @Test
    public void testMax_AGreaterThanB() {
        long actual = FastMath.max(5L, -254L);
        
        assertEquals(5L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(int, int)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#max(int,int)}
 * @utbot.executesCondition {@code ((a <= b)): False}
 * @utbot.returnsFrom {@code return (a <= b) ? b : a;}
 *  */
    @Test
    public void testMax_AGreaterThanB1() {
        int actual = FastMath.max(-3, -4);
        
        assertEquals(-3, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#max(int,int)}
 * @utbot.executesCondition {@code ((a <= b)): True}
 * @utbot.returnsFrom {@code return (a <= b) ? b : a;}
 *  */
    @Test
    public void testMax_ALessOrEqualB2() {
        int actual = FastMath.max(-255, -255);
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.max
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method max(double, double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#max(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(a + b)): False}
 * @utbot.returnsFrom {@code return (a <= b) ? b : (Double.isNaN(a + b) ? Double.NaN : a);}
 *  */
    @Test
    public void testMax_NotDoubleIsNaN() {
        double actual = FastMath.max(4.345847379897E-311, -1.138628458991175E-308);
        
        org.junit.Assert.assertEquals(4.345847379897E-311, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#max(double,double)}
 * @utbot.returnsFrom {@code return (a <= b) ? b : (Double.isNaN(a + b) ? Double.NaN : a);}
 *  */
    @Test
    public void testMax_ALessOrEqualB3() {
        double actual = FastMath.max(3.4913542899315027E-308, 3.4913542899315027E-308);
        
        org.junit.Assert.assertEquals(3.4913542899315027E-308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#max(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(a + b)): True}
 * @utbot.returnsFrom {@code return (a <= b) ? b : (Double.isNaN(a + b) ? Double.NaN : a);}
 *  */
    @Test
    public void testMax_DoubleIsNaN() {
        double actual = FastMath.max(java.lang.Double.NaN, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.floor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method floor(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#floor(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x >= 4503599627370496.0): False}
 * @utbot.executesCondition {@code (x <= -4503599627370496.0): False}
 * @utbot.executesCondition {@code (x < 0): True}
 * @utbot.executesCondition {@code (y != x): True}
 * @utbot.executesCondition {@code (y == 0): False}
 * @utbot.returnsFrom {@code return (double) y;}
 *  */
    @Test
    public void testFloor_YNotEqualsX() {
        double actual = FastMath.floor(-6.027810153338326E-193);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#floor(double)}
 * @utbot.executesCondition {@code (x != x): True}
 *  */
    @Test
    public void testFloor_XNotEqualsX() {
        double actual = FastMath.floor(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#floor(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x >= 4503599627370496.0): True}
 *  */
    @Test
    public void testFloor_XGreaterOrEqual2147483647d() {
        double actual = FastMath.floor(4.503599627370496E15);
        
        org.junit.Assert.assertEquals(4.503599627370496E15, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#floor(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x >= 4503599627370496.0): False}
 * @utbot.executesCondition {@code (x <= -4503599627370496.0): True}
 *  */
    @Test
    public void testFloor_XLessOrEqualNegative2147483647d() {
        double actual = FastMath.floor(-4.503599627370496E15);
        
        org.junit.Assert.assertEquals(-4.503599627370496E15, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#floor(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x >= 4503599627370496.0): False}
 * @utbot.executesCondition {@code (x <= -4503599627370496.0): False}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (y == 0): False}
 * @utbot.returnsFrom {@code return (double) y;}
 *  */
    @Test
    public void testFloor_YNotEqualsZero() {
        double actual = FastMath.floor(262144.0793457106);
        
        org.junit.Assert.assertEquals(262144.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#floor(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x >= 4503599627370496.0): False}
 * @utbot.executesCondition {@code (x <= -4503599627370496.0): False}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (y == 0): True}
 * @utbot.returnsFrom {@code return x * y;}
 *  */
    @Test
    public void testFloor_YEqualsZero() {
        double actual = FastMath.floor(-0.0);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.ceil
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ceil(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#ceil(double)}
 * @utbot.executesCondition {@code (x != x): True}
 * @utbot.returnsFrom {@code return x;}
 *  */
    @Test
    public void testCeil_XNotEqualsX() {
        double actual = FastMath.ceil(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#ceil(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y == x): True}
 * @utbot.returnsFrom {@code return y;}
 *  */
    @Test
    public void testCeil_YEqualsX() {
        double actual = FastMath.ceil(4.503599627370496E15);
        
        org.junit.Assert.assertEquals(4.503599627370496E15, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#ceil(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y == x): True}
 * @utbot.returnsFrom {@code return y;}
 *  */
    @Test
    public void testCeil_YEqualsX_1() {
        double actual = FastMath.ceil(-0.0);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#ceil(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y == x): False}
 * @utbot.executesCondition {@code (y == 0): False}
 * @utbot.returnsFrom {@code return y;}
 *  */
    @Test
    public void testCeil_YNotEqualsZero() {
        double actual = FastMath.ceil(2.5429239116E-314);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method ceil(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#ceil(double)}
     */
    @Test
    public void testCeil() {
        double actual = FastMath.ceil(-1.0);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.rint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method rint(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#rint(double)}
 * @utbot.executesCondition {@code (d < 0.5): False}
 * @utbot.executesCondition {@code ((z & 1) == 0): True}
 * @utbot.returnsFrom {@code return (z & 1) == 0 ? y : y + 1.0;}
 *  */
    @Test
    public void testRint_ZBitwiseAnd1EqualsZero() {
        double actual = FastMath.rint(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#rint(double)}
 * @utbot.executesCondition {@code (d < 0.5): True}
 * @utbot.returnsFrom {@code return y;}
 *  */
    @Test
    public void testRint_DLessThan0d() {
        double actual = FastMath.rint(-4.503599627370496E15);
        
        org.junit.Assert.assertEquals(-4.503599627370496E15, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method rint(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#rint(double)}
     */
    @Test
    public void testRint() {
        double actual = FastMath.rint(-1.0);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.signum
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method signum(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#signum(double)}
 * @utbot.returnsFrom {@code return (a < 0.0) ? -1.0 : ((a > 0.0) ? 1.0 : (Double.isNaN(a) ? Double.NaN : 0.0));}
 *  */
    @Test
    public void testSignum_ALessThanZero() {
        double actual = FastMath.signum(3.785766995733733E-270);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#signum(double)}
 * @utbot.returnsFrom {@code return (a < 0.0) ? -1.0 : ((a > 0.0) ? 1.0 : (Double.isNaN(a) ? Double.NaN : 0.0));}
 *  */
    @Test
    public void testSignum_ALessThanZero_1() {
        double actual = FastMath.signum(-2.225073858507202E-308);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#signum(double)}
 * @utbot.executesCondition {@code (Double.isNaN(a)): False}
 * @utbot.returnsFrom {@code return (a < 0.0) ? -1.0 : ((a > 0.0) ? 1.0 : (Double.isNaN(a) ? Double.NaN : 0.0));}
 *  */
    @Test
    public void testSignum_NotDoubleIsNaN() {
        double actual = FastMath.signum(0.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#signum(double)}
 * @utbot.executesCondition {@code (Double.isNaN(a)): True}
 * @utbot.returnsFrom {@code return (a < 0.0) ? -1.0 : ((a > 0.0) ? 1.0 : (Double.isNaN(a) ? Double.NaN : 0.0));}
 *  */
    @Test
    public void testSignum_DoubleIsNaN() {
        double actual = FastMath.signum(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.split
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method split(double, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#split(double,double[])}
 * @utbot.executesCondition {@code (d < 8e298): True}
 * @utbot.executesCondition {@code (d > -8e298): True}
 *  */
    @Test
    public void testSplit_DGreaterThanNegative2147483647d() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, 0.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method splitMethod = fastMathClazz.getDeclaredMethod("split", doubleType, doubleArrayType);
        splitMethod.setAccessible(true);
        java.lang.Object[] splitMethodArguments = new java.lang.Object[2];
        splitMethodArguments[0] = -8.900295434028806E-10;
        splitMethodArguments[1] = ((Object) doubleArray);
        splitMethod.invoke(null, splitMethodArguments);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        
        org.junit.Assert.assertEquals(-8.900294945490828E-10, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(-4.885379786480764E-17, finalDoubleArray1, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#split(double,double[])}
 * @utbot.executesCondition {@code (d < 8e298): False}
 *  */
    @Test
    public void testSplit_DGreaterOrEqual2147483647d() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, 0.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method splitMethod = fastMathClazz.getDeclaredMethod("split", doubleType, doubleArrayType);
        splitMethod.setAccessible(true);
        java.lang.Object[] splitMethodArguments = new java.lang.Object[2];
        splitMethodArguments[0] = 8.0E298;
        splitMethodArguments[1] = ((Object) doubleArray);
        splitMethod.invoke(null, splitMethodArguments);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        
        org.junit.Assert.assertEquals(7.999999560879315E298, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(4.3912068423819426E291, finalDoubleArray1, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method split(double, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#split(double,double[])}
 * @utbot.executesCondition {@code (d < 8e298): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: split[0] = (d + a - d) * 1073741824.0;
 *  */
    @Test
    public void testSplit_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.split] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.split(FastMath.java:951) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method splitMethod = fastMathClazz.getDeclaredMethod("split", doubleType, doubleArrayType);
        splitMethod.setAccessible(true);
        java.lang.Object[] splitMethodArguments = new java.lang.Object[2];
        splitMethodArguments[0] = 8.0E298;
        splitMethodArguments[1] = ((Object) doubleArray);
        try {
            splitMethod.invoke(null, splitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#split(double,double[])}
 * @utbot.executesCondition {@code (d < 8e298): True}
 * @utbot.executesCondition {@code (d > -8e298): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: split[0] = (d + a) - a;
 *  */
    @Test
    public void testSplit_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.split] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.split(FastMath.java:947) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method splitMethod = fastMathClazz.getDeclaredMethod("split", doubleType, doubleArrayType);
        splitMethod.setAccessible(true);
        java.lang.Object[] splitMethodArguments = new java.lang.Object[2];
        splitMethodArguments[0] = -8.900295434028806E-10;
        splitMethodArguments[1] = ((Object) doubleArray);
        try {
            splitMethod.invoke(null, splitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#split(double,double[])}
 * @utbot.executesCondition {@code (d < 8e298): True}
 * @utbot.executesCondition {@code (d > -8e298): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: split[1] = d - split[0];
 *  */
    @Test
    public void testSplit_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.split] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.split(FastMath.java:948) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method splitMethod = fastMathClazz.getDeclaredMethod("split", doubleType, doubleArrayType);
        splitMethod.setAccessible(true);
        java.lang.Object[] splitMethodArguments = new java.lang.Object[2];
        splitMethodArguments[0] = -8.900295434028806E-10;
        splitMethodArguments[1] = ((Object) doubleArray);
        try {
            splitMethod.invoke(null, splitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#split(double,double[])}
 * @utbot.executesCondition {@code (d < 8e298): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: split[1] = d - split[0];
 *  */
    @Test
    public void testSplit_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.split] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.split(FastMath.java:952) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method splitMethod = fastMathClazz.getDeclaredMethod("split", doubleType, doubleArrayType);
        splitMethod.setAccessible(true);
        java.lang.Object[] splitMethodArguments = new java.lang.Object[2];
        splitMethodArguments[0] = 8.0E298;
        splitMethodArguments[1] = ((Object) doubleArray);
        try {
            splitMethod.invoke(null, splitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#split(double,double[])}
 * @utbot.executesCondition {@code (d < 8e298): True}
 * @utbot.executesCondition {@code (d > -8e298): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: split[0] = (d + a - d) * 1073741824.0;
 *  */
    @Test
    public void testSplit_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.split] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.split(FastMath.java:951) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method splitMethod = fastMathClazz.getDeclaredMethod("split", doubleType, doubleArrayType);
        splitMethod.setAccessible(true);
        java.lang.Object[] splitMethodArguments = new java.lang.Object[2];
        splitMethodArguments[0] = -8.0E298;
        splitMethodArguments[1] = ((Object) doubleArray);
        try {
            splitMethod.invoke(null, splitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#split(double,double[])}
 * @utbot.executesCondition {@code (d < 8e298): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: split[0] = (d + a - d) * 1073741824.0;
 *  */
    @Test
    public void testSplit_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.util.FastMath.split] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.split(FastMath.java:951) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method splitMethod = fastMathClazz.getDeclaredMethod("split", doubleType, doubleArrayType);
        splitMethod.setAccessible(true);
        java.lang.Object[] splitMethodArguments = new java.lang.Object[2];
        splitMethodArguments[0] = 8.0E298;
        splitMethodArguments[1] = ((Object) null);
        try {
            splitMethod.invoke(null, splitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#split(double,double[])}
 * @utbot.executesCondition {@code (d < 8e298): True}
 * @utbot.executesCondition {@code (d > -8e298): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: split[0] = (d + a) - a;
 *  */
    @Test
    public void testSplit_ThrowNullPointerException_1() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.util.FastMath.split] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.split(FastMath.java:947) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method splitMethod = fastMathClazz.getDeclaredMethod("split", doubleType, doubleArrayType);
        splitMethod.setAccessible(true);
        java.lang.Object[] splitMethodArguments = new java.lang.Object[2];
        splitMethodArguments[0] = -8.900295434028806E-10;
        splitMethodArguments[1] = ((Object) null);
        try {
            splitMethod.invoke(null, splitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.asin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asin(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asin(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 1.0): False}
 * @utbot.executesCondition {@code (x < -1.0): False}
 * @utbot.executesCondition {@code (x == 1.0): False}
 * @utbot.executesCondition {@code (x == -1.0): True}
 * @utbot.returnsFrom {@code return -Math.PI / 2.0;}
 *  */
    @Test
    public void testAsin_XEqualsNegative1d() {
        double actual = FastMath.asin(-1.0);
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asin(double)}
 * @utbot.executesCondition {@code (x != x): True}
 *  */
    @Test
    public void testAsin_XNotEqualsX() {
        double actual = FastMath.asin(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asin(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 1.0): True}
 *  */
    @Test
    public void testAsin_XGreaterThan1d() {
        double actual = FastMath.asin(2.0000000000000004);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asin(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 1.0): False}
 * @utbot.executesCondition {@code (x < -1.0): True}
 *  */
    @Test
    public void testAsin_XLessThanNegative1d() {
        double actual = FastMath.asin(-2.0000000000000036);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asin(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 1.0): False}
 * @utbot.executesCondition {@code (x < -1.0): False}
 * @utbot.executesCondition {@code (x == 1.0): True}
 * @utbot.returnsFrom {@code return Math.PI / 2.0;}
 *  */
    @Test
    public void testAsin_XEquals1d() {
        double actual = FastMath.asin(1.0);
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asin(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asin(double)}
     */
    @Test
    public void testAsin() {
        double actual = FastMath.asin(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-1.1125369292536007E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.acos
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acos(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#acos(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 1.0): True}
 *  */
    @Test
    public void testAcos_XGreaterThan1d() {
        double actual = FastMath.acos(2.0000000000000004);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#acos(double)}
 * @utbot.executesCondition {@code (x != x): True}
 *  */
    @Test
    public void testAcos_XNotEqualsX() {
        double actual = FastMath.acos(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#acos(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 1.0): False}
 * @utbot.executesCondition {@code (x < -1.0): True}
 *  */
    @Test
    public void testAcos_XLessThanNegative1d() {
        double actual = FastMath.acos(-2.0000000000000036);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#acos(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 1.0): False}
 * @utbot.executesCondition {@code (x < -1.0): False}
 * @utbot.executesCondition {@code (x == -1.0): True}
 * @utbot.returnsFrom {@code return Math.PI;}
 *  */
    @Test
    public void testAcos_XEqualsNegative1d() {
        double actual = FastMath.acos(-1.0);
        
        org.junit.Assert.assertEquals(3.141592653589793, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#acos(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 1.0): False}
 * @utbot.executesCondition {@code (x < -1.0): False}
 * @utbot.executesCondition {@code (x == -1.0): False}
 * @utbot.executesCondition {@code (x == 1.0): True}
 * @utbot.returnsFrom {@code return 0.0;}
 *  */
    @Test
    public void testAcos_XEquals1d() {
        double actual = FastMath.acos(1.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#acos(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 1.0): False}
 * @utbot.executesCondition {@code (x < -1.0): False}
 * @utbot.executesCondition {@code (x == -1.0): False}
 * @utbot.executesCondition {@code (x == 1.0): False}
 * @utbot.executesCondition {@code (x == 0): True}
 * @utbot.returnsFrom {@code return Math.PI / 2.0;}
 *  */
    @Test
    public void testAcos_XEqualsZero() {
        double actual = FastMath.acos(-0.0);
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.atan
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method atan(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atan(double)}
     */
    @Test
    public void testAtanWithCornerCase() {
        double actual = FastMath.atan(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.atan
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method atan(double, double, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atan(double,double,boolean)}
     */
    @Test
    public void testAtan() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class booleanType = boolean.class;
        Method atanMethod = fastMathClazz.getDeclaredMethod("atan", doubleType, doubleType, booleanType);
        atanMethod.setAccessible(true);
        java.lang.Object[] atanMethodArguments = new java.lang.Object[3];
        atanMethodArguments[0] = 0.11111096687371365;
        atanMethodArguments[1] = 1.073741824E9;
        atanMethodArguments[2] = false;
        double actual = ((Double) atanMethod.invoke(null, atanMethodArguments));
        
        org.junit.Assert.assertEquals(4362552.780510705, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.cbrt
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cbrt(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#cbrt(double)}
     */
    @Test
    public void testCbrt() {
        double actual = FastMath.cbrt(-0.0875862700108075);
        
        org.junit.Assert.assertEquals(-0.44409785673294594, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.sinh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sinh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#sinh(double)}
     */
    @Test
    public void testSinh() {
        double actual = FastMath.sinh(-1.0);
        
        org.junit.Assert.assertEquals(-1.1752011936438014, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.cosh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cosh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#cosh(double)}
     */
    @Test
    public void testCosh() {
        double actual = FastMath.cosh(-0.5);
        
        org.junit.Assert.assertEquals(1.1276259652063807, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.tanh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method tanh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#tanh(double)}
     */
    @Test
    public void testTanh() {
        double actual = FastMath.tanh(-1.0);
        
        org.junit.Assert.assertEquals(-0.7615941559557649, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.expm1
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method expm1(double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#expm1(double,double[])}
     */
    @Test
    public void testExpm1ReturnsZeroWithCornerCaseAndNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, 0.49999999999999994, 1024.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expm1Method = fastMathClazz.getDeclaredMethod("expm1", doubleType, doubleArrayType);
        expm1Method.setAccessible(true);
        java.lang.Object[] expm1MethodArguments = new java.lang.Object[2];
        expm1MethodArguments[0] = 0.0;
        expm1MethodArguments[1] = ((Object) doubleArray);
        double actual = ((Double) expm1Method.invoke(null, expm1MethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.expm1
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method expm1(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#expm1(double)}
     */
    @Test
    public void testExpm1() {
        double actual = FastMath.expm1(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-1.1125369292536007E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.log1p
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method log1p(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#log1p(double)}
     */
    @Test
    public void testLog1pReturnsInfinity() {
        double actual = FastMath.log1p(-1.0);
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.toRadians
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toRadians(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#toRadians(double)}
     */
    @Test
    public void testToRadians() {
        double actual = FastMath.toRadians(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-1.94174324655023E-310, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.toDegrees
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toDegrees(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#toDegrees(double)}
     */
    @Test
    public void testToDegrees() {
        double actual = FastMath.toDegrees(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-6.374367059867597E-307, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.round
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method round(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#round(double)}
     */
    @Test
    public void testRoundWithCornerCase() {
        long actual = FastMath.round(java.lang.Double.NEGATIVE_INFINITY);
        
        assertEquals(java.lang.Long.MIN_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.round
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method round(float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#round(float)}
     */
    @Test
    public void testRoundReturnsZero() {
        int actual = FastMath.round(-5.877472E-39f);
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.random
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method random()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#random()}
     */
    @Test
    public void testRandom() {
        double actual = FastMath.random();
        
        org.junit.Assert.assertEquals(0.3026220288401845, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.ulp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method ulp(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#ulp(double)}
     */
    @Test
    public void testUlp() {
        double actual = FastMath.ulp(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(4.9E-324, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.nextAfter
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nextAfter(double, double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#nextAfter(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(d) || Double.isInfinite(d)): True}
 * @utbot.executesCondition {@code (d == 0): False}
 * @utbot.returnsFrom {@code return d;}
 *  */
    @Test
    public void testNextAfter_DNotEqualsZero() {
        double actual = FastMath.nextAfter(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#nextAfter(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(d) || Double.isInfinite(d)): False}
 * @utbot.returnsFrom {@code return d;}
 *  */
    @Test
    public void testNextAfter_DoubleIsNaNOrDoubleIsInfinite() {
        double actual = FastMath.nextAfter(java.lang.Double.NaN, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#nextAfter(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(d) || Double.isInfinite(d)): True}
 * @utbot.executesCondition {@code (d == 0): True}
 * @utbot.executesCondition {@code (d == 0): True}
 * @utbot.executesCondition {@code ((direction < 0)): True}
 * @utbot.returnsFrom {@code return (direction < 0) ? -Double.MIN_VALUE : Double.MIN_VALUE;}
 *  */
    @Test
    public void testNextAfter_DirectionLessThanZero() {
        double actual = FastMath.nextAfter(-0.0, -2.225073858523391E-308);
        
        org.junit.Assert.assertEquals(-4.9E-324, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#nextAfter(double,double)}
 * @utbot.executesCondition {@code (Double.isNaN(d) || Double.isInfinite(d)): True}
 * @utbot.executesCondition {@code (d == 0): True}
 * @utbot.executesCondition {@code (d == 0): True}
 * @utbot.executesCondition {@code ((direction < 0)): False}
 * @utbot.returnsFrom {@code return (direction < 0) ? -Double.MIN_VALUE : Double.MIN_VALUE;}
 *  */
    @Test
    public void testNextAfter_DirectionGreaterOrEqualZero() {
        double actual = FastMath.nextAfter(-0.0, -0.0);
        
        org.junit.Assert.assertEquals(4.9E-324, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.nextUp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextUp(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#nextUp(double)}
     */
    @Test
    public void testNextUpReturnsInfinityWithCornerCase() {
        double actual = FastMath.nextUp(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.acosh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method acosh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#acosh(double)}
     */
    @Test
    public void testAcoshReturnsNanWithCornerCase() {
        double actual = FastMath.acosh(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.asinh
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asinh(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asinh(double)}
 * @utbot.executesCondition {@code (a < 0): True}
 * @utbot.executesCondition {@code (a > 0.097): False}
 * @utbot.executesCondition {@code (a > 0.036): False}
 * @utbot.executesCondition {@code (a > 0.0036): False}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.returnsFrom {@code return negative ? -absAsinh : absAsinh;}
 *  */
    @Test
    public void testAsinh_Negative() {
        double actual = FastMath.asinh(-4.9E-324);
        
        org.junit.Assert.assertEquals(-4.9E-324, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asinh(double)}
 * @utbot.executesCondition {@code (a < 0): True}
 * @utbot.executesCondition {@code (a > 0.097): False}
 * @utbot.executesCondition {@code (a > 0.036): False}
 * @utbot.executesCondition {@code (a > 0.0036): True}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.returnsFrom {@code return negative ? -absAsinh : absAsinh;}
 *  */
    @Test
    public void testAsinh_AGreaterThan0d() {
        double actual = FastMath.asinh(-0.036);
        
        org.junit.Assert.assertEquals(-0.035992228531467885, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asinh(double)}
 * @utbot.executesCondition {@code (a < 0): False}
 * @utbot.executesCondition {@code (a > 0.097): False}
 * @utbot.executesCondition {@code (a > 0.036): False}
 * @utbot.executesCondition {@code (a > 0.0036): False}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.returnsFrom {@code return negative ? -absAsinh : absAsinh;}
 *  */
    @Test
    public void testAsinh_NotNegative() {
        double actual = FastMath.asinh(0.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asinh(double)}
 * @utbot.executesCondition {@code (a < 0): False}
 * @utbot.executesCondition {@code (a > 0.097): True}
 * @utbot.executesCondition {@code (negative): False}
 * @utbot.returnsFrom {@code return negative ? -absAsinh : absAsinh;}
 *  */
    @Test
    public void testAsinh_AGreaterThan0d_1() {
        double actual = FastMath.asinh(0.109375);
        
        org.junit.Assert.assertEquals(0.10915809213636973, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asinh(double)}
 * @utbot.executesCondition {@code (a < 0): True}
 * @utbot.executesCondition {@code (a > 0.097): False}
 * @utbot.executesCondition {@code (a > 0.036): True}
 * @utbot.executesCondition {@code (negative): True}
 * @utbot.returnsFrom {@code return negative ? -absAsinh : absAsinh;}
 *  */
    @Test
    public void testAsinh_AGreaterThan0d_2() {
        double actual = FastMath.asinh(-0.0390625);
        
        org.junit.Assert.assertEquals(-0.039052572707558686, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asinh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#asinh(double)}
     */
    @Test
    public void testAsinh() {
        double actual = FastMath.asinh(-8.0);
        
        org.junit.Assert.assertEquals(-2.7764722807237177, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.atanh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method atanh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#atanh(double)}
     */
    @Test
    public void testAtanh() {
        double actual = FastMath.atanh(-0.06666666666666667);
        
        org.junit.Assert.assertEquals(-0.06676569631226131, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.quadMult
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method quadMult([D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#quadMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: split(b[0], ys);
 *  */
    @Test
    public void testQuadMult_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double[] doubleArray = {-8.900295434028806E-10, 0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.quadMult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.quadMult(FastMath.java:1060) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method quadMultMethod = fastMathClazz.getDeclaredMethod("quadMult", doubleArrayType, doubleArrayType, doubleArrayType);
        quadMultMethod.setAccessible(true);
        java.lang.Object[] quadMultMethodArguments = new java.lang.Object[3];
        quadMultMethodArguments[0] = ((Object) doubleArray);
        quadMultMethodArguments[1] = ((Object) doubleArray1);
        quadMultMethodArguments[2] = ((Object) null);
        try {
            quadMultMethod.invoke(null, quadMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#quadMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: split(b[0], ys);
 *  */
    @Test
    public void testQuadMult_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        double[] doubleArray = {-8.0E298, 0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.quadMult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.quadMult(FastMath.java:1060) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method quadMultMethod = fastMathClazz.getDeclaredMethod("quadMult", doubleArrayType, doubleArrayType, doubleArrayType);
        quadMultMethod.setAccessible(true);
        java.lang.Object[] quadMultMethodArguments = new java.lang.Object[3];
        quadMultMethodArguments[0] = ((Object) doubleArray);
        quadMultMethodArguments[1] = ((Object) doubleArray1);
        quadMultMethodArguments[2] = ((Object) null);
        try {
            quadMultMethod.invoke(null, quadMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#quadMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: split(a[0], xs);
 *  */
    @Test
    public void testQuadMult_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.quadMult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.quadMult(FastMath.java:1059) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method quadMultMethod = fastMathClazz.getDeclaredMethod("quadMult", doubleArrayType, doubleArrayType, doubleArrayType);
        quadMultMethod.setAccessible(true);
        java.lang.Object[] quadMultMethodArguments = new java.lang.Object[3];
        quadMultMethodArguments[0] = ((Object) doubleArray);
        quadMultMethodArguments[1] = ((Object) null);
        quadMultMethodArguments[2] = ((Object) null);
        try {
            quadMultMethod.invoke(null, quadMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#quadMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: split(b[0], ys);
 *  */
    @Test
    public void testQuadMult_ThrowNullPointerException_1() throws Throwable  {
        double[] doubleArray = {-8.900295434028806E-10};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.quadMult] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.quadMult(FastMath.java:1060) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method quadMultMethod = fastMathClazz.getDeclaredMethod("quadMult", doubleArrayType, doubleArrayType, doubleArrayType);
        quadMultMethod.setAccessible(true);
        java.lang.Object[] quadMultMethodArguments = new java.lang.Object[3];
        quadMultMethodArguments[0] = ((Object) doubleArray);
        quadMultMethodArguments[1] = ((Object) null);
        quadMultMethodArguments[2] = ((Object) null);
        try {
            quadMultMethod.invoke(null, quadMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#quadMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: split(b[0], ys);
 *  */
    @Test
    public void testQuadMult_ThrowNullPointerException_2() throws Throwable  {
        double[] doubleArray = {8.0E298, 0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.quadMult] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.quadMult(FastMath.java:1060) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method quadMultMethod = fastMathClazz.getDeclaredMethod("quadMult", doubleArrayType, doubleArrayType, doubleArrayType);
        quadMultMethod.setAccessible(true);
        java.lang.Object[] quadMultMethodArguments = new java.lang.Object[3];
        quadMultMethodArguments[0] = ((Object) doubleArray);
        quadMultMethodArguments[1] = ((Object) null);
        quadMultMethodArguments[2] = ((Object) null);
        try {
            quadMultMethod.invoke(null, quadMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#quadMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: split(a[0], xs);
 *  */
    @Test
    public void testQuadMult_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.util.FastMath.quadMult] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.quadMult(FastMath.java:1059) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method quadMultMethod = fastMathClazz.getDeclaredMethod("quadMult", doubleArrayType, doubleArrayType, doubleArrayType);
        quadMultMethod.setAccessible(true);
        java.lang.Object[] quadMultMethodArguments = new java.lang.Object[3];
        quadMultMethodArguments[0] = ((Object) null);
        quadMultMethodArguments[1] = ((Object) null);
        quadMultMethodArguments[2] = ((Object) null);
        try {
            quadMultMethod.invoke(null, quadMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method quadMult([D, [D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#quadMult(double[],double[],double[])}
     */
    @Test
    public void testQuadMultWithNonEmptyPrimitiveArrays() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        double[] doubleArray2 = {java.lang.Double.NaN, 1.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method quadMultMethod = fastMathClazz.getDeclaredMethod("quadMult", doubleArrayType, doubleArrayType, doubleArrayType);
        quadMultMethod.setAccessible(true);
        java.lang.Object[] quadMultMethodArguments = new java.lang.Object[3];
        quadMultMethodArguments[0] = ((Object) doubleArray);
        quadMultMethodArguments[1] = ((Object) doubleArray1);
        quadMultMethodArguments[2] = ((Object) doubleArray2);
        quadMultMethod.invoke(null, quadMultMethodArguments);
        
        double finalDoubleArray21 = doubleArray2[1];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray21, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.slowexp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method slowexp(double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#slowexp(double,double[])}
     */
    @Test
    public void testSlowexpReturnsNanWithCornerCaseAndNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {1.0, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method slowexpMethod = fastMathClazz.getDeclaredMethod("slowexp", doubleType, doubleArrayType);
        slowexpMethod.setAccessible(true);
        java.lang.Object[] slowexpMethodArguments = new java.lang.Object[2];
        slowexpMethodArguments[0] = java.lang.Double.NaN;
        slowexpMethodArguments[1] = ((Object) doubleArray);
        double actual = ((Double) slowexpMethod.invoke(null, slowexpMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray1, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.resplit
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resplit([D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#resplit(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double c = a[0] + a[1];
 *  */
    @Test
    public void testResplit_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.resplit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.resplit(FastMath.java:961) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method resplitMethod = fastMathClazz.getDeclaredMethod("resplit", doubleArrayType);
        resplitMethod.setAccessible(true);
        java.lang.Object[] resplitMethodArguments = new java.lang.Object[1];
        resplitMethodArguments[0] = ((Object) doubleArray);
        try {
            resplitMethod.invoke(null, resplitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#resplit(double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: final double c = a[0] + a[1];
 *  */
    @Test
    public void testResplit_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.resplit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.resplit(FastMath.java:961) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method resplitMethod = fastMathClazz.getDeclaredMethod("resplit", doubleArrayType);
        resplitMethod.setAccessible(true);
        java.lang.Object[] resplitMethodArguments = new java.lang.Object[1];
        resplitMethodArguments[0] = ((Object) doubleArray);
        try {
            resplitMethod.invoke(null, resplitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#resplit(double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final double c = a[0] + a[1];
 *  */
    @Test
    public void testResplit_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.util.FastMath.resplit] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.resplit(FastMath.java:961) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method resplitMethod = fastMathClazz.getDeclaredMethod("resplit", doubleArrayType);
        resplitMethod.setAccessible(true);
        java.lang.Object[] resplitMethodArguments = new java.lang.Object[1];
        resplitMethodArguments[0] = ((Object) null);
        try {
            resplitMethod.invoke(null, resplitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method resplit([D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#resplit(double[])}
     */
    @Test
    public void testResplitWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {-8.0E298, -1.0, 9.313225746154785E-10};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method resplitMethod = fastMathClazz.getDeclaredMethod("resplit", doubleArrayType);
        resplitMethod.setAccessible(true);
        java.lang.Object[] resplitMethodArguments = new java.lang.Object[1];
        resplitMethodArguments[0] = ((Object) doubleArray);
        resplitMethod.invoke(null, resplitMethodArguments);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        
        org.junit.Assert.assertEquals(-7.999999560879315E298, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(-4.3912068423819426E291, finalDoubleArray1, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.splitAdd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method splitAdd([D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitAdd(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[0] = a[0] + b[0];
 *  */
    @Test
    public void testSplitAdd_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.splitAdd(FastMath.java:994) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitAddMethod = fastMathClazz.getDeclaredMethod("splitAdd", doubleArrayType, doubleArrayType, doubleArrayType);
        splitAddMethod.setAccessible(true);
        java.lang.Object[] splitAddMethodArguments = new java.lang.Object[3];
        splitAddMethodArguments[0] = ((Object) doubleArray);
        splitAddMethodArguments[1] = ((Object) doubleArray);
        splitAddMethodArguments[2] = ((Object) doubleArray1);
        try {
            splitAddMethod.invoke(null, splitAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitAdd(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[1] = a[1] + b[1];
 *  */
    @Test
    public void testSplitAdd_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.splitAdd(FastMath.java:995) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitAddMethod = fastMathClazz.getDeclaredMethod("splitAdd", doubleArrayType, doubleArrayType, doubleArrayType);
        splitAddMethod.setAccessible(true);
        java.lang.Object[] splitAddMethodArguments = new java.lang.Object[3];
        splitAddMethodArguments[0] = ((Object) doubleArray);
        splitAddMethodArguments[1] = ((Object) doubleArray1);
        splitAddMethodArguments[2] = ((Object) doubleArray1);
        try {
            splitAddMethod.invoke(null, splitAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitAdd(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[1] = a[1] + b[1];
 *  */
    @Test
    public void testSplitAdd_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.splitAdd(FastMath.java:995) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitAddMethod = fastMathClazz.getDeclaredMethod("splitAdd", doubleArrayType, doubleArrayType, doubleArrayType);
        splitAddMethod.setAccessible(true);
        java.lang.Object[] splitAddMethodArguments = new java.lang.Object[3];
        splitAddMethodArguments[0] = ((Object) doubleArray);
        splitAddMethodArguments[1] = ((Object) doubleArray);
        splitAddMethodArguments[2] = ((Object) doubleArray1);
        try {
            splitAddMethod.invoke(null, splitAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitAdd(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[1] = a[1] + b[1];
 *  */
    @Test
    public void testSplitAdd_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.splitAdd(FastMath.java:995) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitAddMethod = fastMathClazz.getDeclaredMethod("splitAdd", doubleArrayType, doubleArrayType, doubleArrayType);
        splitAddMethod.setAccessible(true);
        java.lang.Object[] splitAddMethodArguments = new java.lang.Object[3];
        splitAddMethodArguments[0] = ((Object) doubleArray);
        splitAddMethodArguments[1] = ((Object) doubleArray);
        splitAddMethodArguments[2] = ((Object) doubleArray);
        try {
            splitAddMethod.invoke(null, splitAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitAdd(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[0] = a[0] + b[0];
 *  */
    @Test
    public void testSplitAdd_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.splitAdd(FastMath.java:994) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitAddMethod = fastMathClazz.getDeclaredMethod("splitAdd", doubleArrayType, doubleArrayType, doubleArrayType);
        splitAddMethod.setAccessible(true);
        java.lang.Object[] splitAddMethodArguments = new java.lang.Object[3];
        splitAddMethodArguments[0] = ((Object) doubleArray);
        splitAddMethodArguments[1] = ((Object) doubleArray1);
        splitAddMethodArguments[2] = ((Object) null);
        try {
            splitAddMethod.invoke(null, splitAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitAdd(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[0] = a[0] + b[0];
 *  */
    @Test
    public void testSplitAdd_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitAdd] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.splitAdd(FastMath.java:994) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitAddMethod = fastMathClazz.getDeclaredMethod("splitAdd", doubleArrayType, doubleArrayType, doubleArrayType);
        splitAddMethod.setAccessible(true);
        java.lang.Object[] splitAddMethodArguments = new java.lang.Object[3];
        splitAddMethodArguments[0] = ((Object) doubleArray);
        splitAddMethodArguments[1] = ((Object) null);
        splitAddMethodArguments[2] = ((Object) null);
        try {
            splitAddMethod.invoke(null, splitAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitAdd(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ans[0] = a[0] + b[0];
 *  */
    @Test
    public void testSplitAdd_ThrowNullPointerException_2() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitAdd] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.splitAdd(FastMath.java:994) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitAddMethod = fastMathClazz.getDeclaredMethod("splitAdd", doubleArrayType, doubleArrayType, doubleArrayType);
        splitAddMethod.setAccessible(true);
        java.lang.Object[] splitAddMethodArguments = new java.lang.Object[3];
        splitAddMethodArguments[0] = ((Object) doubleArray);
        splitAddMethodArguments[1] = ((Object) doubleArray);
        splitAddMethodArguments[2] = ((Object) null);
        try {
            splitAddMethod.invoke(null, splitAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitAdd(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ans[0] = a[0] + b[0];
 *  */
    @Test
    public void testSplitAdd_ThrowNullPointerException_1() throws Throwable  {
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitAdd] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.splitAdd(FastMath.java:994) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitAddMethod = fastMathClazz.getDeclaredMethod("splitAdd", doubleArrayType, doubleArrayType, doubleArrayType);
        splitAddMethod.setAccessible(true);
        java.lang.Object[] splitAddMethodArguments = new java.lang.Object[3];
        splitAddMethodArguments[0] = ((Object) doubleArray);
        splitAddMethodArguments[1] = ((Object) null);
        splitAddMethodArguments[2] = ((Object) null);
        try {
            splitAddMethod.invoke(null, splitAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitAdd(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ans[0] = a[0] + b[0];
 *  */
    @Test
    public void testSplitAdd_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitAdd] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.splitAdd(FastMath.java:994) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitAddMethod = fastMathClazz.getDeclaredMethod("splitAdd", doubleArrayType, doubleArrayType, doubleArrayType);
        splitAddMethod.setAccessible(true);
        java.lang.Object[] splitAddMethodArguments = new java.lang.Object[3];
        splitAddMethodArguments[0] = ((Object) null);
        splitAddMethodArguments[1] = ((Object) null);
        splitAddMethodArguments[2] = ((Object) null);
        try {
            splitAddMethod.invoke(null, splitAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method splitAdd([D, [D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitAdd(double[],double[],double[])}
     */
    @Test
    public void testSplitAddWithNonEmptyPrimitiveArrays() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        double[] doubleArray2 = {java.lang.Double.NaN, 1.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitAddMethod = fastMathClazz.getDeclaredMethod("splitAdd", doubleArrayType, doubleArrayType, doubleArrayType);
        splitAddMethod.setAccessible(true);
        java.lang.Object[] splitAddMethodArguments = new java.lang.Object[3];
        splitAddMethodArguments[0] = ((Object) doubleArray);
        splitAddMethodArguments[1] = ((Object) doubleArray1);
        splitAddMethodArguments[2] = ((Object) doubleArray2);
        splitAddMethod.invoke(null, splitAddMethodArguments);
        
        double finalDoubleArray21 = doubleArray2[1];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray21, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.expint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expint(int, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#expint(int,double[])}
 * @utbot.executesCondition {@code (result != null): True}
 * @utbot.invokes org.apache.commons.math.util.FastMath#resplit(double[])
 * @utbot.returnsFrom {@code return ys[0] + ys[1];}
 *  */
    @Test
    public void testExpint_ResultNotEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, 0.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class intType = int.class;
        Class doubleArrayType = Class.forName("[D");
        Method expintMethod = fastMathClazz.getDeclaredMethod("expint", intType, doubleArrayType);
        expintMethod.setAccessible(true);
        java.lang.Object[] expintMethodArguments = new java.lang.Object[2];
        expintMethodArguments[0] = 0;
        expintMethodArguments[1] = ((Object) doubleArray);
        double actual = ((Double) expintMethod.invoke(null, expintMethodArguments));
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        
        org.junit.Assert.assertEquals(1.0, finalDoubleArray0, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#expint(int,double[])}
 * @utbot.executesCondition {@code (result != null): False}
 * @utbot.returnsFrom {@code return ys[0] + ys[1];}
 *  */
    @Test
    public void testExpint_ResultEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class intType = int.class;
        Class doubleArrayType = Class.forName("[D");
        Method expintMethod = fastMathClazz.getDeclaredMethod("expint", intType, doubleArrayType);
        expintMethod.setAccessible(true);
        java.lang.Object[] expintMethodArguments = new java.lang.Object[2];
        expintMethodArguments[0] = 0;
        expintMethodArguments[1] = ((Object) null);
        double actual = ((Double) expintMethod.invoke(null, expintMethodArguments));
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method expint(int, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#expint(int,double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[0] = ys[0];
 *  */
    @Test
    public void testExpint_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.expint] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.expint(FastMath.java:1138) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class intType = int.class;
        Class doubleArrayType = Class.forName("[D");
        Method expintMethod = fastMathClazz.getDeclaredMethod("expint", intType, doubleArrayType);
        expintMethod.setAccessible(true);
        java.lang.Object[] expintMethodArguments = new java.lang.Object[2];
        expintMethodArguments[0] = 0;
        expintMethodArguments[1] = ((Object) doubleArray);
        try {
            expintMethod.invoke(null, expintMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#expint(int,double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[1] = ys[1];
 *  */
    @Test
    public void testExpint_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.expint] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.expint(FastMath.java:1139) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class intType = int.class;
        Class doubleArrayType = Class.forName("[D");
        Method expintMethod = fastMathClazz.getDeclaredMethod("expint", intType, doubleArrayType);
        expintMethod.setAccessible(true);
        java.lang.Object[] expintMethodArguments = new java.lang.Object[2];
        expintMethodArguments[0] = 0;
        expintMethodArguments[1] = ((Object) doubleArray);
        try {
            expintMethod.invoke(null, expintMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method expint(int, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#expint(int,double[])}
     */
    @Test
    public void testExpintWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, 1.0, -1.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class intType = int.class;
        Class doubleArrayType = Class.forName("[D");
        Method expintMethod = fastMathClazz.getDeclaredMethod("expint", intType, doubleArrayType);
        expintMethod.setAccessible(true);
        java.lang.Object[] expintMethodArguments = new java.lang.Object[2];
        expintMethodArguments[0] = 2;
        expintMethodArguments[1] = ((Object) doubleArray);
        double actual = ((Double) expintMethod.invoke(null, expintMethodArguments));
        
        org.junit.Assert.assertEquals(7.38905609893065, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        
        org.junit.Assert.assertEquals(7.389056205749512, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(-1.0681886149151956E-7, finalDoubleArray1, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.splitMult
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method splitMult([D, [D, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[0] = a[0] * b[0];
 *  */
    @Test
    public void testSplitMult_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitMult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.splitMult(FastMath.java:981) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitMultMethod = fastMathClazz.getDeclaredMethod("splitMult", doubleArrayType, doubleArrayType, doubleArrayType);
        splitMultMethod.setAccessible(true);
        java.lang.Object[] splitMultMethodArguments = new java.lang.Object[3];
        splitMultMethodArguments[0] = ((Object) doubleArray);
        splitMultMethodArguments[1] = ((Object) doubleArray);
        splitMultMethodArguments[2] = ((Object) doubleArray1);
        try {
            splitMultMethod.invoke(null, splitMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[1] = a[0] * b[1] + a[1] * b[0] + a[1] * b[1];
 *  */
    @Test
    public void testSplitMult_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitMult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.splitMult(FastMath.java:982) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitMultMethod = fastMathClazz.getDeclaredMethod("splitMult", doubleArrayType, doubleArrayType, doubleArrayType);
        splitMultMethod.setAccessible(true);
        java.lang.Object[] splitMultMethodArguments = new java.lang.Object[3];
        splitMultMethodArguments[0] = ((Object) doubleArray);
        splitMultMethodArguments[1] = ((Object) doubleArray);
        splitMultMethodArguments[2] = ((Object) doubleArray);
        try {
            splitMultMethod.invoke(null, splitMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[1] = a[0] * b[1] + a[1] * b[0] + a[1] * b[1];
 *  */
    @Test
    public void testSplitMult_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        double[] doubleArray = {0.0};
        double[] doubleArray1 = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitMult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.splitMult(FastMath.java:982) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitMultMethod = fastMathClazz.getDeclaredMethod("splitMult", doubleArrayType, doubleArrayType, doubleArrayType);
        splitMultMethod.setAccessible(true);
        java.lang.Object[] splitMultMethodArguments = new java.lang.Object[3];
        splitMultMethodArguments[0] = ((Object) doubleArray);
        splitMultMethodArguments[1] = ((Object) doubleArray1);
        splitMultMethodArguments[2] = ((Object) doubleArray);
        try {
            splitMultMethod.invoke(null, splitMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[1] = a[0] * b[1] + a[1] * b[0] + a[1] * b[1];
 *  */
    @Test
    public void testSplitMult_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitMult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.splitMult(FastMath.java:982) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitMultMethod = fastMathClazz.getDeclaredMethod("splitMult", doubleArrayType, doubleArrayType, doubleArrayType);
        splitMultMethod.setAccessible(true);
        java.lang.Object[] splitMultMethodArguments = new java.lang.Object[3];
        splitMultMethodArguments[0] = ((Object) doubleArray);
        splitMultMethodArguments[1] = ((Object) doubleArray);
        splitMultMethodArguments[2] = ((Object) doubleArray1);
        try {
            splitMultMethod.invoke(null, splitMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[0] = a[0] * b[0];
 *  */
    @Test
    public void testSplitMult_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double[] doubleArray = {0.0, 0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitMult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.splitMult(FastMath.java:981) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitMultMethod = fastMathClazz.getDeclaredMethod("splitMult", doubleArrayType, doubleArrayType, doubleArrayType);
        splitMultMethod.setAccessible(true);
        java.lang.Object[] splitMultMethodArguments = new java.lang.Object[3];
        splitMultMethodArguments[0] = ((Object) doubleArray);
        splitMultMethodArguments[1] = ((Object) doubleArray1);
        splitMultMethodArguments[2] = ((Object) null);
        try {
            splitMultMethod.invoke(null, splitMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ans[0] = a[0] * b[0];
 *  */
    @Test
    public void testSplitMult_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitMult] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.splitMult(FastMath.java:981) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitMultMethod = fastMathClazz.getDeclaredMethod("splitMult", doubleArrayType, doubleArrayType, doubleArrayType);
        splitMultMethod.setAccessible(true);
        java.lang.Object[] splitMultMethodArguments = new java.lang.Object[3];
        splitMultMethodArguments[0] = ((Object) doubleArray);
        splitMultMethodArguments[1] = ((Object) null);
        splitMultMethodArguments[2] = ((Object) null);
        try {
            splitMultMethod.invoke(null, splitMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ans[0] = a[0] * b[0];
 *  */
    @Test
    public void testSplitMult_ThrowNullPointerException_2() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitMult] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.splitMult(FastMath.java:981) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitMultMethod = fastMathClazz.getDeclaredMethod("splitMult", doubleArrayType, doubleArrayType, doubleArrayType);
        splitMultMethod.setAccessible(true);
        java.lang.Object[] splitMultMethodArguments = new java.lang.Object[3];
        splitMultMethodArguments[0] = ((Object) doubleArray);
        splitMultMethodArguments[1] = ((Object) doubleArray);
        splitMultMethodArguments[2] = ((Object) null);
        try {
            splitMultMethod.invoke(null, splitMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ans[0] = a[0] * b[0];
 *  */
    @Test
    public void testSplitMult_ThrowNullPointerException_1() throws Throwable  {
        double[] doubleArray = {0.0, 0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitMult] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.splitMult(FastMath.java:981) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitMultMethod = fastMathClazz.getDeclaredMethod("splitMult", doubleArrayType, doubleArrayType, doubleArrayType);
        splitMultMethod.setAccessible(true);
        java.lang.Object[] splitMultMethodArguments = new java.lang.Object[3];
        splitMultMethodArguments[0] = ((Object) doubleArray);
        splitMultMethodArguments[1] = ((Object) null);
        splitMultMethodArguments[2] = ((Object) null);
        try {
            splitMultMethod.invoke(null, splitMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitMult(double[],double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ans[0] = a[0] * b[0];
 *  */
    @Test
    public void testSplitMult_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitMult] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.splitMult(FastMath.java:981) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitMultMethod = fastMathClazz.getDeclaredMethod("splitMult", doubleArrayType, doubleArrayType, doubleArrayType);
        splitMultMethod.setAccessible(true);
        java.lang.Object[] splitMultMethodArguments = new java.lang.Object[3];
        splitMultMethodArguments[0] = ((Object) null);
        splitMultMethodArguments[1] = ((Object) null);
        splitMultMethodArguments[2] = ((Object) null);
        try {
            splitMultMethod.invoke(null, splitMultMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method splitMult([D, [D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitMult(double[],double[],double[])}
     */
    @Test
    public void testSplitMultWithNonEmptyPrimitiveArrays() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.0, java.lang.Double.NEGATIVE_INFINITY, -1.0};
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY};
        double[] doubleArray2 = {java.lang.Double.NaN, 1.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitMultMethod = fastMathClazz.getDeclaredMethod("splitMult", doubleArrayType, doubleArrayType, doubleArrayType);
        splitMultMethod.setAccessible(true);
        java.lang.Object[] splitMultMethodArguments = new java.lang.Object[3];
        splitMultMethodArguments[0] = ((Object) doubleArray);
        splitMultMethodArguments[1] = ((Object) doubleArray1);
        splitMultMethodArguments[2] = ((Object) doubleArray2);
        splitMultMethod.invoke(null, splitMultMethodArguments);
        
        double finalDoubleArray21 = doubleArray2[1];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray21, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.splitReciprocal
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method splitReciprocal([D, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitReciprocal(double[],double[])}
 * @utbot.executesCondition {@code (in[0] == 0.0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[0] = a / in[0];
 *  */
    @Test
    public void testSplitReciprocal_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        double[] doubleArray = {2.225073858507202E-308};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitReciprocal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.splitReciprocal(FastMath.java:1027) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitReciprocalMethod = fastMathClazz.getDeclaredMethod("splitReciprocal", doubleArrayType, doubleArrayType);
        splitReciprocalMethod.setAccessible(true);
        java.lang.Object[] splitReciprocalMethodArguments = new java.lang.Object[2];
        splitReciprocalMethodArguments[0] = ((Object) doubleArray);
        splitReciprocalMethodArguments[1] = ((Object) doubleArray1);
        try {
            splitReciprocalMethod.invoke(null, splitReciprocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitReciprocal(double[],double[])}
 * @utbot.executesCondition {@code (in[0] == 0.0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[1] = (b * in[0] - a * in[1]) / (in[0] * in[0] + in[0] * in[1]);
 *  */
    @Test
    public void testSplitReciprocal_ThrowArrayIndexOutOfBoundsException_3() throws Throwable  {
        double[] doubleArray = {java.lang.Double.NaN};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitReciprocal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.splitReciprocal(FastMath.java:1028) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitReciprocalMethod = fastMathClazz.getDeclaredMethod("splitReciprocal", doubleArrayType, doubleArrayType);
        splitReciprocalMethod.setAccessible(true);
        java.lang.Object[] splitReciprocalMethodArguments = new java.lang.Object[2];
        splitReciprocalMethodArguments[0] = ((Object) doubleArray);
        splitReciprocalMethodArguments[1] = ((Object) doubleArray1);
        try {
            splitReciprocalMethod.invoke(null, splitReciprocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitReciprocal(double[],double[])}
 * @utbot.executesCondition {@code (in[0] == 0.0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[0] = a / in[0];
 *  */
    @Test
    public void testSplitReciprocal_ThrowArrayIndexOutOfBoundsException_4() throws Throwable  {
        double[] doubleArray = {-0.0, 0.0};
        double[] doubleArray1 = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitReciprocal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.splitReciprocal(FastMath.java:1027) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitReciprocalMethod = fastMathClazz.getDeclaredMethod("splitReciprocal", doubleArrayType, doubleArrayType);
        splitReciprocalMethod.setAccessible(true);
        java.lang.Object[] splitReciprocalMethodArguments = new java.lang.Object[2];
        splitReciprocalMethodArguments[0] = ((Object) doubleArray);
        splitReciprocalMethodArguments[1] = ((Object) doubleArray1);
        try {
            splitReciprocalMethod.invoke(null, splitReciprocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitReciprocal(double[],double[])}
 * @utbot.executesCondition {@code (in[0] == 0.0): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: result[1] = (b * in[0] - a * in[1]) / (in[0] * in[0] + in[0] * in[1]);
 *  */
    @Test
    public void testSplitReciprocal_ThrowArrayIndexOutOfBoundsException_5() throws Throwable  {
        double[] doubleArray = {2.225073858507202E-308, 0.0};
        double[] doubleArray1 = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitReciprocal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.splitReciprocal(FastMath.java:1028) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitReciprocalMethod = fastMathClazz.getDeclaredMethod("splitReciprocal", doubleArrayType, doubleArrayType);
        splitReciprocalMethod.setAccessible(true);
        java.lang.Object[] splitReciprocalMethodArguments = new java.lang.Object[2];
        splitReciprocalMethodArguments[0] = ((Object) doubleArray);
        splitReciprocalMethodArguments[1] = ((Object) doubleArray1);
        try {
            splitReciprocalMethod.invoke(null, splitReciprocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitReciprocal(double[],double[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: in[0] == 0.0
 *  */
    @Test
    public void testSplitReciprocal_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        double[] doubleArray = {};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitReciprocal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            org.apache.commons.math.util.FastMath.splitReciprocal(FastMath.java:1022) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitReciprocalMethod = fastMathClazz.getDeclaredMethod("splitReciprocal", doubleArrayType, doubleArrayType);
        splitReciprocalMethod.setAccessible(true);
        java.lang.Object[] splitReciprocalMethodArguments = new java.lang.Object[2];
        splitReciprocalMethodArguments[0] = ((Object) doubleArray);
        splitReciprocalMethodArguments[1] = ((Object) null);
        try {
            splitReciprocalMethod.invoke(null, splitReciprocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitReciprocal(double[],double[])}
 * @utbot.executesCondition {@code (in[0] == 0.0): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: in[0] = in[1];
 *  */
    @Test
    public void testSplitReciprocal_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        double[] doubleArray = {0.0};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitReciprocal] produces [java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1]
            org.apache.commons.math.util.FastMath.splitReciprocal(FastMath.java:1023) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitReciprocalMethod = fastMathClazz.getDeclaredMethod("splitReciprocal", doubleArrayType, doubleArrayType);
        splitReciprocalMethod.setAccessible(true);
        java.lang.Object[] splitReciprocalMethodArguments = new java.lang.Object[2];
        splitReciprocalMethodArguments[0] = ((Object) doubleArray);
        splitReciprocalMethodArguments[1] = ((Object) null);
        try {
            splitReciprocalMethod.invoke(null, splitReciprocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitReciprocal(double[],double[])}
 * @utbot.executesCondition {@code (in[0] == 0.0): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result[0] = a / in[0];
 *  */
    @Test
    public void testSplitReciprocal_ThrowNullPointerException_1() throws Throwable  {
        double[] doubleArray = {2.225073858507202E-308};
        
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitReciprocal] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.splitReciprocal(FastMath.java:1027) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitReciprocalMethod = fastMathClazz.getDeclaredMethod("splitReciprocal", doubleArrayType, doubleArrayType);
        splitReciprocalMethod.setAccessible(true);
        java.lang.Object[] splitReciprocalMethodArguments = new java.lang.Object[2];
        splitReciprocalMethodArguments[0] = ((Object) doubleArray);
        splitReciprocalMethodArguments[1] = ((Object) null);
        try {
            splitReciprocalMethod.invoke(null, splitReciprocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitReciprocal(double[],double[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: in[0] == 0.0
 *  */
    @Test
    public void testSplitReciprocal_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.util.FastMath.splitReciprocal] produces [java.lang.NullPointerException]
            org.apache.commons.math.util.FastMath.splitReciprocal(FastMath.java:1022) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitReciprocalMethod = fastMathClazz.getDeclaredMethod("splitReciprocal", doubleArrayType, doubleArrayType);
        splitReciprocalMethod.setAccessible(true);
        java.lang.Object[] splitReciprocalMethodArguments = new java.lang.Object[2];
        splitReciprocalMethodArguments[0] = ((Object) null);
        splitReciprocalMethodArguments[1] = ((Object) null);
        try {
            splitReciprocalMethod.invoke(null, splitReciprocalMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method splitReciprocal([D, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#splitReciprocal(double[],double[])}
     */
    @Test
    public void testSplitReciprocalWithNonEmptyPrimitiveArrays() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.9999997615814209, -1.0, 0.0};
        double[] doubleArray1 = {java.lang.Double.POSITIVE_INFINITY, 0.9999997615814209, 2.384185791015625E-7, java.lang.Double.POSITIVE_INFINITY};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleArrayType = Class.forName("[D");
        Method splitReciprocalMethod = fastMathClazz.getDeclaredMethod("splitReciprocal", doubleArrayType, doubleArrayType);
        splitReciprocalMethod.setAccessible(true);
        java.lang.Object[] splitReciprocalMethodArguments = new java.lang.Object[2];
        splitReciprocalMethodArguments[0] = ((Object) doubleArray);
        splitReciprocalMethodArguments[1] = ((Object) doubleArray1);
        splitReciprocalMethod.invoke(null, splitReciprocalMethodArguments);
        
        double finalDoubleArray10 = doubleArray1[0];
        double finalDoubleArray11 = doubleArray1[1];
        
        org.junit.Assert.assertEquals(-4194304.0, finalDoubleArray10, 1.0E-6);
        
        org.junit.Assert.assertEquals(0.0, finalDoubleArray11, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.slowCos
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method slowCos(double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#slowCos(double,double[])}
     */
    @Test
    public void testSlowCosReturnsNanWithCornerCaseAndNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {1.0, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method slowCosMethod = fastMathClazz.getDeclaredMethod("slowCos", doubleType, doubleArrayType);
        slowCosMethod.setAccessible(true);
        java.lang.Object[] slowCosMethodArguments = new java.lang.Object[2];
        slowCosMethodArguments[0] = java.lang.Double.NaN;
        slowCosMethodArguments[1] = ((Object) doubleArray);
        double actual = ((Double) slowCosMethod.invoke(null, slowCosMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray1, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.tanQ
    
    ///region FUZZER: ERROR SUITE for method tanQ(double, double, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#tanQ(double,double,boolean)}
     */
    @Test
    public void testTanQThrowsAIOOBEWithCornerCases() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.util.FastMath.tanQ] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 14]
            org.apache.commons.math.util.FastMath.tanQ(FastMath.java:2043) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class booleanType = boolean.class;
        Method tanQMethod = fastMathClazz.getDeclaredMethod("tanQ", doubleType, doubleType, booleanType);
        tanQMethod.setAccessible(true);
        java.lang.Object[] tanQMethodArguments = new java.lang.Object[3];
        tanQMethodArguments[0] = java.lang.Double.NEGATIVE_INFINITY;
        tanQMethodArguments[1] = java.lang.Double.NEGATIVE_INFINITY;
        tanQMethodArguments[2] = false;
        try {
            tanQMethod.invoke(null, tanQMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.slowSin
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method slowSin(double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#slowSin(double,double[])}
     */
    @Test
    public void testSlowSinReturnsNanWithCornerCaseAndNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {1.0, -1.0, java.lang.Double.NEGATIVE_INFINITY};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method slowSinMethod = fastMathClazz.getDeclaredMethod("slowSin", doubleType, doubleArrayType);
        slowSinMethod.setAccessible(true);
        java.lang.Object[] slowSinMethodArguments = new java.lang.Object[2];
        slowSinMethodArguments[0] = java.lang.Double.NaN;
        slowSinMethodArguments[1] = ((Object) doubleArray);
        double actual = ((Double) slowSinMethod.invoke(null, slowSinMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, finalDoubleArray1, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.cosQ
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cosQ(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#cosQ(double,double)}
     */
    @Test
    public void testCosQReturnsNanWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Method cosQMethod = fastMathClazz.getDeclaredMethod("cosQ", doubleType, doubleType);
        cosQMethod.setAccessible(true);
        java.lang.Object[] cosQMethodArguments = new java.lang.Object[2];
        cosQMethodArguments[0] = 1.0;
        cosQMethodArguments[1] = java.lang.Double.NEGATIVE_INFINITY;
        double actual = ((Double) cosQMethod.invoke(null, cosQMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.buildSinCosTables
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method buildSinCosTables()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#buildSinCosTables()}
     */
    @Test
    public void testBuildSinCosTables() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Method buildSinCosTablesMethod = fastMathClazz.getDeclaredMethod("buildSinCosTables");
        buildSinCosTablesMethod.setAccessible(true);
        java.lang.Object[] buildSinCosTablesMethodArguments = new java.lang.Object[0];
        buildSinCosTablesMethod.invoke(null, buildSinCosTablesMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.polyCosine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method polyCosine(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#polyCosine(double)}
 * @utbot.returnsFrom {@code return p;}
 *  */
    @Test
    public void testPolyCosine_ReturnP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Method polyCosineMethod = fastMathClazz.getDeclaredMethod("polyCosine", doubleType);
        polyCosineMethod.setAccessible(true);
        java.lang.Object[] polyCosineMethodArguments = new java.lang.Object[1];
        polyCosineMethodArguments[0] = java.lang.Double.NaN;
        double actual = ((Double) polyCosineMethod.invoke(null, polyCosineMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.slowLog
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method slowLog(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#slowLog(double)}
     */
    @Test
    public void testSlowLog() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Method slowLogMethod = fastMathClazz.getDeclaredMethod("slowLog", doubleType);
        slowLogMethod.setAccessible(true);
        java.lang.Object[] slowLogMethodArguments = new java.lang.Object[1];
        slowLogMethodArguments[0] = -1.0;
        double[] actual = ((double[]) slowLogMethod.invoke(null, slowLogMethodArguments));
        
        double[] expected = {java.lang.Double.NaN, java.lang.Double.NaN};
        
        assertArrayEquals(expected, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.sinQ
    
    ///region FUZZER: ERROR SUITE for method sinQ(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#sinQ(double,double)}
     */
    @Test
    public void testSinQThrowsAIOOBEWithCornerCases() throws Throwable  {
        /* This test fails because method [org.apache.commons.math.util.FastMath.sinQ] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 14]
            org.apache.commons.math.util.FastMath.sinQ(FastMath.java:1899) */
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Method sinQMethod = fastMathClazz.getDeclaredMethod("sinQ", doubleType, doubleType);
        sinQMethod.setAccessible(true);
        java.lang.Object[] sinQMethodArguments = new java.lang.Object[2];
        sinQMethodArguments[0] = java.lang.Double.NEGATIVE_INFINITY;
        sinQMethodArguments[1] = java.lang.Double.POSITIVE_INFINITY;
        try {
            sinQMethod.invoke(null, sinQMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.polySine
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method polySine(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#polySine(double)}
 * @utbot.returnsFrom {@code return p;}
 *  */
    @Test
    public void testPolySine_ReturnP() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Method polySineMethod = fastMathClazz.getDeclaredMethod("polySine", doubleType);
        polySineMethod.setAccessible(true);
        java.lang.Object[] polySineMethodArguments = new java.lang.Object[1];
        polySineMethodArguments[0] = java.lang.Double.NaN;
        double actual = ((Double) polySineMethod.invoke(null, polySineMethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.util.FastMath.reducePayneHanek
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reducePayneHanek(double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math.util.FastMath#reducePayneHanek(double,double[])}
     */
    @Test
    public void testReducePayneHanekWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {4.503599627370496E15, 4.503599627370496E15, 2.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method reducePayneHanekMethod = fastMathClazz.getDeclaredMethod("reducePayneHanek", doubleType, doubleArrayType);
        reducePayneHanekMethod.setAccessible(true);
        java.lang.Object[] reducePayneHanekMethodArguments = new java.lang.Object[2];
        reducePayneHanekMethodArguments[0] = 1.0;
        reducePayneHanekMethodArguments[1] = ((Object) doubleArray);
        reducePayneHanekMethod.invoke(null, reducePayneHanekMethodArguments);
        
        double finalDoubleArray0 = doubleArray[0];
        double finalDoubleArray1 = doubleArray[1];
        double finalDoubleArray2 = doubleArray[2];
        
        org.junit.Assert.assertEquals(0.0, finalDoubleArray0, 1.0E-6);
        
        org.junit.Assert.assertEquals(1.0, finalDoubleArray1, 1.0E-6);
        
        org.junit.Assert.assertEquals(-9.860761315262648E-32, finalDoubleArray2, 1.0E-6);
    }
    ///endregion
    
    ///endregion
}

