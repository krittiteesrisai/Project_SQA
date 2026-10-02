package org.apache.commons.math.complex;

import org.junit.Test;
import org.apache.commons.math.exception.NullArgumentException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math_complex_ComplexTest {
    ///region Test suites for executable org.apache.commons.math.complex.Complex.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(org.apache.commons.math.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#getReal()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#getImaginary()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(real + rhs.getReal(), imaginary + rhs.getImaginary());}
 *  */
    @Test
    public void testAdd_ComplexGetImaginary() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.112604228005475E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 131072.0);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -3.3376786585028177E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -2.225074430497343E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(org.apache.commons.math.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(rhs);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAdd_ThrowNullArgumentException() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        complex.add(((Complex) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.complex.Complex)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(org.apache.commons.math.complex.Complex)}
     */
    @Test
    public void testAdd() throws Exception  {
        Complex complex = new Complex(0.0, java.lang.Double.NEGATIVE_INFINITY);
        Complex complex1 = new Complex(-1.0, 0.0);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -1.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.complex.Complex)
    
    @Test
    public void testAdd1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.288229753919427E-231);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.337610787760802E-308);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 1.0001221969723701);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 1.9382331417035777E-308);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.0001221969723701);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -1.3993776460572244E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.2468722738616946E307);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 5.914485603706955E-309);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -1.0640202568708872E304);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -2.2479362941185654E307);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0944262981647666);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1.7976929239090589E308);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 1.9999362230882944);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -2.1754513917086687E301);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.09449007507647211);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Other() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        boolean actual = complex.equals(complex);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): True}
 * @utbot.executesCondition {@code (rhs.isNaN): True}
 * @utbot.returnsFrom {@code return isNaN;}
 *  */
    @Test
    public void testEquals_RhsIsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        boolean actual = complex.equals(complex1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): True}
 * @utbot.executesCondition {@code (rhs.isNaN): False}
 * @utbot.returnsFrom {@code return (real == rhs.real) && (imaginary == rhs.imaginary);}
 *  */
    @Test
    public void testEquals_RealEqualsRhsRealAndImaginaryEqualsRhsImaginary() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.2250738916633856E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.4916681486630437E-154);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -2.2250738916633856E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 1.4916681486630437E-154);
        
        boolean actual = complex.equals(complex1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): True}
 * @utbot.executesCondition {@code (rhs.isNaN): False}
 * @utbot.returnsFrom {@code return (real == rhs.real) && (imaginary == rhs.imaginary);}
 *  */
    @Test
    public void testEquals_RealNotEqualsRhsRealAndImaginaryNotEqualsRhsImaginary() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.668739906101317E94);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.8496807838084263E-306);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -1.1857110181532827E80);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 2.8496807838084263E-306);
        
        boolean actual = complex.equals(complex1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): True}
 * @utbot.executesCondition {@code (rhs.isNaN): False}
 * @utbot.returnsFrom {@code return (real == rhs.real) && (imaginary == rhs.imaginary);}
 *  */
    @Test
    public void testEquals_RealNotEqualsRhsRealAndImaginaryNotEqualsRhsImaginary_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -8.988465674311582E307);
        
        boolean actual = complex.equals(complex1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotOtherNotInstanceOfComplex() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        boolean actual = complex.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        String actual = complex.toString();
        
        String expected = "(NaN, 0.0)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#hashCode()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#hash(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#hash(double)}
 * @utbot.returnsFrom {@code return 37 * (17 * MathUtils.hash(imaginary) + MathUtils.hash(real));}
 *  */
    @Test
    public void testHashCode_NotIsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0);
        
        int actual = complex.hashCode();
        
        assertEquals(1073741824, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#hashCode()}
 * @utbot.executesCondition {@code (isNaN): True}
 * @utbot.returnsFrom {@code return 7;}
 *  */
    @Test
    public void testHashCode_IsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        int actual = complex.hashCode();
        
        assertEquals(7, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.executesCondition {@code (isNaN): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testAbs_IsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.executesCondition {@code (isInfinite()): True}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testAbs_IsInfinite() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.executesCondition {@code (isInfinite()): False}
 * @utbot.executesCondition {@code (FastMath.abs(real) < FastMath.abs(imaginary)): False}
 * @utbot.executesCondition {@code (real == 0.0): False}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#sqrt(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(real) * FastMath.sqrt(1 + q * q);}
 *  */
    @Test
    public void testAbs_RealNotEqualsZero() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.225073858507202E-308);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(2.225073858507202E-308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.executesCondition {@code (isInfinite()): False}
 * @utbot.executesCondition {@code (FastMath.abs(real) < FastMath.abs(imaginary)): True}
 * @utbot.executesCondition {@code (imaginary == 0.0): False}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#sqrt(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(imaginary) * FastMath.sqrt(1 + q * q);}
 *  */
    @Test
    public void testAbs_ImaginaryNotEqualsZero() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 8.330086712826292E-258);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.846018596041223E-267);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(8.330086712826292E-258, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.executesCondition {@code (isInfinite()): False}
 * @utbot.executesCondition {@code (FastMath.abs(real) < FastMath.abs(imaginary)): False}
 * @utbot.executesCondition {@code (real == 0.0): True}
 * @utbot.invokes {@link org.apache.commons.math.util.FastMath#abs(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(imaginary);}
 *  */
    @Test
    public void testAbs_RealEqualsZero() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method abs()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
     */
    @Test
    public void testAbsReturnsOne() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.sin
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sin()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#sin()}
     */
    @Test
    public void testSin() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.1752011936438014);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 6.866936764192192E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sin()
    
    @Test
    public void testSin1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0000000000000004);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.9092974268256815);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.68156158598852E154);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.15865756326011965);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.4896609280078125E9);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -709.064950704591);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0000000000000018);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.9092974268256809);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.000000000000057);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.6089369521550264E155);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.167868884556714E155);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.cos
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cos()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#cos()}
     */
    @Test
    public void testCos() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 5.229818908926564E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.5430806348152437);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method cos()
    
    @Test
    public void testCos1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0000000000000004);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.4161468365471428);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.2250738626517244E-308);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -8.589934592000002E9);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.5731352377018242);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0000000000000004);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.4161468365471428);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.7179869236000008E10);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -709.0003032684999);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.tan
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method tan()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#tan()}
     */
    @Test
    public void testTan() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, 1.0);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.761594155955765);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.868947857538285E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tan()
    
    @Test
    public void testTan1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.8125);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.1474836510000954E9);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.675976024411405E154);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -360.62738396224427);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.7504975936025167);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.617727960965E-311);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1.0000019530998543);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -8.379880017880899E153);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.sqrt
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sqrt()
    
    @Test
    public void testSqrt1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.225074389006149E-308);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.0000000000000002);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.2250738585072014E-308);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.2250739911319383E-308);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.225074389006149E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.0547687872245153E-154);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0547687872245151E-154);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.225074389006149E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.0547687872245153E-154);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0547687872245151E-154);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.log
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method log()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#log()}
     */
    @Test
    public void testLog() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method log()
    
    @Test
    public void testLog1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.9921875);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.9921875);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.7853981633974483);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.73091291656406);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0371159593267E-310);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 5.194645696283E-311);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.3211173457565946);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -713.058344629475);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -707.9909534241559);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.356194490192345);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.785766995733679E-270);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.2882297539194267E-231);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.785766995733679E-270);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.785766995733679E-270);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 3.141592653589793);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.112536929255625E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -3.141592653589793);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.225209666237823E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 3.141592653589793);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog13() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.7853981633974483);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog14() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.225209666237823E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -3.141592653589793);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog15() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog16() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.225209666237823E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog17() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.2294197058870983E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog18() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -2.356194490192345);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog19() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.225209666237823E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog20() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2294197058870983E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog21() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.22724678219715E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.5884531892785637);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog22() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.7853981633974483);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog23() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog24() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.848094538889238E-306);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -703.5443882683445);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog25() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -7.29112202295159E-304);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 3.141592653589793);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -697.9992108233993);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog26() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.450147717014403E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -707.7032713517042);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog27() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.pow
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pow(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#pow(org.apache.commons.math.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(x);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testPow_ThrowNullArgumentException() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        complex.pow(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pow(org.apache.commons.math.complex.Complex)
    
    @Test
    public void testPow1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.225074919505097E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.225074919505097E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.225074919505097E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.225074919505097E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow13() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow14() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow15() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow16() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.225074919505097E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow17() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow18() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow19() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0078125);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.04206237782017554);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.007274823499596286);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow20() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.73833895195875E-310);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.2289899051604857E-307);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow21() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow22() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow23() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0000000000000004);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow24() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0000000000000004);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow25() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.8480945388892184E-306);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0000000000000004);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow26() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.exp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method exp()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#exp()}
     */
    @Test
    public void testExp() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.8414709848078965);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.5403023058681398);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method exp()
    
    @Test
    public void testExp1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2065.500061038998);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1048608.5080719048);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.494322843944193E307);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 66309.03369307658);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.68156158598852E154);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.9E-324);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1.2884901919788578E10);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -104451.11059582653);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.68156158598852E154);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0205439314542727E19);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -6.806154902725533E40);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp13() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -931.9039173352094);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp14() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp15() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp16() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -709.0);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.216780750623423E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp17() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -719.000000030268);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 5.52417589424E-313);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.getField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getField()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getField()}
 * @utbot.invokes {@link org.apache.commons.math.complex.ComplexField#getInstance()}
 * @utbot.returnsFrom {@code return ComplexField.getInstance();}
 *  */
    @Test
    public void testGetField_ComplexFieldGetInstance() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.apache.commons.math.complex.ComplexField$LazyHolder");
        ComplexField prevINSTANCE = ((ComplexField) getStaticFieldValue(lazyHolderClazz, "INSTANCE"));
        try {
            Class complexFieldClazz = Class.forName("org.apache.commons.math.complex.ComplexField");
            Class anonymousObjectType = Class.forName("org.apache.commons.math.complex.ComplexField$1");
            Constructor complexFieldConstructor = complexFieldClazz.getDeclaredConstructor(anonymousObjectType);
            complexFieldConstructor.setAccessible(true);
            java.lang.Object[] complexFieldConstructorArguments = new java.lang.Object[1];
            complexFieldConstructorArguments[0] = ((Object) null);
            ComplexField instance = ((ComplexField) complexFieldConstructor.newInstance(complexFieldConstructorArguments));
            setStaticField(lazyHolderClazz, "INSTANCE", instance);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            
            ComplexField actual = complex.getField();
            
        } finally {
            setStaticField(lazyHolderClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getField()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getField()}
     */
    @Test
    public void testGetField() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        ComplexField actual = complex.getField();
        
        Class complexFieldClazz = Class.forName("org.apache.commons.math.complex.ComplexField");
        Class anonymousObjectType = Class.forName("org.apache.commons.math.complex.ComplexField$1");
        Constructor complexFieldConstructor = complexFieldClazz.getDeclaredConstructor(anonymousObjectType);
        complexFieldConstructor.setAccessible(true);
        java.lang.Object[] complexFieldConstructorArguments = new java.lang.Object[1];
        complexFieldConstructorArguments[0] = ((Object) null);
        ComplexField expected = ((ComplexField) complexFieldConstructor.newInstance(complexFieldConstructorArguments));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.isNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.returnsFrom {@code return isNaN;}
 *  */
    @Test
    public void testIsNaN_ReturnIsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        boolean actual = complex.isNaN();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.readResolve
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method readResolve()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.Double#isNaN(double)} twice
    /// execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.Double#isInfinite(double)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#readResolve()}
 * @utbot.returnsFrom {@code return createComplex(real, imaginary);}
 *  */
    @Test
    public void testReadResolve_ReturnCreateComplex() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2250738585072014E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0522684006491881E-289);
        
        Complex actual = ((Complex) complex.readResolve());
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.2250738585072014E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 2.0522684006491881E-289);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#readResolve()}
 * @utbot.returnsFrom {@code return createComplex(real, imaginary);}
 *  */
    @Test
    public void testReadResolve_ReturnCreateComplex_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.345847379897E-311);
        
        Complex actual = ((Complex) complex.readResolve());
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 4.345847379897E-311);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#readResolve()}
 * @utbot.returnsFrom {@code return createComplex(real, imaginary);}
 *  */
    @Test
    public void testReadResolve_ReturnCreateComplex_2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = ((Complex) complex.readResolve());
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method readResolve()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#readResolve()}
 * @utbot.returnsFrom {@code return createComplex(real, imaginary);}
 *  */
    @Test
    public void testReadResolve_ReturnCreateComplex_3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = ((Complex) complex.readResolve());
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#readResolve()}
 * @utbot.returnsFrom {@code return createComplex(real, imaginary);}
 *  */
    @Test
    public void testReadResolve_ReturnCreateComplex_4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
        
        Complex actual = ((Complex) complex.readResolve());
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.isInfinite
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isInfinite()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#isInfinite()}
 * @utbot.returnsFrom {@code return isInfinite;}
 *  */
    @Test
    public void testIsInfinite_ReturnIsInfinite() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        boolean actual = complex.isInfinite();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.asin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method asin()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#asin()}
 * @utbot.executesCondition {@code (isNaN): True}
 *  */
    @Test
    public void testAsin_IsNaN() throws Exception  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(naN, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "isNaN", true);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
            
            Complex actual = complex.asin();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asin()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#asin()}
     */
    @Test
    public void testAsin() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.asin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.8813735870195429);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 3.1467296279827175E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method asin()
    
    @Test
    public void testAsin1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.asin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAsin2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.asin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.acos
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acos()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#acos()}
 * @utbot.executesCondition {@code (isNaN): True}
 *  */
    @Test
    public void testAcos_IsNaN() throws Exception  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(naN, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "isNaN", true);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
            
            Complex actual = complex.acos();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method acos()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#acos()}
     */
    @Test
    public void testAcos() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.acos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.8813735870195428);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.5707963267948966);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method acos()
    
    @Test
    public void testAcos1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.acos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAcos2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.acos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.atan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method atan()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#atan()}
 * @utbot.executesCondition {@code (isNaN): True}
 *  */
    @Test
    public void testAtan_IsNaN() throws Exception  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(naN, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "isNaN", true);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
            
            Complex actual = complex.atan();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method atan()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#atan()}
     */
    @Test
    public void testAtan() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.atan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -354.19820926613204);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.7853981633974483);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method atan()
    
    @Test
    public void testAtan1() throws Exception  {
        Complex prevI = Complex.I;
        try {
            Complex i = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(i, "org.apache.commons.math.complex.Complex", "imaginary", 1.0);
            setField(i, "org.apache.commons.math.complex.Complex", "real", 0.0);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "I", i);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.000000275904313);
            setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
            
            Complex actual = complex.atan();
            
            Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
            setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Complex.class, "I", prevI);
        }
    }
    
    @Test
    public void testAtan2() throws Exception  {
        Complex prevI = Complex.I;
        try {
            Complex i = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(i, "org.apache.commons.math.complex.Complex", "imaginary", 1.0);
            setField(i, "org.apache.commons.math.complex.Complex", "real", 0.0);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "I", i);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -131087.0625);
            setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
            
            Complex actual = complex.atan();
            
            Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -7.628517879260671E-6);
            setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.5707963267948966);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Complex.class, "I", prevI);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.multiply
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(double)
    
    @Test
    public void testMultiply1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.multiply(4.4544935643943E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.multiply(java.lang.Double.POSITIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
        
        Complex actual = complex.multiply(2.2250738585072093E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.multiply(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.multiply
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(rhs);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMultiply_ThrowNullArgumentException() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        complex.multiply(((Complex) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math.complex.Complex)
    
    @Test
    public void testMultiply5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.53E-321);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.2379E-319);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 1.32624737E-315);
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0237E-320);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.0E-323);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.sinh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sinh()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#sinh()}
     */
    @Test
    public void testSinh() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.8414709848078965);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sinh()
    
    @Test
    public void testSinh1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.723542840767628E154);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 736.0039291681023);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -66560.00032043469);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.cosh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cosh()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#cosh()}
     */
    @Test
    public void testCosh() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.5403023058681398);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method cosh()
    
    @Test
    public void testCosh1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.723542840767628E154);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 736.0000000019236);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -66560.00032043469);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.tanh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method tanh()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#tanh()}
     */
    @Test
    public void testTanh() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, 1.0);
        
        Complex actual = complex.tanh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.557407724654902);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tanh()
    
    @Test
    public void testTanh1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.tanh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTanh2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.605322007840141E77);
        
        Complex actual = complex.tanh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTanh3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -8.988465742316158E307);
        
        Complex actual = complex.tanh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTanh4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -360.0000000298023);
        
        Complex actual = complex.tanh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.negate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method negate()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (isNaN): False}
    /// invoke:
    ///     {@link org.apache.commons.math.complex.Complex#createComplex(double,double)} twice
    /// return from: {@code return createComplex(-real, -imaginary);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#negate()}
 * @utbot.returnsFrom {@code return createComplex(-real, -imaginary);}
 *  */
    @Test
    public void testNegate_ReturnCreateComplex() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.4766779039175E-310);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -3.4766779039175E-310);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#negate()}
 * @utbot.returnsFrom {@code return createComplex(-real, -imaginary);}
 *  */
    @Test
    public void testNegate_ReturnCreateComplex_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.1125369292536007E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.1125369292536007E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#negate()}
 * @utbot.returnsFrom {@code return createComplex(-real, -imaginary);}
 *  */
    @Test
    public void testNegate_ReturnCreateComplex_2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method negate()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#negate()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.returnsFrom {@code return createComplex(-real, -imaginary);}
 *  */
    @Test
    public void testNegate_NotIsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#negate()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.returnsFrom {@code return createComplex(-real, -imaginary);}
 *  */
    @Test
    public void testNegate_NotIsNaN_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.225073858507202E-308);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -2.225073858507202E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#negate()}
 * @utbot.executesCondition {@code (isNaN): True}
 *  */
    @Test
    public void testNegate_IsNaN() throws Exception  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(naN, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "isNaN", true);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
            
            Complex actual = complex.negate();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.divide
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#divide(org.apache.commons.math.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(rhs);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testDivide_ThrowNullArgumentException() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        complex.divide(((Complex) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method divide(org.apache.commons.math.complex.Complex)
    
    @Test
    public void testDivide1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 4.9E-324);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        setField(complex1, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -4.9E-324);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 4.9E-324);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        setField(complex1, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 2.2250738585072014E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.1125369292536007E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.divide(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.589214833171103E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.divide(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        
        Complex actual = complex.divide(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.1125369292536007E-308);
        
        Complex actual = complex.divide(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.subtract
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(org.apache.commons.math.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(rhs);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSubtract_ThrowNullArgumentException() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        complex.subtract(((Complex) null));
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.complex.Complex)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(org.apache.commons.math.complex.Complex)}
     */
    @Test
    public void testSubtract() throws Exception  {
        Complex complex = new Complex(0.0, java.lang.Double.NEGATIVE_INFINITY);
        Complex complex1 = new Complex(-1.0, 0.0);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.complex.Complex)
    
    @Test
    public void testSubtract1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.9960789684555496);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 15.881449790527784);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 0.003921508789062556);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 161.8836850214323);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.992157459666487);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -146.00223523090452);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.71619941503266E156);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.2283332761621306E-308);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 7.209462122729698E157);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -7.037842181226431E157);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.390681771566193E-309);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.661400412057517);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 1.3432534741838238);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 3.318146937873694);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.getArgument
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getArgument()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getArgument()}
 * @utbot.returnsFrom {@code return FastMath.atan2(getImaginary(), getReal());}
 *  */
    @Test
    public void testGetArgument_ReturnFastMathAtan2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getArgument()}
 * @utbot.returnsFrom {@code return FastMath.atan2(getImaginary(), getReal());}
 *  */
    @Test
    public void testGetArgument_ReturnFastMathAtan2_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.8758094468947063);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getArgument()}
 * @utbot.returnsFrom {@code return FastMath.atan2(getImaginary(), getReal());}
 *  */
    @Test
    public void testGetArgument_ReturnFastMathAtan2_2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(0.7853981633974483, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getArgument()}
 * @utbot.returnsFrom {@code return FastMath.atan2(getImaginary(), getReal());}
 *  */
    @Test
    public void testGetArgument_ReturnFastMathAtan2_3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getArgument()}
 * @utbot.returnsFrom {@code return FastMath.atan2(getImaginary(), getReal());}
 *  */
    @Test
    public void testGetArgument_ReturnFastMathAtan2_4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getArgument()}
 * @utbot.returnsFrom {@code return FastMath.atan2(getImaginary(), getReal());}
 *  */
    @Test
    public void testGetArgument_ReturnFastMathAtan2_5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getArgument()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getArgument()}
     */
    @Test
    public void testGetArgument() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getArgument()
    
    @Test
    public void testGetArgument1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.2250738585072014E-308);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.450147717014404E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-2.356194490192345, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(3.141592653589793, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-0.7853981633974483, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-3.141592653589793, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 4.450147717014404E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(0.9272952180016124, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(2.356194490192345, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.nthRoot
    
    ///region Errors report for nthRoot
    
    public void testNthRoot_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 1 occurrences of:
        // Exception org.apache.commons.math.MathRuntimeException$4 is not accessible from package org.apache.commons.math.complex
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.getImaginary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getImaginary()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getImaginary()}
 * @utbot.returnsFrom {@code return imaginary;}
 *  */
    @Test
    public void testGetImaginary_ReturnImaginary() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        
        double actual = complex.getImaginary();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.getReal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReal()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#getReal()}
 * @utbot.returnsFrom {@code return real;}
 *  */
    @Test
    public void testGetReal_ReturnReal() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        double actual = complex.getReal();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.sqrt1z
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sqrt1z()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#sqrt1z()}
     */
    @Test
    public void testSqrt1z() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.sqrt1z();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 3.146729627982717E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.4142135623730951);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sqrt1z()
    
    @Test
    public void testSqrt1z1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.sqrt1z();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt1z2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sqrt1z();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt1z3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.sqrt1z();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.conjugate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method conjugate()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (isNaN): False}
    /// invoke:
    ///     {@link org.apache.commons.math.complex.Complex#createComplex(double,double)} twice
    /// return from: {@code return createComplex(real, -imaginary);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#conjugate()}
 * @utbot.returnsFrom {@code return createComplex(real, -imaginary);}
 *  */
    @Test
    public void testConjugate_ReturnCreateComplex() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.390671161567E-309);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.390671161567E-309);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#conjugate()}
 * @utbot.returnsFrom {@code return createComplex(real, -imaginary);}
 *  */
    @Test
    public void testConjugate_ReturnCreateComplex_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.6578092E-316);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.6578092E-316);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#conjugate()}
 * @utbot.returnsFrom {@code return createComplex(real, -imaginary);}
 *  */
    @Test
    public void testConjugate_ReturnCreateComplex_2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method conjugate()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#conjugate()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.returnsFrom {@code return createComplex(real, -imaginary);}
 *  */
    @Test
    public void testConjugate_NotIsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#conjugate()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.returnsFrom {@code return createComplex(real, -imaginary);}
 *  */
    @Test
    public void testConjugate_NotIsNaN_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 7.2911220195563975E-304);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 7.2911220195563975E-304);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#conjugate()}
 * @utbot.executesCondition {@code (isNaN): True}
 *  */
    @Test
    public void testConjugate_IsNaN() throws Exception  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(naN, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "isNaN", true);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
            
            Complex actual = complex.conjugate();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.createComplex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method createComplex(double, double)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.Double#isNaN(double)} twice
    /// execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.Double#isInfinite(double)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return new Complex(realPart, imaginaryPart);}
 *  */
    @Test
    public void testCreateComplex_Return() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.createComplex(7.9E-323, -7.2911220195563975E-304);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -7.2911220195563975E-304);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 7.9E-323);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return new Complex(realPart, imaginaryPart);}
 *  */
    @Test
    public void testCreateComplex_Return_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.createComplex(3.337610787760802E-308, java.lang.Double.POSITIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return new Complex(realPart, imaginaryPart);}
 *  */
    @Test
    public void testCreateComplex_Return_2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.createComplex(java.lang.Double.NEGATIVE_INFINITY, -2.000000000000001);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -2.000000000000001);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method createComplex(double, double)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return new Complex(realPart, imaginaryPart);}
 *  */
    @Test
    public void testCreateComplex_Return_3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.createComplex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return new Complex(realPart, imaginaryPart);}
 *  */
    @Test
    public void testCreateComplex_Return_4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.createComplex(-2.000001907348633, java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -2.000001907348633);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields732513355367300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields732513355367300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass732513355372800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields732513355367300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass732513355372800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields732513355720300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields732513355720300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass732513355722100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields732513355720300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass732513355722100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields732513356357900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields732513356357900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass732513356359700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields732513356357900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass732513356359700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

