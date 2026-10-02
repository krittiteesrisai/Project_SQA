package org.apache.commons.math3.fraction;

import org.junit.Test;
import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.NullArgumentException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class org_apache_commons_math3_fraction_FractionTest {
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.add
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math3.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.invokes org.apache.commons.math3.fraction.Fraction#addSub(org.apache.commons.math3.fraction.Fraction,boolean)
 * @utbot.returnsFrom {@code return addSub(fraction, true);}
 *  */
    @Test
    public void testAdd_FractionAddSub() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        Fraction actual = fraction.add(fraction1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math3.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return addSub(fraction, true);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAdd_ThrowMathArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.add(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return addSub(fraction, true);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAdd_ThrowMathArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.add(fraction1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: return addSub(fraction, true);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAdd_ThrowNullArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        fraction.add(((Fraction) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(org.apache.commons.math3.fraction.Fraction)
    
    @Test
    public void testAdd1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 16777216);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 8);
        
        Fraction actual = fraction.add(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 16777216);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 134217729);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 4096);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 33554432);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.add(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 8193);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1602289664);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.add(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1602289664);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1602289663);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.add(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        Fraction actual = fraction.add(fraction);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    @Test
    public void testAdd6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 256);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -536870912);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        Fraction actual = fraction.add(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 134217728);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -17);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(org.apache.commons.math3.fraction.Fraction)
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 16777216);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 512);
        
        fraction.add(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.add(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.add(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.add(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.add(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741832);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.add(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -4);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.add(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 536870912);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.add(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd15() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.add(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd16() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -32770);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 128);
        
        fraction.add(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAdd17() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.add(fraction1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.add
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator + i * denominator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAdd_ThrowMathArithmeticException1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741824);
        
        fraction.add(1610612736);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#add(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator + i * denominator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAdd_ThrowMathArithmeticException_11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.add(-255);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method add(int)
    
    @Test
    public void testAdd18() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 11603974);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1984297952);
        
        Fraction actual = fraction.add(1185579184);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 5801987);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -536870912);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd19() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 285001603);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1074005952);
        
        Fraction actual = fraction.add(10849600);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 285001603);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -796917760);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd20() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -3);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1366294528);
        
        Fraction actual = fraction.add(-268435456);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 707788800);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd21() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -3);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -805306368);
        
        Fraction actual = fraction.add(-1073741824);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1879048192);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd22() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1207304064);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1556093184);
        
        Fraction actual = fraction.add(25847758);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 9432063);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -8388608);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd23() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1574764547);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147220354);
        
        Fraction actual = fraction.add(1544901590);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1574764547);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1308491776);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd24() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 4191);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1963196416);
        
        Fraction actual = fraction.add(-1497628672);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1397);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 239075328);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd25() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 805307785);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1174142976);
        
        Fraction actual = fraction.add(14942208);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 805307785);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 872415232);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd26() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 536870912);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1610612736);
        
        Fraction actual = fraction.add(1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd27() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1074266113);
        
        Fraction actual = fraction.add(1074266113);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd28() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483645);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.add(-2147483647);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAdd29() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 802545150);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -157671362);
        
        Fraction actual = fraction.add(749666591);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.equals
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method equals(java.lang.Object)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testEquals_Other() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        boolean actual = fraction.equals(fraction);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.executesCondition {@code (other): False}
 * @utbot.executesCondition {@code (other instanceof Fraction): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEquals_NotOtherNotInstanceOfFraction() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        boolean actual = fraction.equals(null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method equals(java.lang.Object)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (other): False},
    ///     {@code (other instanceof Fraction): True}
    /// return from: {@code return (numerator == rhs.numerator) && (denominator == rhs.denominator);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (numerator == rhs.numerator) && (denominator == rhs.denominator);}
 *  */
    @Test
    public void testEquals_NumeratorNotEqualsRhsNumeratorAndDenominatorNotEqualsRhsDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        boolean actual = fraction.equals(fraction1);
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (numerator == rhs.numerator) && (denominator == rhs.denominator);}
 *  */
    @Test
    public void testEquals_NumeratorEqualsRhsNumeratorAndDenominatorEqualsRhsDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        boolean actual = fraction.equals(fraction1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return (numerator == rhs.numerator) && (denominator == rhs.denominator);}
 *  */
    @Test
    public void testEquals_NumeratorNotEqualsRhsNumeratorAndDenominatorNotEqualsRhsDenominator_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        boolean actual = fraction.equals(fraction1);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.toString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method toString()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#toString()}
 * @utbot.executesCondition {@code (denominator == 1): False}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testToString_NumeratorEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        
        String actual = fraction.toString();
        
        String expected = "0";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#toString()}
 * @utbot.executesCondition {@code (denominator == 1): True}
 * @utbot.invokes {@link java.lang.Integer#toString(int)}
 * @utbot.returnsFrom {@code return str;}
 *  */
    @Test
    public void testToString_DenominatorEquals1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        String actual = fraction.toString();
        
        String expected = "-2147483648";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toString()
    
    @Test
    public void testToString1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -17);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        String actual = fraction.toString();
        
        String expected = "-2147483648 / -17";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.hashCode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hashCode()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#hashCode()}
 * @utbot.returnsFrom {@code return 37 * (37 * 17 + numerator) + denominator;}
 *  */
    @Test
    public void testHashCode_Return37Multiply37Multiply17PlusNumeratorPlusDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        int actual = fraction.hashCode();
        
        assertEquals(23055, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.abs
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_NumeratorLessThanZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -131072);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 131072);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_NumeratorLessThanZero_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 131);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -34340864);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 262144);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): True}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_NumeratorGreaterOrEqualZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        Fraction actual = fraction.abs();
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.executesCondition {@code (numerator >= 0): False}
 * @utbot.returnsFrom {@code return ret;}
 *  */
    @Test
    public void testAbs_NumeratorLessThanZero_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -524288);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -524288);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method abs()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: ret = negate();
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAbs_ThrowMathArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.abs();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: ret = negate();
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAbs_ThrowMathArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        fraction.abs();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#abs()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: ret = negate();
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAbs_ThrowMathArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        fraction.abs();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method abs()
    
    @Test
    public void testAbs1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -4096);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2097152);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -512);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbs2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -32);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 32);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbs3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741825);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -5242880);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 214748365);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1048576);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbs4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -96);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 96);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAbs5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 792821769);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2359296);
        
        Fraction actual = fraction.abs();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 264273923);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 786432);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.compareTo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compareTo(org.apache.commons.math3.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#compareTo(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.returnsFrom {@code return (nOd < dOn) ? -1 : ((nOd > dOn) ? +1 : 0);}
 *  */
    @Test
    public void testCompareTo_NOdLessThanDOn() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -256);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 256);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -62);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 8);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(-1, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#compareTo(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code ((nOd > dOn)): True}
 * @utbot.returnsFrom {@code return (nOd < dOn) ? -1 : ((nOd > dOn) ? +1 : 0);}
 *  */
    @Test
    public void testCompareTo_NOdGreaterThanDOn() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -128);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 34);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 128);
        
        int actual = fraction.compareTo(fraction1);
        
        assertEquals(1, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareTo(org.apache.commons.math3.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#compareTo(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: long nOd = ((long) numerator) * object.denominator;
 *  */
    @Test
    public void testCompareTo_ThrowNullPointerException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        /* This test fails because method [org.apache.commons.math3.fraction.Fraction.compareTo] produces [java.lang.NullPointerException]
            org.apache.commons.math3.fraction.Fraction.compareTo(Fraction.java:312) */
        fraction.compareTo(((Fraction) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.intValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method intValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#intValue()}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return (int) doubleValue();}
 *  */
    @Test
    public void testIntValue_FractionDoubleValue() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        int actual = fraction.intValue();
        
        assertEquals(0, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.longValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method longValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#longValue()}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return (long) doubleValue();}
 *  */
    @Test
    public void testLongValue_FractionDoubleValue() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        long actual = fraction.longValue();
        
        assertEquals(0L, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.floatValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method floatValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#floatValue()}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return (float) doubleValue();}
 *  */
    @Test
    public void testFloatValue_FractionDoubleValue() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        float actual = fraction.floatValue();
        
        org.junit.Assert.assertEquals(-0.003921569f, actual, 1.0E-6f);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.doubleValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doubleValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return (double) numerator / (double) denominator;}
 *  */
    @Test
    public void testDoubleValue_ReturnNumeratorDivideDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        double actual = fraction.doubleValue();
        
        org.junit.Assert.assertEquals(-0.00392156862745098, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.getField
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getField()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#getField()}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.FractionField#getInstance()}
 * @utbot.returnsFrom {@code return FractionField.getInstance();}
 *  */
    @Test
    public void testGetField_FractionFieldGetInstance() throws Exception  {
        Class lazyHolderClazz = Class.forName("org.apache.commons.math3.fraction.FractionField$LazyHolder");
        FractionField prevINSTANCE = ((FractionField) getStaticFieldValue(lazyHolderClazz, "INSTANCE"));
        try {
            Class fractionFieldClazz = Class.forName("org.apache.commons.math3.fraction.FractionField");
            Class anonymousObjectType = Class.forName("org.apache.commons.math3.fraction.FractionField$1");
            Constructor fractionFieldConstructor = fractionFieldClazz.getDeclaredConstructor(anonymousObjectType);
            fractionFieldConstructor.setAccessible(true);
            java.lang.Object[] fractionFieldConstructorArguments = new java.lang.Object[1];
            fractionFieldConstructorArguments[0] = ((Object) null);
            FractionField instance = ((FractionField) fractionFieldConstructor.newInstance(fractionFieldConstructorArguments));
            setStaticField(lazyHolderClazz, "INSTANCE", instance);
            Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
            
            FractionField actual = fraction.getField();
            
        } finally {
            setStaticField(lazyHolderClazz, "INSTANCE", prevINSTANCE);
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method getField()
    
    /**
     * @utbot.classUnderTest {@link org.apache.commons.math3.fraction.Fraction}
     * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#getField()}
     */
    @Test
    public void testGetField() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Fraction fraction = new Fraction(-1.1125369292536007E-308, -1);
        
        FractionField actual = fraction.getField();
        
        Class fractionFieldClazz = Class.forName("org.apache.commons.math3.fraction.FractionField");
        Class anonymousObjectType = Class.forName("org.apache.commons.math3.fraction.FractionField$1");
        Constructor fractionFieldConstructor = fractionFieldClazz.getDeclaredConstructor(anonymousObjectType);
        fractionFieldConstructor.setAccessible(true);
        java.lang.Object[] fractionFieldConstructorArguments = new java.lang.Object[1];
        fractionFieldConstructorArguments[0] = ((Object) null);
        FractionField expected = ((FractionField) fractionFieldConstructor.newInstance(fractionFieldConstructorArguments));
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.multiply
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method multiply(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator * i, denominator);}
 *  */
    @Test
    public void testMultiply_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -222);
        
        Fraction actual = fraction.multiply(0);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.returnsFrom {@code return new Fraction(numerator * i, denominator);}
 *  */
    @Test
    public void testMultiply_Return_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 196);
        
        Fraction actual = fraction.multiply(0);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator * i, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testMultiply_ThrowMathArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1048576);
        
        fraction.multiply(2048);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator * i, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testMultiply_ThrowMathArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.multiply(-255);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator * i, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testMultiply_ThrowMathArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 149);
        
        fraction.multiply(-249);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.multiply
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method multiply(org.apache.commons.math3.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#multiply(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testMultiply_ThrowNullArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        fraction.multiply(((Fraction) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.negate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method negate()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1429982742);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 38656);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.returnsFrom {@code return new Fraction(-numerator, denominator);}
 *  */
    @Test
    public void testNegate_Return_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method negate()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} when: numerator == Integer.MIN_VALUE
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testNegate_ThrowMathArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.negate();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(-numerator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testNegate_ThrowMathArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.negate();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(-numerator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testNegate_ThrowMathArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.negate();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method negate()
    
    @Test
    public void testNegate1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741824);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741824);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 32);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -268435456);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 8388608);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 16384);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 16384);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 3);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 73740);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 24580);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -3840);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741827);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3840);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741827);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741824);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741824);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741824);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 67108864);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 16);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1073741827);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741827);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -3);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 576);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 192);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741824);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 64);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 16777216);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 4194304);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -4194304);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -4096);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2048);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testNegate13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147483645);
        
        Fraction actual = fraction.negate();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483645);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.divide
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math3.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: fraction.numerator
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testDivide_ThrowMathArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        fraction.divide(fraction);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return multiply(fraction.reciprocal());
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testDivide_ThrowMathArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.divide(fraction);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testDivide_ThrowNullArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        fraction.divide(((Fraction) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method divide(org.apache.commons.math3.fraction.Fraction)
    
    @Test
    public void testDivide1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741824);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1048576);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -128);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -786432);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -3);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 9437184);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 3072);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -65536);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 266280);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 16);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        Fraction actual = fraction.divide(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 259);
        
        Fraction actual = fraction.divide(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(org.apache.commons.math3.fraction.Fraction)
    
    @Test(expected = MathArithmeticException.class)
    public void testDivide15() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MAX_VALUE);
        
        fraction.divide(fraction);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.divide
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method divide(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator, denominator * i);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testDivide_ThrowMathArithmeticException1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.divide(-1);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator, denominator * i);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testDivide_ThrowMathArithmeticException_11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -254);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        fraction.divide(0);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#divide(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator, denominator * i);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testDivide_ThrowMathArithmeticException_2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1048576);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.divide(2048);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method divide(int)
    
    @Test
    public void testDivide16() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1879673761);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741824);
        
        Fraction actual = fraction.divide(788529153);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 16151647);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741824);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide17() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1957143297);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 392);
        
        Fraction actual = fraction.divide(-1358954481);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 295225159);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 56);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide18() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1879673761);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 131072);
        
        Fraction actual = fraction.divide(788529153);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 16151647);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 131072);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide19() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 505961659);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 2147483645);
        
        Fraction actual = fraction.divide(-1600697511);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 511703549);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483645);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide20() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1282318703);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        Fraction actual = fraction.divide(1535876816);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 131902147);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -134217728);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide21() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1863320577);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        Fraction actual = fraction.divide(788530175);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide22() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 505961659);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -10555400);
        
        Fraction actual = fraction.divide(-1600697511);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 511703549);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 10555400);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDivide23() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -397641941);
        
        Fraction actual = fraction.divide(798432267);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.subtract
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math3.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.invokes org.apache.commons.math3.fraction.Fraction#addSub(org.apache.commons.math3.fraction.Fraction,boolean)
 * @utbot.returnsFrom {@code return addSub(fraction, false);}
 *  */
    @Test
    public void testSubtract_FractionAddSub() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        Fraction actual = fraction.subtract(fraction1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math3.fraction.Fraction)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(org.apache.commons.math3.fraction.Fraction)}
 * @utbot.invokes org.apache.commons.math3.fraction.Fraction#addSub(org.apache.commons.math3.fraction.Fraction,boolean)
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} in: return addSub(fraction, false);
 *  */
    @Test(expected = NullArgumentException.class)
    public void testSubtract_ThrowNullArgumentException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        fraction.subtract(((Fraction) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(org.apache.commons.math3.fraction.Fraction)
    
    @Test
    public void testSubtract1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -6422528);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 6422528);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -6422529);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 292192256);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 292192256);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -292192255);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 256);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 256);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 256);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -536870912);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        Fraction actual = fraction.subtract(fraction1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 134217728);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -15);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(org.apache.commons.math3.fraction.Fraction)
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 25152);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 256);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 16);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MAX_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -4);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 536870912);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract11() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract12() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract13() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract14() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        fraction.subtract(fraction1);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract15() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        fraction.subtract(fraction);
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testSubtract16() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        fraction.subtract(fraction1);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method subtract(org.apache.commons.math3.fraction.Fraction)
    
    @Test
    public void testSubtract17() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        /* This test fails because method [org.apache.commons.math3.fraction.Fraction.subtract] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math3.fraction.Fraction.addSub(Fraction.java:507)
            org.apache.commons.math3.fraction.Fraction.subtract(Fraction.java:459) */
        fraction.subtract(fraction);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.subtract
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method subtract(int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#subtract(int)}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(numerator - i * denominator, denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testSubtract_ThrowMathArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483646);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073742080);
        
        fraction.subtract(1610612864);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method subtract(int)
    
    @Test
    public void testSubtract18() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1473692864);
        
        Fraction actual = fraction.subtract(515852320);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 894784896);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract19() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -752450051);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1275554823);
        
        Fraction actual = fraction.subtract(1437247661);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 752450051);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741824);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract20() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1184696130);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1336559724);
        
        Fraction actual = fraction.subtract(104429686);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 592348065);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -15204352);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract21() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 172495187);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1611596272);
        
        Fraction actual = fraction.subtract(30027088);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 172495187);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483392);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract22() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 3111295);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1570243584);
        
        Fraction actual = fraction.subtract(859702272);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3111295);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 717225984);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract23() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1996488704);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1585446912);
        
        Fraction actual = fraction.subtract(717966186);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 34);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 7);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract24() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -261566446);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 151781384);
        
        Fraction actual = fraction.subtract(2133104868);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 130783223);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1070596096);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract25() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -523755487);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 144834548);
        
        Fraction actual = fraction.subtract(682185076);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 523755487);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2113929216);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract26() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 802680627);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2110179871);
        
        Fraction actual = fraction.subtract(-396421477);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract27() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1610612736);
        
        Fraction actual = fraction.subtract(5308424);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract28() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 536870912);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1610612736);
        
        Fraction actual = fraction.subtract(7);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -4);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSubtract29() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1310747);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1506475984);
        
        Fraction actual = fraction.subtract(-1013441424);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1310747);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.percentageValue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method percentageValue()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#percentageValue()}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.Fraction#doubleValue()}
 * @utbot.returnsFrom {@code return 100 * doubleValue();}
 *  */
    @Test
    public void testPercentageValue_FractionDoubleValue() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        double actual = fraction.percentageValue();
        
        org.junit.Assert.assertEquals(-0.39215686274509803, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.getNumerator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNumerator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#getNumerator()}
 * @utbot.returnsFrom {@code return numerator;}
 *  */
    @Test
    public void testGetNumerator_ReturnNumerator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        int actual = fraction.getNumerator();
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.addSub
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addSub(org.apache.commons.math3.fraction.Fraction, boolean)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#addSub(org.apache.commons.math3.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): True}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testAddSub_FractionNumeratorEqualsZero() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#addSub(org.apache.commons.math3.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.executesCondition {@code (isAdd): True}
 * @utbot.returnsFrom {@code return isAdd ? fraction : fraction.negate();}
 *  */
    @Test
    public void testAddSub_IsAdd() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction;
        addSubMethodArguments[1] = true;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(fraction, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addSub(org.apache.commons.math3.fraction.Fraction, boolean)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#addSub(org.apache.commons.math3.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: int d1 = ArithmeticUtils.gcd(denominator, fraction.denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAddSub_ThrowMathArithmeticException() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#addSub(org.apache.commons.math3.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (fraction.numerator == 0): False}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: int d1 = ArithmeticUtils.gcd(denominator, fraction.denominator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAddSub_ThrowMathArithmeticException_1() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", -255);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#addSub(org.apache.commons.math3.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): False}
 * @utbot.executesCondition {@code (numerator == 0): True}
 * @utbot.executesCondition {@code (isAdd): False}
 * @utbot.invokes {@link org.apache.commons.math3.fraction.Fraction#negate()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: fraction.negate()
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testAddSub_ThrowMathArithmeticException_2() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#addSub(org.apache.commons.math3.fraction.Fraction,boolean)}
 * @utbot.executesCondition {@code (fraction == null): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.NullArgumentException} when: fraction == null
 *  */
    @Test(expected = NullArgumentException.class)
    public void testAddSub_ThrowNullArgumentException() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = ((Object) null);
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addSub(org.apache.commons.math3.fraction.Fraction, boolean)
    
    @Test
    public void testAddSub1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1602224384);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1602224384);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1602224385);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddSub2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddSub3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 256);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -536870912);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 4);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 134217728);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -15);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddSub4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddSub5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 201326592);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 201326592);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -201326591);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddSub6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 16384);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 536870912);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 32767);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testAddSub7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction;
        addSubMethodArguments[1] = false;
        Fraction actual = ((Fraction) addSubMethod.invoke(fraction, addSubMethodArguments));
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addSub(org.apache.commons.math3.fraction.Fraction, boolean)
    
    @Test(expected = MathArithmeticException.class)
    public void testAddSub8() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 134217728);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 256);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAddSub9() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAddSub10() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1073741824);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAddSub11() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -4);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAddSub12() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 64);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 8);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAddSub13() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAddSub14() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", 536870912);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAddSub15() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = MathArithmeticException.class)
    public void testAddSub16() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -66050);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1073741824);
        Fraction fraction1 = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction1, "org.apache.commons.math3.fraction.Fraction", "numerator", 262144);
        
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction1;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addSub(org.apache.commons.math3.fraction.Fraction, boolean)
    
    @Test
    public void testAddSub17() throws Throwable  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        /* This test fails because method [org.apache.commons.math3.fraction.Fraction.addSub] produces [java.lang.ArithmeticException: / by zero]
            org.apache.commons.math3.fraction.Fraction.addSub(Fraction.java:507) */
        Class fractionClazz = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class booleanType = boolean.class;
        Method addSubMethod = fractionClazz.getDeclaredMethod("addSub", fractionClazz, booleanType);
        addSubMethod.setAccessible(true);
        java.lang.Object[] addSubMethodArguments = new java.lang.Object[2];
        addSubMethodArguments[0] = fraction;
        addSubMethodArguments[1] = false;
        try {
            addSubMethod.invoke(fraction, addSubMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.reciprocal
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reciprocal()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.returnsFrom {@code return new Fraction(denominator, numerator);}
 *  */
    @Test
    public void testReciprocal_Return() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 62272);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reciprocal()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(denominator, numerator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testReciprocal_ThrowMathArithmeticException() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        
        fraction.reciprocal();
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#reciprocal()}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: return new Fraction(denominator, numerator);
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testReciprocal_ThrowMathArithmeticException_1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        fraction.reciprocal();
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method reciprocal()
    
    @Test
    public void testReciprocal1() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 1048576);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -7188995);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 7188995);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1048576);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal2() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 715827874);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -357913937);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal3() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -4096);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -7);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 7);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4096);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal4() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -16);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -14);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 7);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 8);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal5() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", 201326592);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 201326592);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal6() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -1024);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 8192);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 8);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal7() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -2147483647);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal8() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 32776);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 4097);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -268435456);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal9() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", Integer.MIN_VALUE);
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", 1);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testReciprocal10() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "numerator", -2147483647);
        
        Fraction actual = fraction.reciprocal();
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.getReducedFraction
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getReducedFraction(int, int)
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: numerator
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_ThrowMathArithmeticException() {
        Fraction.getReducedFraction(-255, 0);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): True}
 * @utbot.executesCondition {@code ((numerator & 1) == 0): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: numerator
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_ThrowMathArithmeticException_1() {
        Fraction.getReducedFraction(-255, Integer.MIN_VALUE);
    }
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#getReducedFraction(int,int)}
 * @utbot.executesCondition {@code (denominator == 0): False}
 * @utbot.executesCondition {@code (numerator == 0): False}
 * @utbot.executesCondition {@code (denominator == Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (denominator < 0): True}
 * @utbot.executesCondition {@code (numerator == Integer.MIN_VALUE): True}
 * @utbot.throwsException {@link org.apache.commons.math3.exception.MathArithmeticException} in: numerator
 *  */
    @Test(expected = MathArithmeticException.class)
    public void testGetReducedFraction_ThrowMathArithmeticException_2() {
        Fraction.getReducedFraction(Integer.MIN_VALUE, -1);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getReducedFraction(int, int)
    
    @Test
    public void testGetReducedFraction1() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-8388608, -16777218);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 8388609);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 4194304);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction2() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-2013265920, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -2013265920);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction3() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(Integer.MIN_VALUE, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", Integer.MIN_VALUE);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction4() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(1073741824, -3);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 3);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -1073741824);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction5() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(53504, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 53504);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction6() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(33685504, Integer.MIN_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 16384);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", -257);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction7() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(-1071282688, Integer.MIN_VALUE);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 4194304);
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "numerator", 2092349);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetReducedFraction8() throws Exception  {
        Fraction actual = Fraction.getReducedFraction(0, 1);
        
        Fraction expected = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(expected, "org.apache.commons.math3.fraction.Fraction", "denominator", 1);
        
        // org.apache.commons.math3.fraction.Fraction has overridden equals method
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable org.apache.commons.math3.fraction.Fraction.getDenominator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getDenominator()
    
    /**
    @utbot.classUnderTest {@link Fraction}
 * @utbot.methodUnderTest {@link org.apache.commons.math3.fraction.Fraction#getDenominator()}
 * @utbot.returnsFrom {@code return denominator;}
 *  */
    @Test
    public void testGetDenominator_ReturnDenominator() throws Exception  {
        Fraction fraction = ((Fraction) createInstance("org.apache.commons.math3.fraction.Fraction"));
        setField(fraction, "org.apache.commons.math3.fraction.Fraction", "denominator", -255);
        
        int actual = fraction.getDenominator();
        
        assertEquals(-255, actual);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields705476300951100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields705476300951100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass705476300956900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields705476300951100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass705476300956900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
                
            java.lang.reflect.Method methodForGetDeclaredFields705476301425300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields705476301425300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass705476301427500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields705476301425300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass705476301427500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields705476302286500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields705476302286500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass705476302288000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields705476302286500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass705476302288000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

