package org.apache.commons.math.complex;

import org.junit.Test;
import org.apache.commons.math.exception.NullArgumentException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.apache.commons.math.exception.NotPositiveException;
import java.util.ArrayList;
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

public final class org_apache_commons_math_complex_ComplexTest {
    ///region Test suites for executable org.apache.commons.math.complex.Complex.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(double)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(double)}
 * @utbot.returnsFrom {@code return createComplex(real + addend, imaginary);}
 *  */
    @Test
    public void testAdd_ReturnCreateComplex() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.add(-1.2647540450507E-311);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(double)}
 * @utbot.returnsFrom {@code return createComplex(real + addend, imaginary);}
 *  */
    @Test
    public void testAdd_ReturnCreateComplex_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.5020091719925972);
        
        Complex actual = complex.add(-3.0040711380255325E-5);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.501979131281217);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(double)}
 * @utbot.returnsFrom {@code return createComplex(real + addend, imaginary);}
 *  */
    @Test
    public void testAdd_ReturnCreateComplex_2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0522684006491881E-289);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -5.6961890777784355E-306);
        
        Complex actual = complex.add(java.lang.Double.POSITIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.0522684006491881E-289);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(double)
    
    @Test
    public void testAdd1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 9.965017445349577E74);
        
        Complex actual = complex.add(-2.3161262058407575E77);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -2.306161188395408E77);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.8915829573914766E74);
        
        Complex actual = complex.add(1.5206456657909258E77);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.5167540828335342E77);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.add(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(org.apache.commons.math.complex.Complex)}
 * @utbot.returnsFrom {@code return createComplex(real + addend.getReal(), imaginary + addend.getImaginary());}
 *  */
    @Test
    public void testAdd_ReturnCreateComplex1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.5993059203660204E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 8.344026969402005E-309);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -1.112696128931236E-308);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.433708617306221E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(org.apache.commons.math.complex.Complex)}
 * @utbot.returnsFrom {@code return createComplex(real + addend.getReal(), imaginary + addend.getImaginary());}
 *  */
    @Test
    public void testAdd_ReturnCreateComplex_11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 9.3234394288E-313);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 2.783804490943227E-309);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 1.7716178191394E-311);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.864852213427E-311);
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
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(addend);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAdd_ThrowNullArgumentException() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        complex.add(((Complex) null));
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math.complex.Complex)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(org.apache.commons.math.complex.Complex)}
     */
    @Test(expected = NullArgumentException.class)
    public void testAddThrowsNAE() {
        Complex complex = new Complex(0.0, -0.0625);
        
        complex.add(((Complex) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.complex.Complex)
    
    @Test
    public void testAdd4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 8.455463862357968E-306);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.812074904647864E-309);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -1.890923439911685E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -7.855077051532284E-309);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 8.436554627958851E-306);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -4.04300214688442E-309);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
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
 * @utbot.executesCondition {@code (c.isNaN): True}
 * @utbot.returnsFrom {@code return isNaN;}
 *  */
    @Test
    public void testEquals_CIsNaN() throws Exception  {
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
 * @utbot.executesCondition {@code (c.isNaN): False}
 * @utbot.returnsFrom {@code return (real == c.real) && (imaginary == c.imaginary);}
 *  */
    @Test
    public void testEquals_RealEqualsCRealAndImaginaryEqualsCImaginary() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.2250738585072014E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -2.2250738585072014E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        boolean actual = complex.equals(complex1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): True}
 * @utbot.executesCondition {@code (c.isNaN): False}
 * @utbot.returnsFrom {@code return (real == c.real) && (imaginary == c.imaginary);}
 *  */
    @Test
    public void testEquals_RealNotEqualsCRealAndImaginaryNotEqualsCImaginary() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 6.805666809531989E38);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 5.415262147479773E-299);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -4.000007629394532);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 5.415262147479773E-299);
        
        boolean actual = complex.equals(complex1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Complex): True}
 * @utbot.executesCondition {@code (c.isNaN): False}
 * @utbot.returnsFrom {@code return (real == c.real) && (imaginary == c.imaginary);}
 *  */
    @Test
    public void testEquals_RealNotEqualsCRealAndImaginaryNotEqualsCImaginary_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.1209442765774E-311);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        String actual = complex.toString();
        
        String expected = "(0.0, 0.0)";
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 5.02168812290889E58);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.177810068960989E40);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(5.02168812290889E58, actual, 1.0E-6);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -896.0000000000001);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 272.25384546932946);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
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
    public void testSin6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0000000000000004);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.9092974268256815);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.68156158598852E154);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.15865756326011965);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -20.0);
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
    public void testSin9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
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
    public void testSin10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
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
    public void testSin11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.6815615859885194E154);
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
    public void testSin12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -896.0000000000001);
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
    public void testSin13() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
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
    public void testSin14() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 32.0);
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
    public void testSin15() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -896.0000000000001);
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
    public void testSin16() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
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
    public void testSin17() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 4.9E-324);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -896.0000000000001);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -896.0000000000001);
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
    public void testCos5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 32.0);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -20.0);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -896.0000000000001);
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
    public void testCos9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
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
    public void testCos10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.68156158598852E154);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.9873336708632807);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
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
    public void testCos12() throws Exception  {
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
    public void testCos13() throws Exception  {
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
    public void testCos14() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos15() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
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
    public void testCos16() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.68156158598852E154);
        
        Complex actual = complex.cos();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.9873336708632807);
        
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
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.7615941559557649);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 154018.0205078237);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.681561747070754E154);
        
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
    
    @Test
    public void testTan4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1.3407807929942597E154);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1.7846161501108355E-308);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -12293.063478473829);
        
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
    public void testTan8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
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
    public void testTan9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sqrt()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#sqrt()}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.executesCondition {@code (real == 0.0): True}
 * @utbot.executesCondition {@code (imaginary == 0.0): True}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(0.0, 0.0);}
 *  */
    @Test
    public void testSqrt_ImaginaryEqualsZero() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sqrt()
    
    @Test
    public void testSqrt1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.3761514708407654E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.532943021867E-310);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.0864785980436874E-154);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0935104819916666E-154);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt2() throws Exception  {
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
    public void testSqrt3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -5.56336434837208E-309);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 5.56336434837208E-309);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -3.3944226059218614E-155);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 8.194861091642382E-155);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.9E-324);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.450147717014404E-308);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.1095373229726E-154);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.000000000000001);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.4088837258807423E-132);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -8.853204668314913E-221);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -8.393103495968409E-67);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 8.393103495968407E-67);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.1125369292536007E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -7.458340731200207E-155);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 7.458340731200207E-155);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.086176502013783E-309);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 6.9568040509953E-310);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.248921428541597);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -710.7107390551275);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog2() throws Exception  {
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
    public void testLog3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.550430849419398E-297);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 7.218561144193211E-307);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.5707963263293123);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -683.4292397595589);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog4() throws Exception  {
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
    public void testLog5() throws Exception  {
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
    public void testLog6() throws Exception  {
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
    public void testLog7() throws Exception  {
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
    public void testLog8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.2261603203521756E-308);
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
    public void testLog9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
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
    public void testLog10() throws Exception  {
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
    public void testLog11() throws Exception  {
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
    public void testLog12() throws Exception  {
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
    public void testLog13() throws Exception  {
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
    public void testLog14() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2261603203521756E-308);
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
    public void testLog15() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2261603203521756E-308);
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
    public void testLog16() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2598406375463764E-308);
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
    public void testLog17() throws Exception  {
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
    public void testLog18() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.5707963267948968);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -707.9909534241559);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog19() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.78576700983676E-270);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 3.141592653589793);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -620.3667265974258);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog20() throws Exception  {
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
    
    @Test
    public void testLog21() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -7.2911220195563975E-304);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -697.9992108238649);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.pow
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method pow(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#pow(double)}
     */
    @Test
    public void testPow() throws Exception  {
        Complex complex = new Complex(0.0, -1.0);
        
        Complex actual = complex.pow(-1.1125369292536007E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.7475689218952297E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#pow(double)}
     */
    @Test
    public void testPow1() throws Exception  {
        Complex complex = new Complex(java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.pow(1.1235582092889474E307);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pow(double)
    
    @Test
    public void testPow2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -7.2911220195563975E-304);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.22724678219715E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2598406375463764E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.2882297539194267E-231);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.785766995733679E-270);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.785766995733679E-270);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.785766995733679E-270);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.2261603203521756E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2261603203521756E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 4.450181685557529E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.450181685557529E-308);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.78576700983676E-270);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow20() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.397037992367592E-215);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.8151437449107708E-276);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow21() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0000000000000004);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2250738585072014E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.2250738585072014E-308);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow23() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 16868.500000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.1030548683422776E-297);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow24() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.pow(java.lang.Double.NaN);
        
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
        
        complex.pow(((Complex) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pow(org.apache.commons.math.complex.Complex)
    
    @Test
    public void testPow25() throws Exception  {
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
    public void testPow26() throws Exception  {
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
    public void testPow27() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.2882297539194267E-231);
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
    public void testPow28() throws Exception  {
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
    public void testPow29() throws Exception  {
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
    public void testPow30() throws Exception  {
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
    public void testPow31() throws Exception  {
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
    public void testPow32() throws Exception  {
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
    public void testPow33() throws Exception  {
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
    public void testPow34() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
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
    public void testPow35() throws Exception  {
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
    public void testPow36() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
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
    public void testPow37() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.1729236899484E-311);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow38() throws Exception  {
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
    public void testPow39() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow40() throws Exception  {
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
    public void testPow41() throws Exception  {
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
    public void testPow42() throws Exception  {
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
    public void testPow43() throws Exception  {
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.68156158598852E154);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.9E-324);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -5.452672051269776E7);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1928.7579958501747);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -6.292427336864698E57);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
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
    public void testExp6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -66304.00032043469);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp7() throws Exception  {
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
    public void testExp8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 6.710957425007735E7);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
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
    public void testExp10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 5.231975621483507E297);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp11() throws Exception  {
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
    public void testExp12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4195014.263672536);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp13() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.68156158598852E154);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.2304644899916266E164);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp14() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -709.9999756217003);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 4.476395351252484E-309);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp17() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -719.000011458993);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 5.52411276036E-313);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.valueOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method valueOf(double)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#valueOf(double)}
 * @utbot.returnsFrom {@code return new Complex(realPart);}
 *  */
    @Test
    public void testValueOf_Return() throws Exception  {
        Complex actual = Complex.valueOf(3.337610787760802E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#valueOf(double)}
 * @utbot.returnsFrom {@code return new Complex(realPart);}
 *  */
    @Test
    public void testValueOf_Return_1() throws Exception  {
        Complex actual = Complex.valueOf(java.lang.Double.POSITIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#valueOf(double)}
 *  */
    @Test
    public void testValueOf() throws Exception  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(naN, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "isNaN", true);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            
            Complex actual = Complex.valueOf(java.lang.Double.NaN);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.valueOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method valueOf(double, double)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False},
    ///     {@code (Double.isNaN(realPart) || Double.isNaN(imaginaryPart)): True}
    /// invoke:
    ///     {@link java.lang.Double#isNaN(double)} 4 times
    /// execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.Double#isNaN(double)} twice
    /// execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.Double#isInfinite(double)} twice
    /// return from: {@code return new Complex(realPart, imaginaryPart);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#valueOf(double,double)}
 * @utbot.returnsFrom {@code return new Complex(realPart, imaginaryPart);}
 *  */
    @Test
    public void testValueOf_Return1() throws Exception  {
        Complex actual = Complex.valueOf(2.225073858507202E-308, -2.0078125);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -2.0078125);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 2.225073858507202E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#valueOf(double,double)}
 * @utbot.returnsFrom {@code return new Complex(realPart, imaginaryPart);}
 *  */
    @Test
    public void testValueOf_Return_11() throws Exception  {
        Complex actual = Complex.valueOf(java.lang.Double.POSITIVE_INFINITY, -2.8480945813291336E-306);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -2.8480945813291336E-306);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#valueOf(double,double)}
 * @utbot.returnsFrom {@code return new Complex(realPart, imaginaryPart);}
 *  */
    @Test
    public void testValueOf_Return_2() throws Exception  {
        Complex actual = Complex.valueOf(3.337610787760802E-308, java.lang.Double.POSITIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method valueOf(double, double)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// return from: {@code return NaN;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#valueOf(double,double)}
 *  */
    @Test
    public void testValueOf1() throws Exception  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(naN, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "isNaN", true);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            
            Complex actual = Complex.valueOf(java.lang.Double.NaN, java.lang.Double.NaN);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#valueOf(double,double)}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 *  */
    @Test
    public void testValueOf_DoubleIsNaN() throws Exception  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(naN, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
            setField(naN, "org.apache.commons.math.complex.Complex", "isNaN", true);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            
            Complex actual = Complex.valueOf(1.4916681462400417E-154, java.lang.Double.NaN);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.4916681462400413E-154);
        
        Complex actual = ((Complex) complex.readResolve());
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.2250738585072014E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.4916681462400413E-154);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 6.32E-322);
        
        Complex actual = ((Complex) complex.readResolve());
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 6.32E-322);
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
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#asin()}
     */
    @Test
    public void testAsin1() throws Exception  {
        Complex complex = new Complex(4.450147733592495E-308, -1.0);
        
        Complex actual = complex.asin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.8813735870195429);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 3.146729639705199E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method asin()
    
    @Test
    public void testAsin2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.asin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAsin3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
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
    public void testAcos3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
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
            setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.716154612436E-312);
            
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
            setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -66048.0);
            setField(complex, "org.apache.commons.math.complex.Complex", "real", 7.291122019557226E-304);
            
            Complex actual = complex.atan();
            
            Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.5140503877153281E-5);
            setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.5707963267948966);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Complex.class, "I", prevI);
        }
    }
    
    @Test
    public void testAtan3() throws Exception  {
        Complex prevI = Complex.I;
        try {
            Complex i = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(i, "org.apache.commons.math.complex.Complex", "imaginary", 1.0);
            setField(i, "org.apache.commons.math.complex.Complex", "real", 0.0);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "I", i);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.5);
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.multiply
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method multiply(double)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(double)}
     */
    @Test
    public void testMultiply() throws Exception  {
        Complex complex = new Complex(java.lang.Double.NaN);
        
        Complex actual = complex.multiply(1.1235582092889477E307);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(double)
    
    @Test
    public void testMultiply1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.multiply(-2.0000009536743164);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.multiply(java.lang.Double.NEGATIVE_INFINITY);
        
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiply(int)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(int)}
 * @utbot.executesCondition {@code (isNaN): False}
 * @utbot.executesCondition {@code (Double.isInfinite(real) || Double.isInfinite(imaginary)): False}
 * @utbot.invokes {@link java.lang.Double#isInfinite(double)}
 * @utbot.returnsFrom {@code return INF;}
 *  */
    @Test
    public void testMultiply_DoubleIsInfiniteOrDoubleIsInfinite() throws Exception  {
        Complex prevINF = Complex.INF;
        try {
            Complex inf = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(inf, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
            setField(inf, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
            setField(inf, "org.apache.commons.math.complex.Complex", "isInfinite", true);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
            
            Complex actual = complex.multiply(-255);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(inf, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(int)}
 * @utbot.executesCondition {@code (isNaN): True}
 * @utbot.returnsFrom {@code return NaN;}
 *  */
    @Test
    public void testMultiply_IsNaN() throws Exception  {
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
            
            Complex actual = complex.multiply(-255);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(int)
    
    @Test
    public void testMultiply4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.multiply(0);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
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
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(factor);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.39519326554E-313);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
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
    public void testMultiply7() throws Exception  {
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.39519326554E-313);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.781342323134002E-309);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
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
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 2.4044250729567197E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sinh()
    
    @Test
    public void testSinh1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.9092974268256815);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.9092974268256815);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.9E-324);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -4.9E-324);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.68156158598852E154);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.15865756326011965);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -8.589934592000002E9);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.8194607979058386);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -896.0000000000001);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 312144.062867668);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh13() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
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
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -3.744670181976722E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.5403023058681398);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method cosh()
    
    @Test
    public void testCosh1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.9E-324);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.684361664375E8);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 710.0000611548855);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 710.0007553101112);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 710.0000611548855);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.68156158598852E154);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.68156158598852E154);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -896.0000000000001);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
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
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.5244064760038671E-307);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tanh()
    
    @Test
    public void testTanh1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 284.0020171701934);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.416585E-318);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
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
    public void testTanh5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.0252468726739156E308);
        
        Complex actual = complex.tanh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTanh6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1.5309621524471578E308);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.1125369292536007E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.0E-323);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.1125369292536007E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -4.0E-323);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.2882297539194272E-231);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.2882297539194272E-231);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
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
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(divisor);
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
    public void testDivide2() throws Exception  {
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
    public void testDivide3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 4.500000000000001);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -2.0009765625);
        setField(complex1, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.divide(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide5() throws Exception  {
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
    public void testDivide6() throws Exception  {
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
    public void testDivide7() throws Exception  {
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
    public void testDivide8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 1.73833895195875E-310);
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
    public void testDivide9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -4.9E-324);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.divide
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method divide(double)
    
    @Test
    public void testDivide11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.divide(java.lang.Double.NEGATIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.divide(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide13() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.divide(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide14() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.divide(java.lang.Double.NEGATIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(double)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(double)}
 * @utbot.executesCondition {@code (isNaN || Double.isNaN(subtrahend)): True}
 * @utbot.invokes {@link java.lang.Double#isNaN(double)}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(real - subtrahend, imaginary);}
 *  */
    @Test
    public void testSubtract_IsNaNOrDoubleIsNaN() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.subtract(-9.556619453194827E-299);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(double)
    
    @Test
    public void testSubtract1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.subtract(-6.7348499E-316);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -8.637915258906252E163);
        
        Complex actual = complex.subtract(8.930366198580527E163);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -1.756828145748678E164);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.subtract(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.1280498146056328E12);
        
        Complex actual = complex.subtract(1.717986929121071E10);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.110869945314422E12);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.subtract(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(org.apache.commons.math.complex.Complex)}
 * @utbot.returnsFrom {@code return createComplex(real - subtrahend.getReal(), imaginary - subtrahend.getImaginary());}
 *  */
    @Test
    public void testSubtract_ReturnCreateComplex() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 1.3387612079446852E-307);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(org.apache.commons.math.complex.Complex)}
 * @utbot.returnsFrom {@code return createComplex(real - subtrahend.getReal(), imaginary - subtrahend.getImaginary());}
 *  */
    @Test
    public void testSubtract_ReturnCreateComplex_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 273.65474075084785);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.08048215320752672);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 273.5742585976403);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(org.apache.commons.math.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NullArgumentException} in: MathUtils.checkNotNull(subtrahend);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSubtract_ThrowNullArgumentException() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        complex.subtract(((Complex) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math.complex.Complex)
    
    @Test
    public void testSubtract6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.858848199410826E-309);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.9843742549419403);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -1.8100456989785486E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 2.0063486403091737);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.324160879037466E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.021974385367233396);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract8() throws Exception  {
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-2.356194490192345, actual, 1.0E-6);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(2.356194490192345, actual, 1.0E-6);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-0.7853981633974483, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.2250738585072014E-308);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 7.291122019556399E-304);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -7.291122019556399E-304);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -7.291122019556399E-304);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-3.141592653589793, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 7.291122019556399E-304);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(1.570750550427741, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 5.06E-321);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 6.63123685E-316);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -5.06E-321);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 6.63123685E-316);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.32624737E-315);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.32624737E-315);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.0E-323);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0E-323);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.785766995733679E-270);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 3.785766995733679E-270);
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
        
        Complex actual = complex.createComplex(2.225074389006149E-308, -2.2250738585072014E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -2.2250738585072014E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 2.225074389006149E-308);
        
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
        
        Complex actual = complex.createComplex(java.lang.Double.NEGATIVE_INFINITY, -1.780059086805762E-307);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.780059086805762E-307);
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
        
        Complex actual = complex.createComplex(1.2882297539194272E-231, java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.2882297539194272E-231);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.nthRoot
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method nthRoot(int)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#nthRoot(int)}
 * @utbot.executesCondition {@code (n <= 0): True}
 * @utbot.throwsException {@link org.apache.commons.math.exception.NotPositiveException} in: for(int k = 0; k < n; k++)
 *  */
    @Test(expected = NotPositiveException.class)
    public void testNthRoot_ThrowNotPositiveException() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        complex.nthRoot(0);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method nthRoot(int)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#nthRoot(int)}
     */
    @Test
    public void testNthRoot() throws Exception  {
        Complex complex = new Complex(0.0, -1.0);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(70));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -0.022438064295804937);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.9997482349425065);
        expected.add(complex1);
        Complex complex2 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex2, "org.apache.commons.math.complex.Complex", "imaginary", 0.06726900561203965);
        setField(complex2, "org.apache.commons.math.complex.Complex", "real", 0.9977348750464561);
        expected.add(complex2);
        Complex complex3 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex3, "org.apache.commons.math.complex.Complex", "imaginary", 0.15643446504023087);
        setField(complex3, "org.apache.commons.math.complex.Complex", "real", 0.9876883405951378);
        expected.add(complex3);
        Complex complex4 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex4, "org.apache.commons.math.complex.Complex", "imaginary", 0.244340406137894);
        setField(complex4, "org.apache.commons.math.complex.Complex", "real", 0.9696895203766869);
        expected.add(complex4);
        Complex complex5 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex5, "org.apache.commons.math.complex.Complex", "imaginary", 0.3302790619551671);
        setField(complex5, "org.apache.commons.math.complex.Complex", "real", 0.9438833303083676);
        expected.add(complex5);
        Complex complex6 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex6, "org.apache.commons.math.complex.Complex", "imaginary", 0.41355850496652063);
        setField(complex6, "org.apache.commons.math.complex.Complex", "real", 0.910477546658816);
        expected.add(complex6);
        Complex complex7 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex7, "org.apache.commons.math.complex.Complex", "imaginary", 0.49350821806434686);
        setField(complex7, "org.apache.commons.math.complex.Complex", "real", 0.8697411331556955);
        expected.add(complex7);
        Complex complex8 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex8, "org.apache.commons.math.complex.Complex", "imaginary", 0.569484493168452);
        setField(complex8, "org.apache.commons.math.complex.Complex", "real", 0.8220020754479099);
        expected.add(complex8);
        Complex complex9 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex9, "org.apache.commons.math.complex.Complex", "imaginary", 0.6408756139850241);
        setField(complex9, "org.apache.commons.math.complex.Complex", "real", 0.7676447403580111);
        expected.add(complex9);
        Complex complex10 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex10, "org.apache.commons.math.complex.Complex", "imaginary", 0.7071067811865475);
        setField(complex10, "org.apache.commons.math.complex.Complex", "real", 0.7071067811865476);
        expected.add(complex10);
        Complex complex11 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex11, "org.apache.commons.math.complex.Complex", "imaginary", 0.7676447403580111);
        setField(complex11, "org.apache.commons.math.complex.Complex", "real", 0.6408756139850241);
        expected.add(complex11);
        Complex complex12 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex12, "org.apache.commons.math.complex.Complex", "imaginary", 0.8220020754479098);
        setField(complex12, "org.apache.commons.math.complex.Complex", "real", 0.5694844931684521);
        expected.add(complex12);
        Complex complex13 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex13, "org.apache.commons.math.complex.Complex", "imaginary", 0.8697411331556953);
        setField(complex13, "org.apache.commons.math.complex.Complex", "real", 0.4935082180643469);
        expected.add(complex13);
        Complex complex14 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex14, "org.apache.commons.math.complex.Complex", "imaginary", 0.9104775466588159);
        setField(complex14, "org.apache.commons.math.complex.Complex", "real", 0.4135585049665207);
        expected.add(complex14);
        Complex complex15 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex15, "org.apache.commons.math.complex.Complex", "imaginary", 0.9438833303083676);
        setField(complex15, "org.apache.commons.math.complex.Complex", "real", 0.33027906195516715);
        expected.add(complex15);
        Complex complex16 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex16, "org.apache.commons.math.complex.Complex", "imaginary", 0.9696895203766869);
        setField(complex16, "org.apache.commons.math.complex.Complex", "real", 0.24434040613789407);
        expected.add(complex16);
        Complex complex17 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex17, "org.apache.commons.math.complex.Complex", "imaginary", 0.9876883405951378);
        setField(complex17, "org.apache.commons.math.complex.Complex", "real", 0.15643446504023092);
        expected.add(complex17);
        Complex complex18 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex18, "org.apache.commons.math.complex.Complex", "imaginary", 0.9977348750464561);
        setField(complex18, "org.apache.commons.math.complex.Complex", "real", 0.06726900561203972);
        expected.add(complex18);
        Complex complex19 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex19, "org.apache.commons.math.complex.Complex", "imaginary", 0.9997482349425065);
        setField(complex19, "org.apache.commons.math.complex.Complex", "real", -0.022438064295804874);
        expected.add(complex19);
        Complex complex20 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex20, "org.apache.commons.math.complex.Complex", "imaginary", 0.9937122098932426);
        setField(complex20, "org.apache.commons.math.complex.Complex", "real", -0.1119644761033078);
        expected.add(complex20);
        Complex complex21 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex21, "org.apache.commons.math.complex.Complex", "imaginary", 0.9796753984232356);
        setField(complex21, "org.apache.commons.math.complex.Complex", "real", -0.20058941578327272);
        expected.add(complex21);
        Complex complex22 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex22, "org.apache.commons.math.complex.Complex", "imaginary", 0.9577508166849306);
        setField(complex22, "org.apache.commons.math.complex.Complex", "real", -0.2875993274320172);
        expected.add(complex22);
        Complex complex23 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex23, "org.apache.commons.math.complex.Complex", "imaginary", 0.928114988519039);
        setField(complex23, "org.apache.commons.math.complex.Complex", "real", -0.3722936584019451);
        expected.add(complex23);
        Complex complex24 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex24, "org.apache.commons.math.complex.Complex", "imaginary", 0.8910065241883679);
        setField(complex24, "org.apache.commons.math.complex.Complex", "real", -0.4539904997395467);
        expected.add(complex24);
        Complex complex25 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex25, "org.apache.commons.math.complex.Complex", "imaginary", 0.8467241992282842);
        setField(complex25, "org.apache.commons.math.complex.Complex", "real", -0.5320320765153365);
        expected.add(complex25);
        Complex complex26 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex26, "org.apache.commons.math.complex.Complex", "imaginary", 0.795624548881781);
        setField(complex26, "org.apache.commons.math.complex.Complex", "real", -0.6057900438408198);
        expected.add(complex26);
        Complex complex27 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex27, "org.apache.commons.math.complex.Complex", "imaginary", 0.7381189974873407);
        setField(complex27, "org.apache.commons.math.complex.Complex", "real", -0.6746705459320743);
        expected.add(complex27);
        Complex complex28 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex28, "org.apache.commons.math.complex.Complex", "imaginary", 0.6746705459320744);
        setField(complex28, "org.apache.commons.math.complex.Complex", "real", -0.7381189974873406);
        expected.add(complex28);
        Complex complex29 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex29, "org.apache.commons.math.complex.Complex", "imaginary", 0.6057900438408199);
        setField(complex29, "org.apache.commons.math.complex.Complex", "real", -0.7956245488817809);
        expected.add(complex29);
        Complex complex30 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex30, "org.apache.commons.math.complex.Complex", "imaginary", 0.5320320765153367);
        setField(complex30, "org.apache.commons.math.complex.Complex", "real", -0.8467241992282841);
        expected.add(complex30);
        Complex complex31 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex31, "org.apache.commons.math.complex.Complex", "imaginary", 0.45399049973954686);
        setField(complex31, "org.apache.commons.math.complex.Complex", "real", -0.8910065241883678);
        expected.add(complex31);
        Complex complex32 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex32, "org.apache.commons.math.complex.Complex", "imaginary", 0.3722936584019453);
        setField(complex32, "org.apache.commons.math.complex.Complex", "real", -0.9281149885190388);
        expected.add(complex32);
        Complex complex33 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex33, "org.apache.commons.math.complex.Complex", "imaginary", 0.2875993274320174);
        setField(complex33, "org.apache.commons.math.complex.Complex", "real", -0.9577508166849305);
        expected.add(complex33);
        Complex complex34 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex34, "org.apache.commons.math.complex.Complex", "imaginary", 0.20058941578327288);
        setField(complex34, "org.apache.commons.math.complex.Complex", "real", -0.9796753984232355);
        expected.add(complex34);
        Complex complex35 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex35, "org.apache.commons.math.complex.Complex", "imaginary", 0.11196447610330798);
        setField(complex35, "org.apache.commons.math.complex.Complex", "real", -0.9937122098932426);
        expected.add(complex35);
        Complex complex36 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex36, "org.apache.commons.math.complex.Complex", "imaginary", 0.022438064295805058);
        setField(complex36, "org.apache.commons.math.complex.Complex", "real", -0.9997482349425065);
        expected.add(complex36);
        Complex complex37 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex37, "org.apache.commons.math.complex.Complex", "imaginary", -0.06726900561203952);
        setField(complex37, "org.apache.commons.math.complex.Complex", "real", -0.9977348750464561);
        expected.add(complex37);
        Complex complex38 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex38, "org.apache.commons.math.complex.Complex", "imaginary", -0.15643446504023073);
        setField(complex38, "org.apache.commons.math.complex.Complex", "real", -0.9876883405951378);
        expected.add(complex38);
        Complex complex39 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex39, "org.apache.commons.math.complex.Complex", "imaginary", -0.2443404061378939);
        setField(complex39, "org.apache.commons.math.complex.Complex", "real", -0.9696895203766869);
        expected.add(complex39);
        Complex complex40 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex40, "org.apache.commons.math.complex.Complex", "imaginary", -0.33027906195516693);
        setField(complex40, "org.apache.commons.math.complex.Complex", "real", -0.9438833303083676);
        expected.add(complex40);
        Complex complex41 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex41, "org.apache.commons.math.complex.Complex", "imaginary", -0.4135585049665205);
        setField(complex41, "org.apache.commons.math.complex.Complex", "real", -0.910477546658816);
        expected.add(complex41);
        Complex complex42 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex42, "org.apache.commons.math.complex.Complex", "imaginary", -0.49350821806434675);
        setField(complex42, "org.apache.commons.math.complex.Complex", "real", -0.8697411331556955);
        expected.add(complex42);
        Complex complex43 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex43, "org.apache.commons.math.complex.Complex", "imaginary", -0.5694844931684518);
        setField(complex43, "org.apache.commons.math.complex.Complex", "real", -0.8220020754479099);
        expected.add(complex43);
        Complex complex44 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex44, "org.apache.commons.math.complex.Complex", "imaginary", -0.640875613985024);
        setField(complex44, "org.apache.commons.math.complex.Complex", "real", -0.7676447403580112);
        expected.add(complex44);
        Complex complex45 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex45, "org.apache.commons.math.complex.Complex", "imaginary", -0.7071067811865475);
        setField(complex45, "org.apache.commons.math.complex.Complex", "real", -0.7071067811865477);
        expected.add(complex45);
        Complex complex46 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex46, "org.apache.commons.math.complex.Complex", "imaginary", -0.767644740358011);
        setField(complex46, "org.apache.commons.math.complex.Complex", "real", -0.6408756139850242);
        expected.add(complex46);
        Complex complex47 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex47, "org.apache.commons.math.complex.Complex", "imaginary", -0.8220020754479098);
        setField(complex47, "org.apache.commons.math.complex.Complex", "real", -0.5694844931684522);
        expected.add(complex47);
        Complex complex48 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex48, "org.apache.commons.math.complex.Complex", "imaginary", -0.8697411331556953);
        setField(complex48, "org.apache.commons.math.complex.Complex", "real", -0.49350821806434697);
        expected.add(complex48);
        Complex complex49 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex49, "org.apache.commons.math.complex.Complex", "imaginary", -0.9104775466588159);
        setField(complex49, "org.apache.commons.math.complex.Complex", "real", -0.4135585049665208);
        expected.add(complex49);
        Complex complex50 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex50, "org.apache.commons.math.complex.Complex", "imaginary", -0.9438833303083675);
        setField(complex50, "org.apache.commons.math.complex.Complex", "real", -0.33027906195516726);
        expected.add(complex50);
        Complex complex51 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex51, "org.apache.commons.math.complex.Complex", "imaginary", -0.9696895203766868);
        setField(complex51, "org.apache.commons.math.complex.Complex", "real", -0.2443404061378942);
        expected.add(complex51);
        Complex complex52 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex52, "org.apache.commons.math.complex.Complex", "imaginary", -0.9876883405951377);
        setField(complex52, "org.apache.commons.math.complex.Complex", "real", -0.15643446504023104);
        expected.add(complex52);
        Complex complex53 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex53, "org.apache.commons.math.complex.Complex", "imaginary", -0.9977348750464561);
        setField(complex53, "org.apache.commons.math.complex.Complex", "real", -0.06726900561203983);
        expected.add(complex53);
        Complex complex54 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex54, "org.apache.commons.math.complex.Complex", "imaginary", -0.9997482349425065);
        setField(complex54, "org.apache.commons.math.complex.Complex", "real", 0.022438064295804753);
        expected.add(complex54);
        Complex complex55 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex55, "org.apache.commons.math.complex.Complex", "imaginary", -0.9937122098932426);
        setField(complex55, "org.apache.commons.math.complex.Complex", "real", 0.11196447610330768);
        expected.add(complex55);
        Complex complex56 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex56, "org.apache.commons.math.complex.Complex", "imaginary", -0.9796753984232356);
        setField(complex56, "org.apache.commons.math.complex.Complex", "real", 0.20058941578327258);
        expected.add(complex56);
        Complex complex57 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex57, "org.apache.commons.math.complex.Complex", "imaginary", -0.9577508166849306);
        setField(complex57, "org.apache.commons.math.complex.Complex", "real", 0.28759932743201705);
        expected.add(complex57);
        Complex complex58 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex58, "org.apache.commons.math.complex.Complex", "imaginary", -0.928114988519039);
        setField(complex58, "org.apache.commons.math.complex.Complex", "real", 0.372293658401945);
        expected.add(complex58);
        Complex complex59 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex59, "org.apache.commons.math.complex.Complex", "imaginary", -0.8910065241883679);
        setField(complex59, "org.apache.commons.math.complex.Complex", "real", 0.45399049973954664);
        expected.add(complex59);
        Complex complex60 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex60, "org.apache.commons.math.complex.Complex", "imaginary", -0.8467241992282842);
        setField(complex60, "org.apache.commons.math.complex.Complex", "real", 0.5320320765153363);
        expected.add(complex60);
        Complex complex61 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex61, "org.apache.commons.math.complex.Complex", "imaginary", -0.7956245488817811);
        setField(complex61, "org.apache.commons.math.complex.Complex", "real", 0.6057900438408197);
        expected.add(complex61);
        Complex complex62 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex62, "org.apache.commons.math.complex.Complex", "imaginary", -0.7381189974873408);
        setField(complex62, "org.apache.commons.math.complex.Complex", "real", 0.6746705459320742);
        expected.add(complex62);
        Complex complex63 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex63, "org.apache.commons.math.complex.Complex", "imaginary", -0.6746705459320745);
        setField(complex63, "org.apache.commons.math.complex.Complex", "real", 0.7381189974873404);
        expected.add(complex63);
        Complex complex64 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex64, "org.apache.commons.math.complex.Complex", "imaginary", -0.60579004384082);
        setField(complex64, "org.apache.commons.math.complex.Complex", "real", 0.7956245488817809);
        expected.add(complex64);
        Complex complex65 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex65, "org.apache.commons.math.complex.Complex", "imaginary", -0.5320320765153368);
        setField(complex65, "org.apache.commons.math.complex.Complex", "real", 0.846724199228284);
        expected.add(complex65);
        Complex complex66 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex66, "org.apache.commons.math.complex.Complex", "imaginary", -0.45399049973954697);
        setField(complex66, "org.apache.commons.math.complex.Complex", "real", 0.8910065241883678);
        expected.add(complex66);
        Complex complex67 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex67, "org.apache.commons.math.complex.Complex", "imaginary", -0.3722936584019454);
        setField(complex67, "org.apache.commons.math.complex.Complex", "real", 0.9281149885190388);
        expected.add(complex67);
        Complex complex68 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex68, "org.apache.commons.math.complex.Complex", "imaginary", -0.2875993274320175);
        setField(complex68, "org.apache.commons.math.complex.Complex", "real", 0.9577508166849305);
        expected.add(complex68);
        Complex complex69 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex69, "org.apache.commons.math.complex.Complex", "imaginary", -0.200589415783273);
        setField(complex69, "org.apache.commons.math.complex.Complex", "real", 0.9796753984232355);
        expected.add(complex69);
        Complex complex70 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex70, "org.apache.commons.math.complex.Complex", "imaginary", -0.11196447610330809);
        setField(complex70, "org.apache.commons.math.complex.Complex", "real", 0.9937122098932426);
        expected.add(complex70);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method nthRoot(int)
    
    @Test
    public void testNthRoot1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 4.9E-324);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 4.9E-324);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(complex1, "org.apache.commons.math.complex.Complex", "isNaN", true);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.1125369292536007E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -1.1125369292536007E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.848094539054999E-306);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.848094539054999E-306);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -2.848094539054999E-306);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 2.8480945390549993E-306);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.225082346490365E-308);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 2.2250823464903648E-308);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 3.337610787760802E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(complex1, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(complex1, "org.apache.commons.math.complex.Complex", "isNaN", true);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.641767935156352E-158);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0128592304505944E-233);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(2));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -1.349401336733507E-79);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 1.3494013367335073E-79);
        expected.add(complex1);
        Complex complex2 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex2, "org.apache.commons.math.complex.Complex", "imaginary", 1.3494013367335073E-79);
        setField(complex2, "org.apache.commons.math.complex.Complex", "real", -1.349401336733507E-79);
        expected.add(complex2);
        
        assertTrue(deepEquals(expected, actual));
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
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.reciprocal
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reciprocal()
    
    @Test
    public void testReciprocal1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.03035346985252E-115);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.752729482307337E-212);
        
        Complex actual = complex.reciprocal();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 4.925250774549309E114);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.15292164204579994E18);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.451359522866695E201);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.reciprocal();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0000000000000004);
        
        Complex actual = complex.reciprocal();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.4999999999999999);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        Complex actual = complex.reciprocal();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        
        Complex actual = complex.reciprocal();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.9961552247705263E307);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -4.4352006878549327E291);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2250738585072014E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.reciprocal();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.reciprocal();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2250738585072014E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.reciprocal();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -4.49423283715579E307);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.sqrt1z();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt1z2() throws Exception  {
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
    public void testSqrt1z3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.144523E-317);
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields726619947142500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields726619947142500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass726619947148000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields726619947142500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass726619947148000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
        
            java.lang.reflect.Method methodForGetDeclaredFields726619947733700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields726619947733700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass726619947745400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields726619947733700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass726619947745400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getStaticFieldValue(Class<?> clazz, String fieldName) throws IllegalAccessException, NoSuchFieldException {
        java.lang.reflect.Field field;
        Class<?> originClass = clazz;
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                
                java.lang.reflect.Field modifiersField;
                
            java.lang.reflect.Method methodForGetDeclaredFields726619948384700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields726619948384700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass726619948386300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields726619948384700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass726619948386300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

