package org.apache.commons.math3.util;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math3_util_FastMathTest {
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.main
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method main([Ljava.lang.String;)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#main(java.lang.String[])}
     */
    @Test
    public void testMainWithNonEmptyObjectArray() {
        java.lang.String[] stringArray = {"TANGENT_TABLE_B", "SINE_TABLE_A", "\n\t\r"};
        
        FastMath.main(stringArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs(long)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#abs(long)}
 * @utbot.executesCondition {@code ((x < 0l)): True}
 * @utbot.returnsFrom {@code return (x < 0l) ? -x : x;}
 *  */
    @Test
    public void testAbs_XLessThanZero() {
        long actual = FastMath.abs(-254L);
        
        assertEquals(254L, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#abs(long)}
 * @utbot.executesCondition {@code ((x < 0l)): False}
 * @utbot.returnsFrom {@code return (x < 0l) ? -x : x;}
 *  */
    @Test
    public void testAbs_XGreaterOrEqualZero() {
        long actual = FastMath.abs(0L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs(float)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#abs(float)}
 * @utbot.executesCondition {@code ((x < 0.0f)): True}
 * @utbot.returnsFrom {@code return (x < 0.0f) ? -x : (x == 0.0f) ? 0.0f : x;}
 *  */
    @Test
    public void testAbs_XLessThanZero1() {
        float actual = FastMath.abs(-1.1754946E-38f);
        
        org.junit.Assert.assertEquals(1.1754946E-38f, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#abs(float)}
 * @utbot.executesCondition {@code ((x < 0.0f)): False}
 * @utbot.executesCondition {@code ((x == 0.0f)): False}
 * @utbot.returnsFrom {@code return (x < 0.0f) ? -x : (x == 0.0f) ? 0.0f : x;}
 *  */
    @Test
    public void testAbs_XNotEqualsZero() {
        float actual = FastMath.abs(java.lang.Float.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Float.NaN, actual, 1.0E-6f);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#abs(float)}
 * @utbot.executesCondition {@code ((x < 0.0f)): False}
 * @utbot.executesCondition {@code ((x == 0.0f)): True}
 * @utbot.returnsFrom {@code return (x < 0.0f) ? -x : (x == 0.0f) ? 0.0f : x;}
 *  */
    @Test
    public void testAbs_XEqualsZero() {
        float actual = FastMath.abs(-0.0f);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#abs(double)}
 * @utbot.executesCondition {@code ((x < 0.0)): True}
 * @utbot.returnsFrom {@code return (x < 0.0) ? -x : (x == 0.0) ? 0.0 : x;}
 *  */
    @Test
    public void testAbs_XLessThanZero2() {
        double actual = FastMath.abs(-2.225073858507202E-308);
        
        org.junit.Assert.assertEquals(2.225073858507202E-308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#abs(double)}
 * @utbot.executesCondition {@code ((x < 0.0)): False}
 * @utbot.executesCondition {@code ((x == 0.0)): False}
 * @utbot.returnsFrom {@code return (x < 0.0) ? -x : (x == 0.0) ? 0.0 : x;}
 *  */
    @Test
    public void testAbs_XNotEqualsZero1() {
        double actual = FastMath.abs(2.53E-321);
        
        org.junit.Assert.assertEquals(2.53E-321, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#abs(double)}
 * @utbot.executesCondition {@code ((x < 0.0)): False}
 * @utbot.executesCondition {@code ((x == 0.0)): True}
 * @utbot.returnsFrom {@code return (x < 0.0) ? -x : (x == 0.0) ? 0.0 : x;}
 *  */
    @Test
    public void testAbs_XEqualsZero1() {
        double actual = FastMath.abs(-0.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs(int)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#abs(int)}
 * @utbot.executesCondition {@code ((x < 0)): False}
 * @utbot.returnsFrom {@code return (x < 0) ? -x : x;}
 *  */
    @Test
    public void testAbs_XGreaterOrEqualZero1() {
        int actual = FastMath.abs(0);
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#abs(int)}
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
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.sin
    
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sin(double)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sin(double)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sin(double)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sin(double)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sin(double)}
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
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sin(double)}
     */
    @Test
    public void testSin() {
        double actual = FastMath.sin(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-1.1125369292536007E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.cos
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cos(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#cos(double)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (xa != xa): True}
 *  */
    @Test
    public void testCos_XaNotEqualsXa() {
        double actual = FastMath.cos(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cos(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#cos(double)}
     */
    @Test
    public void testCosReturnsOne() {
        double actual = FastMath.cos(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.tan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tan(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tan(double)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (xa == 0.0): False}
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tan(double)}
 * @utbot.executesCondition {@code (x < 0): True}
 * @utbot.executesCondition {@code (xa == 0.0): False}
 * @utbot.executesCondition {@code (xa != xa): False}
 * @utbot.executesCondition {@code (xa == Double.POSITIVE_INFINITY): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testTan_XaEqualsDoublePOSITIVE_INFINITY() {
        double actual = FastMath.tan(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tan(double)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (xa == 0.0): True}
 * @utbot.executesCondition {@code (bits < 0): False}
 * @utbot.returnsFrom {@code return 0.0;}
 *  */
    @Test
    public void testTan_BitsGreaterOrEqualZero() {
        double actual = FastMath.tan(0.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tan(double)}
 * @utbot.executesCondition {@code (x < 0): False}
 * @utbot.executesCondition {@code (xa == 0.0): True}
 * @utbot.executesCondition {@code (bits < 0): True}
 * @utbot.returnsFrom {@code return -0.0;}
 *  */
    @Test
    public void testTan_BitsLessThanZero() {
        double actual = FastMath.tan(-0.0);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method tan(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tan(double)}
     */
    @Test
    public void testTan() {
        double actual = FastMath.tan(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-1.1125369292536007E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.atan2
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method atan2(double, double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan2(double,double)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan2(double,double)}
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): True}
 * @utbot.returnsFrom {@code return Math.PI * F_1_4;}
 *  */
    @Test
    public void testAtan2_XEqualsDoublePOSITIVE_INFINITY() {
        double actual = FastMath.atan2(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(0.7853981633974483, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (x == Double.NEGATIVE_INFINITY): True}
 * @utbot.returnsFrom {@code return Math.PI * F_3_4;}
 *  */
    @Test
    public void testAtan2_XEqualsDoubleNEGATIVE_INFINITY() {
        double actual = FastMath.atan2(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(2.356194490192345, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0): False}
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
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (y == Double.NEGATIVE_INFINITY): False}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): True}
 * @utbot.executesCondition {@code (y > 0): True}
 * @utbot.returnsFrom {@code return 0d;}
 *  */
    @Test
    public void testAtan2_YGreaterThanZero() {
        double actual = FastMath.atan2(3.337610787760802E-308, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan2(double,double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (y != y): False}
 * @utbot.executesCondition {@code (y == 0): False}
 * @utbot.executesCondition {@code (y == Double.POSITIVE_INFINITY): False}
 * @utbot.executesCondition {@code (y == Double.NEGATIVE_INFINITY): True}
 * @utbot.executesCondition {@code (x == Double.POSITIVE_INFINITY): True}
 * @utbot.returnsFrom {@code return -Math.PI * F_1_4;}
 *  */
    @Test
    public void testAtan2_XEqualsDoublePOSITIVE_INFINITY_1() {
        double actual = FastMath.atan2(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(-0.7853981633974483, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method atan2(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan2(double,double)}
     */
    @Test
    public void testAtan2ReturnsZeroWithCornerCase() {
        double actual = FastMath.atan2(0.0, 1.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.sqrt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sqrt(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sqrt(double)}
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
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.log
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method log(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#log(double,double)}
     */
    @Test
    public void testLogReturnsZeroWithCornerCase() {
        double actual = FastMath.log(0.0, 1.0);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.log
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method log(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#log(double)}
 * @utbot.returnsFrom {@code return log(x, null);}
 *  */
    @Test
    public void testLog_ReturnLog() {
        double actual = FastMath.log(0.0);
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#log(double)}
 * @utbot.returnsFrom {@code return log(x, null);}
 *  */
    @Test
    public void testLog_ReturnLog_1() {
        double actual = FastMath.log(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#log(double)}
 * @utbot.returnsFrom {@code return log(x, null);}
 *  */
    @Test
    public void testLog_ReturnLog_2() {
        double actual = FastMath.log(2.225073858507202E-308);
        
        org.junit.Assert.assertEquals(-708.3964185322641, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method log(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#log(double)}
     */
    @Test
    public void testLogReturnsNan() {
        double actual = FastMath.log(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.log
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method log(double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#log(double,double[])}
     */
    @Test
    public void testLogWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {0.19999954120254515, java.lang.Double.POSITIVE_INFINITY, 0.99};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
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
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.log10
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method log10(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#log10(double)}
     */
    @Test
    public void testLog10ReturnsNan() {
        double actual = FastMath.log10(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.pow
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pow(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#pow(double,double)}
     */
    @Test
    public void testPow() {
        double actual = FastMath.pow(9.313225746154785E-10, -1.0);
        
        org.junit.Assert.assertEquals(1.073741824E9, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.pow
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pow(double, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#pow(double,int)}
     */
    @Test
    public void testPowReturnsNanWithCornerCase() {
        double actual = FastMath.pow(0.0, -2147483647);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.exp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method exp(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#exp(double)}
     */
    @Test
    public void testExpReturnsZeroWithCornerCase() {
        double actual = FastMath.exp(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.exp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method exp(double, double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#exp(double,double,double[])}
     */
    @Test
    public void testExpWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {java.lang.Double.POSITIVE_INFINITY, 0.0, 40.19140625};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
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
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.min
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(float, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#min(float,float)}
     */
    @Test
    public void testMinReturnsZeroWithCornerCase() {
        float actual = FastMath.min(0.0f, 1.0f);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.min
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#min(int,int)}
     */
    @Test
    public void testMinWithCornerCase() {
        int actual = FastMath.min(Integer.MAX_VALUE, -3);
        
        assertEquals(-3, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.min
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#min(double,double)}
     */
    @Test
    public void testMinReturnsZeroWithCornerCase1() {
        double actual = FastMath.min(0.0, 1.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.min
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method min(long, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#min(long,long)}
     */
    @Test
    public void testMinReturnsZeroWithCornerCase2() {
        long actual = FastMath.min(0L, 1L);
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.max
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max(float, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#max(float,float)}
     */
    @Test
    public void testMaxReturnsOneWithCornerCase() {
        float actual = FastMath.max(0.0f, 1.0f);
        
        org.junit.Assert.assertEquals(1.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.max
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#max(double,double)}
     */
    @Test
    public void testMaxReturnsOneWithCornerCase1() {
        double actual = FastMath.max(0.0, 1.0);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.max
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max(long, long)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#max(long,long)}
     */
    @Test
    public void testMaxReturnsOneWithCornerCase2() {
        long actual = FastMath.max(0L, 1L);
        
        assertEquals(1L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.max
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method max(int, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#max(int,int)}
     */
    @Test
    public void testMaxWithCornerCase() {
        int actual = FastMath.max(Integer.MAX_VALUE, -3);
        
        assertEquals(Integer.MAX_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.floor
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method floor(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#floor(double)}
     */
    @Test
    public void testFloor() {
        double actual = FastMath.floor(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.ceil
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method ceil(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#ceil(double)}
     */
    @Test
    public void testCeil() {
        double actual = FastMath.ceil(-1.0);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.rint
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method rint(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#rint(double)}
     */
    @Test
    public void testRintReturnsZero() {
        double actual = FastMath.rint(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.copySign
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method copySign(float, float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#copySign(float,float)}
     */
    @Test
    public void testCopySignReturnsZeroWithCornerCase() {
        float actual = FastMath.copySign(0.0f, 1.0f);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.copySign
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method copySign(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#copySign(double,double)}
     */
    @Test
    public void testCopySignReturnsZeroWithCornerCase1() {
        double actual = FastMath.copySign(0.0, 1.0);
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.signum
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method signum(float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#signum(float)}
     */
    @Test
    public void testSignum() {
        float actual = FastMath.signum(-5.877472E-39f);
        
        org.junit.Assert.assertEquals(-1.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.signum
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method signum(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#signum(double)}
     */
    @Test
    public void testSignum1() {
        double actual = FastMath.signum(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.scalb
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method scalb(double, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#scalb(double,int)}
     */
    @Test
    public void testScalbReturnsInfinityWithCornerCases() {
        double actual = FastMath.scalb(java.lang.Double.NEGATIVE_INFINITY, 0);
        
        org.junit.Assert.assertEquals(java.lang.Double.NEGATIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.scalb
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method scalb(float, int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#scalb(float,int)}
     */
    @Test
    public void testScalbReturnsZeroWithCornerCase() {
        float actual = FastMath.scalb(0.0f, -2147483520);
        
        org.junit.Assert.assertEquals(0.0f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.getExponent
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getExponent(float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#getExponent(float)}
     */
    @Test
    public void testGetExponent() {
        int actual = FastMath.getExponent(-5.877472E-39f);
        
        assertEquals(-127, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.getExponent
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getExponent(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#getExponent(double)}
     */
    @Test
    public void testGetExponent1() {
        int actual = FastMath.getExponent(-1.1125369292536007E-308);
        
        assertEquals(-1023, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.asin
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asin(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#asin(double)}
     */
    @Test
    public void testAsinReturnsNanWithCornerCase() {
        double actual = FastMath.asin(java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.acos
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method acos(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#acos(double)}
     */
    @Test
    public void testAcos() {
        double actual = FastMath.acos(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.atan
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method atan(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan(double)}
     */
    @Test
    public void testAtanWithCornerCase() {
        double actual = FastMath.atan(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.atan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method atan(double, double, boolean)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan(double,double,boolean)}
 * @utbot.executesCondition {@code (xa == 0.0): True}
 * @utbot.executesCondition {@code (leftPlane): False}
 * @utbot.returnsFrom {@code return leftPlane ? copySign(Math.PI, xa) : xa;}
 *  */
    @Test
    public void testAtan_NotLeftPlane() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
        Class doubleType = double.class;
        Class booleanType = boolean.class;
        Method atanMethod = fastMathClazz.getDeclaredMethod("atan", doubleType, doubleType, booleanType);
        atanMethod.setAccessible(true);
        java.lang.Object[] atanMethodArguments = new java.lang.Object[3];
        atanMethodArguments[0] = 0.0;
        atanMethodArguments[1] = java.lang.Double.NaN;
        atanMethodArguments[2] = false;
        double actual = ((Double) atanMethod.invoke(null, atanMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan(double,double,boolean)}
 * @utbot.executesCondition {@code (xa == 0.0): False}
 * @utbot.executesCondition {@code (xa < 0): False}
 * @utbot.executesCondition {@code (xa > 1.633123935319537E16): True}
 * @utbot.executesCondition {@code ((negate ^ leftPlane)): True}
 * @utbot.returnsFrom {@code return (negate ^ leftPlane) ? (-Math.PI * F_1_2) : (Math.PI * F_1_2);}
 *  */
    @Test
    public void testAtan_NegateXorLeftPlane() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
        Class doubleType = double.class;
        Class booleanType = boolean.class;
        Method atanMethod = fastMathClazz.getDeclaredMethod("atan", doubleType, doubleType, booleanType);
        atanMethod.setAccessible(true);
        java.lang.Object[] atanMethodArguments = new java.lang.Object[3];
        atanMethodArguments[0] = 2.681561585988529E154;
        atanMethodArguments[1] = java.lang.Double.NaN;
        atanMethodArguments[2] = true;
        double actual = ((Double) atanMethod.invoke(null, atanMethodArguments));
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan(double,double,boolean)}
 * @utbot.executesCondition {@code (xa == 0.0): False}
 * @utbot.executesCondition {@code (xa < 0): False}
 * @utbot.executesCondition {@code (xa > 1.633123935319537E16): True}
 * @utbot.executesCondition {@code ((negate ^ leftPlane)): False}
 * @utbot.returnsFrom {@code return (negate ^ leftPlane) ? (-Math.PI * F_1_2) : (Math.PI * F_1_2);}
 *  */
    @Test
    public void testAtan_NegateXorLeftPlane_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
        Class doubleType = double.class;
        Class booleanType = boolean.class;
        Method atanMethod = fastMathClazz.getDeclaredMethod("atan", doubleType, doubleType, booleanType);
        atanMethod.setAccessible(true);
        java.lang.Object[] atanMethodArguments = new java.lang.Object[3];
        atanMethodArguments[0] = 2.681561585988529E154;
        atanMethodArguments[1] = java.lang.Double.NaN;
        atanMethodArguments[2] = false;
        double actual = ((Double) atanMethod.invoke(null, atanMethodArguments));
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan(double,double,boolean)}
 * @utbot.executesCondition {@code (xa == 0.0): False}
 * @utbot.executesCondition {@code (xa < 0): True}
 * @utbot.executesCondition {@code (xa > 1.633123935319537E16): True}
 * @utbot.executesCondition {@code ((negate ^ leftPlane)): False}
 * @utbot.returnsFrom {@code return (negate ^ leftPlane) ? (-Math.PI * F_1_2) : (Math.PI * F_1_2);}
 *  */
    @Test
    public void testAtan_XaLessThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
        Class doubleType = double.class;
        Class booleanType = boolean.class;
        Method atanMethod = fastMathClazz.getDeclaredMethod("atan", doubleType, doubleType, booleanType);
        atanMethod.setAccessible(true);
        java.lang.Object[] atanMethodArguments = new java.lang.Object[3];
        atanMethodArguments[0] = -2.68156158598852E154;
        atanMethodArguments[1] = java.lang.Double.NaN;
        atanMethodArguments[2] = true;
        double actual = ((Double) atanMethod.invoke(null, atanMethodArguments));
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan(double,double,boolean)}
 * @utbot.executesCondition {@code (xa == 0.0): True}
 * @utbot.executesCondition {@code (leftPlane): True}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#copySign(double,double)}
 * @utbot.returnsFrom {@code return leftPlane ? copySign(Math.PI, xa) : xa;}
 *  */
    @Test
    public void testAtan_LeftPlane() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
        Class doubleType = double.class;
        Class booleanType = boolean.class;
        Method atanMethod = fastMathClazz.getDeclaredMethod("atan", doubleType, doubleType, booleanType);
        atanMethod.setAccessible(true);
        java.lang.Object[] atanMethodArguments = new java.lang.Object[3];
        atanMethodArguments[0] = 0.0;
        atanMethodArguments[1] = java.lang.Double.NaN;
        atanMethodArguments[2] = true;
        double actual = ((Double) atanMethod.invoke(null, atanMethodArguments));
        
        org.junit.Assert.assertEquals(3.141592653589793, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method atan(double, double, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atan(double,double,boolean)}
     */
    @Test
    public void testAtan() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
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
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.cbrt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method cbrt(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#cbrt(double)}
 * @utbot.executesCondition {@code (exponent == -1023): True}
 * @utbot.executesCondition {@code (x == 0): False}
 * @utbot.executesCondition {@code (exponent == 1024): True}
 * @utbot.invokes {@link java.lang.Double#doubleToLongBits(double)}
 *  */
    @Test
    public void testCbrt_XNotEqualsZero() {
        double actual = FastMath.cbrt(-1.4052734377485199);
        
        org.junit.Assert.assertEquals(-1.1200917860971504, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#cbrt(double)}
 * @utbot.executesCondition {@code (exponent == -1023): False}
 * @utbot.executesCondition {@code (exponent == 1024): True}
 *  */
    @Test
    public void testCbrt_ExponentNotEqualsNegative1023() {
        double actual = FastMath.cbrt(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#cbrt(double)}
 * @utbot.executesCondition {@code (exponent == -1023): True}
 * @utbot.executesCondition {@code (x == 0): True}
 *  */
    @Test
    public void testCbrt_XEqualsZero() {
        double actual = FastMath.cbrt(-0.0);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.IEEEremainder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method IEEEremainder(double, double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#IEEEremainder(double,double)}
 * @utbot.invokes {@link java.lang.StrictMath#IEEEremainder(double,double)}
 * @utbot.returnsFrom {@code return StrictMath.IEEEremainder(dividend, divisor);}
 *  */
    @Test
    public void testIEEEremainder_StrictMathIEEEremainder() {
        double actual = FastMath.IEEEremainder(java.lang.Double.NaN, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.sinh
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sinh(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sinh(double)}
 * @utbot.executesCondition {@code (x != x): True}
 *  */
    @Test
    public void testSinh_XNotEqualsX() {
        double actual = FastMath.sinh(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sinh(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 20): False}
 * @utbot.executesCondition {@code (x < -20): False}
 * @utbot.executesCondition {@code (x == 0): True}
 *  */
    @Test
    public void testSinh_XEqualsZero() {
        double actual = FastMath.sinh(-0.0);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sinh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sinh(double)}
     */
    @Test
    public void testSinh() {
        double actual = FastMath.sinh(-1.0);
        
        org.junit.Assert.assertEquals(-1.1752011936438014, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.cosh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cosh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#cosh(double)}
     */
    @Test
    public void testCosh() {
        double actual = FastMath.cosh(-0.5);
        
        org.junit.Assert.assertEquals(1.1276259652063807, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.tanh
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tanh(double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tanh(double)}
 * @utbot.executesCondition {@code (x != x): True}
 *  */
    @Test
    public void testTanh_XNotEqualsX() {
        double actual = FastMath.tanh(java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tanh(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 20.0): True}
 * @utbot.returnsFrom {@code return 1.0;}
 *  */
    @Test
    public void testTanh_XGreaterThan20d() {
        double actual = FastMath.tanh(32.000000001862645);
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tanh(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 20.0): False}
 * @utbot.executesCondition {@code (x < -20): False}
 * @utbot.executesCondition {@code (x == 0): True}
 *  */
    @Test
    public void testTanh_XEqualsZero() {
        double actual = FastMath.tanh(-0.0);
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tanh(double)}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x > 20.0): False}
 * @utbot.executesCondition {@code (x < -20): True}
 * @utbot.returnsFrom {@code return -1.0;}
 *  */
    @Test
    public void testTanh_XLessThanNegative20() {
        double actual = FastMath.tanh(-512.0000000000001);
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method tanh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tanh(double)}
     */
    @Test
    public void testTanh() {
        double actual = FastMath.tanh(-1.0);
        
        org.junit.Assert.assertEquals(-0.7615941559557649, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.hypot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hypot(double, double)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#hypot(double,double)}
 * @utbot.executesCondition {@code (Double.isInfinite(x) || Double.isInfinite(y)): False}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testHypot_DoubleIsInfiniteOrDoubleIsInfinite() {
        double actual = FastMath.hypot(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#hypot(double,double)}
 * @utbot.executesCondition {@code (Double.isInfinite(x) || Double.isInfinite(y)): True}
 * @utbot.executesCondition {@code (Double.isNaN(x) || Double.isNaN(y)): True}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testHypot_DoubleIsNaNOrDoubleIsNaN() {
        double actual = FastMath.hypot(java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#hypot(double,double)}
 * @utbot.executesCondition {@code (Double.isInfinite(x) || Double.isInfinite(y)): True}
 * @utbot.executesCondition {@code (Double.isNaN(x) || Double.isNaN(y)): False}
 * @utbot.executesCondition {@code (Double.isNaN(x) || Double.isNaN(y)): False}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testHypot_DoubleIsNaNOrDoubleIsNaN_1() {
        double actual = FastMath.hypot(java.lang.Double.NaN, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#hypot(double,double)}
 * @utbot.executesCondition {@code (Double.isInfinite(x) || Double.isInfinite(y)): True}
 * @utbot.executesCondition {@code (Double.isNaN(x) || Double.isNaN(y)): False}
 * @utbot.executesCondition {@code (Double.isNaN(x) || Double.isNaN(y)): True}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testHypot_DoubleIsNaNOrDoubleIsNaN_2() {
        double actual = FastMath.hypot(2.0000000000000004, java.lang.Double.NaN);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method hypot(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#hypot(double,double)}
     */
    @Test
    public void testHypotWithCornerCase() {
        double actual = FastMath.hypot(0.0, -1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(1.1125369292536007E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.expm1
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method expm1(double, [D)
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#expm1(double,double[])}
 * @utbot.executesCondition {@code (x != x): False}
 * @utbot.executesCondition {@code (x == 0.0): True}
 * @utbot.returnsFrom {@code return x;}
 *  */
    @Test
    public void testExpm1_XEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expm1Method = fastMathClazz.getDeclaredMethod("expm1", doubleType, doubleArrayType);
        expm1Method.setAccessible(true);
        java.lang.Object[] expm1MethodArguments = new java.lang.Object[2];
        expm1MethodArguments[0] = -0.0;
        expm1MethodArguments[1] = ((Object) null);
        double actual = ((Double) expm1Method.invoke(null, expm1MethodArguments));
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link FastMath}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#expm1(double,double[])}
 * @utbot.executesCondition {@code (x != x): True}
 * @utbot.returnsFrom {@code return x;}
 *  */
    @Test
    public void testExpm1_XNotEqualsX() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
        Class doubleType = double.class;
        Class doubleArrayType = Class.forName("[D");
        Method expm1Method = fastMathClazz.getDeclaredMethod("expm1", doubleType, doubleArrayType);
        expm1Method.setAccessible(true);
        java.lang.Object[] expm1MethodArguments = new java.lang.Object[2];
        expm1MethodArguments[0] = java.lang.Double.NaN;
        expm1MethodArguments[1] = ((Object) null);
        double actual = ((Double) expm1Method.invoke(null, expm1MethodArguments));
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.expm1
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method expm1(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#expm1(double)}
     */
    @Test
    public void testExpm1() {
        double actual = FastMath.expm1(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-1.1125369292536007E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.log1p
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method log1p(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#log1p(double)}
     */
    @Test
    public void testLog1p() {
        double actual = FastMath.log1p(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(-1.1125369292536007E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.toRadians
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toRadians(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#toRadians(double)}
     */
    @Test
    public void testToRadiansReturnsInfinityWithCornerCase() {
        double actual = FastMath.toRadians(java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.toDegrees
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toDegrees(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#toDegrees(double)}
     */
    @Test
    public void testToDegreesReturnsInfinityWithCornerCase() {
        double actual = FastMath.toDegrees(java.lang.Double.POSITIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.round
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method round(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#round(double)}
     */
    @Test
    public void testRoundWithCornerCase() {
        long actual = FastMath.round(java.lang.Double.NEGATIVE_INFINITY);
        
        assertEquals(java.lang.Long.MIN_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.round
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method round(float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#round(float)}
     */
    @Test
    public void testRoundWithCornerCase1() {
        int actual = FastMath.round(java.lang.Float.NEGATIVE_INFINITY);
        
        assertEquals(Integer.MIN_VALUE, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.random
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method random()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#random()}
     */
    @Test
    public void testRandom() {
        double actual = FastMath.random();
        
        org.junit.Assert.assertEquals(0.6895245203876116, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.ulp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method ulp(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#ulp(double)}
     */
    @Test
    public void testUlp() {
        double actual = FastMath.ulp(-1.1125369292536007E-308);
        
        org.junit.Assert.assertEquals(4.9E-324, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.ulp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method ulp(float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#ulp(float)}
     */
    @Test
    public void testUlp1() {
        float actual = FastMath.ulp(-5.877472E-39f);
        
        org.junit.Assert.assertEquals(1.4E-45f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.nextAfter
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextAfter(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#nextAfter(double,double)}
     */
    @Test
    public void testNextAfterWithCornerCase() {
        double actual = FastMath.nextAfter(1.1125369292536007E-308, java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(1.1125369292536E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.nextAfter
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextAfter(float, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#nextAfter(float,double)}
     */
    @Test
    public void testNextAfterWithCornerCase1() {
        float actual = FastMath.nextAfter(0.0f, 2.0);
        
        org.junit.Assert.assertEquals(1.4E-45f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.nextUp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextUp(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#nextUp(double)}
     */
    @Test
    public void testNextUpWithCornerCase() {
        double actual = FastMath.nextUp(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(-1.7976931348623157E308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.nextUp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nextUp(float)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#nextUp(float)}
     */
    @Test
    public void testNextUpWithCornerCase1() {
        float actual = FastMath.nextUp(java.lang.Float.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(-3.4028235E38f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.doubleHighPart
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method doubleHighPart(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#doubleHighPart(double)}
     */
    @Test
    public void testDoubleHighPart() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
        Class doubleType = double.class;
        Method doubleHighPartMethod = fastMathClazz.getDeclaredMethod("doubleHighPart", doubleType);
        doubleHighPartMethod.setAccessible(true);
        java.lang.Object[] doubleHighPartMethodArguments = new java.lang.Object[1];
        doubleHighPartMethodArguments[0] = -1.1125369292536007E-308;
        double actual = ((Double) doubleHighPartMethod.invoke(null, doubleHighPartMethodArguments));
        
        org.junit.Assert.assertEquals(-1.1125369292536007E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.asinh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asinh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#asinh(double)}
     */
    @Test
    public void testAsinh() {
        double actual = FastMath.asinh(-0.3333333333333333);
        
        org.junit.Assert.assertEquals(-0.32745015023725843, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.acosh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method acosh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#acosh(double)}
     */
    @Test
    public void testAcoshReturnsNanWithCornerCase() {
        double actual = FastMath.acosh(java.lang.Double.NEGATIVE_INFINITY);
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.atanh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method atanh(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#atanh(double)}
     */
    @Test
    public void testAtanh() {
        double actual = FastMath.atanh(-0.06666666666666667);
        
        org.junit.Assert.assertEquals(-0.06676569631226131, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.polySine
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method polySine(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#polySine(double)}
     */
    @Test
    public void testPolySineReturnsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
        Class doubleType = double.class;
        Method polySineMethod = fastMathClazz.getDeclaredMethod("polySine", doubleType);
        polySineMethod.setAccessible(true);
        java.lang.Object[] polySineMethodArguments = new java.lang.Object[1];
        polySineMethodArguments[0] = -1.1125369292536007E-308;
        double actual = ((Double) polySineMethod.invoke(null, polySineMethodArguments));
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.sinQ
    
    ///region FUZZER: ERROR SUITE for method sinQ(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#sinQ(double,double)}
     */
    @Test
    public void testSinQThrowsAIOOBEWithCornerCases() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.util.FastMath.sinQ] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 14]
            org.apache.commons.math3.util.FastMath.sinQ(FastMath.java:1716) */
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
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
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.polyCosine
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method polyCosine(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#polyCosine(double)}
     */
    @Test
    public void testPolyCosineReturnsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
        Class doubleType = double.class;
        Method polyCosineMethod = fastMathClazz.getDeclaredMethod("polyCosine", doubleType);
        polyCosineMethod.setAccessible(true);
        java.lang.Object[] polyCosineMethodArguments = new java.lang.Object[1];
        polyCosineMethodArguments[0] = -1.1125369292536007E-308;
        double actual = ((Double) polyCosineMethod.invoke(null, polyCosineMethodArguments));
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.reducePayneHanek
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reducePayneHanek(double, [D)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#reducePayneHanek(double,double[])}
     */
    @Test
    public void testReducePayneHanekWithNonEmptyPrimitiveArray() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        double[] doubleArray = {4.503599627370496E15, 4.503599627370496E15, 2.0};
        
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
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
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.cosQ
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cosQ(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#cosQ(double,double)}
     */
    @Test
    public void testCosQReturnsNanWithCornerCase() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
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
    
    ///region Test suites for executable org.apache.commons.math3.util.FastMath.tanQ
    
    ///region FUZZER: ERROR SUITE for method tanQ(double, double, boolean)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.util.FastMath}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.util.FastMath#tanQ(double,double,boolean)}
     */
    @Test
    public void testTanQThrowsAIOOBEWithCornerCases() throws Throwable  {
        /* This test fails because method [org.apache.commons.math3.util.FastMath.tanQ] produces [java.lang.ArrayIndexOutOfBoundsException: Index -2147483648 out of bounds for length 14]
            org.apache.commons.math3.util.FastMath.tanQ(FastMath.java:1860) */
        Class fastMathClazz = Class.forName("org.apache.commons.math3.util.FastMath");
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
}

