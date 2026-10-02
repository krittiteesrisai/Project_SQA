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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method add(double)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
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
        
        Complex actual = complex.add(-5.432309224871E-311);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.80186337904E-312);
        
        Complex actual = complex.add(0.0);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 2.80186337904E-312);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method add(double)
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
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(double)}
 * @utbot.returnsFrom {@code return createComplex(real + addend, imaginary);}
 *  */
    @Test
    public void testAdd_ReturnCreateComplex_2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.337474980021148E-308);
        
        Complex actual = complex.add(java.lang.Double.POSITIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(double)}
 * @utbot.returnsFrom {@code return createComplex(real + addend, imaginary);}
 *  */
    @Test
    public void testAdd_ReturnCreateComplex_3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.5167898917244905E-308);
        
        Complex actual = complex.add(-1.208941460946727E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.3078484307777636E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#add(double)}
 * @utbot.returnsFrom {@code return createComplex(real + addend, imaginary);}
 *  */
    @Test
    public void testAdd_ReturnCreateComplex_4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 513.2187652625454);
        
        Complex actual = complex.add(-1.2812499962744113);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 511.93751526627096);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(double)
    
    @Test
    public void testAdd1() throws Exception  {
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
    
    @Test
    public void testAdd2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 4.494267126637282E307);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.62449190053457E-307);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 1.714441885740386E302);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 4.494284271056139E307);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 4.557239656578772E-305);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 5.3628E-319);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -5.30208E-318);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -4.7658E-318);
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
    public void testAdd3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.29713536832459);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.440369286871114E-308);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 0.09318533549595645);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.3903207038205463);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.977048875847686);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 115440.37470632832);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 0.06604194625875698);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -226320.64089632215);
        
        Complex actual = complex.add(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.9110069295889291);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -110880.26618999382);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd5() throws Exception  {
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
    
    @Test
    public void testAdd6() throws Exception  {
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.73834226757717E-310);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -1.73834226757717E-310);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.689380480730477E19);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -8320.0009765625);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -7.571562874687554E-270);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -8320.0009765625);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4096.0009765625);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -7.123713025126964E-307);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0);
        
        int actual = complex.hashCode();
        
        assertEquals(-1073741824, actual);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 64.0000002384186);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.9164488186871774E-303);
        
        double actual = complex.abs();
        
        org.junit.Assert.assertEquals(64.0000002384186, actual, 1.0E-6);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -8.50705917304822E38);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -709.0002441406252);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0000000000000004);
        
        Complex actual = complex.sin();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.9092974268256815);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -5.902958111405837E20);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.1122305257809188E59);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -709.0027267197511);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.5626221597194674);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.2395694151745916E163);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.689348814849291E19);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -7.73628766563505E-309);
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
    public void testTan8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.6689825292433E-311);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1.0002136231634626);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3538944.015823365);
        
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
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method sqrt()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math.complex.Complex}
     * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#sqrt()}
     */
    @Test
    public void testSqrt() throws Exception  {
        Complex complex = new Complex(4.450147717014403E-308, -1.0);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.7071067811865475);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.7071067811865476);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method sqrt()
    
    @Test
    public void testSqrt1() throws Exception  {
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
    public void testSqrt2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.2250738585072014E-308);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.4916681462400413E-154);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.337610787760802E-308);
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
    public void testSqrt4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.225073858507202E-308);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.4916681462400413E-154);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSqrt5() throws Exception  {
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
    public void testSqrt6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2250738585072014E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.sqrt();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.0547686614862998E-154);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0547686614863E-154);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0000000000000004);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.0000000000000004);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.7853981633974483);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.039720770839918);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 4.600622682543333E-307);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.8121432229867505E-308);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.4665776479840598);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -705.3619912629173);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2256170894296885E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.5881152753716232);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog5() throws Exception  {
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 8.988465942188735E307);
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
    public void testLog8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.225345473968445E-308);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.233765553266995E-308);
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
    public void testLog10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.225345473968445E-308);
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
    public void testLog11() throws Exception  {
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
    public void testLog12() throws Exception  {
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
    public void testLog13() throws Exception  {
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
    public void testLog14() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.225345473968445E-308);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.785766995733679E-270);
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
    public void testLog16() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
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
    public void testLog17() throws Exception  {
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
    public void testLog18() throws Exception  {
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
    public void testLog19() throws Exception  {
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
    public void testLog20() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.225345473968445E-308);
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
    public void testLog21() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.233765553266995E-308);
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
    public void testLog22() throws Exception  {
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.3846334926039434E125);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.272044731954616E96);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 289.04238225078564);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testLog25() throws Exception  {
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
    public void testLog26() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.778309731186628E-299);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -3.141592653589793);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -686.9088559339745);
        
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
    
    @Test
    public void testLog28() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.7800590868057611E-307);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.log();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.5707963267948966);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -706.3169769905843);
        
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
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pow(double)
    
    @Test
    public void testPow1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.337610787760802E-308);
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
    public void testPow2() throws Exception  {
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
    public void testPow3() throws Exception  {
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
    public void testPow4() throws Exception  {
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
    public void testPow5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 2.2256170894296885E-308);
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
    public void testPow6() throws Exception  {
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
    public void testPow7() throws Exception  {
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
    public void testPow8() throws Exception  {
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
    public void testPow9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
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
    public void testPow10() throws Exception  {
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
    public void testPow11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
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
    public void testPow12() throws Exception  {
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
    public void testPow13() throws Exception  {
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
    public void testPow14() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -0.0);
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
    public void testPow16() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.4916756313801302E-154);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1.4916756313801302E-154);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
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
    public void testPow18() throws Exception  {
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
    
    @Test
    public void testPow19() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.000000238418579);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.000000238418579);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -6.210073502794514E231);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 9.124884260620917E192);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 6.507598032998696E-153);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.990316381603742E-303);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 4.488997215955395E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.488997215955395E-308);
        
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
    public void testPow23() throws Exception  {
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
    public void testPow26() throws Exception  {
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
    public void testPow27() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -2.0E-323);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        
        Complex actual = complex.pow(complex);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.397E-320);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testPow28() throws Exception  {
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
    public void testPow29() throws Exception  {
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
    public void testPow30() throws Exception  {
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
    public void testPow31() throws Exception  {
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
    public void testPow32() throws Exception  {
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
    public void testPow35() throws Exception  {
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
    public void testPow36() throws Exception  {
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
    public void testPow37() throws Exception  {
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
    public void testPow38() throws Exception  {
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
    public void testPow39() throws Exception  {
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
    public void testPow40() throws Exception  {
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
    public void testPow41() throws Exception  {
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1059584.000031473);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 9.946464728196055E86);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3294198.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 6.216540493912683E86);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 8.66543206462539E9);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 5.368840194016129E9);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 5.0017260539921875E9);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 6.710957426058492E7);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4128.509809852578);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -5.337120779052795E9);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -789.405823756943);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -66297.0000152588);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -709.007927389503);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.2071729882262216E-308);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testExp17() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -719.0000000149012);
        
        Complex actual = complex.exp();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 5.52417597917E-313);
        
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
        Complex actual = Complex.valueOf(2.052268645298646E-289);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 2.052268645298646E-289);
        
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
        Complex actual = Complex.valueOf(7.291122019556605E-304, -4.4544935643943E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -4.4544935643943E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 7.291122019556605E-304);
        
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
        Complex actual = Complex.valueOf(java.lang.Double.POSITIVE_INFINITY, -4.450419332475646E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -4.450419332475646E-308);
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
        Complex actual = Complex.valueOf(5.06E-321, java.lang.Double.POSITIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 5.06E-321);
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
            
            Complex actual = Complex.valueOf(2.0078125, java.lang.Double.NaN);
            
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 8.6916947597938E-311);
        
        Complex actual = ((Complex) complex.readResolve());
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.2250738585072014E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 8.6916947597938E-311);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 8.6916947597938E-311);
        
        Complex actual = ((Complex) complex.readResolve());
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 8.6916947597938E-311);
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
    public void testAsin2() throws Exception  {
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
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
            setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -259.5);
            setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.778309726740827E-299);
            
            Complex actual = complex.atan();
            
            Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -0.003853583622468889);
            setField(expected, "org.apache.commons.math.complex.Complex", "real", 1.5707963267948966);
            
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
            setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -259.5);
            setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
            
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
    public void testAtan3() throws Exception  {
        Complex prevI = Complex.I;
        try {
            Complex i = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(i, "org.apache.commons.math.complex.Complex", "imaginary", 1.0);
            setField(i, "org.apache.commons.math.complex.Complex", "real", 0.0);
            Class complexClazz = Class.forName("org.apache.commons.math.complex.Complex");
            setStaticField(complexClazz, "I", i);
            Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
            setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
            setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.052268400649189E-289);
            
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method multiply(double)
    
    @Test
    public void testMultiply1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.multiply(1.0118E-320);
        
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
        
        Complex actual = complex.multiply(java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        Complex actual = complex.multiply(java.lang.Double.POSITIVE_INFINITY);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.121995791E-314);
        
        Complex actual = complex.multiply(-1.6781266645200465E-154);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMultiply5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
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
    public void testMultiply6() throws Exception  {
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
    public void testMultiply7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 4.9E-324);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.716154612436E-312);
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
    
    @Test
    public void testMultiply8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.9574384635094935E-126);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
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
    public void testMultiply9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.multiply(complex);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
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
    public void testMultiply11() throws Exception  {
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 8.346350702627147E230);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSinh2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 713.0625114440918);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -73728.000442505);
        
        Complex actual = complex.sinh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 8.346350702627147E230);
        
        Complex actual = complex.cosh();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCosh2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 720.0000228883073);
        
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
    
    @Test
    public void testCosh4() throws Exception  {
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
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tanh()
    
    @Test
    public void testTanh1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -359.7478045821199);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -9.409800003220544E307);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -354.5874168570293);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.2882297539194267E-231);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 5.304989477E-315);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -1.2882297539194267E-231);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -5.304989477E-315);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.9E-324);
        
        Complex actual = complex.negate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.2946074165855514E-308);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -1.6781266645200465E-154);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "isInfinite", true);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide4() throws Exception  {
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
    public void testDivide5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -3.337610787760802E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        Complex actual = complex.divide(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide6() throws Exception  {
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
    public void testDivide7() throws Exception  {
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
    public void testDivide8() throws Exception  {
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
    public void testDivide9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.divide(java.lang.Double.NEGATIVE_INFINITY);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide10() throws Exception  {
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
    public void testDivide11() throws Exception  {
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
    public void testDivide12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
        Complex actual = complex.divide(-0.0);
        
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(double)
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(double)}
 * @utbot.returnsFrom {@code return createComplex(real - subtrahend, imaginary);}
 *  */
    @Test
    public void testSubtract_ReturnCreateComplex() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.subtract(9.482903536528935E-305);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Complex}
 * @utbot.methodUnderTest {@link org.apache.commons.math.complex.Complex#subtract(double)}
 * @utbot.returnsFrom {@code return createComplex(real - subtrahend, imaginary);}
 *  */
    @Test
    public void testSubtract_ReturnCreateComplex_1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -3.54457329335133E-308);
        
        Complex actual = complex.subtract(-1.116888476194519E-308);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -2.427684817156811E-308);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.225345474037519E-308);
        
        Complex actual = complex.subtract(java.lang.Double.POSITIVE_INFINITY);
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1.048829078907147);
        
        Complex actual = complex.subtract(1.9986562766134743);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 2.0);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -3.0474853555206214);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        
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
        setField(complex, "org.apache.commons.math.complex.Complex", "isNaN", true);
        
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
    public void testSubtract_ReturnCreateComplex1() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.5001507579527695);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -7.84798923335656E-310);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 9.168649173219023E-10);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NaN);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -3.5001507588696343);
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
    public void testSubtract_ReturnCreateComplex_11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.507532138397365E-303);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -2.7813423241703894E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
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
    public void testSubtract5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.216871218303781E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 1.7809282662285958E-307);
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 1.08402015113947E-310);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 1.710525514014354E-307);
        
        Complex actual = complex.subtract(complex1);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 1.2060310167923865E-308);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 7.040275221424184E-309);
        
        // org.apache.commons.math.complex.Complex has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract6() throws Exception  {
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
    public void testSubtract7() throws Exception  {
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
    public void testGetArgument_ReturnFastMathAtan2_2() throws Exception  {
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-0.7853981633974483, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -0.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-2.356194490192345, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NEGATIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 2.2250738585072014E-308);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-1.5707963267948966, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.7800590868057615E-307);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(3.141592653589793, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument7() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.7800590868057615E-307);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-0.0, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument8() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.7800590868057615E-307);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.337610787760802E-308);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(1.3854483767992019, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.7800590868057615E-307);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(-3.141592653589793, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.NEGATIVE_INFINITY);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(2.356194490192345, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.POSITIVE_INFINITY);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(1.5707963267948966, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument12() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(java.lang.Double.NaN, actual, 1.0E-6);
    }
    
    @Test
    public void testGetArgument13() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        double actual = complex.getArgument();
        
        org.junit.Assert.assertEquals(0.0, actual, 1.0E-6);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
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
    public void testNthRoot2() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 3.337610787760802E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 3.3376107877608016E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot3() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.450147725303449E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.450147725303449E-308);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -4.450147725303449E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 4.450147725303449E-308);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot4() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 0.0);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 0.0);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot5() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -3.128254836223596E-148);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -2.1015308589382087E-286);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -3.128254836223596E-148);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 1.915503636049227E-164);
        expected.add(complex1);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot6() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -4.450147717014405E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -4.450147717014405E-308);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(1));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -4.450147717014406E-308);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", -4.450147717014405E-308);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.1125369292536007E-308);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 0.0);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(2));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -7.458340731200207E-155);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 7.458340731200208E-155);
        expected.add(complex1);
        Complex complex2 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex2, "org.apache.commons.math.complex.Complex", "imaginary", 7.458340731200208E-155);
        setField(complex2, "org.apache.commons.math.complex.Complex", "real", -7.458340731200207E-155);
        expected.add(complex2);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot9() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 1.0151922252939193E-115);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 3.297880750402423E-229);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(2));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 2.2529893755784996E-58);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 2.2529893755785E-58);
        expected.add(complex1);
        Complex complex2 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex2, "org.apache.commons.math.complex.Complex", "imaginary", -2.2529893755784996E-58);
        setField(complex2, "org.apache.commons.math.complex.Complex", "real", -2.2529893755785003E-58);
        expected.add(complex2);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot10() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 8.344784746116312E231);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", -1.08536185005153E193);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(2));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", 6.459405834175582E115);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 6.459405834175583E115);
        expected.add(complex1);
        Complex complex2 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex2, "org.apache.commons.math.complex.Complex", "imaginary", -6.459405834175582E115);
        setField(complex2, "org.apache.commons.math.complex.Complex", "real", -6.459405834175584E115);
        expected.add(complex2);
        
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNthRoot11() throws Exception  {
        Complex complex = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -1.1805916207174116E21);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 9.505747915027785E-212);
        
        ArrayList actual = ((ArrayList) complex.nthRoot(4));
        
        ArrayList expected = new ArrayList();
        Complex complex1 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex1, "org.apache.commons.math.complex.Complex", "imaginary", -70935.65523836233);
        setField(complex1, "org.apache.commons.math.complex.Complex", "real", 171253.82093227643);
        expected.add(complex1);
        Complex complex2 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex2, "org.apache.commons.math.complex.Complex", "imaginary", 171253.82093227643);
        setField(complex2, "org.apache.commons.math.complex.Complex", "real", 70935.65523836235);
        expected.add(complex2);
        Complex complex3 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex3, "org.apache.commons.math.complex.Complex", "imaginary", 70935.65523836236);
        setField(complex3, "org.apache.commons.math.complex.Complex", "real", -171253.82093227643);
        expected.add(complex3);
        Complex complex4 = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(complex4, "org.apache.commons.math.complex.Complex", "imaginary", -171253.8209322764);
        setField(complex4, "org.apache.commons.math.complex.Complex", "real", -70935.65523836244);
        expected.add(complex4);
        
        assertTrue(deepEquals(expected, actual));
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", 5.562684646268003E-309);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.9E-324);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -5.562684646268003E-309);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "imaginary", -6.63123685E-316);
        setField(complex, "org.apache.commons.math.complex.Complex", "real", java.lang.Double.POSITIVE_INFINITY);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", 6.63123685E-316);
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
        setField(complex, "org.apache.commons.math.complex.Complex", "real", 4.7783097267364807E-299);
        
        Complex actual = complex.conjugate();
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 4.7783097267364807E-299);
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
        
        Complex actual = complex.createComplex(2.2250738585072024E-308, -2.8480945388892184E-306);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", -2.8480945388892184E-306);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", 2.2250738585072024E-308);
        
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
        
        Complex actual = complex.createComplex(-2.0000000298023224, java.lang.Double.NaN);
        
        Complex expected = ((Complex) createInstance("org.apache.commons.math.complex.Complex"));
        setField(expected, "org.apache.commons.math.complex.Complex", "imaginary", java.lang.Double.NaN);
        setField(expected, "org.apache.commons.math.complex.Complex", "real", -2.0000000298023224);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields729851835707500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields729851835707500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass729851835712400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields729851835707500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass729851835712400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields729851836177000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields729851836177000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass729851836178900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields729851836177000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass729851836178900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields729851836756000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields729851836756000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass729851836757000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields729851836756000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass729851836757000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

