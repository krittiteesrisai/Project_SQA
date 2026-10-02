package org.apache.commons.math3.complex;

import org.junit.Test;
import org.apache.commons.math3.exception.NullArgumentException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.apache.commons.math3.exception.NotPositiveException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math3_complex_ComplexTest {
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.add
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(double)
    
    @Test
    public void testAdd1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 8.988465674311582E307);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.add(-1.0000004992252798);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 8.988465674311582E307);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        Complex actual = complex.add(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", -1.0118E-320);
        
        Complex actual = complex.add(1.586385175577863E-309);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 1.586385175567744E-309);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        
        Complex actual = complex.add(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math3.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#add(org.apache.commons.math3.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN || addend.isNaN): True}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link org.apache.commons.math3.complex.Complex#getReal()}
 * @utbot.invokes {@link org.apache.commons.math3.complex.Complex#getImaginary()}
 * @utbot.invokes {@link org.apache.commons.math3.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(real + addend.getReal(), imaginary + addend.getImaginary());}
 *  */
    @Test
    public void testAdd_IsNaNOrAddendIsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 2.503208090820603E-308);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "imaginary", 1.0E-323);
        setField(complex1, "org.apache.commons.math3.complex.Complex", "real", -2.2250738585072014E-308);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 2.503208090820604E-308);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math3.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#add(org.apache.commons.math3.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: MathUtils.checkNotNull(addend);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAdd_ThrowNullArgumentException() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        
        complex.add(((Complex) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math3.complex.Complex)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#add(org.apache.commons.math3.complex.Complex)}
     */
    @Test(expected = NullArgumentException.class)
    public void testAddThrowsNAE() {
        Complex complex = new Complex(0.0, -0.0625);
        
        complex.add(((Complex) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math3.complex.Complex)
    
    @Test
    public void testAdd5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 1.7244323510018207E-307);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "imaginary", -1.04300337117525E-309);
        setField(complex1, "org.apache.commons.math3.complex.Complex", "real", 5.56268468771577E-309);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 1.7800591978789783E-307);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 256.94470214843756);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 4.9E-324);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "imaginary", -61.9313354501501);
        setField(complex1, "org.apache.commons.math3.complex.Complex", "real", 2.716154612436E-312);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 195.01336669828746);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 2.71615461244E-312);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Other() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        
        boolean actual = complex.equals(complex);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): True}
 * @utbot.executesCondition {@code (c.isNaN): True}
 * @utbot.returnsFrom {@code return isNaN;}
 *  */
    @Test
    public void testEquals_CIsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        boolean actual = complex.equals(complex1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): True}
 * @utbot.executesCondition {@code (c.isNaN): False}
 * @utbot.returnsFrom {@code return (real == c.real) && (imaginary == c.imaginary);}
 *  */
    @Test
    public void testEquals_RealEqualsCRealAndImaginaryEqualsCImaginary() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", -6.860482052895944E38);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "imaginary", -0.0);
        setField(complex1, "org.apache.commons.math3.complex.Complex", "real", -6.860482052895944E38);
        
        boolean actual = complex.equals(complex1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): True}
 * @utbot.executesCondition {@code (c.isNaN): False}
 * @utbot.returnsFrom {@code return (real == c.real) && (imaginary == c.imaginary);}
 *  */
    @Test
    public void testEquals_RealNotEqualsCRealAndImaginaryNotEqualsCImaginary() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 9.946521643535633E86);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 3.2978686391988835E-229);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "imaginary", -4.63170123852777E77);
        setField(complex1, "org.apache.commons.math3.complex.Complex", "real", 3.2978686391988835E-229);
        
        boolean actual = complex.equals(complex1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): True}
 * @utbot.executesCondition {@code (c.isNaN): False}
 * @utbot.returnsFrom {@code return (real == c.real) && (imaginary == c.imaginary);}
 *  */
    @Test
    public void testEquals_RealNotEqualsCRealAndImaginaryNotEqualsCImaginary_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 5.56268465662931E-309);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        
        boolean actual = complex.equals(complex1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotOtherNotInstanceOfComplex() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        
        boolean actual = complex.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.toString
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 0.0);
        
        String actual = complex.toString();
        
        String expected = "(0.0, 0.0)";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#hashCode()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathUtils#hash(double)}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathUtils#hash(double)}
 * @utbot.returnsFrom {@code return 37 * (17 * MathUtils.hash(imaginary) + MathUtils.hash(real));}
 *  */
    @Test
    public void testHashCode_NotIsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 2.2250738585072014E-307);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 2.0);
        
        int actual = complex.hashCode();
        
        assertEquals(-418119680, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#hashCode()}
 * @utbot.executesCondition {@code (isNaN): True}
 * @utbot.returnsFrom {@code return 7;}
 *  */
    @Test
    public void testHashCode_IsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        int actual = complex.hashCode();
        
        assertEquals(7, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#abs()}
 * @utbot.executesCondition {@code (isNaN): True}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testAbs_IsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#abs()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.executesCondition {@code (isInfinite()): True}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testAbs_IsInfinite() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#abs()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.executesCondition {@code (isInfinite()): False}
 * @utbot.executesCondition {@code (FastMath.abs(real) < FastMath.abs(imaginary)): False}
 * @utbot.executesCondition {@code (real == 0.0): False}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#sqrt(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(real) * FastMath.sqrt(1 + q * q);}
 *  */
    @Test
    public void testAbs_RealNotEqualsZero() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", -2.225073858507202E-308);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(2.225073858507202E-308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#abs()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.executesCondition {@code (isInfinite()): False}
 * @utbot.executesCondition {@code (FastMath.abs(real) < FastMath.abs(imaginary)): True}
 * @utbot.executesCondition {@code (imaginary == 0.0): False}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#abs(double)}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#sqrt(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(imaginary) * FastMath.sqrt(1 + q * q);}
 *  */
    @Test
    public void testAbs_ImaginaryNotEqualsZero() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 1.5474257869764886E26);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", -3.6613709204267526E-245);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(1.5474257869764886E26, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#abs()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.executesCondition {@code (isInfinite()): False}
 * @utbot.executesCondition {@code (FastMath.abs(real) < FastMath.abs(imaginary)): False}
 * @utbot.executesCondition {@code (real == 0.0): True}
 * @utbot.invokes {@link org.apache.commons.math3.util.FastMath#abs(double)}
 * @utbot.returnsFrom {@code return FastMath.abs(imaginary);}
 *  */
    @Test
    public void testAbs_RealEqualsZero() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", -0.0);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method abs()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#abs()}
     */
    @Test
    public void testAbsReturnsOne() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.sin
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sin()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#sin()}
     */
    @Test
    public void testSin() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -1.1752011936438014);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 6.866936764192192E-308);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sin()
    
    @Test
    public void testSin1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 2.0000000000000004);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.9092974268256815);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 2.68156158598852E154);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", -0.15865756326011965);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", -2.6815615859885206E154);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.5591954344640062);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 1.3145238740835339);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", -2.000000000000001);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", -0.9092974268256814);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 0.0);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.cos
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cos()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#cos()}
     */
    @Test
    public void testCos() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 5.229818908926564E-308);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 1.5430806348152437);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.tan
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method tan()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#tan()}
     */
    @Test
    public void testTan() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -20.0);
        
        Complex actual = complex.tan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -1.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.sqrt
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sqrt()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#sqrt()}
     */
    @Test
    public void testSqrt() throws Exception  {
        Complex complex = new Complex(0.25, -1.0);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -0.6248105338438266);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.8002425902201205);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.log
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method log()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#log()}
     */
    @Test
    public void testLog() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -1.5707963267948966);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.pow
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pow(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#pow(double)}
     */
    @Test
    public void testPow() throws Exception  {
        Complex complex = new Complex(0.0, -1.0);
        
        Complex actual = complex.pow(-1.1125369292536007E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 1.7475689218952297E-308);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#pow(double)}
     */
    @Test
    public void testPow1() throws Exception  {
        Complex complex = new Complex(java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.pow(1.1235582092889474E307);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.pow
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pow(org.apache.commons.math3.complex.Complex)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#pow(org.apache.commons.math3.complex.Complex)}
     */
    @Test(expected = NullArgumentException.class)
    public void testPowThrowsNAE() {
        Complex complex = new Complex(0.0, -0.0625);
        
        complex.pow(((Complex) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.exp
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method exp()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#exp()}
     */
    @Test
    public void testExp() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -0.8414709848078965);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.5403023058681398);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.valueOf
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method valueOf(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#valueOf(double)}
     */
    @Test
    public void testValueOf() throws Exception  {
        Complex actual = Complex.valueOf(-1.1125369292536007E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", -1.1125369292536007E-308);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.valueOf
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method valueOf(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#valueOf(double,double)}
     */
    @Test
    public void testValueOfWithCornerCase() throws Exception  {
        Complex actual = Complex.valueOf(0.0, -1.1125369292536007E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -1.1125369292536007E-308);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.getField
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getField()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#getField()}
     */
    @Test
    public void testGetField() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        ComplexField actual = complex.getField();
        
        Class complexFieldClazz = Class.forName("org.apache.commons.math3.complex.ComplexField");
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.complex.ComplexField$1");
        Constructor complexFieldConstructor = complexFieldClazz.getDeclaredConstructor(anonymousObjectType);
        complexFieldConstructor.setAccessible(true);
        java.lang.Object[] complexFieldConstructorArguments = new java.lang.Object[1];
        complexFieldConstructorArguments[0] = ((Object) null);
        ComplexField expected = ((ComplexField) complexFieldConstructor.newInstance(complexFieldConstructorArguments));
        
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#getField()}
     */
    @Test
    public void testGetField1() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Complex complex = new Complex(4.450147733592495E-308, -1.0);
        
        ComplexField actual = complex.getField();
        
        Class complexFieldClazz = Class.forName("org.apache.commons.math3.complex.ComplexField");
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.complex.ComplexField$1");
        Constructor complexFieldConstructor = complexFieldClazz.getDeclaredConstructor(anonymousObjectType);
        complexFieldConstructor.setAccessible(true);
        java.lang.Object[] complexFieldConstructorArguments = new java.lang.Object[1];
        complexFieldConstructorArguments[0] = ((Object) null);
        ComplexField expected = ((ComplexField) complexFieldConstructor.newInstance(complexFieldConstructorArguments));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.isNaN
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#isNaN()}
     */
    @Test
    public void testIsNaNReturnsFalse() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        boolean actual = complex.isNaN();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.readResolve
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method readResolve()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#readResolve()}
     */
    @Test
    public void testReadResolve() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = ((Complex) complex.readResolve());
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -1.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 4.450147717014403E-308);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.isInfinite
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isInfinite()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#isInfinite()}
     */
    @Test
    public void testIsInfiniteReturnsFalse() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        boolean actual = complex.isInfinite();
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.asin
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method asin()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#asin()}
     */
    @Test
    public void testAsin() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.asin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -0.8813735870195429);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 3.1467296279827175E-308);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#asin()}
     */
    @Test
    public void testAsin1() throws Exception  {
        Complex complex = new Complex(4.450147733592495E-308, -1.0);
        
        Complex actual = complex.asin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -0.8813735870195429);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 3.146729639705199E-308);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.acos
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method acos()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#acos()}
     */
    @Test
    public void testAcos() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.acos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 0.8813735870195428);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 1.5707963267948966);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.atan
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method atan()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#atan()}
     */
    @Test
    public void testAtan() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.atan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -354.19820926613204);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.7853981633974483);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method atan()
    
    @Test
    public void testAtan1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        
        Complex actual = complex.atan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAtan2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        Complex actual = complex.atan();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.multiply
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(double)
    
    @Test
    public void testMultiply1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.multiply(-2.0078125);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        Complex actual = complex.multiply(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 2.315841784746324E77);
        
        Complex actual = complex.multiply(-2.0000000000582077);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 3.2379E-319);
        
        Complex actual = complex.multiply(java.lang.Double.NEGATIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.multiply
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(int)
    
    @Test
    public void testMultiply5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.multiply(0);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 1.7800590868057611E-307);
        
        Complex actual = complex.multiply(0);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.multiply
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math3.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#multiply(org.apache.commons.math3.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math3.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: MathUtils.checkNotNull(factor);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMultiply_ThrowNullArgumentException() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        
        complex.multiply(((Complex) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math3.complex.Complex)
    
    @Test
    public void testMultiply7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 1.2882298307039035E-231);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", 6.63123685E-316);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 1.32624737E-315);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex1, "org.apache.commons.math3.complex.Complex", "real", 0.0);
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.sinh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sinh()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#sinh()}
     */
    @Test
    public void testSinh() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -0.8414709848078965);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 2.4044250729567197E-308);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sinh()
    
    @Test
    public void testSinh1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", -4.9E-324);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math3.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.cosh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method cosh()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#cosh()}
     */
    @Test
    public void testCosh() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -3.744670181976722E-308);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 0.5403023058681398);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.tanh
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method tanh()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#tanh()}
     */
    @Test
    public void testTanh() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -20.0);
        
        Complex actual = complex.tanh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -2.2371609442247427);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 2.6722643476410456E-307);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.negate
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#negate()}
     */
    @Test
    public void testNegate() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 1.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", -4.450147717014403E-308);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.divide
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math3.complex.Complex)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#divide(org.apache.commons.math3.complex.Complex)}
     */
    @Test(expected = NullArgumentException.class)
    public void testDivideThrowsNAE() {
        Complex complex = new Complex(0.0, 0.0625);
        
        complex.divide(((Complex) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.divide
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method divide(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#divide(double)}
     */
    @Test
    public void testDivideWithCornerCase() throws Exception  {
        Complex complex = new Complex(java.lang.Double.POSITIVE_INFINITY, -1.0);
        
        Complex actual = complex.divide(java.lang.Double.NEGATIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#divide(double)}
     */
    @Test
    public void testDivide() throws Exception  {
        Complex complex = new Complex(java.lang.Double.NaN);
        
        Complex actual = complex.divide(1.1235582092889477E307);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.subtract
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method subtract(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#subtract(double)}
     */
    @Test
    public void testSubtractWithCornerCase() throws Exception  {
        Complex complex = new Complex(java.lang.Double.POSITIVE_INFINITY, -1.0);
        
        Complex actual = complex.subtract(java.lang.Double.NEGATIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -1.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#subtract(double)}
     */
    @Test
    public void testSubtract() throws Exception  {
        Complex complex = new Complex(java.lang.Double.NaN);
        
        Complex actual = complex.subtract(1.1235582092889477E307);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math3.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.subtract
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math3.complex.Complex)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#subtract(org.apache.commons.math3.complex.Complex)}
     */
    @Test(expected = NullArgumentException.class)
    public void testSubtractThrowsNAE() {
        Complex complex = new Complex(0.0, -0.0625);
        
        complex.subtract(((Complex) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.getArgument
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getArgument()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#getArgument()}
     */
    @Test
    public void testGetArgument() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.reciprocal
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method reciprocal()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#reciprocal()}
     */
    @Test
    public void testReciprocal() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.reciprocal();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 1.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 4.450147717014403E-308);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.getReal
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getReal()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#getReal()}
     */
    @Test
    public void testGetReal() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        double actual = complex.getReal();
        
        org.junit.Assert.assertEquals(4.450147717014403E-308, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.sqrt1z
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sqrt1z()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#sqrt1z()}
     */
    @Test
    public void testSqrt1z() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.sqrt1z();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 3.146729627982717E-308);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 1.4142135623730951);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.conjugate
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method conjugate()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#conjugate()}
     */
    @Test
    public void testConjugate() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", 1.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 4.450147717014403E-308);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.getImaginary
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getImaginary()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#getImaginary()}
     */
    @Test
    public void testGetImaginary() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        double actual = complex.getImaginary();
        
        org.junit.Assert.assertEquals(-1.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.nthRoot
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nthRoot(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#nthRoot(int)}
     */
    @Test
    public void testNthRoot() throws Exception  {
        Complex complex = new Complex(0.0, -1.0);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(70));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex1, "org.apache.commons.math3.complex.Complex", "imaginary", -0.022438064295804937);
        setField(complex1, "org.apache.commons.math3.complex.Complex", "real", 0.9997482349425065);
        expected.add(complex1);
        Complex complex2 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex2, "org.apache.commons.math3.complex.Complex", "imaginary", 0.06726900561203965);
        setField(complex2, "org.apache.commons.math3.complex.Complex", "real", 0.9977348750464561);
        expected.add(complex2);
        Complex complex3 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex3, "org.apache.commons.math3.complex.Complex", "imaginary", 0.15643446504023087);
        setField(complex3, "org.apache.commons.math3.complex.Complex", "real", 0.9876883405951378);
        expected.add(complex3);
        Complex complex4 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex4, "org.apache.commons.math3.complex.Complex", "imaginary", 0.244340406137894);
        setField(complex4, "org.apache.commons.math3.complex.Complex", "real", 0.9696895203766869);
        expected.add(complex4);
        Complex complex5 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex5, "org.apache.commons.math3.complex.Complex", "imaginary", 0.3302790619551671);
        setField(complex5, "org.apache.commons.math3.complex.Complex", "real", 0.9438833303083676);
        expected.add(complex5);
        Complex complex6 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex6, "org.apache.commons.math3.complex.Complex", "imaginary", 0.41355850496652063);
        setField(complex6, "org.apache.commons.math3.complex.Complex", "real", 0.910477546658816);
        expected.add(complex6);
        Complex complex7 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex7, "org.apache.commons.math3.complex.Complex", "imaginary", 0.49350821806434686);
        setField(complex7, "org.apache.commons.math3.complex.Complex", "real", 0.8697411331556955);
        expected.add(complex7);
        Complex complex8 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex8, "org.apache.commons.math3.complex.Complex", "imaginary", 0.569484493168452);
        setField(complex8, "org.apache.commons.math3.complex.Complex", "real", 0.8220020754479099);
        expected.add(complex8);
        Complex complex9 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex9, "org.apache.commons.math3.complex.Complex", "imaginary", 0.6408756139850241);
        setField(complex9, "org.apache.commons.math3.complex.Complex", "real", 0.7676447403580111);
        expected.add(complex9);
        Complex complex10 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex10, "org.apache.commons.math3.complex.Complex", "imaginary", 0.7071067811865475);
        setField(complex10, "org.apache.commons.math3.complex.Complex", "real", 0.7071067811865476);
        expected.add(complex10);
        Complex complex11 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex11, "org.apache.commons.math3.complex.Complex", "imaginary", 0.7676447403580111);
        setField(complex11, "org.apache.commons.math3.complex.Complex", "real", 0.6408756139850241);
        expected.add(complex11);
        Complex complex12 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex12, "org.apache.commons.math3.complex.Complex", "imaginary", 0.8220020754479098);
        setField(complex12, "org.apache.commons.math3.complex.Complex", "real", 0.5694844931684521);
        expected.add(complex12);
        Complex complex13 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex13, "org.apache.commons.math3.complex.Complex", "imaginary", 0.8697411331556953);
        setField(complex13, "org.apache.commons.math3.complex.Complex", "real", 0.4935082180643469);
        expected.add(complex13);
        Complex complex14 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex14, "org.apache.commons.math3.complex.Complex", "imaginary", 0.9104775466588159);
        setField(complex14, "org.apache.commons.math3.complex.Complex", "real", 0.4135585049665207);
        expected.add(complex14);
        Complex complex15 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex15, "org.apache.commons.math3.complex.Complex", "imaginary", 0.9438833303083676);
        setField(complex15, "org.apache.commons.math3.complex.Complex", "real", 0.33027906195516715);
        expected.add(complex15);
        Complex complex16 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex16, "org.apache.commons.math3.complex.Complex", "imaginary", 0.9696895203766869);
        setField(complex16, "org.apache.commons.math3.complex.Complex", "real", 0.24434040613789407);
        expected.add(complex16);
        Complex complex17 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex17, "org.apache.commons.math3.complex.Complex", "imaginary", 0.9876883405951378);
        setField(complex17, "org.apache.commons.math3.complex.Complex", "real", 0.15643446504023092);
        expected.add(complex17);
        Complex complex18 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex18, "org.apache.commons.math3.complex.Complex", "imaginary", 0.9977348750464561);
        setField(complex18, "org.apache.commons.math3.complex.Complex", "real", 0.06726900561203972);
        expected.add(complex18);
        Complex complex19 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex19, "org.apache.commons.math3.complex.Complex", "imaginary", 0.9997482349425065);
        setField(complex19, "org.apache.commons.math3.complex.Complex", "real", -0.022438064295804874);
        expected.add(complex19);
        Complex complex20 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex20, "org.apache.commons.math3.complex.Complex", "imaginary", 0.9937122098932426);
        setField(complex20, "org.apache.commons.math3.complex.Complex", "real", -0.1119644761033078);
        expected.add(complex20);
        Complex complex21 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex21, "org.apache.commons.math3.complex.Complex", "imaginary", 0.9796753984232356);
        setField(complex21, "org.apache.commons.math3.complex.Complex", "real", -0.20058941578327272);
        expected.add(complex21);
        Complex complex22 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex22, "org.apache.commons.math3.complex.Complex", "imaginary", 0.9577508166849306);
        setField(complex22, "org.apache.commons.math3.complex.Complex", "real", -0.2875993274320172);
        expected.add(complex22);
        Complex complex23 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex23, "org.apache.commons.math3.complex.Complex", "imaginary", 0.928114988519039);
        setField(complex23, "org.apache.commons.math3.complex.Complex", "real", -0.3722936584019451);
        expected.add(complex23);
        Complex complex24 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex24, "org.apache.commons.math3.complex.Complex", "imaginary", 0.8910065241883679);
        setField(complex24, "org.apache.commons.math3.complex.Complex", "real", -0.4539904997395467);
        expected.add(complex24);
        Complex complex25 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex25, "org.apache.commons.math3.complex.Complex", "imaginary", 0.8467241992282842);
        setField(complex25, "org.apache.commons.math3.complex.Complex", "real", -0.5320320765153365);
        expected.add(complex25);
        Complex complex26 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex26, "org.apache.commons.math3.complex.Complex", "imaginary", 0.795624548881781);
        setField(complex26, "org.apache.commons.math3.complex.Complex", "real", -0.6057900438408198);
        expected.add(complex26);
        Complex complex27 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex27, "org.apache.commons.math3.complex.Complex", "imaginary", 0.7381189974873407);
        setField(complex27, "org.apache.commons.math3.complex.Complex", "real", -0.6746705459320743);
        expected.add(complex27);
        Complex complex28 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex28, "org.apache.commons.math3.complex.Complex", "imaginary", 0.6746705459320744);
        setField(complex28, "org.apache.commons.math3.complex.Complex", "real", -0.7381189974873406);
        expected.add(complex28);
        Complex complex29 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex29, "org.apache.commons.math3.complex.Complex", "imaginary", 0.6057900438408199);
        setField(complex29, "org.apache.commons.math3.complex.Complex", "real", -0.7956245488817809);
        expected.add(complex29);
        Complex complex30 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex30, "org.apache.commons.math3.complex.Complex", "imaginary", 0.5320320765153367);
        setField(complex30, "org.apache.commons.math3.complex.Complex", "real", -0.8467241992282841);
        expected.add(complex30);
        Complex complex31 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex31, "org.apache.commons.math3.complex.Complex", "imaginary", 0.45399049973954686);
        setField(complex31, "org.apache.commons.math3.complex.Complex", "real", -0.8910065241883678);
        expected.add(complex31);
        Complex complex32 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex32, "org.apache.commons.math3.complex.Complex", "imaginary", 0.3722936584019453);
        setField(complex32, "org.apache.commons.math3.complex.Complex", "real", -0.9281149885190388);
        expected.add(complex32);
        Complex complex33 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex33, "org.apache.commons.math3.complex.Complex", "imaginary", 0.2875993274320174);
        setField(complex33, "org.apache.commons.math3.complex.Complex", "real", -0.9577508166849305);
        expected.add(complex33);
        Complex complex34 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex34, "org.apache.commons.math3.complex.Complex", "imaginary", 0.20058941578327288);
        setField(complex34, "org.apache.commons.math3.complex.Complex", "real", -0.9796753984232355);
        expected.add(complex34);
        Complex complex35 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex35, "org.apache.commons.math3.complex.Complex", "imaginary", 0.11196447610330798);
        setField(complex35, "org.apache.commons.math3.complex.Complex", "real", -0.9937122098932426);
        expected.add(complex35);
        Complex complex36 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex36, "org.apache.commons.math3.complex.Complex", "imaginary", 0.022438064295805058);
        setField(complex36, "org.apache.commons.math3.complex.Complex", "real", -0.9997482349425065);
        expected.add(complex36);
        Complex complex37 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex37, "org.apache.commons.math3.complex.Complex", "imaginary", -0.06726900561203952);
        setField(complex37, "org.apache.commons.math3.complex.Complex", "real", -0.9977348750464561);
        expected.add(complex37);
        Complex complex38 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex38, "org.apache.commons.math3.complex.Complex", "imaginary", -0.15643446504023073);
        setField(complex38, "org.apache.commons.math3.complex.Complex", "real", -0.9876883405951378);
        expected.add(complex38);
        Complex complex39 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex39, "org.apache.commons.math3.complex.Complex", "imaginary", -0.2443404061378939);
        setField(complex39, "org.apache.commons.math3.complex.Complex", "real", -0.9696895203766869);
        expected.add(complex39);
        Complex complex40 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex40, "org.apache.commons.math3.complex.Complex", "imaginary", -0.33027906195516693);
        setField(complex40, "org.apache.commons.math3.complex.Complex", "real", -0.9438833303083676);
        expected.add(complex40);
        Complex complex41 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex41, "org.apache.commons.math3.complex.Complex", "imaginary", -0.4135585049665205);
        setField(complex41, "org.apache.commons.math3.complex.Complex", "real", -0.910477546658816);
        expected.add(complex41);
        Complex complex42 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex42, "org.apache.commons.math3.complex.Complex", "imaginary", -0.49350821806434675);
        setField(complex42, "org.apache.commons.math3.complex.Complex", "real", -0.8697411331556955);
        expected.add(complex42);
        Complex complex43 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex43, "org.apache.commons.math3.complex.Complex", "imaginary", -0.5694844931684518);
        setField(complex43, "org.apache.commons.math3.complex.Complex", "real", -0.8220020754479099);
        expected.add(complex43);
        Complex complex44 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex44, "org.apache.commons.math3.complex.Complex", "imaginary", -0.640875613985024);
        setField(complex44, "org.apache.commons.math3.complex.Complex", "real", -0.7676447403580112);
        expected.add(complex44);
        Complex complex45 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex45, "org.apache.commons.math3.complex.Complex", "imaginary", -0.7071067811865475);
        setField(complex45, "org.apache.commons.math3.complex.Complex", "real", -0.7071067811865477);
        expected.add(complex45);
        Complex complex46 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex46, "org.apache.commons.math3.complex.Complex", "imaginary", -0.767644740358011);
        setField(complex46, "org.apache.commons.math3.complex.Complex", "real", -0.6408756139850242);
        expected.add(complex46);
        Complex complex47 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex47, "org.apache.commons.math3.complex.Complex", "imaginary", -0.8220020754479098);
        setField(complex47, "org.apache.commons.math3.complex.Complex", "real", -0.5694844931684522);
        expected.add(complex47);
        Complex complex48 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex48, "org.apache.commons.math3.complex.Complex", "imaginary", -0.8697411331556953);
        setField(complex48, "org.apache.commons.math3.complex.Complex", "real", -0.49350821806434697);
        expected.add(complex48);
        Complex complex49 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex49, "org.apache.commons.math3.complex.Complex", "imaginary", -0.9104775466588159);
        setField(complex49, "org.apache.commons.math3.complex.Complex", "real", -0.4135585049665208);
        expected.add(complex49);
        Complex complex50 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex50, "org.apache.commons.math3.complex.Complex", "imaginary", -0.9438833303083675);
        setField(complex50, "org.apache.commons.math3.complex.Complex", "real", -0.33027906195516726);
        expected.add(complex50);
        Complex complex51 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex51, "org.apache.commons.math3.complex.Complex", "imaginary", -0.9696895203766868);
        setField(complex51, "org.apache.commons.math3.complex.Complex", "real", -0.2443404061378942);
        expected.add(complex51);
        Complex complex52 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex52, "org.apache.commons.math3.complex.Complex", "imaginary", -0.9876883405951377);
        setField(complex52, "org.apache.commons.math3.complex.Complex", "real", -0.15643446504023104);
        expected.add(complex52);
        Complex complex53 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex53, "org.apache.commons.math3.complex.Complex", "imaginary", -0.9977348750464561);
        setField(complex53, "org.apache.commons.math3.complex.Complex", "real", -0.06726900561203983);
        expected.add(complex53);
        Complex complex54 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex54, "org.apache.commons.math3.complex.Complex", "imaginary", -0.9997482349425065);
        setField(complex54, "org.apache.commons.math3.complex.Complex", "real", 0.022438064295804753);
        expected.add(complex54);
        Complex complex55 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex55, "org.apache.commons.math3.complex.Complex", "imaginary", -0.9937122098932426);
        setField(complex55, "org.apache.commons.math3.complex.Complex", "real", 0.11196447610330768);
        expected.add(complex55);
        Complex complex56 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex56, "org.apache.commons.math3.complex.Complex", "imaginary", -0.9796753984232356);
        setField(complex56, "org.apache.commons.math3.complex.Complex", "real", 0.20058941578327258);
        expected.add(complex56);
        Complex complex57 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex57, "org.apache.commons.math3.complex.Complex", "imaginary", -0.9577508166849306);
        setField(complex57, "org.apache.commons.math3.complex.Complex", "real", 0.28759932743201705);
        expected.add(complex57);
        Complex complex58 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex58, "org.apache.commons.math3.complex.Complex", "imaginary", -0.928114988519039);
        setField(complex58, "org.apache.commons.math3.complex.Complex", "real", 0.372293658401945);
        expected.add(complex58);
        Complex complex59 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex59, "org.apache.commons.math3.complex.Complex", "imaginary", -0.8910065241883679);
        setField(complex59, "org.apache.commons.math3.complex.Complex", "real", 0.45399049973954664);
        expected.add(complex59);
        Complex complex60 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex60, "org.apache.commons.math3.complex.Complex", "imaginary", -0.8467241992282842);
        setField(complex60, "org.apache.commons.math3.complex.Complex", "real", 0.5320320765153363);
        expected.add(complex60);
        Complex complex61 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex61, "org.apache.commons.math3.complex.Complex", "imaginary", -0.7956245488817811);
        setField(complex61, "org.apache.commons.math3.complex.Complex", "real", 0.6057900438408197);
        expected.add(complex61);
        Complex complex62 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex62, "org.apache.commons.math3.complex.Complex", "imaginary", -0.7381189974873408);
        setField(complex62, "org.apache.commons.math3.complex.Complex", "real", 0.6746705459320742);
        expected.add(complex62);
        Complex complex63 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex63, "org.apache.commons.math3.complex.Complex", "imaginary", -0.6746705459320745);
        setField(complex63, "org.apache.commons.math3.complex.Complex", "real", 0.7381189974873404);
        expected.add(complex63);
        Complex complex64 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex64, "org.apache.commons.math3.complex.Complex", "imaginary", -0.60579004384082);
        setField(complex64, "org.apache.commons.math3.complex.Complex", "real", 0.7956245488817809);
        expected.add(complex64);
        Complex complex65 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex65, "org.apache.commons.math3.complex.Complex", "imaginary", -0.5320320765153368);
        setField(complex65, "org.apache.commons.math3.complex.Complex", "real", 0.846724199228284);
        expected.add(complex65);
        Complex complex66 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex66, "org.apache.commons.math3.complex.Complex", "imaginary", -0.45399049973954697);
        setField(complex66, "org.apache.commons.math3.complex.Complex", "real", 0.8910065241883678);
        expected.add(complex66);
        Complex complex67 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex67, "org.apache.commons.math3.complex.Complex", "imaginary", -0.3722936584019454);
        setField(complex67, "org.apache.commons.math3.complex.Complex", "real", 0.9281149885190388);
        expected.add(complex67);
        Complex complex68 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex68, "org.apache.commons.math3.complex.Complex", "imaginary", -0.2875993274320175);
        setField(complex68, "org.apache.commons.math3.complex.Complex", "real", 0.9577508166849305);
        expected.add(complex68);
        Complex complex69 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex69, "org.apache.commons.math3.complex.Complex", "imaginary", -0.200589415783273);
        setField(complex69, "org.apache.commons.math3.complex.Complex", "real", 0.9796753984232355);
        expected.add(complex69);
        Complex complex70 = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(complex70, "org.apache.commons.math3.complex.Complex", "imaginary", -0.11196447610330809);
        setField(complex70, "org.apache.commons.math3.complex.Complex", "real", 0.9937122098932426);
        expected.add(complex70);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nthRoot(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#nthRoot(int)}
     */
    @Test(expected = NotPositiveException.class)
    public void testNthRootThrowsNPE() {
        Complex complex = new Complex(0.0, -1.0);
        
        complex.nthRoot(-2147483578);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.complex.Complex.createComplex
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method createComplex(double, double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.complex.Complex#createComplex(double,double)}
     */
    @Test
    public void testCreateComplex() throws Exception  {
        Complex complex = new Complex(0.0, -1.0);
        
        Complex actual = complex.createComplex(1.2882297539194267E-231, -1.0);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math3.complex.Complex"));
        setField(expected, "org.apache.commons.math3.complex.Complex", "imaginary", -1.0);
        setField(expected, "org.apache.commons.math3.complex.Complex", "real", 1.2882297539194267E-231);
        
        // org.apache.commons.math3.complex.Complex has overridden equals method
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
        
                java.lang.reflect.Method methodForGetDeclaredFields714882684325300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields714882684325300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass714882684332800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields714882684325300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass714882684332800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

