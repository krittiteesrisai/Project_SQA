package org.apache.commons.math.complex;

import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class org_apache_commons_math_complex_ComplexTest {
    ///region Test suites for executable org.apache.commons.math.complex.Complex.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(org.apache.commons.math.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#getReal()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#getImaginary()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(real + rhs.getReal(), imaginary + rhs.getImaginary());}
 *  */
    @Test
    public void testAdd_ComplexGetImaginary() {
        Complex complex = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        Complex actual = complex.add(complex);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method add(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(org.apache.commons.math.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#getReal()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return createComplex(real + rhs.getReal(), imaginary + rhs.getImaginary());
 *  */
    @Test
    public void testAdd_ThrowNullPointerException() {
        Complex complex = new Complex(0.0, 0.0);
        
        /* This test fails because method [org.apache.commons.math.complex.Complex.add] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.Complex.add(Complex.java:133) */
        complex.add(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.returnsFrom {@code return ret;}
 * @utbot.caughtException {@code ClassCastException ex}
 *  */
    @Test
    public void testEquals_CatchClassCastException() {
        Complex complex = new Complex(0.0, 0.0);
        byte[] byteArray = {};
        
        boolean actual = complex.equals(byteArray);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_OtherEqualsNull() {
        Complex complex = new Complex(0.0, 0.0);
        
        boolean actual = complex.equals(null);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_Other() {
        Complex complex = new Complex(0.0, 0.0);
        
        boolean actual = complex.equals(complex);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.executesCondition {@code (rhs.isNaN()): False}
 * @utbot.executesCondition {@code (ret = (Double.doubleToRawLongBits(real) == Double.doubleToRawLongBits(rhs.getReal())) && (Double.doubleToRawLongBits(imaginary) == Double.doubleToRawLongBits(rhs.getImaginary()));): False}
 * @utbot.invokes {@link java.lang.Double#doubleToRawLongBits(double)}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#getReal()}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_NotRhsIsNaN() {
        Complex complex = new Complex(0.0, 0.0);
        Complex complex1 = new Complex(-2.0, 2.0);
        
        boolean actual = complex.equals(complex1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.executesCondition {@code (rhs.isNaN()): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_RhsIsNaN() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        Complex complex1 = new Complex(-0.0, java.lang.Double.NaN);
        
        boolean actual = complex.equals(complex1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other == null): False}
 * @utbot.executesCondition {@code (rhs.isNaN()): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testEquals_RhsIsNaN_1() {
        Complex complex = new Complex(-2.0000000000000004, -2.0000000000000004);
        Complex complex1 = new Complex(java.lang.Double.NaN, 0.0);
        
        boolean actual = complex.equals(complex1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#hashCode()}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#hash(double)}
 * @utbot.invokes {@link org.apache.commons.math.util.MathUtils#hash(double)}
 * @utbot.returnsFrom {@code return 37 * (17 * MathUtils.hash(imaginary) + MathUtils.hash(real));}
 *  */
    @Test
    public void testHashCode_MathUtilsHash() {
        Complex complex = new Complex(-2.0, 2.0);
        
        int actual = complex.hashCode();
        
        assertEquals(0, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#hashCode()}
 * @utbot.returnsFrom {@code return 7;}
 *  */
    @Test
    public void testHashCode_Return7() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        
        int actual = complex.hashCode();
        
        assertEquals(7, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#hashCode()}
 * @utbot.returnsFrom {@code return 7;}
 *  */
    @Test
    public void testHashCode_Return7_1() {
        Complex complex = new Complex(2.0, java.lang.Double.NaN);
        
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
 * @utbot.executesCondition {@code (Math.abs(real) < Math.abs(imaginary)): True}
 * @utbot.executesCondition {@code (imaginary == 0.0): False}
 * @utbot.invokes {@link java.lang.Math#abs(double)}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 * @utbot.returnsFrom {@code return (Math.abs(imaginary) * Math.sqrt(1 + q * q));}
 *  */
    @Test
    public void testAbs_ImaginaryNotEqualsZero() {
        Complex complex = new Complex(9.1521429793E-314, -2.225076312064835E-308);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(2.225076312083657E-308, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testAbs_ReturnDoublePOSITIVE_INFINITY() {
        Complex complex = new Complex(java.lang.Double.NEGATIVE_INFINITY, 2.0);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.returnsFrom {@code return Double.POSITIVE_INFINITY;}
 *  */
    @Test
    public void testAbs_ReturnDoublePOSITIVE_INFINITY_1() {
        Complex complex = new Complex(2.2250738585072014E-308, java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(java.lang.Double.POSITIVE_INFINITY, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.executesCondition {@code (Math.abs(real) < Math.abs(imaginary)): False}
 * @utbot.executesCondition {@code (real == 0.0): False}
 * @utbot.invokes {@link java.lang.Math#abs(double)}
 * @utbot.invokes {@link java.lang.Math#sqrt(double)}
 * @utbot.returnsFrom {@code return (Math.abs(real) * Math.sqrt(1 + q * q));}
 *  */
    @Test
    public void testAbs_RealNotEqualsZero() {
        Complex complex = new Complex(2.0000000000000004, -2.237502219360062E-154);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(2.0000000000000004, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.executesCondition {@code (Math.abs(real) < Math.abs(imaginary)): False}
 * @utbot.executesCondition {@code (real == 0.0): True}
 * @utbot.invokes {@link java.lang.Math#abs(double)}
 * @utbot.returnsFrom {@code return Math.abs(imaginary);}
 *  */
    @Test
    public void testAbs_RealEqualsZero() {
        Complex complex = new Complex(-0.0, -0.0);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testAbs_ReturnDoubleNaN() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#abs()}
 * @utbot.returnsFrom {@code return Double.NaN;}
 *  */
    @Test
    public void testAbs_ReturnDoubleNaN_1() {
        Complex complex = new Complex(2.0, java.lang.Double.NaN);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.sin
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sin()
    
    @Test
    public void testSin1() {
        Complex complex = new Complex(-2.2250738585072014E-308, 2002.2664382038824);
        
        Complex actual = complex.sin();
        
        Complex expected = new Complex(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin2() {
        Complex complex = new Complex(1.7800590868057611E-307, java.lang.Double.NaN);
        
        Complex actual = complex.sin();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSin3() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        
        Complex actual = complex.sin();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.cos
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method cos()
    
    @Test
    public void testCos1() {
        Complex complex = new Complex(4.7783097267364807E-299, 1.0E300);
        
        Complex actual = complex.cos();
        
        Complex expected = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos2() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        
        Complex actual = complex.cos();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCos3() {
        Complex complex = new Complex(-0.0, java.lang.Double.NaN);
        
        Complex actual = complex.cos();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
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
    public void testTan() {
        Complex complex = new Complex(java.lang.Double.NaN, java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.tan();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tan()
    
    @Test
    public void testTan1() {
        Complex complex = new Complex(-2.0, -2.0);
        
        Complex actual = complex.tan();
        
        Complex expected = new Complex(0.028392952868232287, -1.0238355945704727);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTan2() {
        Complex complex = new Complex(-0.0, java.lang.Double.NaN);
        
        Complex actual = complex.tan();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
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
 * @utbot.executesCondition {@code (real == 0.0): True}
 * @utbot.executesCondition {@code (imaginary == 0.0): True}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(0.0, 0.0);}
 *  */
    @Test
    public void testSqrt_ImaginaryEqualsZero() {
        Complex complex = new Complex(-0.0, -0.0);
        
        Complex actual = complex.sqrt();
        
        Complex expected = new Complex(0.0, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#sqrt()}
 *  */
    @Test
    public void testSqrt() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
            Complex actual = complex.sqrt();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#sqrt()}
 *  */
    @Test
    public void testSqrt_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(1.780059086808999E-307, java.lang.Double.NaN);
            
            Complex actual = complex.sqrt();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sqrt()
    
    @Test
    public void testSqrt1() {
        Complex complex = new Complex(-0.0, 3.337610787760802E-308);
        
        Complex actual = complex.sqrt();
        
        Complex expected = new Complex(1.2918225086599168E-154, 1.291822508659917E-154);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt2() {
        Complex complex = new Complex(java.lang.Double.NEGATIVE_INFINITY, 2.2250738585072014E-308);
        
        Complex actual = complex.sqrt();
        
        Complex expected = new Complex(0.0, java.lang.Double.POSITIVE_INFINITY);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt3() {
        Complex complex = new Complex(-2.0000000001164153, 2.2250738586367177E-308);
        
        Complex actual = complex.sqrt();
        
        Complex expected = new Complex(7.86682407018575E-309, 1.414213562414254);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt4() {
        Complex complex = new Complex(-2.2598406375463764E-308, java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.sqrt();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.log
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method log()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#log()}
 * @utbot.returnsFrom {@code return createComplex(Math.log(abs()), Math.atan2(imaginary, real));}
 *  */
    @Test
    public void testLog_ReturnCreateComplex() {
        Complex complex = new Complex(2.652494739E-315, 2.2250741237566757E-308);
        
        Complex actual = complex.log();
        
        Complex expected = new Complex(-708.3964184130548, 1.5707962075856212);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#log()}
 * @utbot.returnsFrom {@code return createComplex(Math.log(abs()), Math.atan2(imaginary, real));}
 *  */
    @Test
    public void testLog_ReturnCreateComplex_1() {
        Complex complex = new Complex(java.lang.Double.NEGATIVE_INFINITY, 2.0);
        
        Complex actual = complex.log();
        
        Complex expected = new Complex(java.lang.Double.POSITIVE_INFINITY, 3.141592653589793);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#log()}
 * @utbot.returnsFrom {@code return createComplex(Math.log(abs()), Math.atan2(imaginary, real));}
 *  */
    @Test
    public void testLog_ReturnCreateComplex_2() {
        Complex complex = new Complex(3.337610787760802E-308, java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.log();
        
        Complex expected = new Complex(java.lang.Double.POSITIVE_INFINITY, 1.5707963267948966);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#log()}
 * @utbot.returnsFrom {@code return createComplex(Math.log(abs()), Math.atan2(imaginary, real));}
 *  */
    @Test
    public void testLog_ReturnCreateComplex_3() {
        Complex complex = new Complex(2.034916513940389E236, -3.514776401986879E159);
        
        Complex actual = complex.log();
        
        Complex expected = new Complex(544.1205367395571, -1.7272337110188893E-77);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#log()}
 * @utbot.returnsFrom {@code return createComplex(Math.log(abs()), Math.atan2(imaginary, real));}
 *  */
    @Test
    public void testLog_ReturnCreateComplex_4() {
        Complex complex = new Complex(-0.0, -0.0);
        
        Complex actual = complex.log();
        
        Complex expected = new Complex(java.lang.Double.NEGATIVE_INFINITY, -3.141592653589793);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#log()}
 *  */
    @Test
    public void testLog() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(1.780059086808999E-307, java.lang.Double.NaN);
            
            Complex actual = complex.log();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#log()}
 *  */
    @Test
    public void testLog_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
            Complex actual = complex.log();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.pow
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method pow(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#pow(org.apache.commons.math.complex.Complex)}
 * @utbot.returnsFrom {@code return this.log().multiply(x).exp();}
 *  */
    @Test
    public void testPow_ReturnThisLogMultiplyXExp() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(2.53E-321, java.lang.Double.NaN);
            Complex complex1 = new Complex(0.0, 0.0);
            
            Complex actual = complex.pow(complex1);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#pow(org.apache.commons.math.complex.Complex)}
 * @utbot.returnsFrom {@code return this.log().multiply(x).exp();}
 *  */
    @Test
    public void testPow_ReturnThisLogMultiplyXExp_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            Complex complex1 = new Complex(0.0, 0.0);
            
            Complex actual = complex.pow(complex1);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pow(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#pow(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (x == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: x == null
 *  */
    @Test(expected = NullPointerException.class)
    public void testPow_ThrowNullPointerException() {
        Complex complex = new Complex(0.0, 0.0);
        
        complex.pow(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pow(org.apache.commons.math.complex.Complex)
    
    @Test
    public void testPow1() {
        Complex complex = new Complex(1.4916681462400413E-154, java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow2() {
        Complex complex = new Complex(-0.0, -0.0);
        Complex complex1 = new Complex(0.0, 0.0);
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow3() {
        Complex complex = new Complex(4.002453006804331, 4.452876777671931E-308);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = new Complex(257.5031087344645, 2.7368987369809436E-305);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow4() {
        Complex complex = new Complex(java.lang.Double.NEGATIVE_INFINITY, -2.0);
        Complex complex1 = new Complex(0.0, 0.0);
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow5() {
        Complex complex = new Complex(1.4916688575228412E-154, -4.000002145767213);
        Complex complex1 = new Complex(java.lang.Double.NaN, 0.0);
        
        Complex actual = complex.pow(complex1);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.exp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exp()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#exp()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.invokes {@link java.lang.Math#exp(double)}
 * @utbot.invokes {@link java.lang.Math#cos(double)}
 * @utbot.invokes {@link java.lang.Math#sin(double)}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(expReal * Math.cos(imaginary), expReal * Math.sin(imaginary));}
 *  */
    @Test
    public void testExp_ComplexCreateComplex() {
        Complex complex = new Complex(2.702511285879055E154, -2.0000000000000004);
        
        Complex actual = complex.exp();
        
        Complex expected = new Complex(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.NEGATIVE_INFINITY);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method exp()
    
    @Test
    public void testExp1() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        
        Complex actual = complex.exp();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp2() {
        Complex complex = new Complex(1.2882297539194267E-231, java.lang.Double.NaN);
        
        Complex actual = complex.exp();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.isNaN
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isNaN()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.returnsFrom {@code return Double.isNaN(real) || Double.isNaN(imaginary);}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaNOrDoubleIsNaN() {
        Complex complex = new Complex(2.0, 0.0);
        
        boolean actual = complex.isNaN();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.returnsFrom {@code return Double.isNaN(real) || Double.isNaN(imaginary);}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaNOrDoubleIsNaN_1() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        
        boolean actual = complex.isNaN();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.returnsFrom {@code return Double.isNaN(real) || Double.isNaN(imaginary);}
 *  */
    @Test
    public void testIsNaN_DoubleIsNaNOrDoubleIsNaN_2() {
        Complex complex = new Complex(2.0, java.lang.Double.NaN);
        
        boolean actual = complex.isNaN();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.isInfinite
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isInfinite()
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link java.lang.Double#isInfinite(double)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#isInfinite()}
 * @utbot.executesCondition {@code ((Double.isInfinite(real) || Double.isInfinite(imaginary))): True}
 * @utbot.executesCondition {@code ((Double.isInfinite(real) || Double.isInfinite(imaginary))): False}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(real) || Double.isInfinite(imaginary));}
 *  */
    @Test
    public void testIsInfinite_DoubleIsInfiniteOrDoubleIsInfinite() {
        Complex complex = new Complex(2.2250738585072014E-308, -2.0);
        
        boolean actual = complex.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#isInfinite()}
 * @utbot.executesCondition {@code ((Double.isInfinite(real) || Double.isInfinite(imaginary))): True}
 * @utbot.executesCondition {@code ((Double.isInfinite(real) || Double.isInfinite(imaginary))): True}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(real) || Double.isInfinite(imaginary));}
 *  */
    @Test
    public void testIsInfinite_DoubleIsInfiniteOrDoubleIsInfinite_1() {
        Complex complex = new Complex(2.2250738585072014E-308, java.lang.Double.NEGATIVE_INFINITY);
        
        boolean actual = complex.isInfinite();
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#isInfinite()}
 * @utbot.executesCondition {@code ((Double.isInfinite(real) || Double.isInfinite(imaginary))): False}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(real) || Double.isInfinite(imaginary));}
 *  */
    @Test
    public void testIsInfinite_DoubleIsInfiniteOrDoubleIsInfinite_2() {
        Complex complex = new Complex(java.lang.Double.POSITIVE_INFINITY, 2.0);
        
        boolean actual = complex.isInfinite();
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isInfinite()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#isInfinite()}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(real) || Double.isInfinite(imaginary));}
 *  */
    @Test
    public void testIsInfinite_ReturnNotIsNaNAndDoubleIsInfiniteOrDoubleIsInfinite() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        
        boolean actual = complex.isInfinite();
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#isInfinite()}
 * @utbot.returnsFrom {@code return !isNaN() && (Double.isInfinite(real) || Double.isInfinite(imaginary));}
 *  */
    @Test
    public void testIsInfinite_ReturnNotIsNaNAndDoubleIsInfiniteOrDoubleIsInfinite_1() {
        Complex complex = new Complex(2.0, java.lang.Double.NaN);
        
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
 *  */
    @Test
    public void testAsin() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(2.0237E-320, java.lang.Double.NaN);
            
            Complex actual = complex.asin();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#asin()}
 *  */
    @Test
    public void testAsin_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
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
    public void testAsin1() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.asin();
        
        Complex expected = new Complex(3.1467296279827175E-308, -0.8813735870195429);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method asin()
    
    @Test
    public void testAsin2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevINF = Complex.INF;
        try {
            Complex inf = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex complex = new Complex(java.lang.Double.NEGATIVE_INFINITY, 8.0948E-320);
            
            Complex actual = complex.asin();
            
            Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
        }
    }
    
    @Test
    public void testAsin3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevINF = Complex.INF;
        try {
            Complex inf = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex complex = new Complex(1.2882297539194267E-231, java.lang.Double.NEGATIVE_INFINITY);
            
            Complex actual = complex.asin();
            
            Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.acos
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method acos()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#acos()}
 *  */
    @Test
    public void testAcos() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(1.780059086808999E-307, java.lang.Double.NaN);
            
            Complex actual = complex.acos();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#acos()}
 *  */
    @Test
    public void testAcos_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
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
    public void testAcos1() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.acos();
        
        Complex expected = new Complex(1.5707963267948966, 0.8813735870195428);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method acos()
    
    @Test
    public void testAcos2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevINF = Complex.INF;
        try {
            Complex inf = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex complex = new Complex(2.0, java.lang.Double.NEGATIVE_INFINITY);
            
            Complex actual = complex.acos();
            
            Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
        }
    }
    
    @Test
    public void testAcos3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevINF = Complex.INF;
        Complex prevI = Complex.I;
        try {
            Complex inf = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex i = new Complex(0.0, 1.0);
            setStaticField(complexClazz, "I", i);
            Complex complex = new Complex(java.lang.Double.POSITIVE_INFINITY, -1.4916681462400413E-154);
            
            Complex actual = complex.acos();
            
            Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
            setStaticField(Complex.class, "I", prevI);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.atan
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method atan()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#atan()}
 *  */
    @Test
    public void testAtan() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
            Complex actual = complex.atan();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#atan()}
 *  */
    @Test
    public void testAtan_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(1.780059086808999E-307, java.lang.Double.NaN);
            
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
    public void testAtan1() {
        Complex complex = new Complex(1.1392378155556871E-305, -2.3283064365386963E-10);
        
        Complex actual = complex.atan();
        
        Complex expected = new Complex(1.1392378155556871E-305, -2.3283064370807974E-10);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#atan()}
     */
    @Test
    public void testAtan2() {
        Complex complex = new Complex(1.1392378155556871E-305, 1.0);
        
        Complex actual = complex.atan();
        
        Complex expected = new Complex(0.7853981633974484, 351.42562054389225);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.multiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method multiply(org.apache.commons.math.complex.Complex)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (isNaN() || rhs.isNaN()): True}
    /// invoke:
    ///     {@link org.apache.commons.math.complex.Complex#isNaN()} once,
    ///     {@link java.lang.Double#isInfinite(double)} once
    /// return from: {@code return INF;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (Double.isInfinite(real) || Double.isInfinite(imaginary)): False}
 * @utbot.returnsFrom {@code return INF;}
 *  */
    @Test
    public void testMultiply_DoubleIsInfiniteOrDoubleIsInfinite() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevINF = Complex.INF;
        try {
            Complex inf = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex complex = new Complex(java.lang.Double.NEGATIVE_INFINITY, -1.491669568805641E-154);
            Complex complex1 = new Complex(4.0E-323, 2.652494739E-315);
            
            Complex actual = complex.multiply(complex1);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(inf, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (Double.isInfinite(real) || Double.isInfinite(imaginary)): True}
 * @utbot.executesCondition {@code (Double.isInfinite(rhs.real)): False}
 * @utbot.returnsFrom {@code return INF;}
 *  */
    @Test
    public void testMultiply_NotDoubleIsInfinite() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevINF = Complex.INF;
        try {
            Complex inf = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex complex = new Complex(1.0609978955E-314, java.lang.Double.NEGATIVE_INFINITY);
            Complex complex1 = new Complex(4.7783097267364807E-299, 0.0);
            
            Complex actual = complex.multiply(complex1);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(inf, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (Double.isInfinite(real) || Double.isInfinite(imaginary)): True}
 * @utbot.executesCondition {@code (Double.isInfinite(rhs.real)): True}
 * @utbot.executesCondition {@code (Double.isInfinite(rhs.real)): False}
 * @utbot.returnsFrom {@code return INF;}
 *  */
    @Test
    public void testMultiply_NotDoubleIsInfinite_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevINF = Complex.INF;
        try {
            Complex inf = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex complex = new Complex(-2.0522684006501214E-289, -1.2882297539194267E-231);
            Complex complex1 = new Complex(java.lang.Double.NEGATIVE_INFINITY, 2.2250738585072014E-308);
            
            Complex actual = complex.multiply(complex1);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(inf, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (Double.isInfinite(real) || Double.isInfinite(imaginary)): True}
 * @utbot.executesCondition {@code (Double.isInfinite(rhs.real)): True}
 * @utbot.executesCondition {@code (Double.isInfinite(rhs.real)): True}
 * @utbot.executesCondition {@code (Double.isInfinite(rhs.real)): True}
 * @utbot.invokes {@link java.lang.Double#isInfinite(double)}
 * @utbot.returnsFrom {@code return INF;}
 *  */
    @Test
    public void testMultiply_DoubleIsInfinite() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevINF = Complex.INF;
        try {
            Complex inf = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex complex = new Complex(-1.4916681517969382E-154, 1.2882297539194267E-231);
            Complex complex1 = new Complex(2.2250738585072014E-308, java.lang.Double.POSITIVE_INFINITY);
            
            Complex actual = complex.multiply(complex1);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(inf, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method multiply(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN() || rhs.isNaN()): True}
 * @utbot.executesCondition {@code (Double.isInfinite(real) || Double.isInfinite(imaginary)): True}
 * @utbot.executesCondition {@code (Double.isInfinite(rhs.real)): True}
 * @utbot.executesCondition {@code (Double.isInfinite(rhs.real)): True}
 * @utbot.executesCondition {@code (Double.isInfinite(rhs.real)): False}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.invokes {@link java.lang.Double#isInfinite(double)}
 * @utbot.invokes {@link java.lang.Double#isInfinite(double)}
 * @utbot.invokes {@link java.lang.Double#isInfinite(double)}
 * @utbot.invokes {@link java.lang.Double#isInfinite(double)}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(real * rhs.real - imaginary * rhs.imaginary, real * rhs.imaginary + imaginary * rhs.real);}
 *  */
    @Test
    public void testMultiply_NotDoubleIsInfinite_2() {
        Complex complex = new Complex(2.2250738585072014E-308, 2.2598406375463764E-308);
        Complex complex1 = new Complex(2.2250738585072014E-308, 3.337610787760802E-308);
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = new Complex(0.0, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method multiply(org.apache.commons.math.complex.Complex)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return NaN;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN() || rhs.isNaN()): True}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.returnsFrom {@code return NaN;}
 *  */
    @Test
    public void testMultiply_IsNaNOrRhsIsNaN() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(-4.450147717014403E-308, 1.390671161567E-309);
            Complex complex1 = new Complex(java.lang.Double.NaN, 0.0);
            
            Complex actual = complex.multiply(complex1);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN() || rhs.isNaN()): False}
 * @utbot.returnsFrom {@code return NaN;}
 *  */
    @Test
    public void testMultiply_IsNaNOrRhsIsNaN_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
            Complex actual = complex.multiply(null);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN() || rhs.isNaN()): False}
 * @utbot.returnsFrom {@code return NaN;}
 *  */
    @Test
    public void testMultiply_IsNaNOrRhsIsNaN_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(5.43230922487E-312, java.lang.Double.NaN);
            
            Complex actual = complex.multiply(null);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method multiply(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN() || rhs.isNaN()): True}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNaN() || rhs.isNaN()
 *  */
    @Test
    public void testMultiply_ThrowNullPointerException() {
        Complex complex = new Complex(-2.0, 2.0);
        
        /* This test fails because method [org.apache.commons.math.complex.Complex.multiply] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.Complex.multiply(Complex.java:355) */
        complex.multiply(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method multiply(org.apache.commons.math.complex.Complex)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#multiply(org.apache.commons.math.complex.Complex)}
     */
    @Test
    public void testMultiply() {
        Complex complex = new Complex(java.lang.Double.POSITIVE_INFINITY, 0.0);
        Complex complex1 = new Complex(1.1125411732451826E-308, java.lang.Double.NaN);
        
        Complex actual = complex.multiply(complex1);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.sinh
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sinh()
    
    @Test
    public void testSinh1() {
        Complex complex = new Complex(-2.0, -2.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = new Complex(1.5093064853236158, -3.4209548611170133);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh2() {
        Complex complex = new Complex(2.0000000000000018, java.lang.Double.NaN);
        
        Complex actual = complex.sinh();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh3() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        
        Complex actual = complex.sinh();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.cosh
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method cosh()
    
    @Test
    public void testCosh1() {
        Complex complex = new Complex(1.00030971449028E300, 3.39519326554E-313);
        
        Complex actual = complex.cosh();
        
        Complex expected = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh2() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        
        Complex actual = complex.cosh();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.tanh
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tanh()
    
    @Test
    public void testTanh1() {
        Complex complex = new Complex(-2.0, -2.0);
        
        Complex actual = complex.tanh();
        
        Complex expected = new Complex(-1.0238355945704727, 0.028392952868232287);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTanh2() {
        Complex complex = new Complex(java.lang.Double.NaN, 0.0);
        
        Complex actual = complex.tanh();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTanh3() {
        Complex complex = new Complex(1.4916681462400413E-154, java.lang.Double.NaN);
        
        Complex actual = complex.tanh();
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.negate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#negate()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(-real, -imaginary);}
 *  */
    @Test
    public void testNegate_ComplexCreateComplex() {
        Complex complex = new Complex(-0.0, -0.0);
        
        Complex actual = complex.negate();
        
        Complex expected = new Complex(0.0, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#negate()}
 *  */
    @Test
    public void testNegate() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(1.780059086808999E-307, java.lang.Double.NaN);
            
            Complex actual = complex.negate();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#negate()}
 *  */
    @Test
    public void testNegate_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method divide(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#divide(org.apache.commons.math.complex.Complex)}
 *  */
    @Test
    public void testDivide() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
            Complex actual = complex.divide(null);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#divide(org.apache.commons.math.complex.Complex)}
 *  */
    @Test
    public void testDivide_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(2.87034527747429E-306, java.lang.Double.NaN);
            
            Complex actual = complex.divide(null);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method divide(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#divide(org.apache.commons.math.complex.Complex)}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNaN() || rhs.isNaN()
 *  */
    @Test
    public void testDivide_ThrowNullPointerException() {
        Complex complex = new Complex(-2.0, 2.0);
        
        /* This test fails because method [org.apache.commons.math.complex.Complex.divide] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.Complex.divide(Complex.java:194) */
        complex.divide(null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method divide(org.apache.commons.math.complex.Complex)
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#divide(org.apache.commons.math.complex.Complex)}
     */
    @Test
    public void testDivide1() {
        Complex complex = new Complex(0.0, java.lang.Double.POSITIVE_INFINITY);
        Complex complex1 = new Complex(java.lang.Double.NEGATIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method divide(org.apache.commons.math.complex.Complex)
    
    @Test
    public void testDivide2() {
        Complex complex = new Complex(2.53E-321, 3.785766995733679E-270);
        Complex complex1 = new Complex(5.180654E-318, java.lang.Double.NaN);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide3() {
        Complex complex = new Complex(-2.8480945388892178E-306, -2.0);
        Complex complex1 = new Complex(java.lang.Double.NEGATIVE_INFINITY, 2.0);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = new Complex(0.0, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide4() {
        Complex complex = new Complex(7.2911220195563975E-304, -2.0);
        Complex complex1 = new Complex(-1.390671161567E-309, -5.56268464626801E-309);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = new Complex(java.lang.Double.POSITIVE_INFINITY, 8.459732399352061E307);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide5() {
        Complex complex = new Complex(-4.450147717014403E-308, -2.0);
        Complex complex1 = new Complex(-3.337610787760802E-308, -3.337610787760802E-308);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = new Complex(2.9961552247705263E307, 2.9961552247705263E307);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide6() {
        Complex complex = new Complex(-2.0, -2.0);
        Complex complex1 = new Complex(-0.0, java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = new Complex(0.0, 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide7() {
        Complex complex = new Complex(1.4916685018814413E-154, -1.2882297539194267E-231);
        Complex complex1 = new Complex(-0.0, -0.0);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide8() {
        Complex complex = new Complex(-0.0, -2.8480945388892178E-306);
        Complex complex1 = new Complex(java.lang.Double.NaN, 0.0);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method subtract(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN() || rhs.isNaN()): True}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#getReal()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#getImaginary()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(real - rhs.getReal(), imaginary - rhs.getImaginary());}
 *  */
    @Test
    public void testSubtract_IsNaNOrRhsIsNaN() {
        Complex complex = new Complex(1.681843139320305E-308, -8224.000014066814);
        Complex complex1 = new Complex(-1.099873057609708E-308, -104.00000762939374);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = new Complex(2.7817161969300133E-308, -8120.000006437421);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method subtract(org.apache.commons.math.complex.Complex)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link org.apache.commons.math.complex.Complex#isNaN()} once
    /// return from: {@code return NaN;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN() || rhs.isNaN()): True}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.returnsFrom {@code return NaN;}
 *  */
    @Test
    public void testSubtract_IsNaNOrRhsIsNaN_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(2.125, 2.0522684006491881E-289);
            Complex complex1 = new Complex(2.0, java.lang.Double.NaN);
            
            Complex actual = complex.subtract(complex1);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN() || rhs.isNaN()): False}
 * @utbot.returnsFrom {@code return NaN;}
 *  */
    @Test
    public void testSubtract_IsNaNOrRhsIsNaN_2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(4.778309762337662E-299, java.lang.Double.NaN);
            
            Complex actual = complex.subtract(null);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN() || rhs.isNaN()): False}
 * @utbot.returnsFrom {@code return NaN;}
 *  */
    @Test
    public void testSubtract_IsNaNOrRhsIsNaN_3() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
            Complex actual = complex.subtract(null);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method subtract(org.apache.commons.math.complex.Complex)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(org.apache.commons.math.complex.Complex)}
 * @utbot.executesCondition {@code (isNaN() || rhs.isNaN()): True}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#isNaN()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNaN() || rhs.isNaN()
 *  */
    @Test
    public void testSubtract_ThrowNullPointerException() {
        Complex complex = new Complex(-2.0, 2.0);
        
        /* This test fails because method [org.apache.commons.math.complex.Complex.subtract] produces [java.lang.NullPointerException]
            org.apache.commons.math.complex.Complex.subtract(Complex.java:402) */
        complex.subtract(null);
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
    public void testGetImaginary_ReturnImaginary() {
        Complex complex = new Complex(0.0, 0.0);
        
        double actual = complex.getImaginary();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.createComplex
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createComplex(double, double)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return new Complex(real, imaginary);}
 *  */
    @Test
    public void testCreateComplex_Return() {
        Complex complex = new Complex(0.0, 0.0);
        
        Complex actual = complex.createComplex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.conjugate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method conjugate()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#conjugate()}
 * @utbot.invokes {@link org.apache.commons.math.complex.Complex#createComplex(double,double)}
 * @utbot.returnsFrom {@code return createComplex(real, -imaginary);}
 *  */
    @Test
    public void testConjugate_ComplexCreateComplex() {
        Complex complex = new Complex(-2.0, -2.0);
        
        Complex actual = complex.conjugate();
        
        Complex expected = new Complex(-2.0, 2.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#conjugate()}
 *  */
    @Test
    public void testConjugate() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(1.6578092E-316, java.lang.Double.NaN);
            
            Complex actual = complex.conjugate();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#conjugate()}
 *  */
    @Test
    public void testConjugate_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
            Complex actual = complex.conjugate();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
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
    public void testGetReal_ReturnReal() {
        Complex complex = new Complex(0.0, 0.0);
        
        double actual = complex.getReal();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math.complex.Complex.sqrt1z
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method sqrt1z()
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#sqrt1z()}
 * @utbot.returnsFrom {@code return createComplex(1.0, 0.0).subtract(this.multiply(this)).sqrt();}
 *  */
    @Test
    public void testSqrt1z_ReturnCreateComplex1000SubtractThisMultiplyThisSqrt() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(java.lang.Double.NaN, 0.0);
            
            Complex actual = complex.sqrt1z();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#sqrt1z()}
 * @utbot.returnsFrom {@code return createComplex(1.0, 0.0).subtract(this.multiply(this)).sqrt();}
 *  */
    @Test
    public void testSqrt1z_ReturnCreateComplex1000SubtractThisMultiplyThisSqrt_1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevNaN = Complex.NaN;
        try {
            Complex naN = new Complex(java.lang.Double.NaN, java.lang.Double.NaN);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "NaN", naN);
            Complex complex = new Complex(-1.4917136683392308E-154, java.lang.Double.NaN);
            
            Complex actual = complex.sqrt1z();
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(naN, actual);
        } finally {
            setStaticField(Complex.class, "NaN", prevNaN);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sqrt1z()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#sqrt1z()}
     */
    @Test
    public void testSqrt1z() {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.sqrt1z();
        
        Complex expected = new Complex(1.4142135623730951, 3.146729627982717E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sqrt1z()
    
    @Test
    public void testSqrt1z1() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevINF = Complex.INF;
        try {
            Complex inf = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex complex = new Complex(-1.2882297539194267E-231, java.lang.Double.POSITIVE_INFINITY);
            
            Complex actual = complex.sqrt1z();
            
            Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
        }
    }
    
    @Test
    public void testSqrt1z2() throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException  {
        Complex prevINF = Complex.INF;
        try {
            Complex inf = new Complex(java.lang.Double.POSITIVE_INFINITY, java.lang.Double.POSITIVE_INFINITY);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "INF", inf);
            Complex complex = new Complex(java.lang.Double.POSITIVE_INFINITY, -1.2882297539194267E-231);
            
            Complex actual = complex.sqrt1z();
            
            Complex expected = new Complex(java.lang.Double.NaN, java.lang.Double.NEGATIVE_INFINITY);
            
            // org.apache.commons.math.complex.Complex has overridden equals method
            assertEquals(expected, actual);
        } finally {
            setStaticField(Complex.class, "INF", prevINF);
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields787840390942500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields787840390942500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass787840390947300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields787840390942500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass787840390947300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

