package org.apache.commons.math.special;

import org.junit.Test;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MaxIterationsExceededException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;

public final class org_apache_commons_math_special_GammaTest {
    ///region Test suites for executable org.apache.commons.math.special.Gamma.regularizedGammaP
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method regularizedGammaP(double, double)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double,double,int)} twice
    /// return from: {@code return regularizedGammaP(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double)}
 * @utbot.returnsFrom {@code return regularizedGammaP(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testRegularizedGammaP_ReturnRegularizedGammaP() throws MathException  {
        double actual = Gamma.regularizedGammaP(java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double)}
 * @utbot.returnsFrom {@code return regularizedGammaP(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testRegularizedGammaP_ReturnRegularizedGammaP_1() throws MathException  {
        double actual = Gamma.regularizedGammaP(2.225073858507202E-308, -2.225073858507202E-308);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double)}
 * @utbot.returnsFrom {@code return regularizedGammaP(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testRegularizedGammaP_ReturnRegularizedGammaP_2() throws MathException  {
        double actual = Gamma.regularizedGammaP(-0.0, -4.778309726736482E-299);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double)}
 * @utbot.returnsFrom {@code return regularizedGammaP(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testRegularizedGammaP_ReturnRegularizedGammaP_3() throws MathException  {
        double actual = Gamma.regularizedGammaP(-2.0000000000000004, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method regularizedGammaP(double, double)
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double)}
 * @utbot.invokes {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double,double,int)}
 * @utbot.returnsFrom {@code return regularizedGammaP(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testRegularizedGammaP_GammaRegularizedGammaP() throws MathException  {
        double actual = Gamma.regularizedGammaP(2.225073858507202E-308, -0.0);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method regularizedGammaP(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.special.Gamma}
     * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double)}
     */
    @Test
    public void testRegularizedGammaPReturnsNanWithCornerCase() throws MathException  {
        double actual = Gamma.regularizedGammaP(java.lang.Double.POSITIVE_INFINITY, 1.0E-8);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.special.Gamma}
     * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double)}
     */
    @Test
    public void testRegularizedGammaPReturnsNan() throws MathException  {
        double actual = Gamma.regularizedGammaP(1.113623391098575E-308, 1.0);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.special.Gamma.regularizedGammaP
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method regularizedGammaP(double, double, double, int)
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double,double,int)}
 * @utbot.executesCondition {@code (Double.isNaN(a) || Double.isNaN(x)): True}
 * @utbot.executesCondition {@code (a <= 0.0): True}
 * @utbot.executesCondition {@code (x < 0.0): True}
 * @utbot.executesCondition {@code (x == 0.0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaP_XEqualsZero() throws MathException  {
        double actual = Gamma.regularizedGammaP(2.225073858507202E-308, -2.225073858507202E-308, java.lang.Double.NaN, -255);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double,double,int)}
 * @utbot.executesCondition {@code (Double.isNaN(a) || Double.isNaN(x)): True}
 * @utbot.executesCondition {@code (a <= 0.0): True}
 * @utbot.executesCondition {@code (x < 0.0): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaP_XGreaterOrEqualZero() throws MathException  {
        double actual = Gamma.regularizedGammaP(-0.0, -3.78576699573368E-270, java.lang.Double.NaN, -255);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double,double,int)}
 * @utbot.executesCondition {@code (Double.isNaN(a) || Double.isNaN(x)): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaP_DoubleIsNaNOrDoubleIsNaN() throws MathException  {
        double actual = Gamma.regularizedGammaP(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, -255);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double,double,int)}
 * @utbot.executesCondition {@code (Double.isNaN(a) || Double.isNaN(x)): True}
 * @utbot.executesCondition {@code (a <= 0.0): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaP_AGreaterThanZero() throws MathException  {
        double actual = Gamma.regularizedGammaP(-2.0000000000000004, java.lang.Double.NaN, java.lang.Double.NaN, -255);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method regularizedGammaP(double, double, double, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (Double.isNaN(a) || Double.isNaN(x)): True}
    /// invoke:
    ///     {@link java.lang.Double#isNaN(double)} once
    /// execute conditions:
    ///     {@code (a <= 0.0): True},
    ///     {@code (x < 0.0): True},
    ///     {@code (x == 0.0): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double,double,int)}
 * @utbot.executesCondition {@code (x == 0.0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaP_XEqualsZero_1() throws MathException  {
        double actual = Gamma.regularizedGammaP(2.225073858507202E-308, -0.0, java.lang.Double.NaN, 0);
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double,double,int)}
 * @utbot.executesCondition {@code (x == 0.0): False}
 * @utbot.executesCondition {@code (a >= 1.0): True}
 * @utbot.executesCondition {@code (x > a): True}
 * @utbot.invokes {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaP_XGreaterThanA() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, MathException  {
        Class gammaClazz = Class.forName("org.apache.commons.math.special.Gamma");
        double prevHALF_LOG_2_PI = ((Double) getStaticFieldValue(gammaClazz, "HALF_LOG_2_PI"));
        double[] prevLanczos = ((double[]) getStaticFieldValue(gammaClazz, "lanczos"));
        try {
            setStaticField(gammaClazz, "HALF_LOG_2_PI", 4.9E-324);
            double[] lanczos = new double[15];
            lanczos[0] = 0.9999999999999971;
            lanczos[1] = 57.15623566586292;
            lanczos[2] = -59.59796035547549;
            lanczos[3] = 14.136097974741746;
            lanczos[4] = -0.4919138160976202;
            lanczos[5] = 3.399464998481189E-5;
            lanczos[6] = 4.652362892704858E-5;
            lanczos[7] = -9.837447530487956E-5;
            lanczos[8] = 1.580887032249125E-4;
            lanczos[9] = -2.1026444172410488E-4;
            lanczos[10] = 2.1743961811521265E-4;
            lanczos[11] = -1.643181065367639E-4;
            lanczos[12] = 8.441822398385275E-5;
            lanczos[13] = -2.6190838401581408E-5;
            lanczos[14] = 3.6899182659531625E-6;
            setStaticField(gammaClazz, "lanczos", lanczos);
            
            double actual = Gamma.regularizedGammaP(1.0, 8.371160993642715E298, 1.7976931348623157E308, 1);
            
            assertEquals(1.0, actual, 1.0E-6);
        } finally {
            setStaticField(Gamma.class, "HALF_LOG_2_PI", prevHALF_LOG_2_PI);
            setStaticField(Gamma.class, "lanczos", prevLanczos);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method regularizedGammaP(double, double, double, int)
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double,double,int)}
 * @utbot.executesCondition {@code (x > a): True}
 * @utbot.invokes {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: ret = 1.0 - regularizedGammaQ(a, x, epsilon, maxIterations);
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaP_ThrowMaxIterationsExceededException() throws MathException  {
        Gamma.regularizedGammaP(1.0, 8.988465674311582E307, java.lang.Double.NaN, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaP(double,double,double,int)}
 * @utbot.executesCondition {@code (x > a): False}
 * @utbot.executesCondition {@code (n >= maxIterations): True}
 * @utbot.iterates iterate the loop {@code while(Math.abs(an) > epsilon && n < maxIterations)} once
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} when: n >= maxIterations
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaP_ThrowMaxIterationsExceededException_1() throws MathException  {
        Gamma.regularizedGammaP(1.0, 1.0, 1.0, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.special.Gamma.logGamma
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method logGamma(double)
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#logGamma(double)}
 * @utbot.executesCondition {@code (Double.isNaN(x)): True}
 * @utbot.executesCondition {@code (x <= 0.0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testLogGamma_XLessOrEqualZero() {
        double actual = Gamma.logGamma(-0.0);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#logGamma(double)}
 * @utbot.executesCondition {@code (Double.isNaN(x)): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testLogGamma_NotDoubleIsNaN() {
        double actual = Gamma.logGamma(java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#logGamma(double)}
 * @utbot.executesCondition {@code (Double.isNaN(x)): True}
 * @utbot.executesCondition {@code (x <= 0.0): False}
 * @utbot.invokes {@link java.lang.Math#log(double)}
 * @utbot.invokes {@link java.lang.Math#log(double)}
 * @utbot.iterates iterate the loop {@code for(int i = lanczos.length - 1; i > 0; --i)} 14 times
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testLogGamma_XGreaterThanZero() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Class gammaClazz = Class.forName("org.apache.commons.math.special.Gamma");
        double prevHALF_LOG_2_PI = ((Double) getStaticFieldValue(gammaClazz, "HALF_LOG_2_PI"));
        double[] prevLanczos = ((double[]) getStaticFieldValue(gammaClazz, "lanczos"));
        try {
            setStaticField(gammaClazz, "HALF_LOG_2_PI", java.lang.Double.NaN);
            double[] lanczos = new double[15];
            lanczos[0] = 0.9999999999999971;
            lanczos[1] = 57.15623566586292;
            lanczos[2] = -59.59796035547549;
            lanczos[3] = 14.136097974741746;
            lanczos[4] = -0.4919138160976202;
            lanczos[5] = 3.399464998481189E-5;
            lanczos[6] = 4.652362892704858E-5;
            lanczos[7] = -9.837447530487956E-5;
            lanczos[8] = 1.580887032249125E-4;
            lanczos[9] = -2.1026444172410488E-4;
            lanczos[10] = 2.1743961811521265E-4;
            lanczos[11] = -1.643181065367639E-4;
            lanczos[12] = 8.441822398385275E-5;
            lanczos[13] = -2.6190838401581408E-5;
            lanczos[14] = 3.6899182659531625E-6;
            setStaticField(gammaClazz, "lanczos", lanczos);
            
            double actual = Gamma.logGamma(1.2882322110226865E-231);
            
            assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
        } finally {
            setStaticField(Gamma.class, "HALF_LOG_2_PI", prevHALF_LOG_2_PI);
            setStaticField(Gamma.class, "lanczos", prevLanczos);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.special.Gamma.regularizedGammaQ
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method regularizedGammaQ(double, double)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)} twice
    /// return from: {@code return regularizedGammaQ(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double)}
 * @utbot.returnsFrom {@code return regularizedGammaQ(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testRegularizedGammaQ_ReturnRegularizedGammaQ() throws MathException  {
        double actual = Gamma.regularizedGammaQ(java.lang.Double.NaN, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double)}
 * @utbot.returnsFrom {@code return regularizedGammaQ(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testRegularizedGammaQ_ReturnRegularizedGammaQ_1() throws MathException  {
        double actual = Gamma.regularizedGammaQ(2.225073858507202E-308, -2.225073858507202E-308);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double)}
 * @utbot.returnsFrom {@code return regularizedGammaQ(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testRegularizedGammaQ_ReturnRegularizedGammaQ_2() throws MathException  {
        double actual = Gamma.regularizedGammaQ(-0.0, -4.778309726736482E-299);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double)}
 * @utbot.returnsFrom {@code return regularizedGammaQ(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testRegularizedGammaQ_ReturnRegularizedGammaQ_3() throws MathException  {
        double actual = Gamma.regularizedGammaQ(-2.0000000000000004, java.lang.Double.NaN);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method regularizedGammaQ(double, double)
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double)}
 * @utbot.invokes {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.returnsFrom {@code return regularizedGammaQ(a, x, DEFAULT_EPSILON, Integer.MAX_VALUE);}
 *  */
    @Test
    public void testRegularizedGammaQ_GammaRegularizedGammaQ() throws MathException  {
        double actual = Gamma.regularizedGammaQ(2.225073858507202E-308, -0.0);
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method regularizedGammaQ(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.special.Gamma}
     * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double)}
     */
    @Test
    public void testRegularizedGammaQReturnsNanWithCornerCase() throws MathException  {
        double actual = Gamma.regularizedGammaQ(java.lang.Double.POSITIVE_INFINITY, 1.0E-8);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.special.Gamma}
     * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double)}
     */
    @Test
    public void testRegularizedGammaQReturnsNan() throws MathException  {
        double actual = Gamma.regularizedGammaQ(1.113623391098575E-308, 1.0);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.special.Gamma.regularizedGammaQ
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method regularizedGammaQ(double, double, double, int)
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.executesCondition {@code (Double.isNaN(a) || Double.isNaN(x)): True}
 * @utbot.executesCondition {@code (a <= 0.0): True}
 * @utbot.executesCondition {@code (x < 0.0): True}
 * @utbot.executesCondition {@code (x == 0.0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaQ_XEqualsZero() throws MathException  {
        double actual = Gamma.regularizedGammaQ(2.225073858507202E-308, -2.225073858507202E-308, java.lang.Double.NaN, -255);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.executesCondition {@code (Double.isNaN(a) || Double.isNaN(x)): True}
 * @utbot.executesCondition {@code (a <= 0.0): True}
 * @utbot.executesCondition {@code (x < 0.0): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaQ_XGreaterOrEqualZero() throws MathException  {
        double actual = Gamma.regularizedGammaQ(-0.0, -3.78576699573368E-270, java.lang.Double.NaN, -255);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.executesCondition {@code (Double.isNaN(a) || Double.isNaN(x)): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaQ_DoubleIsNaNOrDoubleIsNaN() throws MathException  {
        double actual = Gamma.regularizedGammaQ(java.lang.Double.NaN, java.lang.Double.NaN, java.lang.Double.NaN, -255);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.executesCondition {@code (Double.isNaN(a) || Double.isNaN(x)): True}
 * @utbot.executesCondition {@code (a <= 0.0): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaQ_AGreaterThanZero() throws MathException  {
        double actual = Gamma.regularizedGammaQ(-2.0000000000000004, java.lang.Double.NaN, java.lang.Double.NaN, -255);
        
        assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method regularizedGammaQ(double, double, double, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (Double.isNaN(a) || Double.isNaN(x)): True}
    /// invoke:
    ///     {@link java.lang.Double#isNaN(double)} once
    /// execute conditions:
    ///     {@code (a <= 0.0): True},
    ///     {@code (x < 0.0): True},
    ///     {@code (x == 0.0): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.executesCondition {@code (x == 0.0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaQ_XEqualsZero_1() throws MathException  {
        double actual = Gamma.regularizedGammaQ(2.225073858507202E-308, -0.0, java.lang.Double.NaN, 0);
        
        assertEquals(1.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.executesCondition {@code (x == 0.0): False}
 * @utbot.executesCondition {@code (x < a): False}
 * @utbot.executesCondition {@code (a < 1.0): False}
 * @utbot.invokes {@link org.apache.commons.math.util.ContinuedFraction#evaluate(double,double,int)}
 * @utbot.invokes {@link java.lang.Math#log(double)}
 * @utbot.invokes {@link org.apache.commons.math.special.Gamma#logGamma(double)}
 * @utbot.invokes {@link java.lang.Math#exp(double)}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testRegularizedGammaQ_AGreaterOrEqual1d() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, MathException  {
        Class gammaClazz = Class.forName("org.apache.commons.math.special.Gamma");
        double prevHALF_LOG_2_PI = ((Double) getStaticFieldValue(gammaClazz, "HALF_LOG_2_PI"));
        double[] prevLanczos = ((double[]) getStaticFieldValue(gammaClazz, "lanczos"));
        try {
            setStaticField(gammaClazz, "HALF_LOG_2_PI", 1.287797443943321E-308);
            double[] lanczos = new double[15];
            lanczos[0] = 0.9999999999999971;
            lanczos[1] = 57.15623566586292;
            lanczos[2] = -59.59796035547549;
            lanczos[3] = 14.136097974741746;
            lanczos[4] = -0.4919138160976202;
            lanczos[5] = 3.399464998481189E-5;
            lanczos[6] = 4.652362892704858E-5;
            lanczos[7] = -9.837447530487956E-5;
            lanczos[8] = 1.580887032249125E-4;
            lanczos[9] = -2.1026444172410488E-4;
            lanczos[10] = 2.1743961811521265E-4;
            lanczos[11] = -1.643181065367639E-4;
            lanczos[12] = 8.441822398385275E-5;
            lanczos[13] = -2.6190838401581408E-5;
            lanczos[14] = 3.6899182659531625E-6;
            setStaticField(gammaClazz, "lanczos", lanczos);
            
            double actual = Gamma.regularizedGammaQ(1.0, 1.0, 1.7976931348623157E308, 1);
            
            assertEquals(0.9221370088957894, actual, 1.0E-6);
        } finally {
            setStaticField(Gamma.class, "HALF_LOG_2_PI", prevHALF_LOG_2_PI);
            setStaticField(Gamma.class, "lanczos", prevLanczos);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: CHECKED EXCEPTIONS for method regularizedGammaQ(double, double, double, int)
    
    /**
    @utbot.classUnderTest {@link Gamma}
 * @utbot.methodUnderTest {@link org.apache.commons.math.special.Gamma#regularizedGammaQ(double,double,double,int)}
 * @utbot.executesCondition {@code (Double.isNaN(a) || Double.isNaN(x)): True}
 * @utbot.executesCondition {@code (a <= 0.0): True}
 * @utbot.executesCondition {@code (x < 0.0): True}
 * @utbot.executesCondition {@code (x == 0.0): False}
 * @utbot.executesCondition {@code (x == 0.0): False}
 * @utbot.executesCondition {@code (x < a): False}
 * @utbot.executesCondition {@code (a < 1.0): False}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.ContinuedFraction#evaluate(double,double,int)}
 * @utbot.throwsException {@link org.apache.commons.math.MaxIterationsExceededException} in: ret = 1.0 / cf.evaluate(x, epsilon, maxIterations);
 *  */
    @Test(expected = MaxIterationsExceededException.class)
    public void testRegularizedGammaQ_ThrowMaxIterationsExceededException() throws MathException  {
        Gamma.regularizedGammaQ(1.0, 1.0, java.lang.Double.NaN, 0);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields789173219840100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields789173219840100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass789173219847100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields789173219840100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass789173219847100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
                
                return field.get(null);
            } catch (NoSuchFieldException e) {
                clazz = clazz.getSuperclass();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (java.lang.reflect.InvocationTargetException e3) {
                e3.printStackTrace();
            }
        } while (clazz != null);
    
        throw new NoSuchFieldException("Field '" + fieldName + "' not found on class " + originClass);
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields789173221926900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields789173221926900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass789173221930800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields789173221926900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass789173221930800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    ///endregion
}

